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

class OFBsnTlvIpv4NetmaskVer15 implements OFBsnTlvIpv4Netmask {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIpv4NetmaskVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 8;

        private final static IPv4Address DEFAULT_VALUE = IPv4Address.NONE;

    // OF message fields
    private final IPv4Address value;
//
    // Immutable default instance
    final static OFBsnTlvIpv4NetmaskVer15 DEFAULT = new OFBsnTlvIpv4NetmaskVer15(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIpv4NetmaskVer15(IPv4Address value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvIpv4NetmaskVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x3c;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnTlvIpv4Netmask.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIpv4Netmask.Builder {
        final OFBsnTlvIpv4NetmaskVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv4Address value;

        BuilderWithParent(OFBsnTlvIpv4NetmaskVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x3c;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv4Netmask.Builder setValue(IPv4Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnTlvIpv4Netmask build() {
                IPv4Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvIpv4NetmaskVer15(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvIpv4Netmask.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv4Address value;

    @Override
    public int getType() {
        return 0x3c;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv4Netmask.Builder setValue(IPv4Address value) {
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
        public OFBsnTlvIpv4Netmask build() {
            IPv4Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvIpv4NetmaskVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnTlvIpv4Netmask> {
        @Override
        public OFBsnTlvIpv4Netmask readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0x3c
            short type = bb.readShort();
            if(type != (short) 0x3c)
                throw new OFParseError("Wrong type: Expected=0x3c(0x3c), got="+type);
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
            IPv4Address value = IPv4Address.read4Bytes(bb);

            OFBsnTlvIpv4NetmaskVer15 bsnTlvIpv4NetmaskVer15 = new OFBsnTlvIpv4NetmaskVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIpv4NetmaskVer15);
            return bsnTlvIpv4NetmaskVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIpv4NetmaskVer15Funnel FUNNEL = new OFBsnTlvIpv4NetmaskVer15Funnel();
    static class OFBsnTlvIpv4NetmaskVer15Funnel implements Funnel<OFBsnTlvIpv4NetmaskVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIpv4NetmaskVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x3c
            sink.putShort((short) 0x3c);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIpv4NetmaskVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIpv4NetmaskVer15 message) {
            // fixed value property type = 0x3c
            bb.writeShort((short) 0x3c);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIpv4NetmaskVer15(");
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
        OFBsnTlvIpv4NetmaskVer15 other = (OFBsnTlvIpv4NetmaskVer15) obj;

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

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
