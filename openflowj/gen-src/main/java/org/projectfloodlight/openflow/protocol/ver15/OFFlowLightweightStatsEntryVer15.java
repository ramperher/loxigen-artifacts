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
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFFlowLightweightStatsEntryVer15 implements OFFlowLightweightStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFFlowLightweightStatsEntryVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 24;

        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static int DEFAULT_PRIORITY = 0x0;
        private final static Match DEFAULT_MATCH = OFFactoryVer15.MATCH_WILDCARD_ALL;

    // OF message fields
    private final TableId tableId;
    private final OFFlowStatsReason reason;
    private final int priority;
    private final Match match;
    private final Stat stats;
//

    // package private constructor - used by readers, builders, and factory
    OFFlowLightweightStatsEntryVer15(TableId tableId, OFFlowStatsReason reason, int priority, Match match, Stat stats) {
        if(tableId == null) {
            throw new NullPointerException("OFFlowLightweightStatsEntryVer15: property tableId cannot be null");
        }
        if(reason == null) {
            throw new NullPointerException("OFFlowLightweightStatsEntryVer15: property reason cannot be null");
        }
        if(match == null) {
            throw new NullPointerException("OFFlowLightweightStatsEntryVer15: property match cannot be null");
        }
        if(stats == null) {
            throw new NullPointerException("OFFlowLightweightStatsEntryVer15: property stats cannot be null");
        }
        this.tableId = tableId;
        this.reason = reason;
        this.priority = priority;
        this.match = match;
        this.stats = stats;
    }

    // Accessors for OF message fields
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFFlowStatsReason getReason() {
        return reason;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public Stat getStats() {
        return stats;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFFlowLightweightStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFFlowLightweightStatsEntry.Builder {
        final OFFlowLightweightStatsEntryVer15 parentMessage;

        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean reasonSet;
        private OFFlowStatsReason reason;
        private boolean prioritySet;
        private int priority;
        private boolean matchSet;
        private Match match;
        private boolean statsSet;
        private Stat stats;

        BuilderWithParent(OFFlowLightweightStatsEntryVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public OFFlowStatsReason getReason() {
        return reason;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setReason(OFFlowStatsReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public Stat getStats() {
        return stats;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setStats(Stat stats) {
        this.stats = stats;
        this.statsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFFlowLightweightStatsEntry build() {
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                OFFlowStatsReason reason = this.reasonSet ? this.reason : parentMessage.reason;
                if(reason == null)
                    throw new NullPointerException("Property reason must not be null");
                int priority = this.prioritySet ? this.priority : parentMessage.priority;
                Match match = this.matchSet ? this.match : parentMessage.match;
                if(match == null)
                    throw new NullPointerException("Property match must not be null");
                Stat stats = this.statsSet ? this.stats : parentMessage.stats;
                if(stats == null)
                    throw new NullPointerException("Property stats must not be null");

                //
                return new OFFlowLightweightStatsEntryVer15(
                    tableId,
                    reason,
                    priority,
                    match,
                    stats
                );
        }

    }

    static class Builder implements OFFlowLightweightStatsEntry.Builder {
        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean reasonSet;
        private OFFlowStatsReason reason;
        private boolean prioritySet;
        private int priority;
        private boolean matchSet;
        private Match match;
        private boolean statsSet;
        private Stat stats;

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public OFFlowStatsReason getReason() {
        return reason;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setReason(OFFlowStatsReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public Stat getStats() {
        return stats;
    }

    @Override
    public OFFlowLightweightStatsEntry.Builder setStats(Stat stats) {
        this.stats = stats;
        this.statsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFFlowLightweightStatsEntry build() {
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            if(!this.reasonSet)
                throw new IllegalStateException("Property reason doesn't have default value -- must be set");
            if(reason == null)
                throw new NullPointerException("Property reason must not be null");
            int priority = this.prioritySet ? this.priority : DEFAULT_PRIORITY;
            Match match = this.matchSet ? this.match : DEFAULT_MATCH;
            if(match == null)
                throw new NullPointerException("Property match must not be null");
            if(!this.statsSet)
                throw new IllegalStateException("Property stats doesn't have default value -- must be set");
            if(stats == null)
                throw new NullPointerException("Property stats must not be null");


            return new OFFlowLightweightStatsEntryVer15(
                    tableId,
                    reason,
                    priority,
                    match,
                    stats
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFFlowLightweightStatsEntry> {
        @Override
        public OFFlowLightweightStatsEntry readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
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
            TableId tableId = TableId.readByte(bb);
            OFFlowStatsReason reason = OFFlowStatsReasonSerializerVer15.readFrom(bb);
            int priority = U16.f(bb.readShort());
            Match match = ChannelUtilsVer15.readOFMatch(context, bb);
            Stat stats = ChannelUtilsVer15.readOFStat(context, bb);

            OFFlowLightweightStatsEntryVer15 flowLightweightStatsEntryVer15 = new OFFlowLightweightStatsEntryVer15(
                    tableId,
                      reason,
                      priority,
                      match,
                      stats
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", flowLightweightStatsEntryVer15);
            return flowLightweightStatsEntryVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFFlowLightweightStatsEntryVer15Funnel FUNNEL = new OFFlowLightweightStatsEntryVer15Funnel();
    static class OFFlowLightweightStatsEntryVer15Funnel implements Funnel<OFFlowLightweightStatsEntryVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFFlowLightweightStatsEntryVer15 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            // skip pad (2 bytes)
            message.tableId.putTo(sink);
            OFFlowStatsReasonSerializerVer15.putTo(message.reason, sink);
            sink.putInt(message.priority);
            message.match.putTo(sink);
            message.stats.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFFlowLightweightStatsEntryVer15> {
        @Override
        public void write(ByteBuf bb, OFFlowLightweightStatsEntryVer15 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // pad: 2 bytes
            bb.writeZero(2);
            message.tableId.writeByte(bb);
            OFFlowStatsReasonSerializerVer15.writeTo(bb, message.reason);
            bb.writeShort(U16.t(message.priority));
            message.match.writeTo(bb);
            message.stats.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFFlowLightweightStatsEntryVer15(");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("reason=").append(reason);
        b.append(", ");
        b.append("priority=").append(priority);
        b.append(", ");
        b.append("match=").append(match);
        b.append(", ");
        b.append("stats=").append(stats);
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
        OFFlowLightweightStatsEntryVer15 other = (OFFlowLightweightStatsEntryVer15) obj;

        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if( priority != other.priority)
            return false;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
            return false;
        if (stats == null) {
            if (other.stats != null)
                return false;
        } else if (!stats.equals(other.stats))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + priority;
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        result = prime * result + ((stats == null) ? 0 : stats.hashCode());
        return result;
    }

}
