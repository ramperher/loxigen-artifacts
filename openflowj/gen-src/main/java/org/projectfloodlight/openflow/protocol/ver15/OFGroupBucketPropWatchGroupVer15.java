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

class OFGroupBucketPropWatchGroupVer15 implements OFGroupBucketPropWatchGroup {
    private static final Logger logger = LoggerFactory.getLogger(OFGroupBucketPropWatchGroupVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 8;

        private final static long DEFAULT_WATCH = 0x0L;

    // OF message fields
    private final long watch;
//
    // Immutable default instance
    final static OFGroupBucketPropWatchGroupVer15 DEFAULT = new OFGroupBucketPropWatchGroupVer15(
        DEFAULT_WATCH
    );

    // package private constructor - used by readers, builders, and factory
    OFGroupBucketPropWatchGroupVer15(long watch) {
        this.watch = watch;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public long getWatch() {
        return watch;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFGroupBucketPropWatchGroup.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFGroupBucketPropWatchGroup.Builder {
        final OFGroupBucketPropWatchGroupVer15 parentMessage;

        // OF message fields
        private boolean watchSet;
        private long watch;

        BuilderWithParent(OFGroupBucketPropWatchGroupVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public long getWatch() {
        return watch;
    }

    @Override
    public OFGroupBucketPropWatchGroup.Builder setWatch(long watch) {
        this.watch = watch;
        this.watchSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFGroupBucketPropWatchGroup build() {
                long watch = this.watchSet ? this.watch : parentMessage.watch;

                //
                return new OFGroupBucketPropWatchGroupVer15(
                    watch
                );
        }

    }

    static class Builder implements OFGroupBucketPropWatchGroup.Builder {
        // OF message fields
        private boolean watchSet;
        private long watch;

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public long getWatch() {
        return watch;
    }

    @Override
    public OFGroupBucketPropWatchGroup.Builder setWatch(long watch) {
        this.watch = watch;
        this.watchSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFGroupBucketPropWatchGroup build() {
            long watch = this.watchSet ? this.watch : DEFAULT_WATCH;


            return new OFGroupBucketPropWatchGroupVer15(
                    watch
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFGroupBucketPropWatchGroup> {
        @Override
        public OFGroupBucketPropWatchGroup readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0x2
            short type = bb.readShort();
            if(type != (short) 0x2)
                throw new OFParseError("Wrong type: Expected=0x2(0x2), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long watch = U32.f(bb.readInt());

            OFGroupBucketPropWatchGroupVer15 groupBucketPropWatchGroupVer15 = new OFGroupBucketPropWatchGroupVer15(
                    watch
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", groupBucketPropWatchGroupVer15);
            return groupBucketPropWatchGroupVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFGroupBucketPropWatchGroupVer15Funnel FUNNEL = new OFGroupBucketPropWatchGroupVer15Funnel();
    static class OFGroupBucketPropWatchGroupVer15Funnel implements Funnel<OFGroupBucketPropWatchGroupVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFGroupBucketPropWatchGroupVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x2
            sink.putShort((short) 0x2);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.watch);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFGroupBucketPropWatchGroupVer15> {
        @Override
        public void write(ByteBuf bb, OFGroupBucketPropWatchGroupVer15 message) {
            // fixed value property type = 0x2
            bb.writeShort((short) 0x2);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.watch));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFGroupBucketPropWatchGroupVer15(");
        b.append("watch=").append(watch);
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
        OFGroupBucketPropWatchGroupVer15 other = (OFGroupBucketPropWatchGroupVer15) obj;

        if( watch != other.watch)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (watch ^ (watch >>> 32));
        return result;
    }

}
