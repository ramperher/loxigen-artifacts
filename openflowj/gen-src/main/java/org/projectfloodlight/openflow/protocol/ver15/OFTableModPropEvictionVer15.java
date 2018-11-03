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

class OFTableModPropEvictionVer15 implements OFTableModPropEviction {
    private static final Logger logger = LoggerFactory.getLogger(OFTableModPropEvictionVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 8;

        private final static Set<OFTableModPropEvictionFlag> DEFAULT_FLAGS = ImmutableSet.<OFTableModPropEvictionFlag>of();

    // OF message fields
    private final Set<OFTableModPropEvictionFlag> flags;
//
    // Immutable default instance
    final static OFTableModPropEvictionVer15 DEFAULT = new OFTableModPropEvictionVer15(
        DEFAULT_FLAGS
    );

    // package private constructor - used by readers, builders, and factory
    OFTableModPropEvictionVer15(Set<OFTableModPropEvictionFlag> flags) {
        if(flags == null) {
            throw new NullPointerException("OFTableModPropEvictionVer15: property flags cannot be null");
        }
        this.flags = flags;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public Set<OFTableModPropEvictionFlag> getFlags() {
        return flags;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFTableModPropEviction.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableModPropEviction.Builder {
        final OFTableModPropEvictionVer15 parentMessage;

        // OF message fields
        private boolean flagsSet;
        private Set<OFTableModPropEvictionFlag> flags;

        BuilderWithParent(OFTableModPropEvictionVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public Set<OFTableModPropEvictionFlag> getFlags() {
        return flags;
    }

    @Override
    public OFTableModPropEviction.Builder setFlags(Set<OFTableModPropEvictionFlag> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFTableModPropEviction build() {
                Set<OFTableModPropEvictionFlag> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");

                //
                return new OFTableModPropEvictionVer15(
                    flags
                );
        }

    }

    static class Builder implements OFTableModPropEviction.Builder {
        // OF message fields
        private boolean flagsSet;
        private Set<OFTableModPropEvictionFlag> flags;

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public Set<OFTableModPropEvictionFlag> getFlags() {
        return flags;
    }

    @Override
    public OFTableModPropEviction.Builder setFlags(Set<OFTableModPropEvictionFlag> flags) {
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
        public OFTableModPropEviction build() {
            Set<OFTableModPropEvictionFlag> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");


            return new OFTableModPropEvictionVer15(
                    flags
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFTableModPropEviction> {
        @Override
        public OFTableModPropEviction readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
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
            Set<OFTableModPropEvictionFlag> flags = OFTableModPropEvictionFlagSerializerVer15.readFrom(bb);

            OFTableModPropEvictionVer15 tableModPropEvictionVer15 = new OFTableModPropEvictionVer15(
                    flags
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableModPropEvictionVer15);
            return tableModPropEvictionVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableModPropEvictionVer15Funnel FUNNEL = new OFTableModPropEvictionVer15Funnel();
    static class OFTableModPropEvictionVer15Funnel implements Funnel<OFTableModPropEvictionVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableModPropEvictionVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x2
            sink.putShort((short) 0x2);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            OFTableModPropEvictionFlagSerializerVer15.putTo(message.flags, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableModPropEvictionVer15> {
        @Override
        public void write(ByteBuf bb, OFTableModPropEvictionVer15 message) {
            // fixed value property type = 0x2
            bb.writeShort((short) 0x2);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            OFTableModPropEvictionFlagSerializerVer15.writeTo(bb, message.flags);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableModPropEvictionVer15(");
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
        OFTableModPropEvictionVer15 other = (OFTableModPropEvictionVer15) obj;

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
