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
public class C022 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6337100999715467888L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"C022\",\"namespace\":\"org.apache.avro.example.bean\",\"fields\":[{\"name\":\"c022_dummy15\",\"type\":[\"long\",\"null\"]},{\"name\":\"c022_dummy16\",\"type\":[\"long\",\"null\"]},{\"name\":\"c022_dummy17\",\"type\":[\"long\",\"null\"]},{\"name\":\"c022_dummy18\",\"type\":[\"long\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<C022> ENCODER =
      new BinaryMessageEncoder<C022>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<C022> DECODER =
      new BinaryMessageDecoder<C022>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<C022> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<C022> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<C022>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this C022 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a C022 from a ByteBuffer. */
  public static C022 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Long c022_dummy15;
  @Deprecated public java.lang.Long c022_dummy16;
  @Deprecated public java.lang.Long c022_dummy17;
  @Deprecated public java.lang.Long c022_dummy18;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public C022() {}

  /**
   * All-args constructor.
   * @param c022_dummy15 The new value for c022_dummy15
   * @param c022_dummy16 The new value for c022_dummy16
   * @param c022_dummy17 The new value for c022_dummy17
   * @param c022_dummy18 The new value for c022_dummy18
   */
  public C022(java.lang.Long c022_dummy15, java.lang.Long c022_dummy16, java.lang.Long c022_dummy17, java.lang.Long c022_dummy18) {
    this.c022_dummy15 = c022_dummy15;
    this.c022_dummy16 = c022_dummy16;
    this.c022_dummy17 = c022_dummy17;
    this.c022_dummy18 = c022_dummy18;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return c022_dummy15;
    case 1: return c022_dummy16;
    case 2: return c022_dummy17;
    case 3: return c022_dummy18;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: c022_dummy15 = (java.lang.Long)value$; break;
    case 1: c022_dummy16 = (java.lang.Long)value$; break;
    case 2: c022_dummy17 = (java.lang.Long)value$; break;
    case 3: c022_dummy18 = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'c022_dummy15' field.
   * @return The value of the 'c022_dummy15' field.
   */
  public java.lang.Long getC022Dummy15() {
    return c022_dummy15;
  }

  /**
   * Sets the value of the 'c022_dummy15' field.
   * @param value the value to set.
   */
  public void setC022Dummy15(java.lang.Long value) {
    this.c022_dummy15 = value;
  }

  /**
   * Gets the value of the 'c022_dummy16' field.
   * @return The value of the 'c022_dummy16' field.
   */
  public java.lang.Long getC022Dummy16() {
    return c022_dummy16;
  }

  /**
   * Sets the value of the 'c022_dummy16' field.
   * @param value the value to set.
   */
  public void setC022Dummy16(java.lang.Long value) {
    this.c022_dummy16 = value;
  }

  /**
   * Gets the value of the 'c022_dummy17' field.
   * @return The value of the 'c022_dummy17' field.
   */
  public java.lang.Long getC022Dummy17() {
    return c022_dummy17;
  }

  /**
   * Sets the value of the 'c022_dummy17' field.
   * @param value the value to set.
   */
  public void setC022Dummy17(java.lang.Long value) {
    this.c022_dummy17 = value;
  }

  /**
   * Gets the value of the 'c022_dummy18' field.
   * @return The value of the 'c022_dummy18' field.
   */
  public java.lang.Long getC022Dummy18() {
    return c022_dummy18;
  }

  /**
   * Sets the value of the 'c022_dummy18' field.
   * @param value the value to set.
   */
  public void setC022Dummy18(java.lang.Long value) {
    this.c022_dummy18 = value;
  }

  /**
   * Creates a new C022 RecordBuilder.
   * @return A new C022 RecordBuilder
   */
  public static org.apache.avro.example.bean.C022.Builder newBuilder() {
    return new org.apache.avro.example.bean.C022.Builder();
  }

  /**
   * Creates a new C022 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new C022 RecordBuilder
   */
  public static org.apache.avro.example.bean.C022.Builder newBuilder(org.apache.avro.example.bean.C022.Builder other) {
    return new org.apache.avro.example.bean.C022.Builder(other);
  }

  /**
   * Creates a new C022 RecordBuilder by copying an existing C022 instance.
   * @param other The existing instance to copy.
   * @return A new C022 RecordBuilder
   */
  public static org.apache.avro.example.bean.C022.Builder newBuilder(org.apache.avro.example.bean.C022 other) {
    return new org.apache.avro.example.bean.C022.Builder(other);
  }

  /**
   * RecordBuilder for C022 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<C022>
    implements org.apache.avro.data.RecordBuilder<C022> {

    private java.lang.Long c022_dummy15;
    private java.lang.Long c022_dummy16;
    private java.lang.Long c022_dummy17;
    private java.lang.Long c022_dummy18;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.example.bean.C022.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.c022_dummy15)) {
        this.c022_dummy15 = data().deepCopy(fields()[0].schema(), other.c022_dummy15);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.c022_dummy16)) {
        this.c022_dummy16 = data().deepCopy(fields()[1].schema(), other.c022_dummy16);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.c022_dummy17)) {
        this.c022_dummy17 = data().deepCopy(fields()[2].schema(), other.c022_dummy17);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.c022_dummy18)) {
        this.c022_dummy18 = data().deepCopy(fields()[3].schema(), other.c022_dummy18);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing C022 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.example.bean.C022 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.c022_dummy15)) {
        this.c022_dummy15 = data().deepCopy(fields()[0].schema(), other.c022_dummy15);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.c022_dummy16)) {
        this.c022_dummy16 = data().deepCopy(fields()[1].schema(), other.c022_dummy16);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.c022_dummy17)) {
        this.c022_dummy17 = data().deepCopy(fields()[2].schema(), other.c022_dummy17);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.c022_dummy18)) {
        this.c022_dummy18 = data().deepCopy(fields()[3].schema(), other.c022_dummy18);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'c022_dummy15' field.
      * @return The value.
      */
    public java.lang.Long getC022Dummy15() {
      return c022_dummy15;
    }

    /**
      * Sets the value of the 'c022_dummy15' field.
      * @param value The value of 'c022_dummy15'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder setC022Dummy15(java.lang.Long value) {
      validate(fields()[0], value);
      this.c022_dummy15 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'c022_dummy15' field has been set.
      * @return True if the 'c022_dummy15' field has been set, false otherwise.
      */
    public boolean hasC022Dummy15() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'c022_dummy15' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder clearC022Dummy15() {
      c022_dummy15 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'c022_dummy16' field.
      * @return The value.
      */
    public java.lang.Long getC022Dummy16() {
      return c022_dummy16;
    }

    /**
      * Sets the value of the 'c022_dummy16' field.
      * @param value The value of 'c022_dummy16'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder setC022Dummy16(java.lang.Long value) {
      validate(fields()[1], value);
      this.c022_dummy16 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'c022_dummy16' field has been set.
      * @return True if the 'c022_dummy16' field has been set, false otherwise.
      */
    public boolean hasC022Dummy16() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'c022_dummy16' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder clearC022Dummy16() {
      c022_dummy16 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'c022_dummy17' field.
      * @return The value.
      */
    public java.lang.Long getC022Dummy17() {
      return c022_dummy17;
    }

    /**
      * Sets the value of the 'c022_dummy17' field.
      * @param value The value of 'c022_dummy17'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder setC022Dummy17(java.lang.Long value) {
      validate(fields()[2], value);
      this.c022_dummy17 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'c022_dummy17' field has been set.
      * @return True if the 'c022_dummy17' field has been set, false otherwise.
      */
    public boolean hasC022Dummy17() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'c022_dummy17' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder clearC022Dummy17() {
      c022_dummy17 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'c022_dummy18' field.
      * @return The value.
      */
    public java.lang.Long getC022Dummy18() {
      return c022_dummy18;
    }

    /**
      * Sets the value of the 'c022_dummy18' field.
      * @param value The value of 'c022_dummy18'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder setC022Dummy18(java.lang.Long value) {
      validate(fields()[3], value);
      this.c022_dummy18 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'c022_dummy18' field has been set.
      * @return True if the 'c022_dummy18' field has been set, false otherwise.
      */
    public boolean hasC022Dummy18() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'c022_dummy18' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C022.Builder clearC022Dummy18() {
      c022_dummy18 = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public C022 build() {
      try {
        C022 record = new C022();
        record.c022_dummy15 = fieldSetFlags()[0] ? this.c022_dummy15 : (java.lang.Long) defaultValue(fields()[0]);
        record.c022_dummy16 = fieldSetFlags()[1] ? this.c022_dummy16 : (java.lang.Long) defaultValue(fields()[1]);
        record.c022_dummy17 = fieldSetFlags()[2] ? this.c022_dummy17 : (java.lang.Long) defaultValue(fields()[2]);
        record.c022_dummy18 = fieldSetFlags()[3] ? this.c022_dummy18 : (java.lang.Long) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<C022>
    WRITER$ = (org.apache.avro.io.DatumWriter<C022>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<C022>
    READER$ = (org.apache.avro.io.DatumReader<C022>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}