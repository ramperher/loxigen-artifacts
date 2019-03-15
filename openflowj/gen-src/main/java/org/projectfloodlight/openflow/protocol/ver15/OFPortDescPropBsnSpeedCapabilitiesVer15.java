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

class OFPortDescPropBsnSpeedCapabilitiesVer15 implements OFPortDescPropBsnSpeedCapabilities {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescPropBsnSpeedCapabilitiesVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 36;

        private final static U64 DEFAULT_CURRENT = U64.ZERO;
        private final static U64 DEFAULT_AVAILABLE = U64.ZERO;
        private final static U64 DEFAULT_SUPPORTED = U64.ZERO;

    // OF message fields
    private final U64 current;
    private final U64 available;
    private final U64 supported;
//
    // Immutable default instance
    final static OFPortDescPropBsnSpeedCapabilitiesVer15 DEFAULT = new OFPortDescPropBsnSpeedCapabilitiesVer15(
        DEFAULT_CURRENT, DEFAULT_AVAILABLE, DEFAULT_SUPPORTED
    );

    // package private constructor - used by readers, builders, and factory
    OFPortDescPropBsnSpeedCapabilitiesVer15(U64 current, U64 available, U64 supported) {
        if(current == null) {
            throw new NullPointerException("OFPortDescPropBsnSpeedCapabilitiesVer15: property current cannot be null");
        }
        if(available == null) {
            throw new NullPointerException("OFPortDescPropBsnSpeedCapabilitiesVer15: property available cannot be null");
        }
        if(supported == null) {
            throw new NullPointerException("OFPortDescPropBsnSpeedCapabilitiesVer15: property supported cannot be null");
        }
        this.current = current;
        this.available = available;
        this.supported = supported;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x4L;
    }

    @Override
    public U64 getCurrent() {
        return current;
    }

    @Override
    public U64 getAvailable() {
        return available;
    }

