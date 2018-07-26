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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFGroupDeleteVer14 implements OFGroupDelete {
    private static final Logger logger = LoggerFactory.getLogger(OFGroupDeleteVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 16;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFGroup DEFAULT_GROUP_ID = OFGroup.ALL;
        private final static List<OFBucket> DEFAULT_BUCKETS = ImmutableList.<OFBucket>of();

    // OF message fields
    private final long xid;
    private final OFGroupType groupType;
    private final OFGroup group;
    private final List<OFBucket> buckets;
//

    // package private constructor - used by readers, builders, and factory
    OFGroupDeleteVer14(long xid, OFGroupType groupType, OFGroup group, List<OFBucket> buckets) {
        if(groupType == null) {
            throw new NullPointerException("OFGroupDeleteVer14: property groupType cannot be null");
        }
        if(group == null) {
            throw new NullPointerException("OFGroupDeleteVer14: property group cannot be null");
        }
        if(buckets == null) {
            throw new NullPointerException("OFGroupDeleteVer14: property buckets cannot be null");
        }
        this.xid = xid;
        this.groupType = groupType;
        this.group = group;
        this.buckets = buckets;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.GROUP_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGroupModCommand getCommand() {
        return OFGroupModCommand.DELETE;
    }

    @Override
    public OFGroupType getGroupType() {
        return groupType;
    }

    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public List<OFBucket> getBuckets() {
        return buckets;
    }

    @Override
    public OFGroupBucket getCommandBucketId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property commandBucketId not supported in version 1.4");
    }

    @Override
    public List<OFGroupProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }



    public OFGroupDelete.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFGroupDelete.Builder {
        final OFGroupDeleteVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean groupTypeSet;
        private OFGroupType groupType;
        private boolean groupSet;
        private OFGroup group;
        private boolean bucketsSet;
        private List<OFBucket> buckets;

        BuilderWithParent(OFGroupDeleteVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.GROUP_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGroupDelete.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFGroupModCommand getCommand() {
        return OFGroupModCommand.DELETE;
    }

    @Override
    public OFGroupType getGroupType() {
        return groupType;
    }

    @Override
    public OFGroupDelete.Builder setGroupType(OFGroupType groupType) {
        this.groupType = groupType;
        this.groupTypeSet = true;
        return this;
    }
    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFGroupDelete.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public List<OFBucket> getBuckets() {
        return buckets;
    }

    @Override
    public OFGroupDelete.Builder setBuckets(List<OFBucket> buckets) {
        this.buckets = buckets;
        this.bucketsSet = true;
        return this;
    }
    @Override
    public OFGroupBucket getCommandBucketId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property commandBucketId not supported in version 1.4");
    }

    @Override
    public OFGroupDelete.Builder setCommandBucketId(OFGroupBucket commandBucketId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property commandBucketId not supported in version 1.4");
    }
    @Override
    public List<OFGroupProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }

    @Override
    public OFGroupDelete.Builder setProperties(List<OFGroupProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }


        @Override
        public OFGroupDelete build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFGroupType groupType = this.groupTypeSet ? this.groupType : parentMessage.groupType;
                if(groupType == null)
                    throw new NullPointerException("Property groupType must not be null");
                OFGroup group = this.groupSet ? this.group : parentMessage.group;
                if(group == null)
                    throw new NullPointerException("Property group must not be null");
                List<OFBucket> buckets = this.bucketsSet ? this.buckets : parentMessage.buckets;
                if(buckets == null)
                    throw new NullPointerException("Property buckets must not be null");

                //
                return new OFGroupDeleteVer14(
                    xid,
                    groupType,
                    group,
                    buckets
                );
        }

    }

    static class Builder implements OFGroupDelete.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean groupTypeSet;
        private OFGroupType groupType;
        private boolean groupSet;
        private OFGroup group;
        private boolean bucketsSet;
        private List<OFBucket> buckets;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.GROUP_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGroupDelete.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFGroupModCommand getCommand() {
        return OFGroupModCommand.DELETE;
    }

    @Override
    public OFGroupType getGroupType() {
        return groupType;
    }

    @Override
    public OFGroupDelete.Builder setGroupType(OFGroupType groupType) {
        this.groupType = groupType;
        this.groupTypeSet = true;
        return this;
    }
    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFGroupDelete.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public List<OFBucket> getBuckets() {
        return buckets;
    }

    @Override
    public OFGroupDelete.Builder setBuckets(List<OFBucket> buckets) {
        this.buckets = buckets;
        this.bucketsSet = true;
        return this;
    }
    @Override
    public OFGroupBucket getCommandBucketId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property commandBucketId not supported in version 1.4");
    }

    @Override
    public OFGroupDelete.Builder setCommandBucketId(OFGroupBucket commandBucketId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property commandBucketId not supported in version 1.4");
    }
    @Override
    public List<OFGroupProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }

    @Override
    public OFGroupDelete.Builder setProperties(List<OFGroupProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }
