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

class OFOxmBsnVfiMaskedVer15 implements OFOxmBsnVfiMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnVfiMaskedVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 8;

        private final static VFI DEFAULT_VALUE = VFI.ZERO;
        private final static VFI DEFAULT_VALUE_MASK = VFI.ZERO;

    // OF message fields
    private final VFI value;
    private final VFI mask;
//
    // Immutable default instance
    final static OFOxmBsnVfiMaskedVer15 DEFAULT = new OFOxmBsnVfiMaskedVer15(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnVfiMaskedVer15(VFI value, VFI mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnVfiMaskedVer15: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnVfiMaskedVer15: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x33304L;
    }

    @Override
    public VFI getValue() {
        return value;
    }

    @Override
    public VFI getMask() {
        return mask;
    }

    @Override
    public MatchField<VFI> getMatchField() {
        return MatchField.BSN_VFI;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<VFI> getCanonical() {
        if (VFI.NO_MASK.equals(mask)) {
            return new OFOxmBsnVfiVer15(value);
        } else if(VFI.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFOxmBsnVfiMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnVfiMasked.Builder {
        final OFOxmBsnVfiMaskedVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private VFI value;
        private boolean maskSet;
        private VFI mask;

        BuilderWithParent(OFOxmBsnVfiMaskedVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x33304L;
    }

    @Override
    public VFI getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVfiMasked.Builder setValue(VFI value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public VFI getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnVfiMasked.Builder setMask(VFI mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<VFI> getMatchField() {
        return MatchField.BSN_VFI;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<VFI> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFOxmBsnVfiMasked build() {
                VFI value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                VFI mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnVfiMaskedVer15(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnVfiMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private VFI value;
        private boolean maskSet;
        private VFI mask;

    @Override
    public long getTypeLen() {
        return 0x33304L;
    }

    @Override
    public VFI getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVfiMasked.Builder setValue(VFI value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public VFI getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnVfiMasked.Builder setMask(VFI mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<VFI> getMatchField() {
        return MatchField.BSN_VFI;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<VFI> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFOxmBsnVfiMasked build() {
            VFI value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            VFI mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnVfiMaskedVer15(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFOxmBsnVfiMasked> {
        @Override
        public OFOxmBsnVfiMasked readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            // fixed value property typeLen == 0x33304L
            int typeLen = bb.readInt();
            if(typeLen != 0x33304)
                throw new OFParseError("Wrong typeLen: Expected=0x33304L(0x33304L), got="+typeLen);
            VFI value = VFI.read2Bytes(bb);
            VFI mask = VFI.read2Bytes(bb);

            OFOxmBsnVfiMaskedVer15 oxmBsnVfiMaskedVer15 = new OFOxmBsnVfiMaskedVer15(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnVfiMaskedVer15);
            return oxmBsnVfiMaskedVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnVfiMaskedVer15Funnel FUNNEL = new OFOxmBsnVfiMaskedVer15Funnel();
    static class OFOxmBsnVfiMaskedVer15Funnel implements Funnel<OFOxmBsnVfiMaskedVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnVfiMaskedVer15 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x33304L
            sink.putInt(0x33304);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnVfiMaskedVer15> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnVfiMaskedVer15 message) {
            // fixed value property typeLen = 0x33304L
            bb.writeInt(0x33304);
            message.value.write2Bytes(bb);
            message.mask.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnVfiMaskedVer15(");
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
        OFOxmBsnVfiMaskedVer15 other = (OFOxmBsnVfiMaskedVer15) obj;

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
