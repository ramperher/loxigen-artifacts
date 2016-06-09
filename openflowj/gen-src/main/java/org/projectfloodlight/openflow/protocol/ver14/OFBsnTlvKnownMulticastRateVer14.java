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

class OFBsnTlvKnownMulticastRateVer14 implements OFBsnTlvKnownMulticastRate {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvKnownMulticastRateVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static long DEFAULT_VALUE = 0x0L;

    // OF message fields
    private final long value;
//
    // Immutable default instance
    final static OFBsnTlvKnownMulticastRateVer14 DEFAULT = new OFBsnTlvKnownMulticastRateVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvKnownMulticastRateVer14(long value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x5b;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvKnownMulticastRate.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvKnownMulticastRate.Builder {
        final OFBsnTlvKnownMulticastRateVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private long value;

        BuilderWithParent(OFBsnTlvKnownMulticastRateVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x5b;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFBsnTlvKnownMulticastRate.Builder setValue(long value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvKnownMulticastRate build() {
                long value = this.valueSet ? this.value : parentMessage.value;

                //
                return new OFBsnTlvKnownMulticastRateVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvKnownMulticastRate.Builder {
        // OF message fields
        private boolean valueSet;
        private long value;

    @Override
    public int getType() {
        return 0x5b;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFBsnTlvKnownMulticastRate.Builder setValue(long value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnTlvKnownMulticastRate build() {
            long value = this.valueSet ? this.value : DEFAULT_VALUE;


            return new OFBsnTlvKnownMulticastRateVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvKnownMulticastRate> {
        @Override
        public OFBsnTlvKnownMulticastRate readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x5b
            short type = bb.readShort();
            if(type != (short) 0x5b)
                throw new OFParseError("Wrong type: Expected=0x5b(0x5b), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long value = U32.f(bb.readInt());

            OFBsnTlvKnownMulticastRateVer14 bsnTlvKnownMulticastRateVer14 = new OFBsnTlvKnownMulticastRateVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvKnownMulticastRateVer14);
            return bsnTlvKnownMulticastRateVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvKnownMulticastRateVer14Funnel FUNNEL = new OFBsnTlvKnownMulticastRateVer14Funnel();
    static class OFBsnTlvKnownMulticastRateVer14Funnel implements Funnel<OFBsnTlvKnownMulticastRateVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvKnownMulticastRateVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x5b
            sink.putShort((short) 0x5b);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.value);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvKnownMulticastRateVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvKnownMulticastRateVer14 message) {
            // fixed value property type = 0x5b
            bb.writeShort((short) 0x5b);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.value));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvKnownMulticastRateVer14(");
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
        OFBsnTlvKnownMulticastRateVer14 other = (OFBsnTlvKnownMulticastRateVer14) obj;

        if( value != other.value)
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (value ^ (value >>> 32));
        return result;
    }

}
