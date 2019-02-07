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

class OFOxmMetadataVer12 implements OFOxmMetadata {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmMetadataVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 12;

        private final static OFMetadata DEFAULT_VALUE = OFMetadata.NONE;

    // OF message fields
    private final OFMetadata value;
//
    // Immutable default instance
    final static OFOxmMetadataVer12 DEFAULT = new OFOxmMetadataVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmMetadataVer12(OFMetadata value) {
        if(value == null) {
            throw new NullPointerException("OFOxmMetadataVer12: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80000408L;
    }

    @Override
    public OFMetadata getValue() {
        return value;
    }

    @Override
    public MatchField<OFMetadata> getMatchField() {
        return MatchField.METADATA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFMetadata> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFMetadata getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmMetadata.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmMetadata.Builder {
        final OFOxmMetadataVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFMetadata value;

        BuilderWithParent(OFOxmMetadataVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80000408L;
    }

    @Override
    public OFMetadata getValue() {
        return value;
    }

    @Override
    public OFOxmMetadata.Builder setValue(OFMetadata value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFMetadata> getMatchField() {
        return MatchField.METADATA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFMetadata> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFMetadata getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmMetadata build() {
                OFMetadata value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmMetadataVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmMetadata.Builder {
        // OF message fields
        private boolean valueSet;
        private OFMetadata value;

    @Override
    public long getTypeLen() {
        return 0x80000408L;
    }

    @Override
    public OFMetadata getValue() {
        return value;
    }

    @Override
    public OFOxmMetadata.Builder setValue(OFMetadata value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFMetadata> getMatchField() {
        return MatchField.METADATA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFMetadata> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFMetadata getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmMetadata build() {
            OFMetadata value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmMetadataVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFOxmMetadata> {
        @Override
        public OFOxmMetadata readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            // fixed value property typeLen == 0x80000408L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80000408)
                throw new OFParseError("Wrong typeLen: Expected=0x80000408L(0x80000408L), got="+typeLen);
            OFMetadata value = OFMetadata.read8Bytes(bb);

            OFOxmMetadataVer12 oxmMetadataVer12 = new OFOxmMetadataVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmMetadataVer12);
            return oxmMetadataVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmMetadataVer12Funnel FUNNEL = new OFOxmMetadataVer12Funnel();
    static class OFOxmMetadataVer12Funnel implements Funnel<OFOxmMetadataVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmMetadataVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80000408L
            sink.putInt((int) 0x80000408);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmMetadataVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmMetadataVer12 message) {
            // fixed value property typeLen = 0x80000408L
            bb.writeInt((int) 0x80000408);
            message.value.write8Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmMetadataVer12(");
        b.append("value=").append(value);
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
        OFOxmMetadataVer12 other = (OFOxmMetadataVer12) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
