// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

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
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionCopyTtlOutVer11 implements OFActionCopyTtlOut {
    private static final Logger logger = LoggerFactory.getLogger(OFActionCopyTtlOutVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 8;


    // OF message fields
//
    // Immutable default instance
    final static OFActionCopyTtlOutVer11 DEFAULT = new OFActionCopyTtlOutVer11(

    );

    final static OFActionCopyTtlOutVer11 INSTANCE = new OFActionCopyTtlOutVer11();
    // private empty constructor - use shared instance!
    private OFActionCopyTtlOutVer11() {
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.COPY_TTL_OUT;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    // no data members - do not support builder
    public OFActionCopyTtlOut.Builder createBuilder() {
        throw new UnsupportedOperationException("OFActionCopyTtlOutVer11 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFActionCopyTtlOut> {
        @Override
        public OFActionCopyTtlOut readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 11
            short type = bb.readShort();
            if(type != (short) 0xb)
                throw new OFParseError("Wrong type: Expected=OFActionType.COPY_TTL_OUT(11), got="+type);
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
            // pad: 4 bytes
            bb.skipBytes(4);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionCopyTtlOutVer11Funnel FUNNEL = new OFActionCopyTtlOutVer11Funnel();
    static class OFActionCopyTtlOutVer11Funnel implements Funnel<OFActionCopyTtlOutVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionCopyTtlOutVer11 message, PrimitiveSink sink) {
            // fixed value property type = 11
            sink.putShort((short) 0xb);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionCopyTtlOutVer11> {
        @Override
        public void write(ByteBuf bb, OFActionCopyTtlOutVer11 message) {
            // fixed value property type = 11
            bb.writeShort((short) 0xb);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionCopyTtlOutVer11(");
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        return result;
    }

}
