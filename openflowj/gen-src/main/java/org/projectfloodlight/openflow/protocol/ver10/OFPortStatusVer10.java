// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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

class OFPortStatusVer10 implements OFPortStatus {
    private static final Logger logger = LoggerFactory.getLogger(OFPortStatusVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 64;

        private final static long DEFAULT_XID = 0x0L;

    // OF message fields
    private final long xid;
    private final OFPortReason reason;
    private final OFPortDesc desc;
//

    // package private constructor - used by readers, builders, and factory
    OFPortStatusVer10(long xid, OFPortReason reason, OFPortDesc desc) {
        if(reason == null) {
            throw new NullPointerException("OFPortStatusVer10: property reason cannot be null");
        }
        if(desc == null) {
            throw new NullPointerException("OFPortStatusVer10: property desc cannot be null");
        }
        this.xid = xid;
        this.reason = reason;
        this.desc = desc;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortReason getReason() {
        return reason;
    }

    @Override
    public OFPortDesc getDesc() {
        return desc;
    }



    public OFPortStatus.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortStatus.Builder {
        final OFPortStatusVer10 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean reasonSet;
        private OFPortReason reason;
        private boolean descSet;
        private OFPortDesc desc;

        BuilderWithParent(OFPortStatusVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortStatus.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPortReason getReason() {
        return reason;
    }

    @Override
    public OFPortStatus.Builder setReason(OFPortReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public OFPortDesc getDesc() {
        return desc;
    }

    @Override
    public OFPortStatus.Builder setDesc(OFPortDesc desc) {
        this.desc = desc;
        this.descSet = true;
        return this;
    }


        @Override
        public OFPortStatus build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFPortReason reason = this.reasonSet ? this.reason : parentMessage.reason;
                if(reason == null)
                    throw new NullPointerException("Property reason must not be null");
                OFPortDesc desc = this.descSet ? this.desc : parentMessage.desc;
                if(desc == null)
                    throw new NullPointerException("Property desc must not be null");

                //
                return new OFPortStatusVer10(
                    xid,
                    reason,
                    desc
                );
        }

    }

    static class Builder implements OFPortStatus.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean reasonSet;
        private OFPortReason reason;
        private boolean descSet;
        private OFPortDesc desc;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortStatus.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPortReason getReason() {
        return reason;
    }

    @Override
    public OFPortStatus.Builder setReason(OFPortReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public OFPortDesc getDesc() {
        return desc;
    }

    @Override
    public OFPortStatus.Builder setDesc(OFPortDesc desc) {
        this.desc = desc;
        this.descSet = true;
        return this;
    }
//
        @Override
        public OFPortStatus build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.reasonSet)
                throw new IllegalStateException("Property reason doesn't have default value -- must be set");
            if(reason == null)
                throw new NullPointerException("Property reason must not be null");
            if(!this.descSet)
                throw new IllegalStateException("Property desc doesn't have default value -- must be set");
            if(desc == null)
                throw new NullPointerException("Property desc must not be null");


            return new OFPortStatusVer10(
                    xid,
                    reason,
                    desc
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortStatus> {
        @Override
        public OFPortStatus readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 12
            byte type = bb.readByte();
            if(type != (byte) 0xc)
                throw new OFParseError("Wrong type: Expected=OFType.PORT_STATUS(12), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 64)
                throw new OFParseError("Wrong length: Expected=64(64), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            OFPortReason reason = OFPortReasonSerializerVer10.readFrom(bb);
            // pad: 7 bytes
            bb.skipBytes(7);
            OFPortDesc desc = OFPortDescVer10.READER.readFrom(bb);

            OFPortStatusVer10 portStatusVer10 = new OFPortStatusVer10(
                    xid,
                      reason,
                      desc
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portStatusVer10);
            return portStatusVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortStatusVer10Funnel FUNNEL = new OFPortStatusVer10Funnel();
    static class OFPortStatusVer10Funnel implements Funnel<OFPortStatusVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortStatusVer10 message, PrimitiveSink sink) {
            // fixed value property version = 1
            sink.putByte((byte) 0x1);
            // fixed value property type = 12
            sink.putByte((byte) 0xc);
            // fixed value property length = 64
            sink.putShort((short) 0x40);
            sink.putLong(message.xid);
            OFPortReasonSerializerVer10.putTo(message.reason, sink);
            // skip pad (7 bytes)
            message.desc.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortStatusVer10> {
        @Override
        public void write(ByteBuf bb, OFPortStatusVer10 message) {
            // fixed value property version = 1
            bb.writeByte((byte) 0x1);
            // fixed value property type = 12
            bb.writeByte((byte) 0xc);
            // fixed value property length = 64
            bb.writeShort((short) 0x40);
            bb.writeInt(U32.t(message.xid));
            OFPortReasonSerializerVer10.writeTo(bb, message.reason);
            // pad: 7 bytes
            bb.writeZero(7);
            message.desc.writeTo(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortStatusVer10(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("reason=").append(reason);
        b.append(", ");
        b.append("desc=").append(desc);
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
        OFPortStatusVer10 other = (OFPortStatusVer10) obj;

        if( xid != other.xid)
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (desc == null) {
            if (other.desc != null)
                return false;
        } else if (!desc.equals(other.desc))
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
        OFPortStatusVer10 other = (OFPortStatusVer10) obj;

        // ignore XID
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (desc == null) {
            if (other.desc != null)
                return false;
        } else if (!desc.equals(other.desc))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + ((desc == null) ? 0 : desc.hashCode());
        return result;
    }

}
