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
import java.util.Arrays;

class OFPortDescPropRecirculateVer15 implements OFPortDescPropRecirculate {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescPropRecirculateVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 4;

        private final static byte[] DEFAULT_PORT_NOS = new byte[0];

    // OF message fields
    private final byte[] portNos;
//
    // Immutable default instance
    final static OFPortDescPropRecirculateVer15 DEFAULT = new OFPortDescPropRecirculateVer15(
        DEFAULT_PORT_NOS
    );

    // package private constructor - used by readers, builders, and factory
    OFPortDescPropRecirculateVer15(byte[] portNos) {
        if(portNos == null) {
            throw new NullPointerException("OFPortDescPropRecirculateVer15: property portNos cannot be null");
        }
        this.portNos = portNos;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x4;
    }

    @Override
    public byte[] getPortNos() {
        return portNos;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFPortDescPropRecirculate.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDescPropRecirculate.Builder {
        final OFPortDescPropRecirculateVer15 parentMessage;

        // OF message fields
        private boolean portNosSet;
        private byte[] portNos;

        BuilderWithParent(OFPortDescPropRecirculateVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x4;
    }

    @Override
    public byte[] getPortNos() {
        return portNos;
    }

    @Override
    public OFPortDescPropRecirculate.Builder setPortNos(byte[] portNos) {
        this.portNos = portNos;
        this.portNosSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFPortDescPropRecirculate build() {
                byte[] portNos = this.portNosSet ? this.portNos : parentMessage.portNos;
                if(portNos == null)
                    throw new NullPointerException("Property portNos must not be null");

                //
                return new OFPortDescPropRecirculateVer15(
                    portNos
                );
        }

    }

    static class Builder implements OFPortDescPropRecirculate.Builder {
        // OF message fields
        private boolean portNosSet;
        private byte[] portNos;

    @Override
    public int getType() {
        return 0x4;
    }

    @Override
    public byte[] getPortNos() {
        return portNos;
    }

    @Override
    public OFPortDescPropRecirculate.Builder setPortNos(byte[] portNos) {
        this.portNos = portNos;
        this.portNosSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFPortDescPropRecirculate build() {
            byte[] portNos = this.portNosSet ? this.portNos : DEFAULT_PORT_NOS;
            if(portNos == null)
                throw new NullPointerException("Property portNos must not be null");


            return new OFPortDescPropRecirculateVer15(
                    portNos
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFPortDescPropRecirculate> {
        @Override
        public OFPortDescPropRecirculate readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0x4
            short type = bb.readShort();
            if(type != (short) 0x4)
                throw new OFParseError("Wrong type: Expected=0x4(0x4), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            byte[] portNos = ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));

            OFPortDescPropRecirculateVer15 portDescPropRecirculateVer15 = new OFPortDescPropRecirculateVer15(
                    portNos
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescPropRecirculateVer15);
            return portDescPropRecirculateVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescPropRecirculateVer15Funnel FUNNEL = new OFPortDescPropRecirculateVer15Funnel();
    static class OFPortDescPropRecirculateVer15Funnel implements Funnel<OFPortDescPropRecirculateVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescPropRecirculateVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x4
            sink.putShort((short) 0x4);
            // FIXME: skip funnel of length
            sink.putBytes(message.portNos);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescPropRecirculateVer15> {
        @Override
        public void write(ByteBuf bb, OFPortDescPropRecirculateVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 0x4
            bb.writeShort((short) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeBytes(message.portNos);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescPropRecirculateVer15(");
        b.append("portNos=").append(Arrays.toString(portNos));
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
        OFPortDescPropRecirculateVer15 other = (OFPortDescPropRecirculateVer15) obj;

        if (!Arrays.equals(portNos, other.portNos))
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + Arrays.hashCode(portNos);
        return result;
    }

}
