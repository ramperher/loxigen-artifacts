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

class OFOxmMplsLabelMaskedVer12 implements OFOxmMplsLabelMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmMplsLabelMaskedVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 12;

        private final static U32 DEFAULT_VALUE = U32.ZERO;
        private final static U32 DEFAULT_VALUE_MASK = U32.ZERO;

    // OF message fields
    private final U32 value;
    private final U32 mask;
//
    // Immutable default instance
    final static OFOxmMplsLabelMaskedVer12 DEFAULT = new OFOxmMplsLabelMaskedVer12(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmMplsLabelMaskedVer12(U32 value, U32 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmMplsLabelMaskedVer12: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmMplsLabelMaskedVer12: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80004508L;
    }

    @Override
    public U32 getValue() {
        return value;
    }

    @Override
    public U32 getMask() {
        return mask;
    }

    @Override
    public MatchField<U32> getMatchField() {
        return MatchField.MPLS_LABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<U32> getCanonical() {
        if (U32.NO_MASK.equals(mask)) {
            return new OFOxmMplsLabelVer12(value);
        } else if(U32.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmMplsLabelMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmMplsLabelMasked.Builder {
        final OFOxmMplsLabelMaskedVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U32 value;
        private boolean maskSet;
        private U32 mask;

        BuilderWithParent(OFOxmMplsLabelMaskedVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80004508L;
    }

    @Override
    public U32 getValue() {
        return value;
    }

    @Override
    public OFOxmMplsLabelMasked.Builder setValue(U32 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U32 getMask() {
        return mask;
    }

    @Override
    public OFOxmMplsLabelMasked.Builder setMask(U32 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U32> getMatchField() {
        return MatchField.MPLS_LABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U32> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmMplsLabelMasked build() {
                U32 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                U32 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmMplsLabelMaskedVer12(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmMplsLabelMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private U32 value;
        private boolean maskSet;
        private U32 mask;

    @Override
    public long getTypeLen() {
        return 0x80004508L;
    }

    @Override
    public U32 getValue() {
        return value;
    }

    @Override
    public OFOxmMplsLabelMasked.Builder setValue(U32 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U32 getMask() {
        return mask;
    }

    @Override
    public OFOxmMplsLabelMasked.Builder setMask(U32 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U32> getMatchField() {
        return MatchField.MPLS_LABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U32> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmMplsLabelMasked build() {
            U32 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            U32 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmMplsLabelMaskedVer12(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFOxmMplsLabelMasked> {
        @Override
        public OFOxmMplsLabelMasked readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            // fixed value property typeLen == 0x80004508L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80004508)
                throw new OFParseError("Wrong typeLen: Expected=0x80004508L(0x80004508L), got="+typeLen);
            U32 value = U32.of(bb.readInt());
            U32 mask = U32.of(bb.readInt());

            OFOxmMplsLabelMaskedVer12 oxmMplsLabelMaskedVer12 = new OFOxmMplsLabelMaskedVer12(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmMplsLabelMaskedVer12);
            return oxmMplsLabelMaskedVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmMplsLabelMaskedVer12Funnel FUNNEL = new OFOxmMplsLabelMaskedVer12Funnel();
    static class OFOxmMplsLabelMaskedVer12Funnel implements Funnel<OFOxmMplsLabelMaskedVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmMplsLabelMaskedVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80004508L
            sink.putInt((int) 0x80004508);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmMplsLabelMaskedVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmMplsLabelMaskedVer12 message) {
            // fixed value property typeLen = 0x80004508L
            bb.writeInt((int) 0x80004508);
            bb.writeInt(message.value.getRaw());
            bb.writeInt(message.mask.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmMplsLabelMaskedVer12(");
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
        OFOxmMplsLabelMaskedVer12 other = (OFOxmMplsLabelMaskedVer12) obj;

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
