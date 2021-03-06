var express = require('express')
var app = express()
var cors = require('cors')

app.use(cors());

var { client } = require('./src/StatisticsClient');

function isValidEntry(payload) {
    const { entry } = JSON.parse(payload);
    const count = entry.length;
    return count >= 2 && entry.filter(Number.isInteger).length === count;
}

function calculateStats(payload, resolve, error, next) {
    const { entry } = JSON.parse(payload);
    client.calculateStat(entry)
        .then(stats => resolve(stats))
        .fail(err => error(err))
        .finally(() => next);
}

function generateRandomNumbers(resolve, error, next) {
    client.generateNums()
        .then(randomNumbers => resolve(randomNumbers))
        .fail(err => error(err))
        .finally(() => next);
}

app.get('/actions', function (req, res, next) {
    console.log("Method", req.query.method, "called!");
    switch (req.query.method) {
        case 'IS-VALID-ENTRY':
            /**
             * /actions?method=IS-VALID-ENTRY&payload={"entry":[1,3,4]}
             * should return 200
             *
             * /actions?method=IS-VALID-ENTRY&payload={"entry":[1,3,"Strings"]}
             * should return 400
             */
            const isValid = isValidEntry(req.query.payload);
            res.status(isValid ? 200 : 400).send(isValid ? "OK" : "WRONG PAYLOAD")
            break;
        case 'CALCULATE-STATS':
            /**
             * /actions?method=CALCULATE-STATS&payload={"entry":[1, 5,4]}
             */
            if(!isValidEntry(req.query.payload)) {
                res.status(400).send("WRONG PAYLOAD")
                break;
            }

            calculateStats(req.query.payload,
                (data) => res.status(200).send(data),
                () => res.status(500).send({}),
                next)
            break;
        case 'GEN-RAND':
            /**
             * /actions?method=GEN-RAND
             */
            generateRandomNumbers(
                (data) => res.status(200).send(data),
                () => res.status(500).send({}),
                next);
            break;
        default:
            res.status(400).send({})       
            break;
    }
})

app.listen(8000);

client.ping()
    .then(function(response) {
        console.log("Backend service is", response ? "up!" : "down!");
    });
