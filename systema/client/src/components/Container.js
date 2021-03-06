import React from 'react';

import RandomNumberField from './RandomNumberField';
import GenerateButton from './GenerateButton';
import CalculateButton from './CalculateButton';
import Statistics from './Statistics';

export default function Container(props) {
    let {
        randomNumbers,
        setRandomNumbers,
        generatedNumbers,
        setGeneratedNumbers,
        setStats,
        stats
    } = props;
    return <div>
        <RandomNumberField
            randomNumbers={randomNumbers}
            generatedNumbers={generatedNumbers}
            setRandomNumbers={setRandomNumbers}
            />
        <GenerateButton
            setGeneratedNumbers={setGeneratedNumbers}
            setRandomNumbers={setRandomNumbers} 
            />
        <CalculateButton
            randomNumbers={randomNumbers}
            setStats={setStats} 
            />
        <hr />
        <Statistics
            randomNumbers={randomNumbers}
            stats={stats}
            />
    </div>;
}