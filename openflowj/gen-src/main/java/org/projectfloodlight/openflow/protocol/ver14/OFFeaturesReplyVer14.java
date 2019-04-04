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
import com.google.common.collect.ImmutableSet;
import java.util.List;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFFeaturesReplyVer14 implements OFFeaturesReply {
    private static final Logger logger = LoggerFactory.getLogger(OFFeaturesReplyVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 32;

        private final static long DEFAULT_XID = 0x0L;
        private final static DatapathId DEFAULT_DATAPATH_ID = DatapathId.NONE;
        private final static long DEFAULT_N_BUFFERS = 0x0L;
        private final static short DEFAULT_N_TABLES = (short) 0x0;
        private final static OFAuxId DEFAULT_AUXILIARY_ID = OFAuxId.MAIN;
        private final static Set<OFCapabilities> DEFAULT_CAPABILITIES = ImmutableSet.<OFCapabilities>of();
        private final static long DEFAULT_RESERVED = 0x0L;

    // OF message fields
    private final long xid;
    private final DatapathId datapathId;
    private final long nBuffers;
    private final short nTables;
    private final OFAuxId auxiliaryId;
    private final Set<OFCapabilities> capabilities;
    private final long reserved;
//
    // Immutable default instance
    final static OFFeaturesReplyVer14 DEFAULT = new OFFeaturesReplyVer14(
        DEFAULT_XID, DEFAULT_DATAPATH_ID, DEFAULT_N_BUFFERS, DEFAULT_N_TABLES, DEFAULT_AUXILIARY_ID, DEFAULT_CAPABILITIES, DEFAULT_RESERVED
    );

    // package private constructor - used by readers, builders, and factory
    OFFeaturesReplyVer14(long xid, DatapathId datapathId, long nBuffers, short nTables, OFAuxId auxiliaryId, Set<OFCapabilities> capabilities, long reserved) {
        if(datapathId == null) {
            throw new NullPointerException("OFFeaturesReplyVer14: property datapathId cannot be null");
        }
        if(auxiliaryId == null) {
            throw new NullPointerException("OFFeaturesReplyVer14: property auxiliaryId cannot be null");
        }
        if(capabilities == null) {
            throw new NullPointerException("OFFeaturesReplyVer14: property capabilities cannot be null");
        }
        this.xid = xid;
        this.datapathId = datapathId;
        this.nBuffers = nBuffers;
        this.nTables = nTables;
        this.auxiliaryId = auxiliaryId;
        this.capabilities = capabilities;
        this.reserved = reserved;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public DatapathId getDatapathId() {
        return datapathId;
    }

    @Override
    public long getNBuffers() {
        return nBuffers;
    }

    @Override
    public short getNTables() {
        return nTables;
    }

    @Override
    public OFAuxId getAuxiliaryId() {
        return auxiliaryId;
    }

    @Override
    public Set<OFCapabilities> getCapabilities() {
        return capabilities;
    }

    @Override
    public long getReserved() {
        return reserved;
    }

    @Override
    public Set<OFActionType> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.4");
    }

    @Override
    public List<OFPortDesc> getPorts()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property ports not supported in version 1.4");
    }



    public OFFeaturesReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFFeaturesReply.Builder {
        final OFFeaturesReplyVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean datapathIdSet;
        private DatapathId datapathId;
        private boolean nBuffersSet;
        private long nBuffers;
        private boolean nTablesSet;
        private short nTables;
        private boolean auxiliaryIdSet;
        private OFAuxId auxiliaryId;
        private boolean capabilitiesSet;
        private Set<OFCapabilities> capabilities;
        private boolean reservedSet;
        private long reserved;

        BuilderWithParent(OFFeaturesReplyVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFeaturesReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public DatapathId getDatapathId() {
        return datapathId;
    }

    @Override
    public OFFeaturesReply.Builder setDatapathId(DatapathId datapathId) {
        this.datapathId = datapathId;
        this.datapathIdSet = true;
        return this;
    }
    @Override
    public long getNBuffers() {
        return nBuffers;
    }

    @Override
    public OFFeaturesReply.Builder setNBuffers(long nBuffers) {
        this.nBuffers = nBuffers;
        this.nBuffersSet = true;
        return this;
    }
    @Override
    public short getNTables() {
        return nTables;
    }

    @Override
    public OFFeaturesReply.Builder setNTables(short nTables) {
        this.nTables = nTables;
        this.nTablesSet = true;
        return this;
    }
    @Override
    public OFAuxId getAuxiliaryId() {
        return auxiliaryId;
    }

    @Override
    public OFFeaturesReply.Builder setAuxiliaryId(OFAuxId auxiliaryId) {
        this.auxiliaryId = auxiliaryId;
        this.auxiliaryIdSet = true;
        return this;
    }
    @Override
    public Set<OFCapabilities> getCapabilities() {
        return capabilities;
    }

    @Override
    public OFFeaturesReply.Builder setCapabilities(Set<OFCapabilities> capabilities) {
        this.capabilities = capabilities;
        this.capabilitiesSet = true;
        return this;
    }
    @Override
    public long getReserved() {
        return reserved;
    }

    @Override
    public OFFeaturesReply.Builder setReserved(long reserved) {
        this.reserved = reserved;
        this.reservedSet = true;
        return this;
    }
    @Override
    public Set<OFActionType> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.4");
    }

    @Override
    public OFFeaturesReply.Builder setActions(Set<OFActionType> actions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property actions not supported in version 1.4");
    }
    @Override
    public List<OFPortDesc> getPorts()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property ports not supported in version 1.4");
    }

    @Override
    public OFFeaturesReply.Builder setPorts(List<OFPortDesc> ports) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property ports not supported in version 1.4");
    }


        @Override
        public OFFeaturesReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                DatapathId datapathId = this.datapathIdSet ? this.datapathId : parentMessage.datapathId;
                if(datapathId == null)
                    throw new NullPointerException("Property datapathId must not be null");
                long nBuffers = this.nBuffersSet ? this.nBuffers : parentMessage.nBuffers;
                short nTables = this.nTablesSet ? this.nTables : parentMessage.nTables;
                OFAuxId auxiliaryId = this.auxiliaryIdSet ? this.auxiliaryId : parentMessage.auxiliaryId;
                if(auxiliaryId == null)
                    throw new NullPointerException("Property auxiliaryId must not be null");
                Set<OFCapabilities> capabilities = this.capabilitiesSet ? this.capabilities : parentMessage.capabilities;
                if(capabilities == null)
                    throw new NullPointerException("Property capabilities must not be null");
                long reserved = this.reservedSet ? this.reserved : parentMessage.reserved;

                //
                return new OFFeaturesReplyVer14(
                    xid,
                    datapathId,
                    nBuffers,
                    nTables,
                    auxiliaryId,
                    capabilities,
                    reserved
                );
        }

    }

    static class Builder implements OFFeaturesReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean datapathIdSet;
        private DatapathId datapathId;
        private boolean nBuffersSet;
        private long nBuffers;
        private boolean nTablesSet;
        private short nTables;
        private boolean auxiliaryIdSet;
        private OFAuxId auxiliaryId;
        private boolean capabilitiesSet;
        private Set<OFCapabilities> capabilities;
        private boolean reservedSet;
        private long reserved;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFeaturesReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public DatapathId getDatapathId() {
        return datapathId;
    }

    @Override
    public OFFeaturesReply.Builder setDatapathId(DatapathId datapathId) {
        this.datapathId = datapathId;
        this.datapathIdSet = true;
        return this;
    }
    @Override
    public long getNBuffers() {
        return nBuffers;
    }

    @Override
    public OFFeaturesReply.Builder setNBuffers(long nBuffers) {
        this.nBuffers = nBuffers;
        this.nBuffersSet = true;
        return this;
    }
    @Override
    public short getNTables() {
        return nTables;
    }

    @Override
    public OFFeaturesReply.Builder setNTables(short nTables) {
        this.nTables = nTables;
        this.nTablesSet = true;
        return this;
    }
    @Override
    public OFAuxId getAuxiliaryId() {
        return auxiliaryId;
    }

    @Override
    public OFFeaturesReply.Builder setAuxiliaryId(OFAuxId auxiliaryId) {
        this.auxiliaryId = auxiliaryId;
        this.auxiliaryIdSet = true;
        return this;
    }
    @Override
    public Set<OFCapabilities> getCapabilities() {
        return capabilities;
    }

    @Override
    public OFFeaturesReply.Builder setCapabilities(Set<OFCapabilities> capabilities) {
        this.capabilities = capabilities;
        this.capabilitiesSet = true;
        return this;
    }
    @Override
    public long getReserved() {
        return reserved;
    }

    @Override
    public OFFeaturesReply.Builder setReserved(long reserved) {
        this.reserved = reserved;
        this.reservedSet = true;
        return this;
    }
    @Override
    public Set<OFActionType> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.4");
    }

    @Override
    public OFFeaturesReply.Builder setActions(Set<OFActionType> actions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property actions not supported in version 1.4");
    }
    @Override
    public List<OFPortDesc> getPorts()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property ports not supported in version 1.4");
    }

    @Override
    public OFFeaturesReply.Builder setPorts(List<OFPortDesc> ports) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property ports not supported in version 1.4");
    }
