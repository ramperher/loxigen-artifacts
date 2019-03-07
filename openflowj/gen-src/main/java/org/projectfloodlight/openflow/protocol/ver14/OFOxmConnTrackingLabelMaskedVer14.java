// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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

class OFOxmConnTrackingLabelMaskedVer14 implements OFOxmConnTrackingLabelMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmConnTrackingLabelMaskedVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 36;

        private final static U128 DEFAULT_VALUE = U128.ZERO;
        private final static U128 DEFAULT_VALUE_MASK = U128.ZERO;

    // OF message fields
    private final U128 value;
    private final U128 mask;
//
    // Immutable default instance
    final static OFOxmConnTrackingLabelMaskedVer14 DEFAULT = new OFOxmConnTrackingLabelMaskedVer14(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmConnTrackingLabelMaskedVer14(U128 value, U128 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmConnTrackingLabelMaskedVer14: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmConnTrackingLabelMaskedVer14: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x1d920L;
    }

    @Override
    public U128 getValue() {
        return value;
    }

    @Override
    public U128 getMask() {
        return mask;
    }

    @Override
    public MatchField<U128> getMatchField() {
        return MatchField.CONN_TRACKING_LABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<U128> getCanonical() {
        if (U128.NO_MASK.equals(mask)) {
            return new OFOxmConnTrackingLabelVer14(value);
        } else if(U128.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmConnTrackingLabelMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmConnTrackingLabelMasked.Builder {
        final OFOxmConnTrackingLabelMaskedVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U128 value;
        private boolean maskSet;
        private U128 mask;

        BuilderWithParent(OFOxmConnTrackingLabelMaskedVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x1d920L;
    }

    @Override
    public U128 getValue() {
        return value;
    }

    @Override
    public OFOxmConnTrackingLabelMasked.Builder setValue(U128 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U128 getMask() {
        return mask;
    }

    @Override
    public OFOxmConnTrackingLabelMasked.Builder setMask(U128 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U128> getMatchField() {
        return MatchField.CONN_TRACKING_LABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U128> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmConnTrackingLabelMasked build() {
                U128 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                U128 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmConnTrackingLabelMaskedVer14(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmConnTrackingLabelMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private U128 value;
        private boolean maskSet;
        private U128 mask;

    @Override
    public long getTypeLen() {
        return 0x1d920L;
    }

    @Override
    public U128 getValue() {
        return value;
    }

    @Override
    public OFOxmConnTrackingLabelMasked.Builder setValue(U128 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U128 getMask() {
        return mask;
    }

    @Override
    public OFOxmConnTrackingLabelMasked.Builder setMask(U128 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U128> getMatchField() {
        return MatchField.CONN_TRACKING_LABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U128> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmConnTrackingLabelMasked build() {
            U128 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            U128 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmConnTrackingLabelMaskedVer14(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFOxmConnTrackingLabelMasked> {
        @Override
        public OFOxmConnTrackingLabelMasked readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            // fixed value property typeLen == 0x1d920L
            int typeLen = bb.readInt();
            if(typeLen != 0x1d920)
                throw new OFParseError("Wrong typeLen: Expected=0x1d920L(0x1d920L), got="+typeLen);
            U128 value = U128.read16Bytes(bb);
            U128 mask = U128.read16Bytes(bb);

            OFOxmConnTrackingLabelMaskedVer14 oxmConnTrackingLabelMaskedVer14 = new OFOxmConnTrackingLabelMaskedVer14(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmConnTrackingLabelMaskedVer14);
            return oxmConnTrackingLabelMaskedVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmConnTrackingLabelMaskedVer14Funnel FUNNEL = new OFOxmConnTrackingLabelMaskedVer14Funnel();
    static class OFOxmConnTrackingLabelMaskedVer14Funnel implements Funnel<OFOxmConnTrackingLabelMaskedVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmConnTrackingLabelMaskedVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x1d920L
            sink.putInt(0x1d920);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmConnTrackingLabelMaskedVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmConnTrackingLabelMaskedVer14 message) {
            // fixed value property typeLen = 0x1d920L
            bb.writeInt(0x1d920);
            message.value.write16Bytes(bb);
            message.mask.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmConnTrackingLabelMaskedVer14(");
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
        OFOxmConnTrackingLabelMaskedVer14 other = (OFOxmConnTrackingLabelMaskedVer14) obj;

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
