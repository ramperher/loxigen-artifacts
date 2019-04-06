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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnVlanCounterStatsRequestVer13 implements OFBsnVlanCounterStatsRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnVlanCounterStatsRequestVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 26;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFStatsRequestFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsRequestFlags>of();
        private final static int DEFAULT_VLAN_VID = 0x0;

    // OF message fields
    private final long xid;
    private final Set<OFStatsRequestFlags> flags;
    private final int vlanVid;
//
    // Immutable default instance
    final static OFBsnVlanCounterStatsRequestVer13 DEFAULT = new OFBsnVlanCounterStatsRequestVer13(
        DEFAULT_XID, DEFAULT_FLAGS, DEFAULT_VLAN_VID
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnVlanCounterStatsRequestVer13(long xid, Set<OFStatsRequestFlags> flags, int vlanVid) {
        if(flags == null) {
            throw new NullPointerException("OFBsnVlanCounterStatsRequestVer13: property flags cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
        this.vlanVid = vlanVid;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x9L;
    }

    @Override
    public int getVlanVid() {
        return vlanVid;
    }



    public OFBsnVlanCounterStatsRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnVlanCounterStatsRequest.Builder {
        final OFBsnVlanCounterStatsRequestVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsRequestFlags> flags;
        private boolean vlanVidSet;
        private int vlanVid;

        BuilderWithParent(OFBsnVlanCounterStatsRequestVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnVlanCounterStatsRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnVlanCounterStatsRequest.Builder setFlags(Set<OFStatsRequestFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x9L;
    }

    @Override
    public int getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFBsnVlanCounterStatsRequest.Builder setVlanVid(int vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }


        @Override
        public OFBsnVlanCounterStatsRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFStatsRequestFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                int vlanVid = this.vlanVidSet ? this.vlanVid : parentMessage.vlanVid;

                //
                return new OFBsnVlanCounterStatsRequestVer13(
                    xid,
                    flags,
                    vlanVid
                );
        }

    }

    static class Builder implements OFBsnVlanCounterStatsRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsRequestFlags> flags;
        private boolean vlanVidSet;
        private int vlanVid;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnVlanCounterStatsRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnVlanCounterStatsRequest.Builder setFlags(Set<OFStatsRequestFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x9L;
    }

    @Override
    public int getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFBsnVlanCounterStatsRequest.Builder setVlanVid(int vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
//
        @Override
        public OFBsnVlanCounterStatsRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsRequestFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            int vlanVid = this.vlanVidSet ? this.vlanVid : DEFAULT_VLAN_VID;


            return new OFBsnVlanCounterStatsRequestVer13(
                    xid,
                    flags,
                    vlanVid
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnVlanCounterStatsRequest> {
        @Override
        public OFBsnVlanCounterStatsRequest readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 18
            byte type = bb.readByte();
            if(type != (byte) 0x12)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REQUEST(18), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 26)
                throw new OFParseError("Wrong length: Expected=26(26), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property statsType == 65535
            short statsType = bb.readShort();
            if(statsType != (short) 0xffff)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.EXPERIMENTER(65535), got="+statsType);
            Set<OFStatsRequestFlags> flags = OFStatsRequestFlagsSerializerVer13.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x9L
            int subtype = bb.readInt();
            if(subtype != 0x9)
                throw new OFParseError("Wrong subtype: Expected=0x9L(0x9L), got="+subtype);
            int vlanVid = U16.f(bb.readShort());

            OFBsnVlanCounterStatsRequestVer13 bsnVlanCounterStatsRequestVer13 = new OFBsnVlanCounterStatsRequestVer13(
                    xid,
                      flags,
                      vlanVid
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnVlanCounterStatsRequestVer13);
            return bsnVlanCounterStatsRequestVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnVlanCounterStatsRequestVer13Funnel FUNNEL = new OFBsnVlanCounterStatsRequestVer13Funnel();
    static class OFBsnVlanCounterStatsRequestVer13Funnel implements Funnel<OFBsnVlanCounterStatsRequestVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnVlanCounterStatsRequestVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 18
            sink.putByte((byte) 0x12);
            // fixed value property length = 26
            sink.putShort((short) 0x1a);
            sink.putLong(message.xid);
            // fixed value property statsType = 65535
            sink.putShort((short) 0xffff);
            OFStatsRequestFlagsSerializerVer13.putTo(message.flags, sink);
            // skip pad (4 bytes)
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x9L
            sink.putInt(0x9);
            sink.putInt(message.vlanVid);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnVlanCounterStatsRequestVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnVlanCounterStatsRequestVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 18
            bb.writeByte((byte) 0x12);
            // fixed value property length = 26
            bb.writeShort((short) 0x1a);
            bb.writeInt(U32.t(message.xid));
            // fixed value property statsType = 65535
            bb.writeShort((short) 0xffff);
            OFStatsRequestFlagsSerializerVer13.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x9L
            bb.writeInt(0x9);
            bb.writeShort(U16.t(message.vlanVid));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnVlanCounterStatsRequestVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("vlanVid=").append(vlanVid);
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
        OFBsnVlanCounterStatsRequestVer13 other = (OFBsnVlanCounterStatsRequestVer13) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if( vlanVid != other.vlanVid)
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
        OFBsnVlanCounterStatsRequestVer13 other = (OFBsnVlanCounterStatsRequestVer13) obj;

        // ignore XID
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if( vlanVid != other.vlanVid)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + vlanVid;
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + vlanVid;
        return result;
    }

}
