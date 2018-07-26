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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionIdSetNwTtlVer15 implements OFActionIdSetNwTtl {
    private static final Logger logger = LoggerFactory.getLogger(OFActionIdSetNwTtlVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 4;


    // OF message fields
//
    // Immutable default instance
    final static OFActionIdSetNwTtlVer15 DEFAULT = new OFActionIdSetNwTtlVer15(

    );

    final static OFActionIdSetNwTtlVer15 INSTANCE = new OFActionIdSetNwTtlVer15();
    // private empty constructor - use shared instance!
    private OFActionIdSetNwTtlVer15() {
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_TTL;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    // no data members - do not support builder
    public OFActionIdSetNwTtl.Builder createBuilder() {
        throw new UnsupportedOperationException("OFActionIdSetNwTtlVer15 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFActionIdSetNwTtl> {
        @Override
        public OFActionIdSetNwTtl readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 23
            short type = bb.readShort();
            if(type != (short) 0x17)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_NW_TTL(23), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 4)
                throw new OFParseError("Wrong length: Expected=4(4), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionIdSetNwTtlVer15Funnel FUNNEL = new OFActionIdSetNwTtlVer15Funnel();
    static class OFActionIdSetNwTtlVer15Funnel implements Funnel<OFActionIdSetNwTtlVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionIdSetNwTtlVer15 message, PrimitiveSink sink) {
            // fixed value property type = 23
            sink.putShort((short) 0x17);
            // fixed value property length = 4
            sink.putShort((short) 0x4);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionIdSetNwTtlVer15> {
        @Override
        public void write(ByteBuf bb, OFActionIdSetNwTtlVer15 message) {
            // fixed value property type = 23
            bb.writeShort((short) 0x17);
            // fixed value property length = 4
            bb.writeShort((short) 0x4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionIdSetNwTtlVer15(");
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
