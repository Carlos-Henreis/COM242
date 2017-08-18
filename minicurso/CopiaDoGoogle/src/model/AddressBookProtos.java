package model;


public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tutorial.Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required int32 id = 2;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 2;</code>
     */
    int getId();

    /**
     * <code>optional string email = 3;</code>
     */
    boolean hasEmail();
    /**
     * <code>optional string email = 3;</code>
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 3;</code>
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       * @return 
     */
    java.util.List<model.AddressBookProtos.Person.PhoneNumber> 
        getPhonesList();
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       * @param index
       * @return 
     */
    model.AddressBookProtos.Person.PhoneNumber getPhones(int index);
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       * @return 
     */
    int getPhonesCount();
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       * @return 
     */
    java.util.List<? extends model.AddressBookProtos.Person.PhoneNumberOrBuilder> 
        getPhonesOrBuilderList();
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       * @param index
       * @return 
     */
    model.AddressBookProtos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code tutorial.Person}
   */
  public  static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tutorial.Person)
      PersonOrBuilder {
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      name_ = "";
      id_ = 0;
      email_ = "";
      phones_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              email_ = bs;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                phones_ = new java.util.ArrayList<model.AddressBookProtos.Person.PhoneNumber>();
                mutable_bitField0_ |= 0x00000008;
              }
              phones_.add(
                  input.readMessage(model.AddressBookProtos.Person.PhoneNumber.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          phones_ = java.util.Collections.unmodifiableList(phones_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return model.AddressBookProtos.internal_static_tutorial_Person_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return model.AddressBookProtos.internal_static_tutorial_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              model.AddressBookProtos.Person.class, model.AddressBookProtos.Person.Builder.class);
    }

    /**
     * Protobuf enum {@code tutorial.Person.PhoneType}
     */
    public enum PhoneType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>MOBILE = 0;</code>
       */
      MOBILE(0),
      /**
       * <code>HOME = 1;</code>
       */
      HOME(1),
      /**
       * <code>WORK = 2;</code>
       */
      WORK(2),
      ;

      /**
       * <code>MOBILE = 0;</code>
       */
      public static final int MOBILE_VALUE = 0;
      /**
       * <code>HOME = 1;</code>
       */
      public static final int HOME_VALUE = 1;
      /**
       * <code>WORK = 2;</code>
       */
      public static final int WORK_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static PhoneType valueOf(int value) {
        return forNumber(value);
      }

      public static PhoneType forNumber(int value) {
        switch (value) {
          case 0: return MOBILE;
          case 1: return HOME;
          case 2: return WORK;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PhoneType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PhoneType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PhoneType>() {
              public PhoneType findValueByNumber(int number) {
                return PhoneType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return model.AddressBookProtos.Person.getDescriptor().getEnumTypes().get(0);
      }

      private static final PhoneType[] VALUES = values();

      public static PhoneType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private PhoneType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:tutorial.Person.PhoneType)
    }

    public interface PhoneNumberOrBuilder extends
        // @@protoc_insertion_point(interface_extends:tutorial.Person.PhoneNumber)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>required string number = 1;</code>
       */
      boolean hasNumber();
      /**
       * <code>required string number = 1;</code>
       */
      java.lang.String getNumber();
      /**
       * <code>required string number = 1;</code>
       */
      com.google.protobuf.ByteString
          getNumberBytes();

      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       */
      boolean hasType();
      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       */
      model.AddressBookProtos.Person.PhoneType getType();
    }
    /**
     * Protobuf type {@code tutorial.Person.PhoneNumber}
     */
    public  static final class PhoneNumber extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:tutorial.Person.PhoneNumber)
        PhoneNumberOrBuilder {
      // Use PhoneNumber.newBuilder() to construct.
      private PhoneNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private PhoneNumber() {
        number_ = "";
        type_ = 1;
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private PhoneNumber(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                number_ = bs;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();
                model.AddressBookProtos.Person.PhoneType value = model.AddressBookProtos.Person.PhoneType.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(2, rawValue);
                } else {
                  bitField0_ |= 0x00000002;
                  type_ = rawValue;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return model.AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return model.AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                model.AddressBookProtos.Person.PhoneNumber.class, model.AddressBookProtos.Person.PhoneNumber.Builder.class);
      }

      private int bitField0_;
      public static final int NUMBER_FIELD_NUMBER = 1;
      private volatile java.lang.Object number_;
      /**
       * <code>required string number = 1;</code>
       */
      public boolean hasNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string number = 1;</code>
       */
      public java.lang.String getNumber() {
        java.lang.Object ref = number_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            number_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string number = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNumberBytes() {
        java.lang.Object ref = number_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          number_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       */
      public model.AddressBookProtos.Person.PhoneType getType() {
        model.AddressBookProtos.Person.PhoneType result = model.AddressBookProtos.Person.PhoneType.valueOf(type_);
        return result == null ? model.AddressBookProtos.Person.PhoneType.HOME : result;
      }

      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasNumber()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeEnum(2, type_);
        }
        unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(2, type_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof model.AddressBookProtos.Person.PhoneNumber)) {
          return super.equals(obj);
        }
        model.AddressBookProtos.Person.PhoneNumber other = (model.AddressBookProtos.Person.PhoneNumber) obj;

        boolean result = true;
        result = result && (hasNumber() == other.hasNumber());
        if (hasNumber()) {
          result = result && getNumber()
              .equals(other.getNumber());
        }
        result = result && (hasType() == other.hasType());
        if (hasType()) {
          result = result && type_ == other.type_;
        }
        result = result && unknownFields.equals(other.unknownFields);
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasNumber()) {
          hash = (37 * hash) + NUMBER_FIELD_NUMBER;
          hash = (53 * hash) + getNumber().hashCode();
        }
        if (hasType()) {
          hash = (37 * hash) + TYPE_FIELD_NUMBER;
          hash = (53 * hash) + type_;
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static model.AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(model.AddressBookProtos.Person.PhoneNumber prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code tutorial.Person.PhoneNumber}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:tutorial.Person.PhoneNumber)
          model.AddressBookProtos.Person.PhoneNumberOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return model.AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return model.AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  model.AddressBookProtos.Person.PhoneNumber.class, model.AddressBookProtos.Person.PhoneNumber.Builder.class);
        }

        // Construct using model.AddressBookProtos.Person.PhoneNumber.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        public Builder clear() {
          super.clear();
          number_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          type_ = 1;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return model.AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_descriptor;
        }

        public model.AddressBookProtos.Person.PhoneNumber getDefaultInstanceForType() {
          return model.AddressBookProtos.Person.PhoneNumber.getDefaultInstance();
        }

        public model.AddressBookProtos.Person.PhoneNumber build() {
          model.AddressBookProtos.Person.PhoneNumber result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public model.AddressBookProtos.Person.PhoneNumber buildPartial() {
          model.AddressBookProtos.Person.PhoneNumber result = new model.AddressBookProtos.Person.PhoneNumber(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.number_ = number_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.type_ = type_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder clone() {
          return (Builder) super.clone();
        }
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return (Builder) super.setField(field, value);
        }
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof model.AddressBookProtos.Person.PhoneNumber) {
            return mergeFrom((model.AddressBookProtos.Person.PhoneNumber)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(model.AddressBookProtos.Person.PhoneNumber other) {
          if (other == model.AddressBookProtos.Person.PhoneNumber.getDefaultInstance()) return this;
          if (other.hasNumber()) {
            bitField0_ |= 0x00000001;
            number_ = other.number_;
            onChanged();
          }
          if (other.hasType()) {
            setType(other.getType());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        public final boolean isInitialized() {
          if (!hasNumber()) {
            return false;
          }
          return true;
        }

        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          model.AddressBookProtos.Person.PhoneNumber parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (model.AddressBookProtos.Person.PhoneNumber) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private java.lang.Object number_ = "";
        /**
         * <code>required string number = 1;</code>
         */
        public boolean hasNumber() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string number = 1;</code>
         */
        public java.lang.String getNumber() {
          java.lang.Object ref = number_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              number_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>required string number = 1;</code>
         */
        public com.google.protobuf.ByteString
            getNumberBytes() {
          java.lang.Object ref = number_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            number_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string number = 1;</code>
         */
        public Builder setNumber(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          number_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>required string number = 1;</code>
         */
        public Builder clearNumber() {
          bitField0_ = (bitField0_ & ~0x00000001);
          number_ = getDefaultInstance().getNumber();
          onChanged();
          return this;
        }
        /**
         * <code>required string number = 1;</code>
         */
        public Builder setNumberBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          number_ = value;
          onChanged();
          return this;
        }

        private int type_ = 1;
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         */
        public boolean hasType() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         */
        public model.AddressBookProtos.Person.PhoneType getType() {
          model.AddressBookProtos.Person.PhoneType result = model.AddressBookProtos.Person.PhoneType.valueOf(type_);
          return result == null ? model.AddressBookProtos.Person.PhoneType.HOME : result;
        }
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         */
        public Builder setType(model.AddressBookProtos.Person.PhoneType value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          type_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         */
        public Builder clearType() {
          bitField0_ = (bitField0_ & ~0x00000002);
          type_ = 1;
          onChanged();
          return this;
        }
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:tutorial.Person.PhoneNumber)
      }

      // @@protoc_insertion_point(class_scope:tutorial.Person.PhoneNumber)
      private static final model.AddressBookProtos.Person.PhoneNumber DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new model.AddressBookProtos.Person.PhoneNumber();
      }

      public static model.AddressBookProtos.Person.PhoneNumber getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<PhoneNumber>
          PARSER = new com.google.protobuf.AbstractParser<PhoneNumber>() {
        public PhoneNumber parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new PhoneNumber(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<PhoneNumber> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<PhoneNumber> getParserForType() {
        return PARSER;
      }

      public model.AddressBookProtos.Person.PhoneNumber getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>required int32 id = 2;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 id = 2;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    private volatile java.lang.Object email_;
    /**
     * <code>optional string email = 3;</code>
     */
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string email = 3;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          email_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PHONES_FIELD_NUMBER = 4;
    private java.util.List<model.AddressBookProtos.Person.PhoneNumber> phones_;
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    public java.util.List<model.AddressBookProtos.Person.PhoneNumber> getPhonesList() {
      return phones_;
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    public java.util.List<? extends model.AddressBookProtos.Person.PhoneNumberOrBuilder> 
        getPhonesOrBuilderList() {
      return phones_;
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    public int getPhonesCount() {
      return phones_.size();
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    public model.AddressBookProtos.Person.PhoneNumber getPhones(int index) {
      return phones_.get(index);
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    public model.AddressBookProtos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
        int index) {
      return phones_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPhonesCount(); i++) {
        if (!getPhones(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      for (int i = 0; i < phones_.size(); i++) {
        output.writeMessage(4, phones_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
      }
      for (int i = 0; i < phones_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, phones_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof model.AddressBookProtos.Person)) {
        return super.equals(obj);
      }
      model.AddressBookProtos.Person other = (model.AddressBookProtos.Person) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
      }
      result = result && (hasId() == other.hasId());
      if (hasId()) {
        result = result && (getId()
            == other.getId());
      }
      result = result && (hasEmail() == other.hasEmail());
      if (hasEmail()) {
        result = result && getEmail()
            .equals(other.getEmail());
      }
      result = result && getPhonesList()
          .equals(other.getPhonesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasEmail()) {
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
      }
      if (getPhonesCount() > 0) {
        hash = (37 * hash) + PHONES_FIELD_NUMBER;
        hash = (53 * hash) + getPhonesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static model.AddressBookProtos.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static model.AddressBookProtos.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static model.AddressBookProtos.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static model.AddressBookProtos.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static model.AddressBookProtos.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static model.AddressBookProtos.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static model.AddressBookProtos.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static model.AddressBookProtos.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static model.AddressBookProtos.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static model.AddressBookProtos.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static model.AddressBookProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static model.AddressBookProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(model.AddressBookProtos.Person prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code tutorial.Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tutorial.Person)
        model.AddressBookProtos.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return model.AddressBookProtos.internal_static_tutorial_Person_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return model.AddressBookProtos.internal_static_tutorial_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                model.AddressBookProtos.Person.class, model.AddressBookProtos.Person.Builder.class);
      }

      // Construct using model.AddressBookProtos.Person.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPhonesFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        if (phonesBuilder_ == null) {
          phones_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          phonesBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return model.AddressBookProtos.internal_static_tutorial_Person_descriptor;
      }

      public model.AddressBookProtos.Person getDefaultInstanceForType() {
        return model.AddressBookProtos.Person.getDefaultInstance();
      }

      public model.AddressBookProtos.Person build() {
        model.AddressBookProtos.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public model.AddressBookProtos.Person buildPartial() {
        model.AddressBookProtos.Person result = new model.AddressBookProtos.Person(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.email_ = email_;
        if (phonesBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            phones_ = java.util.Collections.unmodifiableList(phones_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.phones_ = phones_;
        } else {
          result.phones_ = phonesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof model.AddressBookProtos.Person) {
          return mergeFrom((model.AddressBookProtos.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(model.AddressBookProtos.Person other) {
        if (other == model.AddressBookProtos.Person.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasEmail()) {
          bitField0_ |= 0x00000004;
          email_ = other.email_;
          onChanged();
        }
        if (phonesBuilder_ == null) {
          if (!other.phones_.isEmpty()) {
            if (phones_.isEmpty()) {
              phones_ = other.phones_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensurePhonesIsMutable();
              phones_.addAll(other.phones_);
            }
            onChanged();
          }
        } else {
          if (!other.phones_.isEmpty()) {
            if (phonesBuilder_.isEmpty()) {
              phonesBuilder_.dispose();
              phonesBuilder_ = null;
              phones_ = other.phones_;
              bitField0_ = (bitField0_ & ~0x00000008);
              phonesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPhonesFieldBuilder() : null;
            } else {
              phonesBuilder_.addAllMessages(other.phones_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasId()) {
          return false;
        }
        for (int i = 0; i < getPhonesCount(); i++) {
          if (!getPhones(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        model.AddressBookProtos.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (model.AddressBookProtos.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>required int32 id = 2;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 id = 2;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 2;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 2;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>optional string email = 3;</code>
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            email_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000004);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }

      private java.util.List<model.AddressBookProtos.Person.PhoneNumber> phones_ =
        java.util.Collections.emptyList();
      private void ensurePhonesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          phones_ = new java.util.ArrayList<model.AddressBookProtos.Person.PhoneNumber>(phones_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          model.AddressBookProtos.Person.PhoneNumber, model.AddressBookProtos.Person.PhoneNumber.Builder, model.AddressBookProtos.Person.PhoneNumberOrBuilder> phonesBuilder_;

      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public java.util.List<model.AddressBookProtos.Person.PhoneNumber> getPhonesList() {
        if (phonesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(phones_);
        } else {
          return phonesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public int getPhonesCount() {
        if (phonesBuilder_ == null) {
          return phones_.size();
        } else {
          return phonesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public model.AddressBookProtos.Person.PhoneNumber getPhones(int index) {
        if (phonesBuilder_ == null) {
          return phones_.get(index);
        } else {
          return phonesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder setPhones(
          int index, model.AddressBookProtos.Person.PhoneNumber value) {
        if (phonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhonesIsMutable();
          phones_.set(index, value);
          onChanged();
        } else {
          phonesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder setPhones(
          int index, model.AddressBookProtos.Person.PhoneNumber.Builder builderForValue) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.set(index, builderForValue.build());
          onChanged();
        } else {
          phonesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(model.AddressBookProtos.Person.PhoneNumber value) {
        if (phonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhonesIsMutable();
          phones_.add(value);
          onChanged();
        } else {
          phonesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(
          int index, model.AddressBookProtos.Person.PhoneNumber value) {
        if (phonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhonesIsMutable();
          phones_.add(index, value);
          onChanged();
        } else {
          phonesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(
          model.AddressBookProtos.Person.PhoneNumber.Builder builderForValue) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.add(builderForValue.build());
          onChanged();
        } else {
          phonesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(
          int index, model.AddressBookProtos.Person.PhoneNumber.Builder builderForValue) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.add(index, builderForValue.build());
          onChanged();
        } else {
          phonesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addAllPhones(
          java.lang.Iterable<? extends model.AddressBookProtos.Person.PhoneNumber> values) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, phones_);
          onChanged();
        } else {
          phonesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder clearPhones() {
        if (phonesBuilder_ == null) {
          phones_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          phonesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder removePhones(int index) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.remove(index);
          onChanged();
        } else {
          phonesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public model.AddressBookProtos.Person.PhoneNumber.Builder getPhonesBuilder(
          int index) {
        return getPhonesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public model.AddressBookProtos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
          int index) {
        if (phonesBuilder_ == null) {
          return phones_.get(index);  } else {
          return phonesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public java.util.List<? extends model.AddressBookProtos.Person.PhoneNumberOrBuilder> 
           getPhonesOrBuilderList() {
        if (phonesBuilder_ != null) {
          return phonesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(phones_);
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public model.AddressBookProtos.Person.PhoneNumber.Builder addPhonesBuilder() {
        return getPhonesFieldBuilder().addBuilder(
            model.AddressBookProtos.Person.PhoneNumber.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public model.AddressBookProtos.Person.PhoneNumber.Builder addPhonesBuilder(
          int index) {
        return getPhonesFieldBuilder().addBuilder(
            index, model.AddressBookProtos.Person.PhoneNumber.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public java.util.List<model.AddressBookProtos.Person.PhoneNumber.Builder> 
           getPhonesBuilderList() {
        return getPhonesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          model.AddressBookProtos.Person.PhoneNumber, model.AddressBookProtos.Person.PhoneNumber.Builder, model.AddressBookProtos.Person.PhoneNumberOrBuilder> 
          getPhonesFieldBuilder() {
        if (phonesBuilder_ == null) {
          phonesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              model.AddressBookProtos.Person.PhoneNumber, model.AddressBookProtos.Person.PhoneNumber.Builder, model.AddressBookProtos.Person.PhoneNumberOrBuilder>(
                  phones_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          phones_ = null;
        }
        return phonesBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tutorial.Person)
    }

    // @@protoc_insertion_point(class_scope:tutorial.Person)
    private static final model.AddressBookProtos.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new model.AddressBookProtos.Person();
    }

    public static model.AddressBookProtos.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    public model.AddressBookProtos.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AddressBookOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tutorial.AddressBook)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    java.util.List<model.AddressBookProtos.Person> 
        getPeopleList();
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    model.AddressBookProtos.Person getPeople(int index);
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    int getPeopleCount();
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    java.util.List<? extends model.AddressBookProtos.PersonOrBuilder> 
        getPeopleOrBuilderList();
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    model.AddressBookProtos.PersonOrBuilder getPeopleOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code tutorial.AddressBook}
   */
  public  static final class AddressBook extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tutorial.AddressBook)
      AddressBookOrBuilder {
    // Use AddressBook.newBuilder() to construct.
    private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddressBook() {
      people_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddressBook(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                people_ = new java.util.ArrayList<model.AddressBookProtos.Person>();
                mutable_bitField0_ |= 0x00000001;
              }
              people_.add(
                  input.readMessage(model.AddressBookProtos.Person.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          people_ = java.util.Collections.unmodifiableList(people_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return model.AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return model.AddressBookProtos.internal_static_tutorial_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              model.AddressBookProtos.AddressBook.class, model.AddressBookProtos.AddressBook.Builder.class);
    }

    public static final int PEOPLE_FIELD_NUMBER = 1;
    private java.util.List<model.AddressBookProtos.Person> people_;
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    public java.util.List<model.AddressBookProtos.Person> getPeopleList() {
      return people_;
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    public java.util.List<? extends model.AddressBookProtos.PersonOrBuilder> 
        getPeopleOrBuilderList() {
      return people_;
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    public int getPeopleCount() {
      return people_.size();
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    public model.AddressBookProtos.Person getPeople(int index) {
      return people_.get(index);
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    public model.AddressBookProtos.PersonOrBuilder getPeopleOrBuilder(
        int index) {
      return people_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPeopleCount(); i++) {
        if (!getPeople(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < people_.size(); i++) {
        output.writeMessage(1, people_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < people_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, people_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof model.AddressBookProtos.AddressBook)) {
        return super.equals(obj);
      }
      model.AddressBookProtos.AddressBook other = (model.AddressBookProtos.AddressBook) obj;

      boolean result = true;
      result = result && getPeopleList()
          .equals(other.getPeopleList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPeopleCount() > 0) {
        hash = (37 * hash) + PEOPLE_FIELD_NUMBER;
        hash = (53 * hash) + getPeopleList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static model.AddressBookProtos.AddressBook parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static model.AddressBookProtos.AddressBook parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static model.AddressBookProtos.AddressBook parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static model.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(model.AddressBookProtos.AddressBook prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code tutorial.AddressBook}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tutorial.AddressBook)
        model.AddressBookProtos.AddressBookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return model.AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return model.AddressBookProtos.internal_static_tutorial_AddressBook_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                model.AddressBookProtos.AddressBook.class, model.AddressBookProtos.AddressBook.Builder.class);
      }

      // Construct using model.AddressBookProtos.AddressBook.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPeopleFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (peopleBuilder_ == null) {
          people_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          peopleBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return model.AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
      }

      public model.AddressBookProtos.AddressBook getDefaultInstanceForType() {
        return model.AddressBookProtos.AddressBook.getDefaultInstance();
      }

      public model.AddressBookProtos.AddressBook build() {
        model.AddressBookProtos.AddressBook result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public model.AddressBookProtos.AddressBook buildPartial() {
        model.AddressBookProtos.AddressBook result = new model.AddressBookProtos.AddressBook(this);
        int from_bitField0_ = bitField0_;
        if (peopleBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            people_ = java.util.Collections.unmodifiableList(people_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.people_ = people_;
        } else {
          result.people_ = peopleBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof model.AddressBookProtos.AddressBook) {
          return mergeFrom((model.AddressBookProtos.AddressBook)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(model.AddressBookProtos.AddressBook other) {
        if (other == model.AddressBookProtos.AddressBook.getDefaultInstance()) return this;
        if (peopleBuilder_ == null) {
          if (!other.people_.isEmpty()) {
            if (people_.isEmpty()) {
              people_ = other.people_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePeopleIsMutable();
              people_.addAll(other.people_);
            }
            onChanged();
          }
        } else {
          if (!other.people_.isEmpty()) {
            if (peopleBuilder_.isEmpty()) {
              peopleBuilder_.dispose();
              peopleBuilder_ = null;
              people_ = other.people_;
              bitField0_ = (bitField0_ & ~0x00000001);
              peopleBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPeopleFieldBuilder() : null;
            } else {
              peopleBuilder_.addAllMessages(other.people_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getPeopleCount(); i++) {
          if (!getPeople(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        model.AddressBookProtos.AddressBook parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (model.AddressBookProtos.AddressBook) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<model.AddressBookProtos.Person> people_ =
        java.util.Collections.emptyList();
      private void ensurePeopleIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          people_ = new java.util.ArrayList<model.AddressBookProtos.Person>(people_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          model.AddressBookProtos.Person, model.AddressBookProtos.Person.Builder, model.AddressBookProtos.PersonOrBuilder> peopleBuilder_;

      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public java.util.List<model.AddressBookProtos.Person> getPeopleList() {
        if (peopleBuilder_ == null) {
          return java.util.Collections.unmodifiableList(people_);
        } else {
          return peopleBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public int getPeopleCount() {
        if (peopleBuilder_ == null) {
          return people_.size();
        } else {
          return peopleBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public model.AddressBookProtos.Person getPeople(int index) {
        if (peopleBuilder_ == null) {
          return people_.get(index);
        } else {
          return peopleBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder setPeople(
          int index, model.AddressBookProtos.Person value) {
        if (peopleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePeopleIsMutable();
          people_.set(index, value);
          onChanged();
        } else {
          peopleBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder setPeople(
          int index, model.AddressBookProtos.Person.Builder builderForValue) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.set(index, builderForValue.build());
          onChanged();
        } else {
          peopleBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(model.AddressBookProtos.Person value) {
        if (peopleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePeopleIsMutable();
          people_.add(value);
          onChanged();
        } else {
          peopleBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(
          int index, model.AddressBookProtos.Person value) {
        if (peopleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePeopleIsMutable();
          people_.add(index, value);
          onChanged();
        } else {
          peopleBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(
          model.AddressBookProtos.Person.Builder builderForValue) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.add(builderForValue.build());
          onChanged();
        } else {
          peopleBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(
          int index, model.AddressBookProtos.Person.Builder builderForValue) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.add(index, builderForValue.build());
          onChanged();
        } else {
          peopleBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addAllPeople(
          java.lang.Iterable<? extends model.AddressBookProtos.Person> values) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, people_);
          onChanged();
        } else {
          peopleBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder clearPeople() {
        if (peopleBuilder_ == null) {
          people_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          peopleBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder removePeople(int index) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.remove(index);
          onChanged();
        } else {
          peopleBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public model.AddressBookProtos.Person.Builder getPeopleBuilder(
          int index) {
        return getPeopleFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public model.AddressBookProtos.PersonOrBuilder getPeopleOrBuilder(
          int index) {
        if (peopleBuilder_ == null) {
          return people_.get(index);  } else {
          return peopleBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public java.util.List<? extends model.AddressBookProtos.PersonOrBuilder> 
           getPeopleOrBuilderList() {
        if (peopleBuilder_ != null) {
          return peopleBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(people_);
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public model.AddressBookProtos.Person.Builder addPeopleBuilder() {
        return getPeopleFieldBuilder().addBuilder(
            model.AddressBookProtos.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public model.AddressBookProtos.Person.Builder addPeopleBuilder(
          int index) {
        return getPeopleFieldBuilder().addBuilder(
            index, model.AddressBookProtos.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public java.util.List<model.AddressBookProtos.Person.Builder> 
           getPeopleBuilderList() {
        return getPeopleFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          model.AddressBookProtos.Person, model.AddressBookProtos.Person.Builder, model.AddressBookProtos.PersonOrBuilder> 
          getPeopleFieldBuilder() {
        if (peopleBuilder_ == null) {
          peopleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              model.AddressBookProtos.Person, model.AddressBookProtos.Person.Builder, model.AddressBookProtos.PersonOrBuilder>(
                  people_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          people_ = null;
        }
        return peopleBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tutorial.AddressBook)
    }

    // @@protoc_insertion_point(class_scope:tutorial.AddressBook)
    private static final model.AddressBookProtos.AddressBook DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new model.AddressBookProtos.AddressBook();
    }

    public static model.AddressBookProtos.AddressBook getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<AddressBook>
        PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
      public AddressBook parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AddressBook(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddressBook> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddressBook> getParserForType() {
      return PARSER;
    }

    public model.AddressBookProtos.AddressBook getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_PhoneNumber_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressBook_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021addressbook.proto\022\010tutorial\"\333\001\n\006Person" +
      "\022\014\n\004name\030\001 \002(\t\022\n\n\002id\030\002 \002(\005\022\r\n\005email\030\003 \001(" +
      "\t\022,\n\006phones\030\004 \003(\0132\034.tutorial.Person.Phon" +
      "eNumber\032M\n\013PhoneNumber\022\016\n\006number\030\001 \002(\t\022." +
      "\n\004type\030\002 \001(\0162\032.tutorial.Person.PhoneType" +
      ":\004HOME\"+\n\tPhoneType\022\n\n\006MOBILE\020\000\022\010\n\004HOME\020" +
      "\001\022\010\n\004WORK\020\002\"/\n\013AddressBook\022 \n\006people\030\001 \003" +
      "(\0132\020.tutorial.PersonB)\n\024com.example.tuto" +
      "rialB\021AddressBookProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tutorial_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", });
    internal_static_tutorial_Person_PhoneNumber_descriptor =
      internal_static_tutorial_Person_descriptor.getNestedTypes().get(0);
    internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_tutorial_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressBook_descriptor,
        new java.lang.String[] { "People", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
