// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmBsnUdf5MaskedVer13 implements OFOxmBsnUdf5Masked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnUdf5MaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;

        private final static UDF DEFAULT_VALUE = UDF.ZERO;
        private final static UDF DEFAULT_VALUE_MASK = UDF.ZERO;

    // OF message fields
    private final UDF value;
    private final UDF mask;
//
    // Immutable default instance
    final static OFOxmBsnUdf5MaskedVer13 DEFAULT = new OFOxmBsnUdf5MaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnUdf5MaskedVer13(UDF value, UDF mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnUdf5MaskedVer13: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnUdf5MaskedVer13: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x31b08L;
    }

    @Override
    public UDF getValue() {
        return value;
    }

    @Override
    public UDF getMask() {
        return mask;
    }

    @Override
    public MatchField<UDF> getMatchField() {
        return MatchField.BSN_UDF5;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<UDF> getCanonical() {
        if (UDF.NO_MASK.equals(mask)) {
            return new OFOxmBsnUdf5Ver13(value);
        } else if(UDF.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnUdf5Masked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnUdf5Masked.Builder {
        final OFOxmBsnUdf5MaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private UDF value;
        private boolean maskSet;
        private UDF mask;

        BuilderWithParent(OFOxmBsnUdf5MaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x31b08L;
    }

    @Override
    public UDF getValue() {
        return value;
    }

    @Override
    public OFOxmBsnUdf5Masked.Builder setValue(UDF value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public UDF getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnUdf5Masked.Builder setMask(UDF mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<UDF> getMatchField() {
        return MatchField.BSN_UDF5;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<UDF> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnUdf5Masked build() {
                UDF value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                UDF mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnUdf5MaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnUdf5Masked.Builder {
        // OF message fields
        private boolean valueSet;
        private UDF value;
        private boolean maskSet;
        private UDF mask;

    @Override
    public long getTypeLen() {
        return 0x31b08L;
    }

    @Override
    public UDF getValue() {
        return value;
    }

    @Override
    public OFOxmBsnUdf5Masked.Builder setValue(UDF value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public UDF getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnUdf5Masked.Builder setMask(UDF mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<UDF> getMatchField() {
        return MatchField.BSN_UDF5;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<UDF> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnUdf5Masked build() {
            UDF value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            UDF mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnUdf5MaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFOxmBsnUdf5Masked> {
        @Override
        public OFOxmBsnUdf5Masked readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            // fixed value property typeLen == 0x31b08L
            int typeLen = bb.readInt();
            if(typeLen != 0x31b08)
                throw new OFParseError("Wrong typeLen: Expected=0x31b08L(0x31b08L), got="+typeLen);
            UDF value = UDF.read4Bytes(bb);
            UDF mask = UDF.read4Bytes(bb);

            OFOxmBsnUdf5MaskedVer13 oxmBsnUdf5MaskedVer13 = new OFOxmBsnUdf5MaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnUdf5MaskedVer13);
            return oxmBsnUdf5MaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnUdf5MaskedVer13Funnel FUNNEL = new OFOxmBsnUdf5MaskedVer13Funnel();
    static class OFOxmBsnUdf5MaskedVer13Funnel implements Funnel<OFOxmBsnUdf5MaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnUdf5MaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x31b08L
            sink.putInt(0x31b08);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnUdf5MaskedVer13> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnUdf5MaskedVer13 message) {
            // fixed value property typeLen = 0x31b08L
            bb.writeInt(0x31b08);
            message.value.write4Bytes(bb);
            message.mask.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnUdf5MaskedVer13(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("mask=").append(mask);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFOxmBsnUdf5MaskedVer13 other = (OFOxmBsnUdf5MaskedVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        return result;
    }

}
