// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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

class OFOxmMplsBosMaskedVer15 implements OFOxmMplsBosMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmMplsBosMaskedVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 6;

        private final static OFBooleanValue DEFAULT_VALUE = OFBooleanValue.FALSE;
        private final static OFBooleanValue DEFAULT_VALUE_MASK = OFBooleanValue.FALSE;

    // OF message fields
    private final OFBooleanValue value;
    private final OFBooleanValue mask;
//
    // Immutable default instance
    final static OFOxmMplsBosMaskedVer15 DEFAULT = new OFOxmMplsBosMaskedVer15(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmMplsBosMaskedVer15(OFBooleanValue value, OFBooleanValue mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmMplsBosMaskedVer15: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmMplsBosMaskedVer15: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80004902L;
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
        return MatchField.MPLS_BOS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<OFBooleanValue> getCanonical() {
        if (OFBooleanValue.NO_MASK.equals(mask)) {
            return new OFOxmMplsBosVer15(value);
        } else if(OFBooleanValue.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFOxmMplsBosMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmMplsBosMasked.Builder {
        final OFOxmMplsBosMaskedVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;
        private boolean maskSet;
        private OFBooleanValue mask;

        BuilderWithParent(OFOxmMplsBosMaskedVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80004902L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmMplsBosMasked.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public OFOxmMplsBosMasked.Builder setMask(OFBooleanValue mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.MPLS_BOS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFOxmMplsBosMasked build() {
                OFBooleanValue value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                OFBooleanValue mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmMplsBosMaskedVer15(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmMplsBosMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;
        private boolean maskSet;
        private OFBooleanValue mask;

    @Override
    public long getTypeLen() {
        return 0x80004902L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmMplsBosMasked.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public OFOxmMplsBosMasked.Builder setMask(OFBooleanValue mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.MPLS_BOS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFOxmMplsBosMasked build() {
            OFBooleanValue value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            OFBooleanValue mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmMplsBosMaskedVer15(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFOxmMplsBosMasked> {
        @Override
        public OFOxmMplsBosMasked readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            // fixed value property typeLen == 0x80004902L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80004902)
                throw new OFParseError("Wrong typeLen: Expected=0x80004902L(0x80004902L), got="+typeLen);
            OFBooleanValue value = OFBooleanValue.of(bb.readByte() != 0);
            OFBooleanValue mask = OFBooleanValue.of(bb.readByte() != 0);

            OFOxmMplsBosMaskedVer15 oxmMplsBosMaskedVer15 = new OFOxmMplsBosMaskedVer15(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmMplsBosMaskedVer15);
            return oxmMplsBosMaskedVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmMplsBosMaskedVer15Funnel FUNNEL = new OFOxmMplsBosMaskedVer15Funnel();
    static class OFOxmMplsBosMaskedVer15Funnel implements Funnel<OFOxmMplsBosMaskedVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmMplsBosMaskedVer15 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80004902L
            sink.putInt((int) 0x80004902);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmMplsBosMaskedVer15> {
        @Override
        public void write(ByteBuf bb, OFOxmMplsBosMaskedVer15 message) {
            // fixed value property typeLen = 0x80004902L
            bb.writeInt((int) 0x80004902);
            bb.writeByte(message.value.getInt());
            bb.writeByte(message.mask.getInt());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmMplsBosMaskedVer15(");
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
        OFOxmMplsBosMaskedVer15 other = (OFOxmMplsBosMaskedVer15) obj;

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
