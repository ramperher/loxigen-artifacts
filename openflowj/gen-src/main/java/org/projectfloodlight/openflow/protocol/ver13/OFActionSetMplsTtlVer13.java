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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionSetMplsTtlVer13 implements OFActionSetMplsTtl {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetMplsTtlVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static short DEFAULT_MPLS_TTL = (short) 0x0;

    // OF message fields
    private final short mplsTtl;
//
    // Immutable default instance
    final static OFActionSetMplsTtlVer13 DEFAULT = new OFActionSetMplsTtlVer13(
        DEFAULT_MPLS_TTL
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetMplsTtlVer13(short mplsTtl) {
        this.mplsTtl = mplsTtl;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_MPLS_TTL;
    }

    @Override
    public short getMplsTtl() {
        return mplsTtl;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFActionSetMplsTtl.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetMplsTtl.Builder {
        final OFActionSetMplsTtlVer13 parentMessage;

        // OF message fields
        private boolean mplsTtlSet;
        private short mplsTtl;

        BuilderWithParent(OFActionSetMplsTtlVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_MPLS_TTL;
    }

    @Override
    public short getMplsTtl() {
        return mplsTtl;
    }

    @Override
    public OFActionSetMplsTtl.Builder setMplsTtl(short mplsTtl) {
        this.mplsTtl = mplsTtl;
        this.mplsTtlSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFActionSetMplsTtl build() {
                short mplsTtl = this.mplsTtlSet ? this.mplsTtl : parentMessage.mplsTtl;

                //
                return new OFActionSetMplsTtlVer13(
                    mplsTtl
                );
        }

    }

    static class Builder implements OFActionSetMplsTtl.Builder {
        // OF message fields
        private boolean mplsTtlSet;
        private short mplsTtl;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_MPLS_TTL;
    }

    @Override
    public short getMplsTtl() {
        return mplsTtl;
    }

    @Override
    public OFActionSetMplsTtl.Builder setMplsTtl(short mplsTtl) {
        this.mplsTtl = mplsTtl;
        this.mplsTtlSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFActionSetMplsTtl build() {
            short mplsTtl = this.mplsTtlSet ? this.mplsTtl : DEFAULT_MPLS_TTL;


            return new OFActionSetMplsTtlVer13(
                    mplsTtl
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFActionSetMplsTtl> {
        @Override
        public OFActionSetMplsTtl readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 15
            short type = bb.readShort();
            if(type != (short) 0xf)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_MPLS_TTL(15), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            short mplsTtl = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);

            OFActionSetMplsTtlVer13 actionSetMplsTtlVer13 = new OFActionSetMplsTtlVer13(
                    mplsTtl
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetMplsTtlVer13);
            return actionSetMplsTtlVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetMplsTtlVer13Funnel FUNNEL = new OFActionSetMplsTtlVer13Funnel();
    static class OFActionSetMplsTtlVer13Funnel implements Funnel<OFActionSetMplsTtlVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetMplsTtlVer13 message, PrimitiveSink sink) {
            // fixed value property type = 15
            sink.putShort((short) 0xf);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putShort(message.mplsTtl);
            // skip pad (3 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetMplsTtlVer13> {
        @Override
        public void write(ByteBuf bb, OFActionSetMplsTtlVer13 message) {
            // fixed value property type = 15
            bb.writeShort((short) 0xf);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeByte(U8.t(message.mplsTtl));
            // pad: 3 bytes
            bb.writeZero(3);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetMplsTtlVer13(");
        b.append("mplsTtl=").append(mplsTtl);
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
        OFActionSetMplsTtlVer13 other = (OFActionSetMplsTtlVer13) obj;

        if( mplsTtl != other.mplsTtl)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + mplsTtl;
        return result;
    }

}
