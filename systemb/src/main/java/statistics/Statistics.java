/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package statistics;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-09-16")
public class Statistics implements org.apache.thrift.TBase<Statistics, Statistics._Fields>, java.io.Serializable, Cloneable, Comparable<Statistics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Statistics");

  private static final org.apache.thrift.protocol.TField MEAN_FIELD_DESC = new org.apache.thrift.protocol.TField("mean", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField MEDIAN_FIELD_DESC = new org.apache.thrift.protocol.TField("median", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField VARIANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("variance", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField STD_DEV_FIELD_DESC = new org.apache.thrift.protocol.TField("stdDev", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StatisticsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StatisticsTupleSchemeFactory();

  public double mean; // required
  public int median; // required
  public double variance; // required
  public double stdDev; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MEAN((short)1, "mean"),
    MEDIAN((short)2, "median"),
    VARIANCE((short)3, "variance"),
    STD_DEV((short)4, "stdDev");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MEAN
          return MEAN;
        case 2: // MEDIAN
          return MEDIAN;
        case 3: // VARIANCE
          return VARIANCE;
        case 4: // STD_DEV
          return STD_DEV;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MEAN_ISSET_ID = 0;
  private static final int __MEDIAN_ISSET_ID = 1;
  private static final int __VARIANCE_ISSET_ID = 2;
  private static final int __STDDEV_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MEAN, new org.apache.thrift.meta_data.FieldMetaData("mean", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MEDIAN, new org.apache.thrift.meta_data.FieldMetaData("median", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.VARIANCE, new org.apache.thrift.meta_data.FieldMetaData("variance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STD_DEV, new org.apache.thrift.meta_data.FieldMetaData("stdDev", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Statistics.class, metaDataMap);
  }

  public Statistics() {
  }

  public Statistics(
    double mean,
    int median,
    double variance,
    double stdDev)
  {
    this();
    this.mean = mean;
    setMeanIsSet(true);
    this.median = median;
    setMedianIsSet(true);
    this.variance = variance;
    setVarianceIsSet(true);
    this.stdDev = stdDev;
    setStdDevIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Statistics(Statistics other) {
    __isset_bitfield = other.__isset_bitfield;
    this.mean = other.mean;
    this.median = other.median;
    this.variance = other.variance;
    this.stdDev = other.stdDev;
  }

  public Statistics deepCopy() {
    return new Statistics(this);
  }

  @Override
  public void clear() {
    setMeanIsSet(false);
    this.mean = 0.0;
    setMedianIsSet(false);
    this.median = 0;
    setVarianceIsSet(false);
    this.variance = 0.0;
    setStdDevIsSet(false);
    this.stdDev = 0.0;
  }

  public double getMean() {
    return this.mean;
  }

  public Statistics setMean(double mean) {
    this.mean = mean;
    setMeanIsSet(true);
    return this;
  }

  public void unsetMean() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MEAN_ISSET_ID);
  }

  /** Returns true if field mean is set (has been assigned a value) and false otherwise */
  public boolean isSetMean() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MEAN_ISSET_ID);
  }

  public void setMeanIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MEAN_ISSET_ID, value);
  }

  public int getMedian() {
    return this.median;
  }

  public Statistics setMedian(int median) {
    this.median = median;
    setMedianIsSet(true);
    return this;
  }

  public void unsetMedian() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MEDIAN_ISSET_ID);
  }

  /** Returns true if field median is set (has been assigned a value) and false otherwise */
  public boolean isSetMedian() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MEDIAN_ISSET_ID);
  }

  public void setMedianIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MEDIAN_ISSET_ID, value);
  }

  public double getVariance() {
    return this.variance;
  }

  public Statistics setVariance(double variance) {
    this.variance = variance;
    setVarianceIsSet(true);
    return this;
  }

  public void unsetVariance() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VARIANCE_ISSET_ID);
  }

  /** Returns true if field variance is set (has been assigned a value) and false otherwise */
  public boolean isSetVariance() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VARIANCE_ISSET_ID);
  }

  public void setVarianceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VARIANCE_ISSET_ID, value);
  }

  public double getStdDev() {
    return this.stdDev;
  }

  public Statistics setStdDev(double stdDev) {
    this.stdDev = stdDev;
    setStdDevIsSet(true);
    return this;
  }

  public void unsetStdDev() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STDDEV_ISSET_ID);
  }

  /** Returns true if field stdDev is set (has been assigned a value) and false otherwise */
  public boolean isSetStdDev() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STDDEV_ISSET_ID);
  }

  public void setStdDevIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STDDEV_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case MEAN:
      if (value == null) {
        unsetMean();
      } else {
        setMean((Double)value);
      }
      break;

    case MEDIAN:
      if (value == null) {
        unsetMedian();
      } else {
        setMedian((Integer)value);
      }
      break;

    case VARIANCE:
      if (value == null) {
        unsetVariance();
      } else {
        setVariance((Double)value);
      }
      break;

    case STD_DEV:
      if (value == null) {
        unsetStdDev();
      } else {
        setStdDev((Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MEAN:
      return getMean();

    case MEDIAN:
      return getMedian();

    case VARIANCE:
      return getVariance();

    case STD_DEV:
      return getStdDev();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MEAN:
      return isSetMean();
    case MEDIAN:
      return isSetMedian();
    case VARIANCE:
      return isSetVariance();
    case STD_DEV:
      return isSetStdDev();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Statistics)
      return this.equals((Statistics)that);
    return false;
  }

  public boolean equals(Statistics that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mean = true;
    boolean that_present_mean = true;
    if (this_present_mean || that_present_mean) {
      if (!(this_present_mean && that_present_mean))
        return false;
      if (this.mean != that.mean)
        return false;
    }

    boolean this_present_median = true;
    boolean that_present_median = true;
    if (this_present_median || that_present_median) {
      if (!(this_present_median && that_present_median))
        return false;
      if (this.median != that.median)
        return false;
    }

    boolean this_present_variance = true;
    boolean that_present_variance = true;
    if (this_present_variance || that_present_variance) {
      if (!(this_present_variance && that_present_variance))
        return false;
      if (this.variance != that.variance)
        return false;
    }

    boolean this_present_stdDev = true;
    boolean that_present_stdDev = true;
    if (this_present_stdDev || that_present_stdDev) {
      if (!(this_present_stdDev && that_present_stdDev))
        return false;
      if (this.stdDev != that.stdDev)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(mean);

    hashCode = hashCode * 8191 + median;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(variance);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(stdDev);

    return hashCode;
  }

  @Override
  public int compareTo(Statistics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMean()).compareTo(other.isSetMean());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMean()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mean, other.mean);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMedian()).compareTo(other.isSetMedian());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMedian()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.median, other.median);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVariance()).compareTo(other.isSetVariance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVariance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.variance, other.variance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStdDev()).compareTo(other.isSetStdDev());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStdDev()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stdDev, other.stdDev);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Statistics(");
    boolean first = true;

    sb.append("mean:");
    sb.append(this.mean);
    first = false;
    if (!first) sb.append(", ");
    sb.append("median:");
    sb.append(this.median);
    first = false;
    if (!first) sb.append(", ");
    sb.append("variance:");
    sb.append(this.variance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stdDev:");
    sb.append(this.stdDev);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StatisticsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StatisticsStandardScheme getScheme() {
      return new StatisticsStandardScheme();
    }
  }

  private static class StatisticsStandardScheme extends org.apache.thrift.scheme.StandardScheme<Statistics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Statistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MEAN
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.mean = iprot.readDouble();
              struct.setMeanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MEDIAN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.median = iprot.readI32();
              struct.setMedianIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VARIANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.variance = iprot.readDouble();
              struct.setVarianceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STD_DEV
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.stdDev = iprot.readDouble();
              struct.setStdDevIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Statistics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MEAN_FIELD_DESC);
      oprot.writeDouble(struct.mean);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MEDIAN_FIELD_DESC);
      oprot.writeI32(struct.median);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VARIANCE_FIELD_DESC);
      oprot.writeDouble(struct.variance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STD_DEV_FIELD_DESC);
      oprot.writeDouble(struct.stdDev);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StatisticsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StatisticsTupleScheme getScheme() {
      return new StatisticsTupleScheme();
    }
  }

  private static class StatisticsTupleScheme extends org.apache.thrift.scheme.TupleScheme<Statistics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Statistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMean()) {
        optionals.set(0);
      }
      if (struct.isSetMedian()) {
        optionals.set(1);
      }
      if (struct.isSetVariance()) {
        optionals.set(2);
      }
      if (struct.isSetStdDev()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMean()) {
        oprot.writeDouble(struct.mean);
      }
      if (struct.isSetMedian()) {
        oprot.writeI32(struct.median);
      }
      if (struct.isSetVariance()) {
        oprot.writeDouble(struct.variance);
      }
      if (struct.isSetStdDev()) {
        oprot.writeDouble(struct.stdDev);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Statistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.mean = iprot.readDouble();
        struct.setMeanIsSet(true);
      }
      if (incoming.get(1)) {
        struct.median = iprot.readI32();
        struct.setMedianIsSet(true);
      }
      if (incoming.get(2)) {
        struct.variance = iprot.readDouble();
        struct.setVarianceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.stdDev = iprot.readDouble();
        struct.setStdDevIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

