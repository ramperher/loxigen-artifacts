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

class OFBsnTlvIcmpv6ChksumVer14 implements OFBsnTlvIcmpv6Chksum {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIcmpv6ChksumVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 6;

        private final static int DEFAULT_VALUE = 0x0;

    // OF message fields
    private final int value;
//
    // Immutable default instance
    final static OFBsnTlvIcmpv6ChksumVer14 DEFAULT = new OFBsnTlvIcmpv6ChksumVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIcmpv6ChksumVer14(int value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x7d;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvIcmpv6Chksum.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIcmpv6Chksum.Builder {
        final OFBsnTlvIcmpv6ChksumVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private int value;

        BuilderWithParent(OFBsnTlvIcmpv6ChksumVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x7d;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIcmpv6Chksum.Builder setValue(int value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvIcmpv6Chksum build() {
                int value = this.valueSet ? this.value : parentMessage.value;

                //
                return new OFBsnTlvIcmpv6ChksumVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvIcmpv6Chksum.Builder {
        // OF message fields
        private boolean valueSet;
        private int value;

    @Override
    public int getType() {
        return 0x7d;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIcmpv6Chksum.Builder setValue(int value) {
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
        public OFBsnTlvIcmpv6Chksum build() {
            int value = this.valueSet ? this.value : DEFAULT_VALUE;


            return new OFBsnTlvIcmpv6ChksumVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnTlvIcmpv6Chksum> {
        @Override
        public OFBsnTlvIcmpv6Chksum readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0x7d
            short type = bb.readShort();
            if(type != (short) 0x7d)
                throw new OFParseError("Wrong type: Expected=0x7d(0x7d), got="+type);
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

            OFBsnTlvIcmpv6ChksumVer14 bsnTlvIcmpv6ChksumVer14 = new OFBsnTlvIcmpv6ChksumVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIcmpv6ChksumVer14);
            return bsnTlvIcmpv6ChksumVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIcmpv6ChksumVer14Funnel FUNNEL = new OFBsnTlvIcmpv6ChksumVer14Funnel();
    static class OFBsnTlvIcmpv6ChksumVer14Funnel implements Funnel<OFBsnTlvIcmpv6ChksumVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIcmpv6ChksumVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x7d
            sink.putShort((short) 0x7d);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            sink.putInt(message.value);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIcmpv6ChksumVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIcmpv6ChksumVer14 message) {
            // fixed value property type = 0x7d
            bb.writeShort((short) 0x7d);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            bb.writeShort(U16.t(message.value));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIcmpv6ChksumVer14(");
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
        OFBsnTlvIcmpv6ChksumVer14 other = (OFBsnTlvIcmpv6ChksumVer14) obj;

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
