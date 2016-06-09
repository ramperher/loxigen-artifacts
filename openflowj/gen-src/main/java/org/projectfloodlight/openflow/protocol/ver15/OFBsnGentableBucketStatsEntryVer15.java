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

class OFBsnGentableBucketStatsEntryVer15 implements OFBsnGentableBucketStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGentableBucketStatsEntryVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 16;

        private final static U128 DEFAULT_CHECKSUM = U128.ZERO;

    // OF message fields
    private final U128 checksum;
//
    // Immutable default instance
    final static OFBsnGentableBucketStatsEntryVer15 DEFAULT = new OFBsnGentableBucketStatsEntryVer15(
        DEFAULT_CHECKSUM
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnGentableBucketStatsEntryVer15(U128 checksum) {
        if(checksum == null) {
            throw new NullPointerException("OFBsnGentableBucketStatsEntryVer15: property checksum cannot be null");
        }
        this.checksum = checksum;
    }

    // Accessors for OF message fields
    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnGentableBucketStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGentableBucketStatsEntry.Builder {
        final OFBsnGentableBucketStatsEntryVer15 parentMessage;

        // OF message fields
        private boolean checksumSet;
        private U128 checksum;

        BuilderWithParent(OFBsnGentableBucketStatsEntryVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableBucketStatsEntry.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnGentableBucketStatsEntry build() {
                U128 checksum = this.checksumSet ? this.checksum : parentMessage.checksum;
                if(checksum == null)
                    throw new NullPointerException("Property checksum must not be null");

                //
                return new OFBsnGentableBucketStatsEntryVer15(
                    checksum
                );
        }

    }

    static class Builder implements OFBsnGentableBucketStatsEntry.Builder {
        // OF message fields
        private boolean checksumSet;
        private U128 checksum;

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableBucketStatsEntry.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFBsnGentableBucketStatsEntry build() {
            U128 checksum = this.checksumSet ? this.checksum : DEFAULT_CHECKSUM;
            if(checksum == null)
                throw new NullPointerException("Property checksum must not be null");


            return new OFBsnGentableBucketStatsEntryVer15(
                    checksum
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGentableBucketStatsEntry> {
        @Override
        public OFBsnGentableBucketStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            U128 checksum = U128.read16Bytes(bb);

            OFBsnGentableBucketStatsEntryVer15 bsnGentableBucketStatsEntryVer15 = new OFBsnGentableBucketStatsEntryVer15(
                    checksum
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGentableBucketStatsEntryVer15);
            return bsnGentableBucketStatsEntryVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGentableBucketStatsEntryVer15Funnel FUNNEL = new OFBsnGentableBucketStatsEntryVer15Funnel();
    static class OFBsnGentableBucketStatsEntryVer15Funnel implements Funnel<OFBsnGentableBucketStatsEntryVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGentableBucketStatsEntryVer15 message, PrimitiveSink sink) {
            message.checksum.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGentableBucketStatsEntryVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnGentableBucketStatsEntryVer15 message) {
            message.checksum.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGentableBucketStatsEntryVer15(");
        b.append("checksum=").append(checksum);
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
        OFBsnGentableBucketStatsEntryVer15 other = (OFBsnGentableBucketStatsEntryVer15) obj;

        if (checksum == null) {
            if (other.checksum != null)
                return false;
        } else if (!checksum.equals(other.checksum))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((checksum == null) ? 0 : checksum.hashCode());
        return result;
    }

}
