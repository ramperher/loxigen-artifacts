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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionSetNwSrcVer11 implements OFActionSetNwSrc {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetNwSrcVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 8;

        private final static IPv4Address DEFAULT_NW_ADDR = IPv4Address.NONE;

    // OF message fields
    private final IPv4Address nwAddr;
//
    // Immutable default instance
    final static OFActionSetNwSrcVer11 DEFAULT = new OFActionSetNwSrcVer11(
        DEFAULT_NW_ADDR
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetNwSrcVer11(IPv4Address nwAddr) {
        if(nwAddr == null) {
            throw new NullPointerException("OFActionSetNwSrcVer11: property nwAddr cannot be null");
        }
        this.nwAddr = nwAddr;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_SRC;
    }

    @Override
    public IPv4Address getNwAddr() {
        return nwAddr;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFActionSetNwSrc.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetNwSrc.Builder {
        final OFActionSetNwSrcVer11 parentMessage;

        // OF message fields
        private boolean nwAddrSet;
        private IPv4Address nwAddr;

        BuilderWithParent(OFActionSetNwSrcVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_SRC;
    }

    @Override
    public IPv4Address getNwAddr() {
        return nwAddr;
    }

    @Override
    public OFActionSetNwSrc.Builder setNwAddr(IPv4Address nwAddr) {
        this.nwAddr = nwAddr;
        this.nwAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFActionSetNwSrc build() {
                IPv4Address nwAddr = this.nwAddrSet ? this.nwAddr : parentMessage.nwAddr;
                if(nwAddr == null)
                    throw new NullPointerException("Property nwAddr must not be null");

                //
                return new OFActionSetNwSrcVer11(
                    nwAddr
                );
        }

    }

    static class Builder implements OFActionSetNwSrc.Builder {
        // OF message fields
        private boolean nwAddrSet;
        private IPv4Address nwAddr;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_SRC;
    }

    @Override
    public IPv4Address getNwAddr() {
        return nwAddr;
    }

    @Override
    public OFActionSetNwSrc.Builder setNwAddr(IPv4Address nwAddr) {
        this.nwAddr = nwAddr;
        this.nwAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFActionSetNwSrc build() {
            IPv4Address nwAddr = this.nwAddrSet ? this.nwAddr : DEFAULT_NW_ADDR;
            if(nwAddr == null)
                throw new NullPointerException("Property nwAddr must not be null");


            return new OFActionSetNwSrcVer11(
                    nwAddr
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFActionSetNwSrc> {
        @Override
        public OFActionSetNwSrc readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 5
            short type = bb.readShort();
            if(type != (short) 0x5)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_NW_SRC(5), got="+type);
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
            IPv4Address nwAddr = IPv4Address.read4Bytes(bb);

            OFActionSetNwSrcVer11 actionSetNwSrcVer11 = new OFActionSetNwSrcVer11(
                    nwAddr
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetNwSrcVer11);
            return actionSetNwSrcVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetNwSrcVer11Funnel FUNNEL = new OFActionSetNwSrcVer11Funnel();
    static class OFActionSetNwSrcVer11Funnel implements Funnel<OFActionSetNwSrcVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetNwSrcVer11 message, PrimitiveSink sink) {
            // fixed value property type = 5
            sink.putShort((short) 0x5);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.nwAddr.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetNwSrcVer11> {
        @Override
        public void write(ByteBuf bb, OFActionSetNwSrcVer11 message) {
            // fixed value property type = 5
            bb.writeShort((short) 0x5);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.nwAddr.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetNwSrcVer11(");
        b.append("nwAddr=").append(nwAddr);
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
        OFActionSetNwSrcVer11 other = (OFActionSetNwSrcVer11) obj;

        if (nwAddr == null) {
            if (other.nwAddr != null)
                return false;
        } else if (!nwAddr.equals(other.nwAddr))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((nwAddr == null) ? 0 : nwAddr.hashCode());
        return result;
    }

}
