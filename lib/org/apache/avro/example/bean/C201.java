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
public class C201 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8402236025285038067L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"C201\",\"namespace\":\"org.apache.avro.example.bean\",\"fields\":[{\"name\":\"c201_dummy15\",\"type\":[\"long\",\"null\"]},{\"name\":\"c201_dummy16\",\"type\":[\"long\",\"null\"]},{\"name\":\"c201_dummy17\",\"type\":[\"long\",\"null\"]},{\"name\":\"c201_dummy18\",\"type\":[\"long\",\"null\"]},{\"name\":\"c201_dummy19\",\"type\":[\"long\",\"null\"]},{\"name\":\"c201_dummy20\",\"type\":[\"long\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<C201> ENCODER =
      new BinaryMessageEncoder<C201>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<C201> DECODER =
      new BinaryMessageDecoder<C201>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<C201> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<C201> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<C201>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this C201 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a C201 from a ByteBuffer. */
  public static C201 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Long c201_dummy15;
  @Deprecated public java.lang.Long c201_dummy16;
  @Deprecated public java.lang.Long c201_dummy17;
  @Deprecated public java.lang.Long c201_dummy18;
  @Deprecated public java.lang.Long c201_dummy19;
  @Deprecated public java.lang.Long c201_dummy20;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public C201() {}

  /**
   * All-args constructor.
   * @param c201_dummy15 The new value for c201_dummy15
   * @param c201_dummy16 The new value for c201_dummy16
   * @param c201_dummy17 The new value for c201_dummy17
   * @param c201_dummy18 The new value for c201_dummy18
   * @param c201_dummy19 The new value for c201_dummy19
   * @param c201_dummy20 The new value for c201_dummy20
   */
  public C201(java.lang.Long c201_dummy15, java.lang.Long c201_dummy16, java.lang.Long c201_dummy17, java.lang.Long c201_dummy18, java.lang.Long c201_dummy19, java.lang.Long c201_dummy20) {
    this.c201_dummy15 = c201_dummy15;
    this.c201_dummy16 = c201_dummy16;
    this.c201_dummy17 = c201_dummy17;
    this.c201_dummy18 = c201_dummy18;
    this.c201_dummy19 = c201_dummy19;
    this.c201_dummy20 = c201_dummy20;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return c201_dummy15;
    case 1: return c201_dummy16;
    case 2: return c201_dummy17;
    case 3: return c201_dummy18;
    case 4: return c201_dummy19;
    case 5: return c201_dummy20;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: c201_dummy15 = (java.lang.Long)value$; break;
    case 1: c201_dummy16 = (java.lang.Long)value$; break;
    case 2: c201_dummy17 = (java.lang.Long)value$; break;
    case 3: c201_dummy18 = (java.lang.Long)value$; break;
    case 4: c201_dummy19 = (java.lang.Long)value$; break;
    case 5: c201_dummy20 = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'c201_dummy15' field.
   * @return The value of the 'c201_dummy15' field.
   */
  public java.lang.Long getC201Dummy15() {
    return c201_dummy15;
  }

  /**
   * Sets the value of the 'c201_dummy15' field.
   * @param value the value to set.
   */
  public void setC201Dummy15(java.lang.Long value) {
    this.c201_dummy15 = value;
  }

  /**
   * Gets the value of the 'c201_dummy16' field.
   * @return The value of the 'c201_dummy16' field.
   */
  public java.lang.Long getC201Dummy16() {
    return c201_dummy16;
  }

  /**
   * Sets the value of the 'c201_dummy16' field.
   * @param value the value to set.
   */
  public void setC201Dummy16(java.lang.Long value) {
    this.c201_dummy16 = value;
  }

  /**
   * Gets the value of the 'c201_dummy17' field.
   * @return The value of the 'c201_dummy17' field.
   */
  public java.lang.Long getC201Dummy17() {
    return c201_dummy17;
  }

  /**
   * Sets the value of the 'c201_dummy17' field.
   * @param value the value to set.
   */
  public void setC201Dummy17(java.lang.Long value) {
    this.c201_dummy17 = value;
  }

  /**
   * Gets the value of the 'c201_dummy18' field.
   * @return The value of the 'c201_dummy18' field.
   */
  public java.lang.Long getC201Dummy18() {
    return c201_dummy18;
  }

  /**
   * Sets the value of the 'c201_dummy18' field.
   * @param value the value to set.
   */
  public void setC201Dummy18(java.lang.Long value) {
    this.c201_dummy18 = value;
  }

  /**
   * Gets the value of the 'c201_dummy19' field.
   * @return The value of the 'c201_dummy19' field.
   */
  public java.lang.Long getC201Dummy19() {
    return c201_dummy19;
  }

  /**
   * Sets the value of the 'c201_dummy19' field.
   * @param value the value to set.
   */
  public void setC201Dummy19(java.lang.Long value) {
    this.c201_dummy19 = value;
  }

  /**
   * Gets the value of the 'c201_dummy20' field.
   * @return The value of the 'c201_dummy20' field.
   */
  public java.lang.Long getC201Dummy20() {
    return c201_dummy20;
  }

  /**
   * Sets the value of the 'c201_dummy20' field.
   * @param value the value to set.
   */
  public void setC201Dummy20(java.lang.Long value) {
    this.c201_dummy20 = value;
  }

  /**
   * Creates a new C201 RecordBuilder.
   * @return A new C201 RecordBuilder
   */
  public static org.apache.avro.example.bean.C201.Builder newBuilder() {
    return new org.apache.avro.example.bean.C201.Builder();
  }

  /**
   * Creates a new C201 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new C201 RecordBuilder
   */
  public static org.apache.avro.example.bean.C201.Builder newBuilder(org.apache.avro.example.bean.C201.Builder other) {
    return new org.apache.avro.example.bean.C201.Builder(other);
  }

  /**
   * Creates a new C201 RecordBuilder by copying an existing C201 instance.
   * @param other The existing instance to copy.
   * @return A new C201 RecordBuilder
   */
  public static org.apache.avro.example.bean.C201.Builder newBuilder(org.apache.avro.example.bean.C201 other) {
    return new org.apache.avro.example.bean.C201.Builder(other);
  }

  /**
   * RecordBuilder for C201 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<C201>
    implements org.apache.avro.data.RecordBuilder<C201> {

    private java.lang.Long c201_dummy15;
    private java.lang.Long c201_dummy16;
    private java.lang.Long c201_dummy17;
    private java.lang.Long c201_dummy18;
    private java.lang.Long c201_dummy19;
    private java.lang.Long c201_dummy20;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.example.bean.C201.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.c201_dummy15)) {
        this.c201_dummy15 = data().deepCopy(fields()[0].schema(), other.c201_dummy15);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.c201_dummy16)) {
        this.c201_dummy16 = data().deepCopy(fields()[1].schema(), other.c201_dummy16);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.c201_dummy17)) {
        this.c201_dummy17 = data().deepCopy(fields()[2].schema(), other.c201_dummy17);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.c201_dummy18)) {
        this.c201_dummy18 = data().deepCopy(fields()[3].schema(), other.c201_dummy18);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.c201_dummy19)) {
        this.c201_dummy19 = data().deepCopy(fields()[4].schema(), other.c201_dummy19);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.c201_dummy20)) {
        this.c201_dummy20 = data().deepCopy(fields()[5].schema(), other.c201_dummy20);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing C201 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.example.bean.C201 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.c201_dummy15)) {
        this.c201_dummy15 = data().deepCopy(fields()[0].schema(), other.c201_dummy15);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.c201_dummy16)) {
        this.c201_dummy16 = data().deepCopy(fields()[1].schema(), other.c201_dummy16);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.c201_dummy17)) {
        this.c201_dummy17 = data().deepCopy(fields()[2].schema(), other.c201_dummy17);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.c201_dummy18)) {
        this.c201_dummy18 = data().deepCopy(fields()[3].schema(), other.c201_dummy18);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.c201_dummy19)) {
        this.c201_dummy19 = data().deepCopy(fields()[4].schema(), other.c201_dummy19);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.c201_dummy20)) {
        this.c201_dummy20 = data().deepCopy(fields()[5].schema(), other.c201_dummy20);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'c201_dummy15' field.
      * @return The value.
      */
    public java.lang.Long getC201Dummy15() {
      return c201_dummy15;
    }

    /**
      * Sets the value of the 'c201_dummy15' field.
      * @param value The value of 'c201_dummy15'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder setC201Dummy15(java.lang.Long value) {
      validate(fields()[0], value);
      this.c201_dummy15 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'c201_dummy15' field has been set.
      * @return True if the 'c201_dummy15' field has been set, false otherwise.
      */
    public boolean hasC201Dummy15() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'c201_dummy15' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder clearC201Dummy15() {
      c201_dummy15 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'c201_dummy16' field.
      * @return The value.
      */
    public java.lang.Long getC201Dummy16() {
      return c201_dummy16;
    }

    /**
      * Sets the value of the 'c201_dummy16' field.
      * @param value The value of 'c201_dummy16'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder setC201Dummy16(java.lang.Long value) {
      validate(fields()[1], value);
      this.c201_dummy16 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'c201_dummy16' field has been set.
      * @return True if the 'c201_dummy16' field has been set, false otherwise.
      */
    public boolean hasC201Dummy16() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'c201_dummy16' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder clearC201Dummy16() {
      c201_dummy16 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'c201_dummy17' field.
      * @return The value.
      */
    public java.lang.Long getC201Dummy17() {
      return c201_dummy17;
    }

    /**
      * Sets the value of the 'c201_dummy17' field.
      * @param value The value of 'c201_dummy17'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder setC201Dummy17(java.lang.Long value) {
      validate(fields()[2], value);
      this.c201_dummy17 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'c201_dummy17' field has been set.
      * @return True if the 'c201_dummy17' field has been set, false otherwise.
      */
    public boolean hasC201Dummy17() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'c201_dummy17' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder clearC201Dummy17() {
      c201_dummy17 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'c201_dummy18' field.
      * @return The value.
      */
    public java.lang.Long getC201Dummy18() {
      return c201_dummy18;
    }

    /**
      * Sets the value of the 'c201_dummy18' field.
      * @param value The value of 'c201_dummy18'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder setC201Dummy18(java.lang.Long value) {
      validate(fields()[3], value);
      this.c201_dummy18 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'c201_dummy18' field has been set.
      * @return True if the 'c201_dummy18' field has been set, false otherwise.
      */
    public boolean hasC201Dummy18() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'c201_dummy18' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder clearC201Dummy18() {
      c201_dummy18 = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'c201_dummy19' field.
      * @return The value.
      */
    public java.lang.Long getC201Dummy19() {
      return c201_dummy19;
    }

    /**
      * Sets the value of the 'c201_dummy19' field.
      * @param value The value of 'c201_dummy19'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder setC201Dummy19(java.lang.Long value) {
      validate(fields()[4], value);
      this.c201_dummy19 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'c201_dummy19' field has been set.
      * @return True if the 'c201_dummy19' field has been set, false otherwise.
      */
    public boolean hasC201Dummy19() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'c201_dummy19' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder clearC201Dummy19() {
      c201_dummy19 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'c201_dummy20' field.
      * @return The value.
      */
    public java.lang.Long getC201Dummy20() {
      return c201_dummy20;
    }

    /**
      * Sets the value of the 'c201_dummy20' field.
      * @param value The value of 'c201_dummy20'.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder setC201Dummy20(java.lang.Long value) {
      validate(fields()[5], value);
      this.c201_dummy20 = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'c201_dummy20' field has been set.
      * @return True if the 'c201_dummy20' field has been set, false otherwise.
      */
    public boolean hasC201Dummy20() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'c201_dummy20' field.
      * @return This builder.
      */
    public org.apache.avro.example.bean.C201.Builder clearC201Dummy20() {
      c201_dummy20 = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public C201 build() {
      try {
        C201 record = new C201();
        record.c201_dummy15 = fieldSetFlags()[0] ? this.c201_dummy15 : (java.lang.Long) defaultValue(fields()[0]);
        record.c201_dummy16 = fieldSetFlags()[1] ? this.c201_dummy16 : (java.lang.Long) defaultValue(fields()[1]);
        record.c201_dummy17 = fieldSetFlags()[2] ? this.c201_dummy17 : (java.lang.Long) defaultValue(fields()[2]);
        record.c201_dummy18 = fieldSetFlags()[3] ? this.c201_dummy18 : (java.lang.Long) defaultValue(fields()[3]);
        record.c201_dummy19 = fieldSetFlags()[4] ? this.c201_dummy19 : (java.lang.Long) defaultValue(fields()[4]);
        record.c201_dummy20 = fieldSetFlags()[5] ? this.c201_dummy20 : (java.lang.Long) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<C201>
    WRITER$ = (org.apache.avro.io.DatumWriter<C201>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<C201>
    READER$ = (org.apache.avro.io.DatumReader<C201>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}