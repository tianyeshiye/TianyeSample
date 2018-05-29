/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.example.bean;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class C001 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2123850923624576051L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"C001\",\"namespace\":\"org.apache.avro.example.bean\",\"fields\":[{\"name\":\"c001_dummy15\",\"type\":[\"long\",\"null\"]},{\"name\":\"c001_dummy16\",\"type\":[\"long\",\"null\"]},{\"name\":\"c001_dummy17\",\"type\":[\"long\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<C001> ENCODER =
      new BinaryMessageEncoder<C001>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<C001> DECODER =
      new BinaryMessageDecoder<C001>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<C001> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<C001> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<C001>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this C001 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a C001 from a ByteBuffer. */
  public static C001 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Long c001_dummy15;
  @Deprecated public java.lang.Long c001_dummy16;
  @Deprecated public java.lang.Long c001_dummy17;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public C001() {}

  /**
   * All-args constructor.
   * @param c001_dummy15 The new value for c001_dummy15
   * @param c001_dummy16 The new value for c001_dummy16
   * @param c001_dummy17 The new value for c001_dummy17
   */
  public C001(java.lang.Long c001_dummy15, java.lang.Long c001_dummy16, java.lang.Long c001_dummy17) {
    this.c001_dummy15 = c001_dummy15;
    this.c001_dummy16 = c001_dummy16;
    this.c001_dummy17 = c001_dummy17;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return c001_dummy15;
    case 1: return c001_dummy16;
    case 2: return c001_dummy17;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: c001_dummy15 = (java.lang.Long)value$; break;
    case 1: c001_dummy16 = (java.lang.Long)value$; break;
    case 2: c001_dummy17 = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'c001_dummy15' field.
   * @return The value of the 'c001_dummy15' field.
   */
  public java.lang.Long getC001Dummy15() {
    return c001_dummy15;
  }

  /**
   * Sets the value of the 'c001_dummy15' field.
   * @param value the value to set.
   */
  public void setC001Dummy15(java.lang.Long value) {
    this.c001_dummy15 = value;
  }

  /**
   * Gets the value of the 'c001_dummy16' field.
   * @return The value of the 'c001_dummy16' field.
   */
  public java.lang.Long getC001Dummy16() {
    return c001_dummy16;
  }

  /**
   * Sets the value of the 'c001_dummy16' field.
   * @param value the value to set.
   */
  public void setC001Dummy16(java.lang.Long value) {
    this.c001_dummy16 = value;
  }

  /**
   * Gets the value of the 'c001_dummy17' field.
   * @return The value of the 'c001_dummy17' field.
   */
  public java.lang.Long getC001Dummy17() {
    return c001_dummy17;
  }

  /**
   * Sets the value of the 'c001_dummy17' field.
   * @param value the value to set.
   */
  public void setC001Dummy17(java.lang.Long value) {
    this.c001_dummy17 = value;
  }

  /**
   * Creates a new C001 RecordBuilder.
   * @return A new C001 RecordBuilder
   */
  public static org.apache.avro.example.bean.C001.Builder newBuilder() {
    return new org.apache.avro.example.bean.C001.Builder();
  }

  /**
   * Creates a new C001 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new C001 RecordBuilder
   */
  public static org.apache.avro.example.bean.C001.Builder newBuilder(org.apache.avro.example.bean.C001.Builder other) {
    return new org.apache.avro.example.bean.C001.Builder(other);
  }

  /**
   * Creates a new C001 RecordBuilder by copying an existing C001 instance.
   * @param other The existing instance to copy.
   * @return A new C001 RecordBuilder
   */
  public static org.apache.avro.example.bean.C001.Builder newBuilder(org.apache.avro.example.bean.C001 other) {
    return new org.apache.avro.example.bean.C001.Builder(other);
  }

  /**
   * RecordBuilder for C001 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<C001>
    implements org.apache.avro.data.RecordBuilder<C001> {

    private java.lang.Long c001_dummy15;
    private java.lang.Long c001_dummy16;
    private java.lang.Long c001_dummy17;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.example.bean.C001.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.c001_dummy15)) {
        this.c001_dummy15 = data().deepCopy(fields()[0].schema(), other.c001_dummy15);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.c001_dummy16)) {
        this.c001_dummy16 = data().deepCopy(fields()[1].schema(), other.c001_dummy16);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.c001_dummy17)) {
        this.c001_dummy17 = data().deepCopy(fields()[2].schema(), other.c001_dummy17);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing C001 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.example.bean.C001 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.c001_dummy15)) {
        this.c001_dummy15 = data().deepCopy(fields()[0].schema(), other.c001_dummy15);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.c001_dummy16)) {
        this.c001_dummy16 = data().deepCopy(fields()[1].schema(), other.c001_dummy16);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.c001_dummy17)) {
        this.c001_dummy17 = data().deepCopy(fields()[2].schema(), other.c001_dummy17);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'c001_dummy15' field.
      * @return The value.
      */
    public java.lang.Long getC001Dummy15() {
      return c001_dummy15;
    }

    /**
      * Sets the value of the 'c001_dummy15' field.
      * @param value The value of 'c001_dummy15'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C001.Builder setC001Dummy15(java.lang.Long value) {
      validate(fields()[0], value);
      this.c001_dummy15 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'c001_dummy15' field has been set.
      * @return True if the 'c001_dummy15' field has been set, false otherwise.
      */
    public boolean hasC001Dummy15() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'c001_dummy15' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C001.Builder clearC001Dummy15() {
      c001_dummy15 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'c001_dummy16' field.
      * @return The value.
      */
    public java.lang.Long getC001Dummy16() {
      return c001_dummy16;
    }

    /**
      * Sets the value of the 'c001_dummy16' field.
      * @param value The value of 'c001_dummy16'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C001.Builder setC001Dummy16(java.lang.Long value) {
      validate(fields()[1], value);
      this.c001_dummy16 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'c001_dummy16' field has been set.
      * @return True if the 'c001_dummy16' field has been set, false otherwise.
      */
    public boolean hasC001Dummy16() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'c001_dummy16' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C001.Builder clearC001Dummy16() {
      c001_dummy16 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'c001_dummy17' field.
      * @return The value.
      */
    public java.lang.Long getC001Dummy17() {
      return c001_dummy17;
    }

    /**
      * Sets the value of the 'c001_dummy17' field.
      * @param value The value of 'c001_dummy17'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C001.Builder setC001Dummy17(java.lang.Long value) {
      validate(fields()[2], value);
      this.c001_dummy17 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'c001_dummy17' field has been set.
      * @return True if the 'c001_dummy17' field has been set, false otherwise.
      */
    public boolean hasC001Dummy17() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'c001_dummy17' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C001.Builder clearC001Dummy17() {
      c001_dummy17 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public C001 build() {
      try {
        C001 record = new C001();
        record.c001_dummy15 = fieldSetFlags()[0] ? this.c001_dummy15 : (java.lang.Long) defaultValue(fields()[0]);
        record.c001_dummy16 = fieldSetFlags()[1] ? this.c001_dummy16 : (java.lang.Long) defaultValue(fields()[1]);
        record.c001_dummy17 = fieldSetFlags()[2] ? this.c001_dummy17 : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<C001>
    WRITER$ = (org.apache.avro.io.DatumWriter<C001>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<C001>
    READER$ = (org.apache.avro.io.DatumReader<C001>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}