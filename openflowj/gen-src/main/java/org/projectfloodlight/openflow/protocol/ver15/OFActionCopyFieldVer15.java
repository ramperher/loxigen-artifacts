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
import java.util.List;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionCopyFieldVer15 implements OFActionCopyField {
    private static final Logger logger = LoggerFactory.getLogger(OFActionCopyFieldVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 12;

        private final static int DEFAULT_N_BITS = 0x0;
        private final static int DEFAULT_SRC_OFFSET = 0x0;
        private final static int DEFAULT_DST_OFFSET = 0x0;
        private final static OFOxmList DEFAULT_OXM_IDS = OFOxmList.EMPTY;

    // OF message fields
    private final int nBits;
    private final int srcOffset;
    private final int dstOffset;
    private final OFOxmList oxmIds;
//
    // Immutable default instance
    final static OFActionCopyFieldVer15 DEFAULT = new OFActionCopyFieldVer15(
        DEFAULT_N_BITS, DEFAULT_SRC_OFFSET, DEFAULT_DST_OFFSET, DEFAULT_OXM_IDS
    );

    // package private constructor - used by readers, builders, and factory
    OFActionCopyFieldVer15(int nBits, int srcOffset, int dstOffset, OFOxmList oxmIds) {
        if(oxmIds == null) {
            throw new NullPointerException("OFActionCopyFieldVer15: property oxmIds cannot be null");
        }
        this.nBits = nBits;
        this.srcOffset = srcOffset;
        this.dstOffset = dstOffset;
        this.oxmIds = oxmIds;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1c;
    }

    @Override
    public int getNBits() {
        return nBits;
    }

    @Override
    public int getSrcOffset() {
        return srcOffset;
    }

    @Override
    public int getDstOffset() {
        return dstOffset;
    }

    @Override
    public OFOxmList getOxmIds() {
        return oxmIds;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFActionCopyField.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionCopyField.Builder {
        final OFActionCopyFieldVer15 parentMessage;

        // OF message fields
        private boolean nBitsSet;
        private int nBits;
        private boolean srcOffsetSet;
        private int srcOffset;
        private boolean dstOffsetSet;
        private int dstOffset;
        private boolean oxmIdsSet;
        private OFOxmList oxmIds;

        BuilderWithParent(OFActionCopyFieldVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1c;
    }

    @Override
    public int getNBits() {
        return nBits;
    }

    @Override
    public OFActionCopyField.Builder setNBits(int nBits) {
        this.nBits = nBits;
        this.nBitsSet = true;
        return this;
    }
    @Override
    public int getSrcOffset() {
        return srcOffset;
    }

    @Override
    public OFActionCopyField.Builder setSrcOffset(int srcOffset) {
        this.srcOffset = srcOffset;
        this.srcOffsetSet = true;
        return this;
    }
    @Override
    public int getDstOffset() {
        return dstOffset;
    }

    @Override
    public OFActionCopyField.Builder setDstOffset(int dstOffset) {
        this.dstOffset = dstOffset;
        this.dstOffsetSet = true;
        return this;
    }
    @Override
    public OFOxmList getOxmIds() {
        return oxmIds;
    }

    @Override
    public OFActionCopyField.Builder setOxmIds(OFOxmList oxmIds) {
        this.oxmIds = oxmIds;
        this.oxmIdsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFActionCopyField build() {
                int nBits = this.nBitsSet ? this.nBits : parentMessage.nBits;
                int srcOffset = this.srcOffsetSet ? this.srcOffset : parentMessage.srcOffset;
                int dstOffset = this.dstOffsetSet ? this.dstOffset : parentMessage.dstOffset;
                OFOxmList oxmIds = this.oxmIdsSet ? this.oxmIds : parentMessage.oxmIds;
                if(oxmIds == null)
                    throw new NullPointerException("Property oxmIds must not be null");

                //
                return new OFActionCopyFieldVer15(
                    nBits,
                    srcOffset,
                    dstOffset,
                    oxmIds
                );
        }

    }

    static class Builder implements OFActionCopyField.Builder {
        // OF message fields
        private boolean nBitsSet;
        private int nBits;
        private boolean srcOffsetSet;
        private int srcOffset;
        private boolean dstOffsetSet;
        private int dstOffset;
        private boolean oxmIdsSet;
        private OFOxmList oxmIds;

    @Override
    public int getType() {
        return 0x1c;
    }

    @Override
    public int getNBits() {
        return nBits;
    }

    @Override
    public OFActionCopyField.Builder setNBits(int nBits) {
        this.nBits = nBits;
        this.nBitsSet = true;
        return this;
    }
    @Override
    public int getSrcOffset() {
        return srcOffset;
    }

    @Override
    public OFActionCopyField.Builder setSrcOffset(int srcOffset) {
        this.srcOffset = srcOffset;
        this.srcOffsetSet = true;
        return this;
    }
    @Override
    public int getDstOffset() {
        return dstOffset;
    }

    @Override
    public OFActionCopyField.Builder setDstOffset(int dstOffset) {
        this.dstOffset = dstOffset;
        this.dstOffsetSet = true;
        return this;
    }
    @Override
    public OFOxmList getOxmIds() {
        return oxmIds;
    }

    @Override
    public OFActionCopyField.Builder setOxmIds(OFOxmList oxmIds) {
        this.oxmIds = oxmIds;
        this.oxmIdsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFActionCopyField build() {
            int nBits = this.nBitsSet ? this.nBits : DEFAULT_N_BITS;
            int srcOffset = this.srcOffsetSet ? this.srcOffset : DEFAULT_SRC_OFFSET;
            int dstOffset = this.dstOffsetSet ? this.dstOffset : DEFAULT_DST_OFFSET;
            OFOxmList oxmIds = this.oxmIdsSet ? this.oxmIds : DEFAULT_OXM_IDS;
            if(oxmIds == null)
                throw new NullPointerException("Property oxmIds must not be null");


            return new OFActionCopyFieldVer15(
                    nBits,
                    srcOffset,
                    dstOffset,
                    oxmIds
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFActionCopyField> {
        @Override
        public OFActionCopyField readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0x1c
            short type = bb.readShort();
            if(type != (short) 0x1c)
                throw new OFParseError("Wrong type: Expected=0x1c(0x1c), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            int nBits = U16.f(bb.readShort());
            int srcOffset = U16.f(bb.readShort());
            int dstOffset = U16.f(bb.readShort());
            // pad: 2 bytes
            bb.skipBytes(2);
            OFOxmList oxmIds = OFOxmList.readFrom(context, bb, length - (bb.readerIndex() - start), OFOxmVer15.READER);

            OFActionCopyFieldVer15 actionCopyFieldVer15 = new OFActionCopyFieldVer15(
                    nBits,
                      srcOffset,
                      dstOffset,
                      oxmIds
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionCopyFieldVer15);
            return actionCopyFieldVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionCopyFieldVer15Funnel FUNNEL = new OFActionCopyFieldVer15Funnel();
    static class OFActionCopyFieldVer15Funnel implements Funnel<OFActionCopyFieldVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionCopyFieldVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x1c
            sink.putShort((short) 0x1c);
            // FIXME: skip funnel of length
            sink.putInt(message.nBits);
            sink.putInt(message.srcOffset);
            sink.putInt(message.dstOffset);
            // skip pad (2 bytes)
            message.oxmIds.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionCopyFieldVer15> {
        @Override
        public void write(ByteBuf bb, OFActionCopyFieldVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 0x1c
            bb.writeShort((short) 0x1c);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeShort(U16.t(message.nBits));
            bb.writeShort(U16.t(message.srcOffset));
            bb.writeShort(U16.t(message.dstOffset));
            // pad: 2 bytes
            bb.writeZero(2);
            message.oxmIds.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionCopyFieldVer15(");
        b.append("nBits=").append(nBits);
        b.append(", ");
        b.append("srcOffset=").append(srcOffset);
        b.append(", ");
        b.append("dstOffset=").append(dstOffset);
        b.append(", ");
        b.append("oxmIds=").append(oxmIds);
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
        OFActionCopyFieldVer15 other = (OFActionCopyFieldVer15) obj;

        if( nBits != other.nBits)
            return false;
        if( srcOffset != other.srcOffset)
            return false;
        if( dstOffset != other.dstOffset)
            return false;
        if (oxmIds == null) {
            if (other.oxmIds != null)
                return false;
        } else if (!oxmIds.equals(other.oxmIds))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + nBits;
        result = prime * result + srcOffset;
        result = prime * result + dstOffset;
        result = prime * result + ((oxmIds == null) ? 0 : oxmIds.hashCode());
        return result;
    }

}