//
        @Override
        public OFGroupDelete build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.groupTypeSet)
                throw new IllegalStateException("Property groupType doesn't have default value -- must be set");
            if(groupType == null)
                throw new NullPointerException("Property groupType must not be null");
            OFGroup group = this.groupSet ? this.group : DEFAULT_GROUP_ID;
            if(group == null)
                throw new NullPointerException("Property group must not be null");
            List<OFBucket> buckets = this.bucketsSet ? this.buckets : DEFAULT_BUCKETS;
            if(buckets == null)
                throw new NullPointerException("Property buckets must not be null");


            return new OFGroupDeleteVer14(
                    xid,
                    groupType,
                    group,
                    buckets
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFGroupDelete> {
        @Override
        public OFGroupDelete readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 15
            byte type = bb.readByte();
            if(type != (byte) 0xf)
                throw new OFParseError("Wrong type: Expected=OFType.GROUP_MOD(15), got="+type);
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
            // fixed value property command == 2
            short command = bb.readShort();
            if(command != (short) 0x2)
                throw new OFParseError("Wrong command: Expected=OFGroupModCommand.DELETE(2), got="+command);
            OFGroupType groupType = OFGroupTypeSerializerVer14.readFrom(bb);
            // pad: 1 bytes
            bb.skipBytes(1);
            OFGroup group = OFGroup.read4Bytes(bb);
            List<OFBucket> buckets = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFBucketVer14.READER);

            OFGroupDeleteVer14 groupDeleteVer14 = new OFGroupDeleteVer14(
                    xid,
                      groupType,
                      group,
                      buckets
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", groupDeleteVer14);
            return groupDeleteVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFGroupDeleteVer14Funnel FUNNEL = new OFGroupDeleteVer14Funnel();
    static class OFGroupDeleteVer14Funnel implements Funnel<OFGroupDeleteVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFGroupDeleteVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 15
            sink.putByte((byte) 0xf);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property command = 2
            sink.putShort((short) 0x2);
            OFGroupTypeSerializerVer14.putTo(message.groupType, sink);
            // skip pad (1 bytes)
            message.group.putTo(sink);
            FunnelUtils.putList(message.buckets, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFGroupDeleteVer14> {
        @Override
        public void write(ByteBuf bb, OFGroupDeleteVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 15
            bb.writeByte((byte) 0xf);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property command = 2
            bb.writeShort((short) 0x2);
            OFGroupTypeSerializerVer14.writeTo(bb, message.groupType);
            // pad: 1 bytes
            bb.writeZero(1);
            message.group.write4Bytes(bb);
            ChannelUtils.writeList(bb, message.buckets);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFGroupDeleteVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("groupType=").append(groupType);
        b.append(", ");
        b.append("group=").append(group);
        b.append(", ");
        b.append("buckets=").append(buckets);
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
        OFGroupDeleteVer14 other = (OFGroupDeleteVer14) obj;

        if( xid != other.xid)
            return false;
        if (groupType == null) {
            if (other.groupType != null)
                return false;
        } else if (!groupType.equals(other.groupType))
            return false;
        if (group == null) {
            if (other.group != null)
                return false;
        } else if (!group.equals(other.group))
            return false;
        if (buckets == null) {
            if (other.buckets != null)
                return false;
        } else if (!buckets.equals(other.buckets))
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
        OFGroupDeleteVer14 other = (OFGroupDeleteVer14) obj;

        // ignore XID
        if (groupType == null) {
            if (other.groupType != null)
                return false;
        } else if (!groupType.equals(other.groupType))
            return false;
        if (group == null) {
            if (other.group != null)
                return false;
        } else if (!group.equals(other.group))
            return false;
        if (buckets == null) {
            if (other.buckets != null)
                return false;
        } else if (!buckets.equals(other.buckets))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((groupType == null) ? 0 : groupType.hashCode());
        result = prime * result + ((group == null) ? 0 : group.hashCode());
        result = prime * result + ((buckets == null) ? 0 : buckets.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((groupType == null) ? 0 : groupType.hashCode());
        result = prime * result + ((group == null) ? 0 : group.hashCode());
        result = prime * result + ((buckets == null) ? 0 : buckets.hashCode());
        return result;
    }

}
