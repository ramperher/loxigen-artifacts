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

class OFBsnDebugCounterStatsEntryVer15 implements OFBsnDebugCounterStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnDebugCounterStatsEntryVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 16;

        private final static U64 DEFAULT_COUNTER_ID = U64.ZERO;
        private final static U64 DEFAULT_VALUE = U64.ZERO;

    // OF message fields
    private final U64 counterId;
    private final U64 value;
//
    // Immutable default instance
    final static OFBsnDebugCounterStatsEntryVer15 DEFAULT = new OFBsnDebugCounterStatsEntryVer15(
        DEFAULT_COUNTER_ID, DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnDebugCounterStatsEntryVer15(U64 counterId, U64 value) {
        if(counterId == null) {
            throw new NullPointerException("OFBsnDebugCounterStatsEntryVer15: property counterId cannot be null");
        }
        if(value == null) {
            throw new NullPointerException("OFBsnDebugCounterStatsEntryVer15: property value cannot be null");
        }
        this.counterId = counterId;
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public U64 getCounterId() {
        return counterId;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnDebugCounterStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnDebugCounterStatsEntry.Builder {
        final OFBsnDebugCounterStatsEntryVer15 parentMessage;

        // OF message fields
        private boolean counterIdSet;
        private U64 counterId;
        private boolean valueSet;
        private U64 value;

        BuilderWithParent(OFBsnDebugCounterStatsEntryVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public U64 getCounterId() {
        return counterId;
    }

    @Override
    public OFBsnDebugCounterStatsEntry.Builder setCounterId(U64 counterId) {
        this.counterId = counterId;
        this.counterIdSet = true;
        return this;
    }
    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFBsnDebugCounterStatsEntry.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnDebugCounterStatsEntry build() {
                U64 counterId = this.counterIdSet ? this.counterId : parentMessage.counterId;
                if(counterId == null)
                    throw new NullPointerException("Property counterId must not be null");
                U64 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnDebugCounterStatsEntryVer15(
                    counterId,
                    value
                );
        }

    }

    static class Builder implements OFBsnDebugCounterStatsEntry.Builder {
        // OF message fields
        private boolean counterIdSet;
        private U64 counterId;
        private boolean valueSet;
        private U64 value;

    @Override
    public U64 getCounterId() {
        return counterId;
    }

    @Override
    public OFBsnDebugCounterStatsEntry.Builder setCounterId(U64 counterId) {
        this.counterId = counterId;
        this.counterIdSet = true;
        return this;
    }
    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFBsnDebugCounterStatsEntry.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFBsnDebugCounterStatsEntry build() {
            U64 counterId = this.counterIdSet ? this.counterId : DEFAULT_COUNTER_ID;
            if(counterId == null)
                throw new NullPointerException("Property counterId must not be null");
            U64 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnDebugCounterStatsEntryVer15(
                    counterId,
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnDebugCounterStatsEntry> {
        @Override
        public OFBsnDebugCounterStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            U64 counterId = U64.ofRaw(bb.readLong());
            U64 value = U64.ofRaw(bb.readLong());

            OFBsnDebugCounterStatsEntryVer15 bsnDebugCounterStatsEntryVer15 = new OFBsnDebugCounterStatsEntryVer15(
                    counterId,
                      value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnDebugCounterStatsEntryVer15);
            return bsnDebugCounterStatsEntryVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnDebugCounterStatsEntryVer15Funnel FUNNEL = new OFBsnDebugCounterStatsEntryVer15Funnel();
    static class OFBsnDebugCounterStatsEntryVer15Funnel implements Funnel<OFBsnDebugCounterStatsEntryVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnDebugCounterStatsEntryVer15 message, PrimitiveSink sink) {
            message.counterId.putTo(sink);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnDebugCounterStatsEntryVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnDebugCounterStatsEntryVer15 message) {
            bb.writeLong(message.counterId.getValue());
            bb.writeLong(message.value.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnDebugCounterStatsEntryVer15(");
        b.append("counterId=").append(counterId);
        b.append(", ");
        b.append("value=").append(value);
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
        OFBsnDebugCounterStatsEntryVer15 other = (OFBsnDebugCounterStatsEntryVer15) obj;

        if (counterId == null) {
            if (other.counterId != null)
                return false;
        } else if (!counterId.equals(other.counterId))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((counterId == null) ? 0 : counterId.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
