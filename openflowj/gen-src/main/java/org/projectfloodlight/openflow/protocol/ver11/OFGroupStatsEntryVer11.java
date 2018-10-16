// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

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

class OFGroupStatsEntryVer11 implements OFGroupStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFGroupStatsEntryVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int MINIMUM_LENGTH = 32;

        private final static OFGroup DEFAULT_GROUP_ID = OFGroup.ALL;
        private final static long DEFAULT_REF_COUNT = 0x0L;
        private final static U64 DEFAULT_PACKET_COUNT = U64.ZERO;
        private final static U64 DEFAULT_BYTE_COUNT = U64.ZERO;
        private final static List<OFBucketCounter> DEFAULT_BUCKET_STATS = ImmutableList.<OFBucketCounter>of();

    // OF message fields
    private final OFGroup group;
    private final long refCount;
    private final U64 packetCount;
    private final U64 byteCount;
    private final List<OFBucketCounter> bucketStats;
//
    // Immutable default instance
    final static OFGroupStatsEntryVer11 DEFAULT = new OFGroupStatsEntryVer11(
        DEFAULT_GROUP_ID, DEFAULT_REF_COUNT, DEFAULT_PACKET_COUNT, DEFAULT_BYTE_COUNT, DEFAULT_BUCKET_STATS
    );

    // package private constructor - used by readers, builders, and factory
    OFGroupStatsEntryVer11(OFGroup group, long refCount, U64 packetCount, U64 byteCount, List<OFBucketCounter> bucketStats) {
        if(group == null) {
            throw new NullPointerException("OFGroupStatsEntryVer11: property group cannot be null");
        }
        if(packetCount == null) {
            throw new NullPointerException("OFGroupStatsEntryVer11: property packetCount cannot be null");
        }
        if(byteCount == null) {
            throw new NullPointerException("OFGroupStatsEntryVer11: property byteCount cannot be null");
        }
        if(bucketStats == null) {
            throw new NullPointerException("OFGroupStatsEntryVer11: property bucketStats cannot be null");
        }
        this.group = group;
        this.refCount = refCount;
        this.packetCount = packetCount;
        this.byteCount = byteCount;
        this.bucketStats = bucketStats;
    }

    // Accessors for OF message fields
    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public long getRefCount() {
        return refCount;
    }

    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public List<OFBucketCounter> getBucketStats() {
        return bucketStats;
    }

    @Override
    public long getDurationSec()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property durationSec not supported in version 1.1");
    }

    @Override
    public long getDurationNsec()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property durationNsec not supported in version 1.1");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFGroupStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFGroupStatsEntry.Builder {
        final OFGroupStatsEntryVer11 parentMessage;

        // OF message fields
        private boolean groupSet;
        private OFGroup group;
        private boolean refCountSet;
        private long refCount;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean bucketStatsSet;
        private List<OFBucketCounter> bucketStats;

        BuilderWithParent(OFGroupStatsEntryVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFGroupStatsEntry.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public long getRefCount() {
        return refCount;
    }

    @Override
    public OFGroupStatsEntry.Builder setRefCount(long refCount) {
        this.refCount = refCount;
        this.refCountSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFGroupStatsEntry.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFGroupStatsEntry.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public List<OFBucketCounter> getBucketStats() {
        return bucketStats;
    }

    @Override
    public OFGroupStatsEntry.Builder setBucketStats(List<OFBucketCounter> bucketStats) {
        this.bucketStats = bucketStats;
        this.bucketStatsSet = true;
        return this;
    }
    @Override
    public long getDurationSec()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property durationSec not supported in version 1.1");
    }

    @Override
    public OFGroupStatsEntry.Builder setDurationSec(long durationSec) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property durationSec not supported in version 1.1");
    }
    @Override
    public long getDurationNsec()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property durationNsec not supported in version 1.1");
    }

    @Override
    public OFGroupStatsEntry.Builder setDurationNsec(long durationNsec) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property durationNsec not supported in version 1.1");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFGroupStatsEntry build() {
                OFGroup group = this.groupSet ? this.group : parentMessage.group;
                if(group == null)
                    throw new NullPointerException("Property group must not be null");
                long refCount = this.refCountSet ? this.refCount : parentMessage.refCount;
                U64 packetCount = this.packetCountSet ? this.packetCount : parentMessage.packetCount;
                if(packetCount == null)
                    throw new NullPointerException("Property packetCount must not be null");
                U64 byteCount = this.byteCountSet ? this.byteCount : parentMessage.byteCount;
                if(byteCount == null)
                    throw new NullPointerException("Property byteCount must not be null");
                List<OFBucketCounter> bucketStats = this.bucketStatsSet ? this.bucketStats : parentMessage.bucketStats;
                if(bucketStats == null)
                    throw new NullPointerException("Property bucketStats must not be null");

                //
                return new OFGroupStatsEntryVer11(
                    group,
                    refCount,
                    packetCount,
                    byteCount,
                    bucketStats
                );
        }

    }

    static class Builder implements OFGroupStatsEntry.Builder {
        // OF message fields
        private boolean groupSet;
        private OFGroup group;
        private boolean refCountSet;
        private long refCount;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean bucketStatsSet;
        private List<OFBucketCounter> bucketStats;

    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFGroupStatsEntry.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public long getRefCount() {
        return refCount;
    }

    @Override
    public OFGroupStatsEntry.Builder setRefCount(long refCount) {
        this.refCount = refCount;
        this.refCountSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFGroupStatsEntry.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFGroupStatsEntry.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public List<OFBucketCounter> getBucketStats() {
        return bucketStats;
    }

    @Override
    public OFGroupStatsEntry.Builder setBucketStats(List<OFBucketCounter> bucketStats) {
        this.bucketStats = bucketStats;
        this.bucketStatsSet = true;
        return this;
    }
    @Override
    public long getDurationSec()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property durationSec not supported in version 1.1");
    }

    @Override
    public OFGroupStatsEntry.Builder setDurationSec(long durationSec) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property durationSec not supported in version 1.1");
    }
    @Override
    public long getDurationNsec()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property durationNsec not supported in version 1.1");
    }

    @Override
    public OFGroupStatsEntry.Builder setDurationNsec(long durationNsec) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property durationNsec not supported in version 1.1");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFGroupStatsEntry build() {
            OFGroup group = this.groupSet ? this.group : DEFAULT_GROUP_ID;
            if(group == null)
                throw new NullPointerException("Property group must not be null");
            long refCount = this.refCountSet ? this.refCount : DEFAULT_REF_COUNT;
            U64 packetCount = this.packetCountSet ? this.packetCount : DEFAULT_PACKET_COUNT;
            if(packetCount == null)
                throw new NullPointerException("Property packetCount must not be null");
            U64 byteCount = this.byteCountSet ? this.byteCount : DEFAULT_BYTE_COUNT;
            if(byteCount == null)
                throw new NullPointerException("Property byteCount must not be null");
            List<OFBucketCounter> bucketStats = this.bucketStatsSet ? this.bucketStats : DEFAULT_BUCKET_STATS;
            if(bucketStats == null)
                throw new NullPointerException("Property bucketStats must not be null");


            return new OFGroupStatsEntryVer11(
                    group,
                    refCount,
                    packetCount,
                    byteCount,
                    bucketStats
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFGroupStatsEntry> {
        @Override
        public OFGroupStatsEntry readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
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
            // pad: 2 bytes
            bb.skipBytes(2);
            OFGroup group = OFGroup.read4Bytes(bb);
            long refCount = U32.f(bb.readInt());
            // pad: 4 bytes
            bb.skipBytes(4);
            U64 packetCount = U64.ofRaw(bb.readLong());
            U64 byteCount = U64.ofRaw(bb.readLong());
            List<OFBucketCounter> bucketStats = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFBucketCounterVer11.READER);

            OFGroupStatsEntryVer11 groupStatsEntryVer11 = new OFGroupStatsEntryVer11(
                    group,
                      refCount,
                      packetCount,
                      byteCount,
                      bucketStats
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", groupStatsEntryVer11);
            return groupStatsEntryVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFGroupStatsEntryVer11Funnel FUNNEL = new OFGroupStatsEntryVer11Funnel();
    static class OFGroupStatsEntryVer11Funnel implements Funnel<OFGroupStatsEntryVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFGroupStatsEntryVer11 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            // skip pad (2 bytes)
            message.group.putTo(sink);
            sink.putLong(message.refCount);
            // skip pad (4 bytes)
            message.packetCount.putTo(sink);
            message.byteCount.putTo(sink);
            FunnelUtils.putList(message.bucketStats, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFGroupStatsEntryVer11> {
        @Override
        public void write(ByteBuf bb, OFGroupStatsEntryVer11 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // pad: 2 bytes
            bb.writeZero(2);
            message.group.write4Bytes(bb);
            bb.writeInt(U32.t(message.refCount));
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeLong(message.packetCount.getValue());
            bb.writeLong(message.byteCount.getValue());
            ChannelUtils.writeList(bb, message.bucketStats);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFGroupStatsEntryVer11(");
        b.append("group=").append(group);
        b.append(", ");
        b.append("refCount=").append(refCount);
        b.append(", ");
        b.append("packetCount=").append(packetCount);
        b.append(", ");
        b.append("byteCount=").append(byteCount);
        b.append(", ");
        b.append("bucketStats=").append(bucketStats);
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
        OFGroupStatsEntryVer11 other = (OFGroupStatsEntryVer11) obj;

        if (group == null) {
            if (other.group != null)
                return false;
        } else if (!group.equals(other.group))
            return false;
        if( refCount != other.refCount)
            return false;
        if (packetCount == null) {
            if (other.packetCount != null)
                return false;
        } else if (!packetCount.equals(other.packetCount))
            return false;
        if (byteCount == null) {
            if (other.byteCount != null)
                return false;
        } else if (!byteCount.equals(other.byteCount))
            return false;
        if (bucketStats == null) {
            if (other.bucketStats != null)
                return false;
        } else if (!bucketStats.equals(other.bucketStats))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((group == null) ? 0 : group.hashCode());
        result = prime *  (int) (refCount ^ (refCount >>> 32));
        result = prime * result + ((packetCount == null) ? 0 : packetCount.hashCode());
        result = prime * result + ((byteCount == null) ? 0 : byteCount.hashCode());
        result = prime * result + ((bucketStats == null) ? 0 : bucketStats.hashCode());
        return result;
    }

}
