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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnControllerConnectionsReplyVer15 implements OFBsnControllerConnectionsReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnControllerConnectionsReplyVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 16;

        private final static long DEFAULT_XID = 0x0L;
        private final static List<OFBsnControllerConnection> DEFAULT_CONNECTIONS = ImmutableList.<OFBsnControllerConnection>of();

    // OF message fields
    private final long xid;
    private final List<OFBsnControllerConnection> connections;
//
    // Immutable default instance
    final static OFBsnControllerConnectionsReplyVer15 DEFAULT = new OFBsnControllerConnectionsReplyVer15(
        DEFAULT_XID, DEFAULT_CONNECTIONS
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnControllerConnectionsReplyVer15(long xid, List<OFBsnControllerConnection> connections) {
        if(connections == null) {
            throw new NullPointerException("OFBsnControllerConnectionsReplyVer15: property connections cannot be null");
        }
        this.xid = xid;
        this.connections = connections;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
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
        return 0x39L;
    }

    @Override
    public List<OFBsnControllerConnection> getConnections() {
        return connections;
    }



    public OFBsnControllerConnectionsReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnControllerConnectionsReply.Builder {
        final OFBsnControllerConnectionsReplyVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean connectionsSet;
        private List<OFBsnControllerConnection> connections;

        BuilderWithParent(OFBsnControllerConnectionsReplyVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
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
    public OFBsnControllerConnectionsReply.Builder setXid(long xid) {
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
        return 0x39L;
    }

    @Override
    public List<OFBsnControllerConnection> getConnections() {
        return connections;
    }

    @Override
    public OFBsnControllerConnectionsReply.Builder setConnections(List<OFBsnControllerConnection> connections) {
        this.connections = connections;
        this.connectionsSet = true;
        return this;
    }


        @Override
        public OFBsnControllerConnectionsReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                List<OFBsnControllerConnection> connections = this.connectionsSet ? this.connections : parentMessage.connections;
                if(connections == null)
                    throw new NullPointerException("Property connections must not be null");

                //
                return new OFBsnControllerConnectionsReplyVer15(
                    xid,
                    connections
                );
        }

    }

    static class Builder implements OFBsnControllerConnectionsReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean connectionsSet;
        private List<OFBsnControllerConnection> connections;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
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
    public OFBsnControllerConnectionsReply.Builder setXid(long xid) {
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
        return 0x39L;
    }

    @Override
    public List<OFBsnControllerConnection> getConnections() {
        return connections;
    }

    @Override
    public OFBsnControllerConnectionsReply.Builder setConnections(List<OFBsnControllerConnection> connections) {
        this.connections = connections;
        this.connectionsSet = true;
        return this;
    }
//
        @Override
        public OFBsnControllerConnectionsReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            List<OFBsnControllerConnection> connections = this.connectionsSet ? this.connections : DEFAULT_CONNECTIONS;
            if(connections == null)
                throw new NullPointerException("Property connections must not be null");


            return new OFBsnControllerConnectionsReplyVer15(
                    xid,
                    connections
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnControllerConnectionsReply> {
        @Override
        public OFBsnControllerConnectionsReply readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
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
            // fixed value property subtype == 0x39L
            int subtype = bb.readInt();
            if(subtype != 0x39)
                throw new OFParseError("Wrong subtype: Expected=0x39L(0x39L), got="+subtype);
            List<OFBsnControllerConnection> connections = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFBsnControllerConnectionVer15.READER);

            OFBsnControllerConnectionsReplyVer15 bsnControllerConnectionsReplyVer15 = new OFBsnControllerConnectionsReplyVer15(
                    xid,
                      connections
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnControllerConnectionsReplyVer15);
            return bsnControllerConnectionsReplyVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnControllerConnectionsReplyVer15Funnel FUNNEL = new OFBsnControllerConnectionsReplyVer15Funnel();
    static class OFBsnControllerConnectionsReplyVer15Funnel implements Funnel<OFBsnControllerConnectionsReplyVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnControllerConnectionsReplyVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x39L
            sink.putInt(0x39);
            FunnelUtils.putList(message.connections, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnControllerConnectionsReplyVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnControllerConnectionsReplyVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x39L
            bb.writeInt(0x39);
            ChannelUtils.writeList(bb, message.connections);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnControllerConnectionsReplyVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("connections=").append(connections);
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
        OFBsnControllerConnectionsReplyVer15 other = (OFBsnControllerConnectionsReplyVer15) obj;

        if( xid != other.xid)
            return false;
        if (connections == null) {
            if (other.connections != null)
                return false;
        } else if (!connections.equals(other.connections))
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
        OFBsnControllerConnectionsReplyVer15 other = (OFBsnControllerConnectionsReplyVer15) obj;

        // ignore XID
        if (connections == null) {
            if (other.connections != null)
                return false;
        } else if (!connections.equals(other.connections))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((connections == null) ? 0 : connections.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((connections == null) ? 0 : connections.hashCode());
        return result;
    }

}
