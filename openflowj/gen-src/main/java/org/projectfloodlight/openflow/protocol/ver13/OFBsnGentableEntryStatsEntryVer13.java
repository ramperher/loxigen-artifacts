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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnGentableEntryStatsEntryVer13 implements OFBsnGentableEntryStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGentableEntryStatsEntryVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;

        private final static List<OFBsnTlv> DEFAULT_KEY = ImmutableList.<OFBsnTlv>of();
        private final static List<OFBsnTlv> DEFAULT_STATS = ImmutableList.<OFBsnTlv>of();

    // OF message fields
    private final List<OFBsnTlv> key;
    private final List<OFBsnTlv> stats;
//
    // Immutable default instance
    final static OFBsnGentableEntryStatsEntryVer13 DEFAULT = new OFBsnGentableEntryStatsEntryVer13(
        DEFAULT_KEY, DEFAULT_STATS
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnGentableEntryStatsEntryVer13(List<OFBsnTlv> key, List<OFBsnTlv> stats) {
        if(key == null) {
            throw new NullPointerException("OFBsnGentableEntryStatsEntryVer13: property key cannot be null");
        }
        if(stats == null) {
            throw new NullPointerException("OFBsnGentableEntryStatsEntryVer13: property stats cannot be null");
        }
        this.key = key;
        this.stats = stats;
    }

    // Accessors for OF message fields
    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public List<OFBsnTlv> getStats() {
        return stats;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnGentableEntryStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGentableEntryStatsEntry.Builder {
        final OFBsnGentableEntryStatsEntryVer13 parentMessage;

        // OF message fields
        private boolean keySet;
        private List<OFBsnTlv> key;
        private boolean statsSet;
        private List<OFBsnTlv> stats;

        BuilderWithParent(OFBsnGentableEntryStatsEntryVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public OFBsnGentableEntryStatsEntry.Builder setKey(List<OFBsnTlv> key) {
        this.key = key;
        this.keySet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getStats() {
        return stats;
    }

    @Override
    public OFBsnGentableEntryStatsEntry.Builder setStats(List<OFBsnTlv> stats) {
        this.stats = stats;
        this.statsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnGentableEntryStatsEntry build() {
                List<OFBsnTlv> key = this.keySet ? this.key : parentMessage.key;
                if(key == null)
                    throw new NullPointerException("Property key must not be null");
                List<OFBsnTlv> stats = this.statsSet ? this.stats : parentMessage.stats;
                if(stats == null)
                    throw new NullPointerException("Property stats must not be null");

                //
                return new OFBsnGentableEntryStatsEntryVer13(
                    key,
                    stats
                );
        }

    }

    static class Builder implements OFBsnGentableEntryStatsEntry.Builder {
        // OF message fields
        private boolean keySet;
        private List<OFBsnTlv> key;
        private boolean statsSet;
        private List<OFBsnTlv> stats;

    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public OFBsnGentableEntryStatsEntry.Builder setKey(List<OFBsnTlv> key) {
        this.key = key;
        this.keySet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getStats() {
        return stats;
    }

    @Override
    public OFBsnGentableEntryStatsEntry.Builder setStats(List<OFBsnTlv> stats) {
        this.stats = stats;
        this.statsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnGentableEntryStatsEntry build() {
            List<OFBsnTlv> key = this.keySet ? this.key : DEFAULT_KEY;
            if(key == null)
                throw new NullPointerException("Property key must not be null");
            List<OFBsnTlv> stats = this.statsSet ? this.stats : DEFAULT_STATS;
            if(stats == null)
                throw new NullPointerException("Property stats must not be null");


            return new OFBsnGentableEntryStatsEntryVer13(
                    key,
                    stats
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnGentableEntryStatsEntry> {
        @Override
        public OFBsnGentableEntryStatsEntry readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
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
            int keyLength = U16.f(bb.readShort());
            List<OFBsnTlv> key = ChannelUtils.readList(context, bb, keyLength, OFBsnTlvVer13.READER);
            List<OFBsnTlv> stats = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFBsnTlvVer13.READER);

            OFBsnGentableEntryStatsEntryVer13 bsnGentableEntryStatsEntryVer13 = new OFBsnGentableEntryStatsEntryVer13(
                    key,
                      stats
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGentableEntryStatsEntryVer13);
            return bsnGentableEntryStatsEntryVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGentableEntryStatsEntryVer13Funnel FUNNEL = new OFBsnGentableEntryStatsEntryVer13Funnel();
    static class OFBsnGentableEntryStatsEntryVer13Funnel implements Funnel<OFBsnGentableEntryStatsEntryVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGentableEntryStatsEntryVer13 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            // FIXME: skip funnel of keyLength
            FunnelUtils.putList(message.key, sink);
            FunnelUtils.putList(message.stats, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGentableEntryStatsEntryVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnGentableEntryStatsEntryVer13 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // keyLength is length indicator for key, will be
            // udpated when key has been written
            int keyLengthIndex = bb.writerIndex();
            bb.writeShort(0);
            int keyStartIndex = bb.writerIndex();
            ChannelUtils.writeList(bb, message.key);
            // update field length member keyLength
            int keyLength = bb.writerIndex() - keyStartIndex;
            bb.setShort(keyLengthIndex, keyLength);
            ChannelUtils.writeList(bb, message.stats);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGentableEntryStatsEntryVer13(");
        b.append("key=").append(key);
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
        OFBsnGentableEntryStatsEntryVer13 other = (OFBsnGentableEntryStatsEntryVer13) obj;

        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
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

        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((stats == null) ? 0 : stats.hashCode());
        return result;
    }

}