//
        @Override
        public OFFeaturesReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            DatapathId datapathId = this.datapathIdSet ? this.datapathId : DEFAULT_DATAPATH_ID;
            if(datapathId == null)
                throw new NullPointerException("Property datapathId must not be null");
            long nBuffers = this.nBuffersSet ? this.nBuffers : DEFAULT_N_BUFFERS;
            short nTables = this.nTablesSet ? this.nTables : DEFAULT_N_TABLES;
            OFAuxId auxiliaryId = this.auxiliaryIdSet ? this.auxiliaryId : DEFAULT_AUXILIARY_ID;
            if(auxiliaryId == null)
                throw new NullPointerException("Property auxiliaryId must not be null");
            Set<OFCapabilities> capabilities = this.capabilitiesSet ? this.capabilities : DEFAULT_CAPABILITIES;
            if(capabilities == null)
                throw new NullPointerException("Property capabilities must not be null");
            long reserved = this.reservedSet ? this.reserved : DEFAULT_RESERVED;


            return new OFFeaturesReplyVer14(
                    xid,
                    datapathId,
                    nBuffers,
                    nTables,
                    auxiliaryId,
                    capabilities,
                    reserved
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFFeaturesReply> {
        @Override
        public OFFeaturesReply readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 6
            byte type = bb.readByte();
            if(type != (byte) 0x6)
                throw new OFParseError("Wrong type: Expected=OFType.FEATURES_REPLY(6), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 32)
                throw new OFParseError("Wrong length: Expected=32(32), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            DatapathId datapathId = DatapathId.of(bb.readLong());
            long nBuffers = U32.f(bb.readInt());
            short nTables = U8.f(bb.readByte());
            OFAuxId auxiliaryId = OFAuxId.readByte(bb);
            // pad: 2 bytes
            bb.skipBytes(2);
            Set<OFCapabilities> capabilities = OFCapabilitiesSerializerVer14.readFrom(bb);
            long reserved = U32.f(bb.readInt());

            OFFeaturesReplyVer14 featuresReplyVer14 = new OFFeaturesReplyVer14(
                    xid,
                      datapathId,
                      nBuffers,
                      nTables,
                      auxiliaryId,
                      capabilities,
                      reserved
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", featuresReplyVer14);
            return featuresReplyVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFFeaturesReplyVer14Funnel FUNNEL = new OFFeaturesReplyVer14Funnel();
    static class OFFeaturesReplyVer14Funnel implements Funnel<OFFeaturesReplyVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFFeaturesReplyVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 6
            sink.putByte((byte) 0x6);
            // fixed value property length = 32
            sink.putShort((short) 0x20);
            sink.putLong(message.xid);
            message.datapathId.putTo(sink);
            sink.putLong(message.nBuffers);
            sink.putShort(message.nTables);
            message.auxiliaryId.putTo(sink);
            // skip pad (2 bytes)
            OFCapabilitiesSerializerVer14.putTo(message.capabilities, sink);
            sink.putLong(message.reserved);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFFeaturesReplyVer14> {
        @Override
        public void write(ByteBuf bb, OFFeaturesReplyVer14 message) {
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 6
            bb.writeByte((byte) 0x6);
            // fixed value property length = 32
            bb.writeShort((short) 0x20);
            bb.writeInt(U32.t(message.xid));
            bb.writeLong(message.datapathId.getLong());
            bb.writeInt(U32.t(message.nBuffers));
            bb.writeByte(U8.t(message.nTables));
            message.auxiliaryId.writeByte(bb);
            // pad: 2 bytes
            bb.writeZero(2);
            OFCapabilitiesSerializerVer14.writeTo(bb, message.capabilities);
            bb.writeInt(U32.t(message.reserved));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFFeaturesReplyVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("datapathId=").append(datapathId);
        b.append(", ");
        b.append("nBuffers=").append(nBuffers);
        b.append(", ");
        b.append("nTables=").append(nTables);
        b.append(", ");
        b.append("auxiliaryId=").append(auxiliaryId);
        b.append(", ");
        b.append("capabilities=").append(capabilities);
        b.append(", ");
        b.append("reserved=").append(reserved);
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
        OFFeaturesReplyVer14 other = (OFFeaturesReplyVer14) obj;

        if( xid != other.xid)
            return false;
        if (datapathId == null) {
            if (other.datapathId != null)
                return false;
        } else if (!datapathId.equals(other.datapathId))
            return false;
        if( nBuffers != other.nBuffers)
            return false;
        if( nTables != other.nTables)
            return false;
        if (auxiliaryId == null) {
            if (other.auxiliaryId != null)
                return false;
        } else if (!auxiliaryId.equals(other.auxiliaryId))
            return false;
        if (capabilities == null) {
            if (other.capabilities != null)
                return false;
        } else if (!capabilities.equals(other.capabilities))
            return false;
        if( reserved != other.reserved)
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
        OFFeaturesReplyVer14 other = (OFFeaturesReplyVer14) obj;

        // ignore XID
        if (datapathId == null) {
            if (other.datapathId != null)
                return false;
        } else if (!datapathId.equals(other.datapathId))
            return false;
        if( nBuffers != other.nBuffers)
            return false;
        if( nTables != other.nTables)
            return false;
        if (auxiliaryId == null) {
            if (other.auxiliaryId != null)
                return false;
        } else if (!auxiliaryId.equals(other.auxiliaryId))
            return false;
        if (capabilities == null) {
            if (other.capabilities != null)
                return false;
        } else if (!capabilities.equals(other.capabilities))
            return false;
        if( reserved != other.reserved)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((datapathId == null) ? 0 : datapathId.hashCode());
        result = prime *  (int) (nBuffers ^ (nBuffers >>> 32));
        result = prime * result + nTables;
        result = prime * result + ((auxiliaryId == null) ? 0 : auxiliaryId.hashCode());
        result = prime * result + ((capabilities == null) ? 0 : capabilities.hashCode());
        result = prime *  (int) (reserved ^ (reserved >>> 32));
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((datapathId == null) ? 0 : datapathId.hashCode());
        result = prime *  (int) (nBuffers ^ (nBuffers >>> 32));
        result = prime * result + nTables;
        result = prime * result + ((auxiliaryId == null) ? 0 : auxiliaryId.hashCode());
        result = prime * result + ((capabilities == null) ? 0 : capabilities.hashCode());
        result = prime *  (int) (reserved ^ (reserved >>> 32));
        return result;
    }

}
