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

class OFGroupAddVer15 implements OFGroupAdd {
    private static final Logger logger = LoggerFactory.getLogger(OFGroupAddVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFGroup DEFAULT_GROUP_ID = OFGroup.ALL;
        private final static List<OFBucket> DEFAULT_BUCKETS = ImmutableList.<OFBucket>of();
        private final static List<OFGroupProp> DEFAULT_PROPERTIES = ImmutableList.<OFGroupProp>of();

    // OF message fields
    private final long xid;
    private final OFGroupType groupType;
    private final OFGroup group;
    private final OFGroupBucket commandBucketId;
    private final List<OFBucket> buckets;
    private final List<OFGroupProp> properties;
//

    // package private constructor - used by readers, builders, and factory
    OFGroupAddVer15(long xid, OFGroupType groupType, OFGroup group, OFGroupBucket commandBucketId, List<OFBucket> buckets, List<OFGroupProp> properties) {
        if(groupType == null) {
            throw new NullPointerException("OFGroupAddVer15: property groupType cannot be null");
        }
        if(group == null) {
            throw new NullPointerException("OFGroupAddVer15: property group cannot be null");
        }
        if(commandBucketId == null) {
            throw new NullPointerException("OFGroupAddVer15: property commandBucketId cannot be null");
        }
        if(buckets == null) {
            throw new NullPointerException("OFGroupAddVer15: property buckets cannot be null");
        }
        if(properties == null) {
            throw new NullPointerException("OFGroupAddVer15: property properties cannot be null");
        }
        this.xid = xid;
        this.groupType = groupType;
        this.group = group;
        this.commandBucketId = commandBucketId;
        this.buckets = buckets;
        this.properties = properties;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
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
        return OFGroupModCommand.ADD;
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
    public OFGroupBucket getCommandBucketId() {
        return commandBucketId;
    }

    @Override
    public List<OFGroupProp> getProperties() {
        return properties;
    }



    public OFGroupAdd.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFGroupAdd.Builder {
        final OFGroupAddVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean groupTypeSet;
        private OFGroupType groupType;
        private boolean groupSet;
        private OFGroup group;
        private boolean commandBucketIdSet;
        private OFGroupBucket commandBucketId;
        private boolean bucketsSet;
        private List<OFBucket> buckets;
        private boolean propertiesSet;
        private List<OFGroupProp> properties;

        BuilderWithParent(OFGroupAddVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
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
    public OFGroupAdd.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFGroupModCommand getCommand() {
        return OFGroupModCommand.ADD;
    }

    @Override
    public OFGroupType getGroupType() {
        return groupType;
    }

    @Override
    public OFGroupAdd.Builder setGroupType(OFGroupType groupType) {
        this.groupType = groupType;
        this.groupTypeSet = true;
        return this;
    }
    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFGroupAdd.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public List<OFBucket> getBuckets() {
        return buckets;
    }

    @Override
    public OFGroupAdd.Builder setBuckets(List<OFBucket> buckets) {
        this.buckets = buckets;
        this.bucketsSet = true;
        return this;
    }
    @Override
    public OFGroupBucket getCommandBucketId() {
        return commandBucketId;
    }

    @Override
    public OFGroupAdd.Builder setCommandBucketId(OFGroupBucket commandBucketId) {
        this.commandBucketId = commandBucketId;
        this.commandBucketIdSet = true;
        return this;
    }
    @Override
    public List<OFGroupProp> getProperties() {
        return properties;
    }

    @Override
    public OFGroupAdd.Builder setProperties(List<OFGroupProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }


        @Override
        public OFGroupAdd build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFGroupType groupType = this.groupTypeSet ? this.groupType : parentMessage.groupType;
                if(groupType == null)
                    throw new NullPointerException("Property groupType must not be null");
                OFGroup group = this.groupSet ? this.group : parentMessage.group;
                if(group == null)
                    throw new NullPointerException("Property group must not be null");
                OFGroupBucket commandBucketId = this.commandBucketIdSet ? this.commandBucketId : parentMessage.commandBucketId;
                if(commandBucketId == null)
                    throw new NullPointerException("Property commandBucketId must not be null");
                List<OFBucket> buckets = this.bucketsSet ? this.buckets : parentMessage.buckets;
                if(buckets == null)
                    throw new NullPointerException("Property buckets must not be null");
                List<OFGroupProp> properties = this.propertiesSet ? this.properties : parentMessage.properties;
                if(properties == null)
                    throw new NullPointerException("Property properties must not be null");

                //
                return new OFGroupAddVer15(
                    xid,
                    groupType,
                    group,
                    commandBucketId,
                    buckets,
                    properties
                );
        }

    }

    static class Builder implements OFGroupAdd.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean groupTypeSet;
        private OFGroupType groupType;
        private boolean groupSet;
        private OFGroup group;
        private boolean commandBucketIdSet;
        private OFGroupBucket commandBucketId;
        private boolean bucketsSet;
        private List<OFBucket> buckets;
        private boolean propertiesSet;
        private List<OFGroupProp> properties;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
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
    public OFGroupAdd.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFGroupModCommand getCommand() {
        return OFGroupModCommand.ADD;
    }

    @Override
    public OFGroupType getGroupType() {
        return groupType;
    }

    @Override
    public OFGroupAdd.Builder setGroupType(OFGroupType groupType) {
        this.groupType = groupType;
        this.groupTypeSet = true;
        return this;
    }
    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFGroupAdd.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public List<OFBucket> getBuckets() {
        return buckets;
    }

    @Override
    public OFGroupAdd.Builder setBuckets(List<OFBucket> buckets) {
        this.buckets = buckets;
        this.bucketsSet = true;
        return this;
    }
    @Override
    public OFGroupBucket getCommandBucketId() {
        return commandBucketId;
    }

    @Override
    public OFGroupAdd.Builder setCommandBucketId(OFGroupBucket commandBucketId) {
        this.commandBucketId = commandBucketId;
        this.commandBucketIdSet = true;
        return this;
    }
    @Override
    public List<OFGroupProp> getProperties() {
        return properties;
    }

    @Override
    public OFGroupAdd.Builder setProperties(List<OFGroupProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
//
        @Override
        public OFGroupAdd build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.groupTypeSet)
                throw new IllegalStateException("Property groupType doesn't have default value -- must be set");
            if(groupType == null)
                throw new NullPointerException("Property groupType must not be null");
            OFGroup group = this.groupSet ? this.group : DEFAULT_GROUP_ID;
            if(group == null)
                throw new NullPointerException("Property group must not be null");
            if(!this.commandBucketIdSet)
                throw new IllegalStateException("Property commandBucketId doesn't have default value -- must be set");
            if(commandBucketId == null)
                throw new NullPointerException("Property commandBucketId must not be null");
            List<OFBucket> buckets = this.bucketsSet ? this.buckets : DEFAULT_BUCKETS;
            if(buckets == null)
                throw new NullPointerException("Property buckets must not be null");
            List<OFGroupProp> properties = this.propertiesSet ? this.properties : DEFAULT_PROPERTIES;
            if(properties == null)
                throw new NullPointerException("Property properties must not be null");


            return new OFGroupAddVer15(
                    xid,
                    groupType,
                    group,
                    commandBucketId,
                    buckets,
                    properties
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFGroupAdd> {
        @Override
        public OFGroupAdd readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
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
            // fixed value property command == 0
            short command = bb.readShort();
            if(command != (short) 0x0)
                throw new OFParseError("Wrong command: Expected=OFGroupModCommand.ADD(0), got="+command);
            OFGroupType groupType = OFGroupTypeSerializerVer15.readFrom(bb);
            // pad: 1 bytes
            bb.skipBytes(1);
            OFGroup group = OFGroup.read4Bytes(bb);
            int bucketArrayLen = U16.f(bb.readShort());
            // pad: 2 bytes
            bb.skipBytes(2);
            OFGroupBucket commandBucketId = OFGroupBucketSerializerVer15.readFrom(bb);
            List<OFBucket> buckets = ChannelUtils.readList(context, bb, bucketArrayLen, OFBucketVer15.READER);
            List<OFGroupProp> properties = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFGroupPropVer15.READER);

            OFGroupAddVer15 groupAddVer15 = new OFGroupAddVer15(
                    xid,
                      groupType,
                      group,
                      commandBucketId,
                      buckets,
                      properties
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", groupAddVer15);
            return groupAddVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFGroupAddVer15Funnel FUNNEL = new OFGroupAddVer15Funnel();
    static class OFGroupAddVer15Funnel implements Funnel<OFGroupAddVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFGroupAddVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 15
            sink.putByte((byte) 0xf);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property command = 0
            sink.putShort((short) 0x0);
            OFGroupTypeSerializerVer15.putTo(message.groupType, sink);
            // skip pad (1 bytes)
            message.group.putTo(sink);
            // FIXME: skip funnel of bucketArrayLen
            // skip pad (2 bytes)
            OFGroupBucketSerializerVer15.putTo(message.commandBucketId, sink);
            FunnelUtils.putList(message.buckets, sink);
            FunnelUtils.putList(message.properties, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFGroupAddVer15> {
        @Override
        public void write(ByteBuf bb, OFGroupAddVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 15
            bb.writeByte((byte) 0xf);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property command = 0
            bb.writeShort((short) 0x0);
            OFGroupTypeSerializerVer15.writeTo(bb, message.groupType);
            // pad: 1 bytes
            bb.writeZero(1);
            message.group.write4Bytes(bb);
            // bucketArrayLen is length indicator for buckets, will be
            // udpated when buckets has been written
            int bucketArrayLenIndex = bb.writerIndex();
            bb.writeShort(0);
            // pad: 2 bytes
            bb.writeZero(2);
            OFGroupBucketSerializerVer15.writeTo(bb, message.commandBucketId);
            int bucketsStartIndex = bb.writerIndex();
            ChannelUtils.writeList(bb, message.buckets);
            // update field length member bucketArrayLen
            int bucketsLength = bb.writerIndex() - bucketsStartIndex;
            bb.setShort(bucketArrayLenIndex, bucketsLength);
            ChannelUtils.writeList(bb, message.properties);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFGroupAddVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("groupType=").append(groupType);
        b.append(", ");
        b.append("group=").append(group);
        b.append(", ");
        b.append("commandBucketId=").append(commandBucketId);
        b.append(", ");
        b.append("buckets=").append(buckets);
        b.append(", ");
        b.append("properties=").append(properties);
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
        OFGroupAddVer15 other = (OFGroupAddVer15) obj;

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
        if (commandBucketId == null) {
            if (other.commandBucketId != null)
                return false;
        } else if (!commandBucketId.equals(other.commandBucketId))
            return false;
        if (buckets == null) {
            if (other.buckets != null)
                return false;
        } else if (!buckets.equals(other.buckets))
            return false;
        if (properties == null) {
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
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
        OFGroupAddVer15 other = (OFGroupAddVer15) obj;

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
        if (commandBucketId == null) {
            if (other.commandBucketId != null)
                return false;
        } else if (!commandBucketId.equals(other.commandBucketId))
            return false;
        if (buckets == null) {
            if (other.buckets != null)
                return false;
        } else if (!buckets.equals(other.buckets))
            return false;
        if (properties == null) {
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
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
        result = prime * result + ((commandBucketId == null) ? 0 : commandBucketId.hashCode());
        result = prime * result + ((buckets == null) ? 0 : buckets.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((groupType == null) ? 0 : groupType.hashCode());
        result = prime * result + ((group == null) ? 0 : group.hashCode());
        result = prime * result + ((commandBucketId == null) ? 0 : commandBucketId.hashCode());
        result = prime * result + ((buckets == null) ? 0 : buckets.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

}
