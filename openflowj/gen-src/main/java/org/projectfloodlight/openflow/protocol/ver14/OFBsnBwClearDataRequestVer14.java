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

class OFBsnBwClearDataRequestVer14 implements OFBsnBwClearDataRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnBwClearDataRequestVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 16;

        private final static long DEFAULT_XID = 0x0L;

    // OF message fields
    private final long xid;
//
    // Immutable default instance
    final static OFBsnBwClearDataRequestVer14 DEFAULT = new OFBsnBwClearDataRequestVer14(
        DEFAULT_XID
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnBwClearDataRequestVer14(long xid) {
        this.xid = xid;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x15L;
    }



    public OFBsnBwClearDataRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnBwClearDataRequest.Builder {
        final OFBsnBwClearDataRequestVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;

        BuilderWithParent(OFBsnBwClearDataRequestVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnBwClearDataRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x15L;
    }



        @Override
        public OFBsnBwClearDataRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;

                //
                return new OFBsnBwClearDataRequestVer14(
                    xid
                );
        }

    }

    static class Builder implements OFBsnBwClearDataRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnBwClearDataRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x15L;
    }

//
        @Override
        public OFBsnBwClearDataRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;


            return new OFBsnBwClearDataRequestVer14(
                    xid
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnBwClearDataRequest> {
        @Override
        public OFBsnBwClearDataRequest readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 16)
                throw new OFParseError("Wrong length: Expected=16(16), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x15L
            int subtype = bb.readInt();
            if(subtype != 0x15)
                throw new OFParseError("Wrong subtype: Expected=0x15L(0x15L), got="+subtype);

            OFBsnBwClearDataRequestVer14 bsnBwClearDataRequestVer14 = new OFBsnBwClearDataRequestVer14(
                    xid
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnBwClearDataRequestVer14);
            return bsnBwClearDataRequestVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnBwClearDataRequestVer14Funnel FUNNEL = new OFBsnBwClearDataRequestVer14Funnel();
    static class OFBsnBwClearDataRequestVer14Funnel implements Funnel<OFBsnBwClearDataRequestVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnBwClearDataRequestVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x15L
            sink.putInt(0x15);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnBwClearDataRequestVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnBwClearDataRequestVer14 message) {
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x15L
            bb.writeInt(0x15);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnBwClearDataRequestVer14(");
        b.append("xid=").append(xid);
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
        OFBsnBwClearDataRequestVer14 other = (OFBsnBwClearDataRequestVer14) obj;

        if( xid != other.xid)
            return false;
        return true;
    }

    @Override
    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnBwClearDataRequestVer14 other = (OFBsnBwClearDataRequestVer14) obj;

        // ignore XID
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        return result;
    }

}
