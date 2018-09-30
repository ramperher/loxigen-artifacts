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

class OFBsnTlvPartnerPortPriorityVer15 implements OFBsnTlvPartnerPortPriority {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvPartnerPortPriorityVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 6;

        private final static int DEFAULT_VALUE = 0x0;

    // OF message fields
    private final int value;
//
    // Immutable default instance
    final static OFBsnTlvPartnerPortPriorityVer15 DEFAULT = new OFBsnTlvPartnerPortPriorityVer15(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvPartnerPortPriorityVer15(int value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x31;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnTlvPartnerPortPriority.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvPartnerPortPriority.Builder {
        final OFBsnTlvPartnerPortPriorityVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private int value;

        BuilderWithParent(OFBsnTlvPartnerPortPriorityVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x31;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFBsnTlvPartnerPortPriority.Builder setValue(int value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnTlvPartnerPortPriority build() {
                int value = this.valueSet ? this.value : parentMessage.value;

                //
                return new OFBsnTlvPartnerPortPriorityVer15(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvPartnerPortPriority.Builder {
        // OF message fields
        private boolean valueSet;
        private int value;

    @Override
    public int getType() {
        return 0x31;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFBsnTlvPartnerPortPriority.Builder setValue(int value) {
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
        public OFBsnTlvPartnerPortPriority build() {
            int value = this.valueSet ? this.value : DEFAULT_VALUE;


            return new OFBsnTlvPartnerPortPriorityVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnTlvPartnerPortPriority> {
        @Override
        public OFBsnTlvPartnerPortPriority readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0x31
            short type = bb.readShort();
            if(type != (short) 0x31)
                throw new OFParseError("Wrong type: Expected=0x31(0x31), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 6)
                throw new OFParseError("Wrong length: Expected=6(6), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            int value = U16.f(bb.readShort());

            OFBsnTlvPartnerPortPriorityVer15 bsnTlvPartnerPortPriorityVer15 = new OFBsnTlvPartnerPortPriorityVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvPartnerPortPriorityVer15);
            return bsnTlvPartnerPortPriorityVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvPartnerPortPriorityVer15Funnel FUNNEL = new OFBsnTlvPartnerPortPriorityVer15Funnel();
    static class OFBsnTlvPartnerPortPriorityVer15Funnel implements Funnel<OFBsnTlvPartnerPortPriorityVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvPartnerPortPriorityVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x31
            sink.putShort((short) 0x31);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            sink.putInt(message.value);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvPartnerPortPriorityVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvPartnerPortPriorityVer15 message) {
            // fixed value property type = 0x31
            bb.writeShort((short) 0x31);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            bb.writeShort(U16.t(message.value));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvPartnerPortPriorityVer15(");
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
        OFBsnTlvPartnerPortPriorityVer15 other = (OFBsnTlvPartnerPortPriorityVer15) obj;

        if( value != other.value)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + value;
        return result;
    }

}
