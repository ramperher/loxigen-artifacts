// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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

class OFOxmBsnGlobalVrfAllowedMaskedVer12 implements OFOxmBsnGlobalVrfAllowedMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnGlobalVrfAllowedMaskedVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 6;

        private final static OFBooleanValue DEFAULT_VALUE = OFBooleanValue.FALSE;
        private final static OFBooleanValue DEFAULT_VALUE_MASK = OFBooleanValue.FALSE;

    // OF message fields
    private final OFBooleanValue value;
    private final OFBooleanValue mask;
//
    // Immutable default instance
    final static OFOxmBsnGlobalVrfAllowedMaskedVer12 DEFAULT = new OFOxmBsnGlobalVrfAllowedMaskedVer12(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnGlobalVrfAllowedMaskedVer12(OFBooleanValue value, OFBooleanValue mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnGlobalVrfAllowedMaskedVer12: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnGlobalVrfAllowedMaskedVer12: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x30702L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_GLOBAL_VRF_ALLOWED;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<OFBooleanValue> getCanonical() {
        if (OFBooleanValue.NO_MASK.equals(mask)) {
            return new OFOxmBsnGlobalVrfAllowedVer12(value);
        } else if(OFBooleanValue.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmBsnGlobalVrfAllowedMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnGlobalVrfAllowedMasked.Builder {
        final OFOxmBsnGlobalVrfAllowedMaskedVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;
        private boolean maskSet;
        private OFBooleanValue mask;

        BuilderWithParent(OFOxmBsnGlobalVrfAllowedMaskedVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x30702L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmBsnGlobalVrfAllowedMasked.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnGlobalVrfAllowedMasked.Builder setMask(OFBooleanValue mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_GLOBAL_VRF_ALLOWED;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmBsnGlobalVrfAllowedMasked build() {
                OFBooleanValue value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                OFBooleanValue mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnGlobalVrfAllowedMaskedVer12(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnGlobalVrfAllowedMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;
        private boolean maskSet;
        private OFBooleanValue mask;

    @Override
    public long getTypeLen() {
        return 0x30702L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmBsnGlobalVrfAllowedMasked.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnGlobalVrfAllowedMasked.Builder setMask(OFBooleanValue mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_GLOBAL_VRF_ALLOWED;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmBsnGlobalVrfAllowedMasked build() {
            OFBooleanValue value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            OFBooleanValue mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnGlobalVrfAllowedMaskedVer12(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFOxmBsnGlobalVrfAllowedMasked> {
        @Override
        public OFOxmBsnGlobalVrfAllowedMasked readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            // fixed value property typeLen == 0x30702L
            int typeLen = bb.readInt();
            if(typeLen != 0x30702)
                throw new OFParseError("Wrong typeLen: Expected=0x30702L(0x30702L), got="+typeLen);
            OFBooleanValue value = OFBooleanValue.of(bb.readByte() != 0);
            OFBooleanValue mask = OFBooleanValue.of(bb.readByte() != 0);

            OFOxmBsnGlobalVrfAllowedMaskedVer12 oxmBsnGlobalVrfAllowedMaskedVer12 = new OFOxmBsnGlobalVrfAllowedMaskedVer12(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnGlobalVrfAllowedMaskedVer12);
            return oxmBsnGlobalVrfAllowedMaskedVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnGlobalVrfAllowedMaskedVer12Funnel FUNNEL = new OFOxmBsnGlobalVrfAllowedMaskedVer12Funnel();
    static class OFOxmBsnGlobalVrfAllowedMaskedVer12Funnel implements Funnel<OFOxmBsnGlobalVrfAllowedMaskedVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnGlobalVrfAllowedMaskedVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x30702L
            sink.putInt(0x30702);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnGlobalVrfAllowedMaskedVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnGlobalVrfAllowedMaskedVer12 message) {
            // fixed value property typeLen = 0x30702L
            bb.writeInt(0x30702);
            bb.writeByte(message.value.getInt());
            bb.writeByte(message.mask.getInt());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnGlobalVrfAllowedMaskedVer12(");
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
        OFOxmBsnGlobalVrfAllowedMaskedVer12 other = (OFOxmBsnGlobalVrfAllowedMaskedVer12) obj;

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
