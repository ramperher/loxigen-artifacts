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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnSetLacpRequestVer14 implements OFBsnSetLacpRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnSetLacpRequestVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 38;

        private final static long DEFAULT_XID = 0x0L;
        private final static short DEFAULT_ENABLED = (short) 0x0;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static int DEFAULT_ACTOR_SYS_PRIORITY = 0x0;
        private final static MacAddress DEFAULT_ACTOR_SYS_MAC = MacAddress.NONE;
        private final static int DEFAULT_ACTOR_PORT_PRIORITY = 0x0;
        private final static int DEFAULT_ACTOR_PORT_NUM = 0x0;
        private final static int DEFAULT_ACTOR_KEY = 0x0;

    // OF message fields
    private final long xid;
    private final short enabled;
    private final OFPort portNo;
    private final int actorSysPriority;
    private final MacAddress actorSysMac;
    private final int actorPortPriority;
    private final int actorPortNum;
    private final int actorKey;
//
    // Immutable default instance
    final static OFBsnSetLacpRequestVer14 DEFAULT = new OFBsnSetLacpRequestVer14(
        DEFAULT_XID, DEFAULT_ENABLED, DEFAULT_PORT_NO, DEFAULT_ACTOR_SYS_PRIORITY, DEFAULT_ACTOR_SYS_MAC, DEFAULT_ACTOR_PORT_PRIORITY, DEFAULT_ACTOR_PORT_NUM, DEFAULT_ACTOR_KEY
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnSetLacpRequestVer14(long xid, short enabled, OFPort portNo, int actorSysPriority, MacAddress actorSysMac, int actorPortPriority, int actorPortNum, int actorKey) {
        if(portNo == null) {
            throw new NullPointerException("OFBsnSetLacpRequestVer14: property portNo cannot be null");
        }
        if(actorSysMac == null) {
            throw new NullPointerException("OFBsnSetLacpRequestVer14: property actorSysMac cannot be null");
        }
        this.xid = xid;
        this.enabled = enabled;
        this.portNo = portNo;
        this.actorSysPriority = actorSysPriority;
        this.actorSysMac = actorSysMac;
        this.actorPortPriority = actorPortPriority;
        this.actorPortNum = actorPortNum;
        this.actorKey = actorKey;
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
        return 0x29L;
    }

    @Override
    public short getEnabled() {
        return enabled;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public int getActorKey() {
        return actorKey;
    }



    public OFBsnSetLacpRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnSetLacpRequest.Builder {
        final OFBsnSetLacpRequestVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean enabledSet;
        private short enabled;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean actorSysPrioritySet;
        private int actorSysPriority;
        private boolean actorSysMacSet;
        private MacAddress actorSysMac;
        private boolean actorPortPrioritySet;
        private int actorPortPriority;
        private boolean actorPortNumSet;
        private int actorPortNum;
        private boolean actorKeySet;
        private int actorKey;

        BuilderWithParent(OFBsnSetLacpRequestVer14 parentMessage) {
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
    public OFBsnSetLacpRequest.Builder setXid(long xid) {
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
        return 0x29L;
    }

    @Override
    public short getEnabled() {
        return enabled;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setEnabled(short enabled) {
        this.enabled = enabled;
        this.enabledSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorSysPriority(int actorSysPriority) {
        this.actorSysPriority = actorSysPriority;
        this.actorSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorSysMac(MacAddress actorSysMac) {
        this.actorSysMac = actorSysMac;
        this.actorSysMacSet = true;
        return this;
    }
    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorPortPriority(int actorPortPriority) {
        this.actorPortPriority = actorPortPriority;
        this.actorPortPrioritySet = true;
        return this;
    }
    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorPortNum(int actorPortNum) {
        this.actorPortNum = actorPortNum;
        this.actorPortNumSet = true;
        return this;
    }
    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorKey(int actorKey) {
        this.actorKey = actorKey;
        this.actorKeySet = true;
        return this;
    }


        @Override
        public OFBsnSetLacpRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                short enabled = this.enabledSet ? this.enabled : parentMessage.enabled;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                int actorSysPriority = this.actorSysPrioritySet ? this.actorSysPriority : parentMessage.actorSysPriority;
                MacAddress actorSysMac = this.actorSysMacSet ? this.actorSysMac : parentMessage.actorSysMac;
                if(actorSysMac == null)
                    throw new NullPointerException("Property actorSysMac must not be null");
                int actorPortPriority = this.actorPortPrioritySet ? this.actorPortPriority : parentMessage.actorPortPriority;
                int actorPortNum = this.actorPortNumSet ? this.actorPortNum : parentMessage.actorPortNum;
                int actorKey = this.actorKeySet ? this.actorKey : parentMessage.actorKey;

                //
                return new OFBsnSetLacpRequestVer14(
                    xid,
                    enabled,
                    portNo,
                    actorSysPriority,
                    actorSysMac,
                    actorPortPriority,
                    actorPortNum,
                    actorKey
                );
        }

    }

    static class Builder implements OFBsnSetLacpRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean enabledSet;
        private short enabled;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean actorSysPrioritySet;
        private int actorSysPriority;
        private boolean actorSysMacSet;
        private MacAddress actorSysMac;
        private boolean actorPortPrioritySet;
        private int actorPortPriority;
        private boolean actorPortNumSet;
        private int actorPortNum;
        private boolean actorKeySet;
        private int actorKey;

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
    public OFBsnSetLacpRequest.Builder setXid(long xid) {
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
        return 0x29L;
    }

    @Override
    public short getEnabled() {
        return enabled;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setEnabled(short enabled) {
        this.enabled = enabled;
        this.enabledSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorSysPriority(int actorSysPriority) {
        this.actorSysPriority = actorSysPriority;
        this.actorSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorSysMac(MacAddress actorSysMac) {
        this.actorSysMac = actorSysMac;
        this.actorSysMacSet = true;
        return this;
    }
    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorPortPriority(int actorPortPriority) {
        this.actorPortPriority = actorPortPriority;
        this.actorPortPrioritySet = true;
        return this;
    }
    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorPortNum(int actorPortNum) {
        this.actorPortNum = actorPortNum;
        this.actorPortNumSet = true;
        return this;
    }
    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public OFBsnSetLacpRequest.Builder setActorKey(int actorKey) {
        this.actorKey = actorKey;
        this.actorKeySet = true;
        return this;
    }
//
        @Override
        public OFBsnSetLacpRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            short enabled = this.enabledSet ? this.enabled : DEFAULT_ENABLED;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            int actorSysPriority = this.actorSysPrioritySet ? this.actorSysPriority : DEFAULT_ACTOR_SYS_PRIORITY;
            MacAddress actorSysMac = this.actorSysMacSet ? this.actorSysMac : DEFAULT_ACTOR_SYS_MAC;
            if(actorSysMac == null)
                throw new NullPointerException("Property actorSysMac must not be null");
            int actorPortPriority = this.actorPortPrioritySet ? this.actorPortPriority : DEFAULT_ACTOR_PORT_PRIORITY;
            int actorPortNum = this.actorPortNumSet ? this.actorPortNum : DEFAULT_ACTOR_PORT_NUM;
            int actorKey = this.actorKeySet ? this.actorKey : DEFAULT_ACTOR_KEY;


            return new OFBsnSetLacpRequestVer14(
                    xid,
                    enabled,
                    portNo,
                    actorSysPriority,
                    actorSysMac,
                    actorPortPriority,
                    actorPortNum,
                    actorKey
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnSetLacpRequest> {
        @Override
        public OFBsnSetLacpRequest readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
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
            if(length != 38)
                throw new OFParseError("Wrong length: Expected=38(38), got="+length);
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
            // fixed value property subtype == 0x29L
            int subtype = bb.readInt();
            if(subtype != 0x29)
                throw new OFParseError("Wrong subtype: Expected=0x29L(0x29L), got="+subtype);
            short enabled = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);
            OFPort portNo = OFPort.read4Bytes(bb);
            int actorSysPriority = U16.f(bb.readShort());
            MacAddress actorSysMac = MacAddress.read6Bytes(bb);
            int actorPortPriority = U16.f(bb.readShort());
            int actorPortNum = U16.f(bb.readShort());
            int actorKey = U16.f(bb.readShort());

            OFBsnSetLacpRequestVer14 bsnSetLacpRequestVer14 = new OFBsnSetLacpRequestVer14(
                    xid,
                      enabled,
                      portNo,
                      actorSysPriority,
                      actorSysMac,
                      actorPortPriority,
                      actorPortNum,
                      actorKey
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnSetLacpRequestVer14);
            return bsnSetLacpRequestVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnSetLacpRequestVer14Funnel FUNNEL = new OFBsnSetLacpRequestVer14Funnel();
    static class OFBsnSetLacpRequestVer14Funnel implements Funnel<OFBsnSetLacpRequestVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnSetLacpRequestVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 38
            sink.putShort((short) 0x26);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x29L
            sink.putInt(0x29);
            sink.putShort(message.enabled);
            // skip pad (3 bytes)
            message.portNo.putTo(sink);
            sink.putInt(message.actorSysPriority);
            message.actorSysMac.putTo(sink);
            sink.putInt(message.actorPortPriority);
            sink.putInt(message.actorPortNum);
            sink.putInt(message.actorKey);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnSetLacpRequestVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnSetLacpRequestVer14 message) {
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 38
            bb.writeShort((short) 0x26);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x29L
            bb.writeInt(0x29);
            bb.writeByte(U8.t(message.enabled));
            // pad: 3 bytes
            bb.writeZero(3);
            message.portNo.write4Bytes(bb);
            bb.writeShort(U16.t(message.actorSysPriority));
            message.actorSysMac.write6Bytes(bb);
            bb.writeShort(U16.t(message.actorPortPriority));
            bb.writeShort(U16.t(message.actorPortNum));
            bb.writeShort(U16.t(message.actorKey));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnSetLacpRequestVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("enabled=").append(enabled);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("actorSysPriority=").append(actorSysPriority);
        b.append(", ");
        b.append("actorSysMac=").append(actorSysMac);
        b.append(", ");
        b.append("actorPortPriority=").append(actorPortPriority);
        b.append(", ");
        b.append("actorPortNum=").append(actorPortNum);
        b.append(", ");
        b.append("actorKey=").append(actorKey);
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
        OFBsnSetLacpRequestVer14 other = (OFBsnSetLacpRequestVer14) obj;

        if( xid != other.xid)
            return false;
        if( enabled != other.enabled)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( actorSysPriority != other.actorSysPriority)
            return false;
        if (actorSysMac == null) {
            if (other.actorSysMac != null)
                return false;
        } else if (!actorSysMac.equals(other.actorSysMac))
            return false;
        if( actorPortPriority != other.actorPortPriority)
            return false;
        if( actorPortNum != other.actorPortNum)
            return false;
        if( actorKey != other.actorKey)
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
        OFBsnSetLacpRequestVer14 other = (OFBsnSetLacpRequestVer14) obj;

        // ignore XID
        if( enabled != other.enabled)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( actorSysPriority != other.actorSysPriority)
            return false;
        if (actorSysMac == null) {
            if (other.actorSysMac != null)
                return false;
        } else if (!actorSysMac.equals(other.actorSysMac))
            return false;
        if( actorPortPriority != other.actorPortPriority)
            return false;
        if( actorPortNum != other.actorPortNum)
            return false;
        if( actorKey != other.actorKey)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + enabled;
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + actorSysPriority;
        result = prime * result + ((actorSysMac == null) ? 0 : actorSysMac.hashCode());
        result = prime * result + actorPortPriority;
        result = prime * result + actorPortNum;
        result = prime * result + actorKey;
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + enabled;
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + actorSysPriority;
        result = prime * result + ((actorSysMac == null) ? 0 : actorSysMac.hashCode());
        result = prime * result + actorPortPriority;
        result = prime * result + actorPortNum;
        result = prime * result + actorKey;
        return result;
    }

}
