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

class OFBsnPduRxReplyVer12 implements OFBsnPduRxReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnPduRxReplyVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 25;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_STATUS = 0x0L;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static short DEFAULT_SLOT_NUM = (short) 0x0;

    // OF message fields
    private final long xid;
    private final long status;
    private final OFPort portNo;
    private final short slotNum;
//
    // Immutable default instance
    final static OFBsnPduRxReplyVer12 DEFAULT = new OFBsnPduRxReplyVer12(
        DEFAULT_XID, DEFAULT_STATUS, DEFAULT_PORT_NO, DEFAULT_SLOT_NUM
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnPduRxReplyVer12(long xid, long status, OFPort portNo, short slotNum) {
        if(portNo == null) {
            throw new NullPointerException("OFBsnPduRxReplyVer12: property portNo cannot be null");
        }
        this.xid = xid;
        this.status = status;
        this.portNo = portNo;
        this.slotNum = slotNum;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
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
        return 0x22L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public short getSlotNum() {
        return slotNum;
    }



    public OFBsnPduRxReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnPduRxReply.Builder {
        final OFBsnPduRxReplyVer12 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean slotNumSet;
        private short slotNum;

        BuilderWithParent(OFBsnPduRxReplyVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
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
    public OFBsnPduRxReply.Builder setXid(long xid) {
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
        return 0x22L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnPduRxReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnPduRxReply.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public OFBsnPduRxReply.Builder setSlotNum(short slotNum) {
        this.slotNum = slotNum;
        this.slotNumSet = true;
        return this;
    }


        @Override
        public OFBsnPduRxReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long status = this.statusSet ? this.status : parentMessage.status;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                short slotNum = this.slotNumSet ? this.slotNum : parentMessage.slotNum;

                //
                return new OFBsnPduRxReplyVer12(
                    xid,
                    status,
                    portNo,
                    slotNum
                );
        }

    }

    static class Builder implements OFBsnPduRxReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean slotNumSet;
        private short slotNum;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
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
    public OFBsnPduRxReply.Builder setXid(long xid) {
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
        return 0x22L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnPduRxReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnPduRxReply.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public OFBsnPduRxReply.Builder setSlotNum(short slotNum) {
        this.slotNum = slotNum;
        this.slotNumSet = true;
        return this;
    }
//
        @Override
        public OFBsnPduRxReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long status = this.statusSet ? this.status : DEFAULT_STATUS;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            short slotNum = this.slotNumSet ? this.slotNum : DEFAULT_SLOT_NUM;


            return new OFBsnPduRxReplyVer12(
                    xid,
                    status,
                    portNo,
                    slotNum
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnPduRxReply> {
        @Override
        public OFBsnPduRxReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 25)
                throw new OFParseError("Wrong length: Expected=25(25), got="+length);
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
            // fixed value property subtype == 0x22L
            int subtype = bb.readInt();
            if(subtype != 0x22)
                throw new OFParseError("Wrong subtype: Expected=0x22L(0x22L), got="+subtype);
            long status = U32.f(bb.readInt());
            OFPort portNo = OFPort.read4Bytes(bb);
            short slotNum = U8.f(bb.readByte());

            OFBsnPduRxReplyVer12 bsnPduRxReplyVer12 = new OFBsnPduRxReplyVer12(
                    xid,
                      status,
                      portNo,
                      slotNum
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnPduRxReplyVer12);
            return bsnPduRxReplyVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnPduRxReplyVer12Funnel FUNNEL = new OFBsnPduRxReplyVer12Funnel();
    static class OFBsnPduRxReplyVer12Funnel implements Funnel<OFBsnPduRxReplyVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnPduRxReplyVer12 message, PrimitiveSink sink) {
            // fixed value property version = 3
            sink.putByte((byte) 0x3);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 25
            sink.putShort((short) 0x19);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x22L
            sink.putInt(0x22);
            sink.putLong(message.status);
            message.portNo.putTo(sink);
            sink.putShort(message.slotNum);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnPduRxReplyVer12> {
        @Override
        public void write(ByteBuf bb, OFBsnPduRxReplyVer12 message) {
            // fixed value property version = 3
            bb.writeByte((byte) 0x3);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 25
            bb.writeShort((short) 0x19);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x22L
            bb.writeInt(0x22);
            bb.writeInt(U32.t(message.status));
            message.portNo.write4Bytes(bb);
            bb.writeByte(U8.t(message.slotNum));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnPduRxReplyVer12(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("status=").append(status);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("slotNum=").append(slotNum);
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
        OFBsnPduRxReplyVer12 other = (OFBsnPduRxReplyVer12) obj;

        if( xid != other.xid)
            return false;
        if( status != other.status)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( slotNum != other.slotNum)
            return false;
        return true;
    }

    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnPduRxReplyVer12 other = (OFBsnPduRxReplyVer12) obj;

        // ignore XID
        if( status != other.status)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( slotNum != other.slotNum)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime *  (int) (status ^ (status >>> 32));
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + slotNum;
        return result;
    }

}