    @Override
    public U64 getSupported() {
        return supported;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFPortDescPropBsnSpeedCapabilities.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDescPropBsnSpeedCapabilities.Builder {
        final OFPortDescPropBsnSpeedCapabilitiesVer15 parentMessage;

        // OF message fields
        private boolean currentSet;
        private U64 current;
        private boolean availableSet;
        private U64 available;
        private boolean supportedSet;
        private U64 supported;

        BuilderWithParent(OFPortDescPropBsnSpeedCapabilitiesVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x4L;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public U64 getCurrent() {
        return current;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setCurrent(U64 current) {
        this.current = current;
        this.currentSet = true;
        return this;
    }
    @Override
    public U64 getAvailable() {
        return available;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setAvailable(U64 available) {
        this.available = available;
        this.availableSet = true;
        return this;
    }
    @Override
    public U64 getSupported() {
        return supported;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setSupported(U64 supported) {
        this.supported = supported;
        this.supportedSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFPortDescPropBsnSpeedCapabilities build() {
                U64 current = this.currentSet ? this.current : parentMessage.current;
                if(current == null)
                    throw new NullPointerException("Property current must not be null");
                U64 available = this.availableSet ? this.available : parentMessage.available;
                if(available == null)
                    throw new NullPointerException("Property available must not be null");
                U64 supported = this.supportedSet ? this.supported : parentMessage.supported;
                if(supported == null)
                    throw new NullPointerException("Property supported must not be null");

                //
                return new OFPortDescPropBsnSpeedCapabilitiesVer15(
                    current,
                    available,
                    supported
                );
        }

    }

    static class Builder implements OFPortDescPropBsnSpeedCapabilities.Builder {
        // OF message fields
        private boolean currentSet;
        private U64 current;
        private boolean availableSet;
        private U64 available;
        private boolean supportedSet;
        private U64 supported;

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x4L;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public U64 getCurrent() {
        return current;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setCurrent(U64 current) {
        this.current = current;
        this.currentSet = true;
        return this;
    }
    @Override
    public U64 getAvailable() {
        return available;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setAvailable(U64 available) {
        this.available = available;
        this.availableSet = true;
        return this;
    }
    @Override
    public U64 getSupported() {
        return supported;
    }

    @Override
    public OFPortDescPropBsnSpeedCapabilities.Builder setSupported(U64 supported) {
        this.supported = supported;
        this.supportedSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFPortDescPropBsnSpeedCapabilities build() {
            U64 current = this.currentSet ? this.current : DEFAULT_CURRENT;
            if(current == null)
                throw new NullPointerException("Property current must not be null");
            U64 available = this.availableSet ? this.available : DEFAULT_AVAILABLE;
            if(available == null)
                throw new NullPointerException("Property available must not be null");
            U64 supported = this.supportedSet ? this.supported : DEFAULT_SUPPORTED;
            if(supported == null)
                throw new NullPointerException("Property supported must not be null");


            return new OFPortDescPropBsnSpeedCapabilitiesVer15(
                    current,
                    available,
                    supported
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFPortDescPropBsnSpeedCapabilities> {
        @Override
        public OFPortDescPropBsnSpeedCapabilities readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0xffff
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=0xffff(0xffff), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 36)
                throw new OFParseError("Wrong length: Expected=36(36), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property expType == 0x4L
            int expType = bb.readInt();
            if(expType != 0x4)
                throw new OFParseError("Wrong expType: Expected=0x4L(0x4L), got="+expType);
            U64 current = U64.ofRaw(bb.readLong());
            U64 available = U64.ofRaw(bb.readLong());
            U64 supported = U64.ofRaw(bb.readLong());

            OFPortDescPropBsnSpeedCapabilitiesVer15 portDescPropBsnSpeedCapabilitiesVer15 = new OFPortDescPropBsnSpeedCapabilitiesVer15(
                    current,
                      available,
                      supported
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescPropBsnSpeedCapabilitiesVer15);
            return portDescPropBsnSpeedCapabilitiesVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescPropBsnSpeedCapabilitiesVer15Funnel FUNNEL = new OFPortDescPropBsnSpeedCapabilitiesVer15Funnel();
    static class OFPortDescPropBsnSpeedCapabilitiesVer15Funnel implements Funnel<OFPortDescPropBsnSpeedCapabilitiesVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescPropBsnSpeedCapabilitiesVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0xffff
            sink.putShort((short) 0xffff);
            // fixed value property length = 36
            sink.putShort((short) 0x24);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property expType = 0x4L
            sink.putInt(0x4);
            message.current.putTo(sink);
            message.available.putTo(sink);
            message.supported.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescPropBsnSpeedCapabilitiesVer15> {
        @Override
        public void write(ByteBuf bb, OFPortDescPropBsnSpeedCapabilitiesVer15 message) {
            // fixed value property type = 0xffff
            bb.writeShort((short) 0xffff);
            // fixed value property length = 36
            bb.writeShort((short) 0x24);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property expType = 0x4L
            bb.writeInt(0x4);
            bb.writeLong(message.current.getValue());
            bb.writeLong(message.available.getValue());
            bb.writeLong(message.supported.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescPropBsnSpeedCapabilitiesVer15(");
        b.append("current=").append(current);
        b.append(", ");
        b.append("available=").append(available);
        b.append(", ");
        b.append("supported=").append(supported);
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
        OFPortDescPropBsnSpeedCapabilitiesVer15 other = (OFPortDescPropBsnSpeedCapabilitiesVer15) obj;

        if (current == null) {
            if (other.current != null)
                return false;
        } else if (!current.equals(other.current))
            return false;
        if (available == null) {
            if (other.available != null)
                return false;
        } else if (!available.equals(other.available))
            return false;
        if (supported == null) {
            if (other.supported != null)
                return false;
        } else if (!supported.equals(other.supported))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((current == null) ? 0 : current.hashCode());
        result = prime * result + ((available == null) ? 0 : available.hashCode());
        result = prime * result + ((supported == null) ? 0 : supported.hashCode());
        return result;
    }

}
