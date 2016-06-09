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

class OFBundleFeaturesPropTimeVer15 implements OFBundleFeaturesPropTime {
    private static final Logger logger = LoggerFactory.getLogger(OFBundleFeaturesPropTimeVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 72;


    // OF message fields
    private final OFTime schedAccuracy;
    private final OFTime schedMaxFuture;
    private final OFTime schedMaxPast;
    private final OFTime timestamp;
//

    // package private constructor - used by readers, builders, and factory
    OFBundleFeaturesPropTimeVer15(OFTime schedAccuracy, OFTime schedMaxFuture, OFTime schedMaxPast, OFTime timestamp) {
        if(schedAccuracy == null) {
            throw new NullPointerException("OFBundleFeaturesPropTimeVer15: property schedAccuracy cannot be null");
        }
        if(schedMaxFuture == null) {
            throw new NullPointerException("OFBundleFeaturesPropTimeVer15: property schedMaxFuture cannot be null");
        }
        if(schedMaxPast == null) {
            throw new NullPointerException("OFBundleFeaturesPropTimeVer15: property schedMaxPast cannot be null");
        }
        if(timestamp == null) {
            throw new NullPointerException("OFBundleFeaturesPropTimeVer15: property timestamp cannot be null");
        }
        this.schedAccuracy = schedAccuracy;
        this.schedMaxFuture = schedMaxFuture;
        this.schedMaxPast = schedMaxPast;
        this.timestamp = timestamp;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public OFTime getSchedAccuracy() {
        return schedAccuracy;
    }

    @Override
    public OFTime getSchedMaxFuture() {
        return schedMaxFuture;
    }

    @Override
    public OFTime getSchedMaxPast() {
        return schedMaxPast;
    }

    @Override
    public OFTime getTimestamp() {
        return timestamp;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBundleFeaturesPropTime.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBundleFeaturesPropTime.Builder {
        final OFBundleFeaturesPropTimeVer15 parentMessage;

        // OF message fields
        private boolean schedAccuracySet;
        private OFTime schedAccuracy;
        private boolean schedMaxFutureSet;
        private OFTime schedMaxFuture;
        private boolean schedMaxPastSet;
        private OFTime schedMaxPast;
        private boolean timestampSet;
        private OFTime timestamp;

        BuilderWithParent(OFBundleFeaturesPropTimeVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public OFTime getSchedAccuracy() {
        return schedAccuracy;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setSchedAccuracy(OFTime schedAccuracy) {
        this.schedAccuracy = schedAccuracy;
        this.schedAccuracySet = true;
        return this;
    }
    @Override
    public OFTime getSchedMaxFuture() {
        return schedMaxFuture;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setSchedMaxFuture(OFTime schedMaxFuture) {
        this.schedMaxFuture = schedMaxFuture;
        this.schedMaxFutureSet = true;
        return this;
    }
    @Override
    public OFTime getSchedMaxPast() {
        return schedMaxPast;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setSchedMaxPast(OFTime schedMaxPast) {
        this.schedMaxPast = schedMaxPast;
        this.schedMaxPastSet = true;
        return this;
    }
    @Override
    public OFTime getTimestamp() {
        return timestamp;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setTimestamp(OFTime timestamp) {
        this.timestamp = timestamp;
        this.timestampSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBundleFeaturesPropTime build() {
                OFTime schedAccuracy = this.schedAccuracySet ? this.schedAccuracy : parentMessage.schedAccuracy;
                if(schedAccuracy == null)
                    throw new NullPointerException("Property schedAccuracy must not be null");
                OFTime schedMaxFuture = this.schedMaxFutureSet ? this.schedMaxFuture : parentMessage.schedMaxFuture;
                if(schedMaxFuture == null)
                    throw new NullPointerException("Property schedMaxFuture must not be null");
                OFTime schedMaxPast = this.schedMaxPastSet ? this.schedMaxPast : parentMessage.schedMaxPast;
                if(schedMaxPast == null)
                    throw new NullPointerException("Property schedMaxPast must not be null");
                OFTime timestamp = this.timestampSet ? this.timestamp : parentMessage.timestamp;
                if(timestamp == null)
                    throw new NullPointerException("Property timestamp must not be null");

                //
                return new OFBundleFeaturesPropTimeVer15(
                    schedAccuracy,
                    schedMaxFuture,
                    schedMaxPast,
                    timestamp
                );
        }

    }

    static class Builder implements OFBundleFeaturesPropTime.Builder {
        // OF message fields
        private boolean schedAccuracySet;
        private OFTime schedAccuracy;
        private boolean schedMaxFutureSet;
        private OFTime schedMaxFuture;
        private boolean schedMaxPastSet;
        private OFTime schedMaxPast;
        private boolean timestampSet;
        private OFTime timestamp;

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public OFTime getSchedAccuracy() {
        return schedAccuracy;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setSchedAccuracy(OFTime schedAccuracy) {
        this.schedAccuracy = schedAccuracy;
        this.schedAccuracySet = true;
        return this;
    }
    @Override
    public OFTime getSchedMaxFuture() {
        return schedMaxFuture;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setSchedMaxFuture(OFTime schedMaxFuture) {
        this.schedMaxFuture = schedMaxFuture;
        this.schedMaxFutureSet = true;
        return this;
    }
    @Override
    public OFTime getSchedMaxPast() {
        return schedMaxPast;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setSchedMaxPast(OFTime schedMaxPast) {
        this.schedMaxPast = schedMaxPast;
        this.schedMaxPastSet = true;
        return this;
    }
    @Override
    public OFTime getTimestamp() {
        return timestamp;
    }

    @Override
    public OFBundleFeaturesPropTime.Builder setTimestamp(OFTime timestamp) {
        this.timestamp = timestamp;
        this.timestampSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFBundleFeaturesPropTime build() {
            if(!this.schedAccuracySet)
                throw new IllegalStateException("Property schedAccuracy doesn't have default value -- must be set");
            if(schedAccuracy == null)
                throw new NullPointerException("Property schedAccuracy must not be null");
            if(!this.schedMaxFutureSet)
                throw new IllegalStateException("Property schedMaxFuture doesn't have default value -- must be set");
            if(schedMaxFuture == null)
                throw new NullPointerException("Property schedMaxFuture must not be null");
            if(!this.schedMaxPastSet)
                throw new IllegalStateException("Property schedMaxPast doesn't have default value -- must be set");
            if(schedMaxPast == null)
                throw new NullPointerException("Property schedMaxPast must not be null");
            if(!this.timestampSet)
                throw new IllegalStateException("Property timestamp doesn't have default value -- must be set");
            if(timestamp == null)
                throw new NullPointerException("Property timestamp must not be null");


            return new OFBundleFeaturesPropTimeVer15(
                    schedAccuracy,
                    schedMaxFuture,
                    schedMaxPast,
                    timestamp
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBundleFeaturesPropTime> {
        @Override
        public OFBundleFeaturesPropTime readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=0x1(0x1), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 72)
                throw new OFParseError("Wrong length: Expected=72(72), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // pad: 4 bytes
            bb.skipBytes(4);
            OFTime schedAccuracy = OFTimeVer15.READER.readFrom(bb);
            OFTime schedMaxFuture = OFTimeVer15.READER.readFrom(bb);
            OFTime schedMaxPast = OFTimeVer15.READER.readFrom(bb);
            OFTime timestamp = OFTimeVer15.READER.readFrom(bb);

            OFBundleFeaturesPropTimeVer15 bundleFeaturesPropTimeVer15 = new OFBundleFeaturesPropTimeVer15(
                    schedAccuracy,
                      schedMaxFuture,
                      schedMaxPast,
                      timestamp
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bundleFeaturesPropTimeVer15);
            return bundleFeaturesPropTimeVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBundleFeaturesPropTimeVer15Funnel FUNNEL = new OFBundleFeaturesPropTimeVer15Funnel();
    static class OFBundleFeaturesPropTimeVer15Funnel implements Funnel<OFBundleFeaturesPropTimeVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBundleFeaturesPropTimeVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x1
            sink.putShort((short) 0x1);
            // fixed value property length = 72
            sink.putShort((short) 0x48);
            // skip pad (4 bytes)
            message.schedAccuracy.putTo(sink);
            message.schedMaxFuture.putTo(sink);
            message.schedMaxPast.putTo(sink);
            message.timestamp.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBundleFeaturesPropTimeVer15> {
        @Override
        public void write(ByteBuf bb, OFBundleFeaturesPropTimeVer15 message) {
            // fixed value property type = 0x1
            bb.writeShort((short) 0x1);
            // fixed value property length = 72
            bb.writeShort((short) 0x48);
            // pad: 4 bytes
            bb.writeZero(4);
            message.schedAccuracy.writeTo(bb);
            message.schedMaxFuture.writeTo(bb);
            message.schedMaxPast.writeTo(bb);
            message.timestamp.writeTo(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBundleFeaturesPropTimeVer15(");
        b.append("schedAccuracy=").append(schedAccuracy);
        b.append(", ");
        b.append("schedMaxFuture=").append(schedMaxFuture);
        b.append(", ");
        b.append("schedMaxPast=").append(schedMaxPast);
        b.append(", ");
        b.append("timestamp=").append(timestamp);
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
        OFBundleFeaturesPropTimeVer15 other = (OFBundleFeaturesPropTimeVer15) obj;

        if (schedAccuracy == null) {
            if (other.schedAccuracy != null)
                return false;
        } else if (!schedAccuracy.equals(other.schedAccuracy))
            return false;
        if (schedMaxFuture == null) {
            if (other.schedMaxFuture != null)
                return false;
        } else if (!schedMaxFuture.equals(other.schedMaxFuture))
            return false;
        if (schedMaxPast == null) {
            if (other.schedMaxPast != null)
                return false;
        } else if (!schedMaxPast.equals(other.schedMaxPast))
            return false;
        if (timestamp == null) {
            if (other.timestamp != null)
                return false;
        } else if (!timestamp.equals(other.timestamp))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((schedAccuracy == null) ? 0 : schedAccuracy.hashCode());
        result = prime * result + ((schedMaxFuture == null) ? 0 : schedMaxFuture.hashCode());
        result = prime * result + ((schedMaxPast == null) ? 0 : schedMaxPast.hashCode());
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        return result;
    }

}
