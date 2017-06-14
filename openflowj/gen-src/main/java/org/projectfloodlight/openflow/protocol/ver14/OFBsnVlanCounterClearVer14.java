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

class OFBsnVlanCounterClearVer14 implements OFBsnVlanCounterClear {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnVlanCounterClearVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 18;

        private final static long DEFAULT_XID = 0x0L;
        private final static int DEFAULT_VLAN_VID = 0x0;

    // OF message fields
    private final long xid;
    private final int vlanVid;
//
    // Immutable default instance
    final static OFBsnVlanCounterClearVer14 DEFAULT = new OFBsnVlanCounterClearVer14(
        DEFAULT_XID, DEFAULT_VLAN_VID
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnVlanCounterClearVer14(long xid, int vlanVid) {
        this.xid = xid;
        this.vlanVid = vlanVid;
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
        return 0x46L;
    }

    @Override
    public int getVlanVid() {
        return vlanVid;
    }



    public OFBsnVlanCounterClear.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnVlanCounterClear.Builder {
        final OFBsnVlanCounterClearVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean vlanVidSet;
        private int vlanVid;

        BuilderWithParent(OFBsnVlanCounterClearVer14 parentMessage) {
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
    public OFBsnVlanCounterClear.Builder setXid(long xid) {
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
        return 0x46L;
    }

    @Override
    public int getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFBsnVlanCounterClear.Builder setVlanVid(int vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }


        @Override
        public OFBsnVlanCounterClear build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                int vlanVid = this.vlanVidSet ? this.vlanVid : parentMessage.vlanVid;

                //
                return new OFBsnVlanCounterClearVer14(
                    xid,
                    vlanVid
                );
        }

    }

    static class Builder implements OFBsnVlanCounterClear.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean vlanVidSet;
        private int vlanVid;

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
    public OFBsnVlanCounterClear.Builder setXid(long xid) {
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
        return 0x46L;
    }

    @Override
    public int getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFBsnVlanCounterClear.Builder setVlanVid(int vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
//
        @Override
        public OFBsnVlanCounterClear build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            int vlanVid = this.vlanVidSet ? this.vlanVid : DEFAULT_VLAN_VID;


            return new OFBsnVlanCounterClearVer14(
                    xid,
                    vlanVid
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnVlanCounterClear> {
        @Override
        public OFBsnVlanCounterClear readFrom(ByteBuf bb) throws OFParseError {
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
            if(length != 18)
                throw new OFParseError("Wrong length: Expected=18(18), got="+length);
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
            // fixed value property subtype == 0x46L
            int subtype = bb.readInt();
            if(subtype != 0x46)
                throw new OFParseError("Wrong subtype: Expected=0x46L(0x46L), got="+subtype);
            int vlanVid = U16.f(bb.readShort());

            OFBsnVlanCounterClearVer14 bsnVlanCounterClearVer14 = new OFBsnVlanCounterClearVer14(
                    xid,
                      vlanVid
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnVlanCounterClearVer14);
            return bsnVlanCounterClearVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnVlanCounterClearVer14Funnel FUNNEL = new OFBsnVlanCounterClearVer14Funnel();
    static class OFBsnVlanCounterClearVer14Funnel implements Funnel<OFBsnVlanCounterClearVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnVlanCounterClearVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 18
            sink.putShort((short) 0x12);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x46L
            sink.putInt(0x46);
            sink.putInt(message.vlanVid);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnVlanCounterClearVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnVlanCounterClearVer14 message) {
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 18
            bb.writeShort((short) 0x12);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x46L
            bb.writeInt(0x46);
            bb.writeShort(U16.t(message.vlanVid));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnVlanCounterClearVer14(");
        b.append("xid=").append(xid);
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
        OFBsnVlanCounterClearVer14 other = (OFBsnVlanCounterClearVer14) obj;

        if( xid != other.xid)
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
        OFBsnVlanCounterClearVer14 other = (OFBsnVlanCounterClearVer14) obj;

        // ignore XID
        if( vlanVid != other.vlanVid)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + vlanVid;
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + vlanVid;
        return result;
    }

}