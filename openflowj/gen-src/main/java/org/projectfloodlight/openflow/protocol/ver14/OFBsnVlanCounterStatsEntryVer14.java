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

class OFBsnVlanCounterStatsEntryVer14 implements OFBsnVlanCounterStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnVlanCounterStatsEntryVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 8;

        private final static int DEFAULT_VLAN_VID = 0x0;
        private final static List<U64> DEFAULT_VALUES = ImmutableList.<U64>of();

    // OF message fields
    private final int vlanVid;
    private final List<U64> values;
//
    // Immutable default instance
    final static OFBsnVlanCounterStatsEntryVer14 DEFAULT = new OFBsnVlanCounterStatsEntryVer14(
        DEFAULT_VLAN_VID, DEFAULT_VALUES
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnVlanCounterStatsEntryVer14(int vlanVid, List<U64> values) {
        if(values == null) {
            throw new NullPointerException("OFBsnVlanCounterStatsEntryVer14: property values cannot be null");
        }
        this.vlanVid = vlanVid;
        this.values = values;
    }

    // Accessors for OF message fields
    @Override
    public int getVlanVid() {
        return vlanVid;
    }

    @Override
    public List<U64> getValues() {
        return values;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnVlanCounterStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnVlanCounterStatsEntry.Builder {
        final OFBsnVlanCounterStatsEntryVer14 parentMessage;

        // OF message fields
        private boolean vlanVidSet;
        private int vlanVid;
        private boolean valuesSet;
        private List<U64> values;

        BuilderWithParent(OFBsnVlanCounterStatsEntryVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFBsnVlanCounterStatsEntry.Builder setVlanVid(int vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
    @Override
    public List<U64> getValues() {
        return values;
    }

    @Override
    public OFBsnVlanCounterStatsEntry.Builder setValues(List<U64> values) {
        this.values = values;
        this.valuesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnVlanCounterStatsEntry build() {
                int vlanVid = this.vlanVidSet ? this.vlanVid : parentMessage.vlanVid;
                List<U64> values = this.valuesSet ? this.values : parentMessage.values;
                if(values == null)
                    throw new NullPointerException("Property values must not be null");

                //
                return new OFBsnVlanCounterStatsEntryVer14(
                    vlanVid,
                    values
                );
        }

    }

    static class Builder implements OFBsnVlanCounterStatsEntry.Builder {
        // OF message fields
        private boolean vlanVidSet;
        private int vlanVid;
        private boolean valuesSet;
        private List<U64> values;

    @Override
    public int getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFBsnVlanCounterStatsEntry.Builder setVlanVid(int vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
    @Override
    public List<U64> getValues() {
        return values;
    }

    @Override
    public OFBsnVlanCounterStatsEntry.Builder setValues(List<U64> values) {
        this.values = values;
        this.valuesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnVlanCounterStatsEntry build() {
            int vlanVid = this.vlanVidSet ? this.vlanVid : DEFAULT_VLAN_VID;
            List<U64> values = this.valuesSet ? this.values : DEFAULT_VALUES;
            if(values == null)
                throw new NullPointerException("Property values must not be null");


            return new OFBsnVlanCounterStatsEntryVer14(
                    vlanVid,
                    values
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnVlanCounterStatsEntry> {
        @Override
        public OFBsnVlanCounterStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            int vlanVid = U16.f(bb.readShort());
            // pad: 4 bytes
            bb.skipBytes(4);
            List<U64> values = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), U64.READER);

            OFBsnVlanCounterStatsEntryVer14 bsnVlanCounterStatsEntryVer14 = new OFBsnVlanCounterStatsEntryVer14(
                    vlanVid,
                      values
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnVlanCounterStatsEntryVer14);
            return bsnVlanCounterStatsEntryVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnVlanCounterStatsEntryVer14Funnel FUNNEL = new OFBsnVlanCounterStatsEntryVer14Funnel();
    static class OFBsnVlanCounterStatsEntryVer14Funnel implements Funnel<OFBsnVlanCounterStatsEntryVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnVlanCounterStatsEntryVer14 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            sink.putInt(message.vlanVid);
            // skip pad (4 bytes)
            FunnelUtils.putList(message.values, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnVlanCounterStatsEntryVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnVlanCounterStatsEntryVer14 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeShort(U16.t(message.vlanVid));
            // pad: 4 bytes
            bb.writeZero(4);
            ChannelUtils.writeList(bb, message.values);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnVlanCounterStatsEntryVer14(");
        b.append("vlanVid=").append(vlanVid);
        b.append(", ");
        b.append("values=").append(values);
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
        OFBsnVlanCounterStatsEntryVer14 other = (OFBsnVlanCounterStatsEntryVer14) obj;

        if( vlanVid != other.vlanVid)
            return false;
        if (values == null) {
            if (other.values != null)
                return false;
        } else if (!values.equals(other.values))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + vlanVid;
        result = prime * result + ((values == null) ? 0 : values.hashCode());
        return result;
    }

}
