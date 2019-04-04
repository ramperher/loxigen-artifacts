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
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFQueuePropMaxRateVer14 implements OFQueuePropMaxRate {
    private static final Logger logger = LoggerFactory.getLogger(OFQueuePropMaxRateVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 16;

        private final static int DEFAULT_RATE = 0x0;

    // OF message fields
    private final int rate;
//
    // Immutable default instance
    final static OFQueuePropMaxRateVer14 DEFAULT = new OFQueuePropMaxRateVer14(
        DEFAULT_RATE
    );

    // package private constructor - used by readers, builders, and factory
    OFQueuePropMaxRateVer14(int rate) {
        this.rate = rate;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFQueuePropMaxRate.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFQueuePropMaxRate.Builder {
        final OFQueuePropMaxRateVer14 parentMessage;

        // OF message fields
        private boolean rateSet;
        private int rate;

        BuilderWithParent(OFQueuePropMaxRateVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public OFQueuePropMaxRate.Builder setRate(int rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFQueuePropMaxRate build() {
                int rate = this.rateSet ? this.rate : parentMessage.rate;

                //
                return new OFQueuePropMaxRateVer14(
                    rate
                );
        }

    }

    static class Builder implements OFQueuePropMaxRate.Builder {
        // OF message fields
        private boolean rateSet;
        private int rate;

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public OFQueuePropMaxRate.Builder setRate(int rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFQueuePropMaxRate build() {
            int rate = this.rateSet ? this.rate : DEFAULT_RATE;


            return new OFQueuePropMaxRateVer14(
                    rate
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFQueuePropMaxRate> {
        @Override
        public OFQueuePropMaxRate readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0x2
            short type = bb.readShort();
            if(type != (short) 0x2)
                throw new OFParseError("Wrong type: Expected=0x2(0x2), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 16)
                throw new OFParseError("Wrong length: Expected=16(16), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // pad: 4 bytes
            bb.skipBytes(4);
            int rate = U16.f(bb.readShort());
            // pad: 6 bytes
            bb.skipBytes(6);

            OFQueuePropMaxRateVer14 queuePropMaxRateVer14 = new OFQueuePropMaxRateVer14(
                    rate
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", queuePropMaxRateVer14);
            return queuePropMaxRateVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFQueuePropMaxRateVer14Funnel FUNNEL = new OFQueuePropMaxRateVer14Funnel();
    static class OFQueuePropMaxRateVer14Funnel implements Funnel<OFQueuePropMaxRateVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFQueuePropMaxRateVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x2
            sink.putShort((short) 0x2);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            // skip pad (4 bytes)
            sink.putInt(message.rate);
            // skip pad (6 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFQueuePropMaxRateVer14> {
        @Override
        public void write(ByteBuf bb, OFQueuePropMaxRateVer14 message) {
            // fixed value property type = 0x2
            bb.writeShort((short) 0x2);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeShort(U16.t(message.rate));
            // pad: 6 bytes
            bb.writeZero(6);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFQueuePropMaxRateVer14(");
        b.append("rate=").append(rate);
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
        OFQueuePropMaxRateVer14 other = (OFQueuePropMaxRateVer14) obj;

        if( rate != other.rate)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + rate;
        return result;
    }

}
