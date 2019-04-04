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
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTlvLagOptionsVer15 implements OFBsnTlvLagOptions {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvLagOptionsVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 6;

        private final static Set<OFBsnLagFlag> DEFAULT_FLAGS = ImmutableSet.<OFBsnLagFlag>of();

    // OF message fields
    private final Set<OFBsnLagFlag> flags;
//
    // Immutable default instance
    final static OFBsnTlvLagOptionsVer15 DEFAULT = new OFBsnTlvLagOptionsVer15(
        DEFAULT_FLAGS
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvLagOptionsVer15(Set<OFBsnLagFlag> flags) {
        if(flags == null) {
            throw new NullPointerException("OFBsnTlvLagOptionsVer15: property flags cannot be null");
        }
        this.flags = flags;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xa0;
    }

    @Override
    public Set<OFBsnLagFlag> getFlags() {
        return flags;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnTlvLagOptions.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvLagOptions.Builder {
        final OFBsnTlvLagOptionsVer15 parentMessage;

        // OF message fields
        private boolean flagsSet;
        private Set<OFBsnLagFlag> flags;

        BuilderWithParent(OFBsnTlvLagOptionsVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xa0;
    }

    @Override
    public Set<OFBsnLagFlag> getFlags() {
        return flags;
    }

    @Override
    public OFBsnTlvLagOptions.Builder setFlags(Set<OFBsnLagFlag> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnTlvLagOptions build() {
                Set<OFBsnLagFlag> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");

                //
                return new OFBsnTlvLagOptionsVer15(
                    flags
                );
        }

    }

    static class Builder implements OFBsnTlvLagOptions.Builder {
        // OF message fields
        private boolean flagsSet;
        private Set<OFBsnLagFlag> flags;

    @Override
    public int getType() {
        return 0xa0;
    }

    @Override
    public Set<OFBsnLagFlag> getFlags() {
        return flags;
    }

    @Override
    public OFBsnTlvLagOptions.Builder setFlags(Set<OFBsnLagFlag> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFBsnTlvLagOptions build() {
            Set<OFBsnLagFlag> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");


            return new OFBsnTlvLagOptionsVer15(
                    flags
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnTlvLagOptions> {
        @Override
        public OFBsnTlvLagOptions readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0xa0
            short type = bb.readShort();
            if(type != (short) 0xa0)
                throw new OFParseError("Wrong type: Expected=0xa0(0xa0), got="+type);
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
            Set<OFBsnLagFlag> flags = OFBsnLagFlagSerializerVer15.readFrom(bb);

            OFBsnTlvLagOptionsVer15 bsnTlvLagOptionsVer15 = new OFBsnTlvLagOptionsVer15(
                    flags
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvLagOptionsVer15);
            return bsnTlvLagOptionsVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvLagOptionsVer15Funnel FUNNEL = new OFBsnTlvLagOptionsVer15Funnel();
    static class OFBsnTlvLagOptionsVer15Funnel implements Funnel<OFBsnTlvLagOptionsVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvLagOptionsVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0xa0
            sink.putShort((short) 0xa0);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            OFBsnLagFlagSerializerVer15.putTo(message.flags, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvLagOptionsVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvLagOptionsVer15 message) {
            // fixed value property type = 0xa0
            bb.writeShort((short) 0xa0);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            OFBsnLagFlagSerializerVer15.writeTo(bb, message.flags);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvLagOptionsVer15(");
        b.append("flags=").append(flags);
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
        OFBsnTlvLagOptionsVer15 other = (OFBsnTlvLagOptionsVer15) obj;

        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        return result;
    }

}
