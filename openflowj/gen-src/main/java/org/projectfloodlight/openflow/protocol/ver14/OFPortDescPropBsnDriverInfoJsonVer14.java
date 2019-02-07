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
import java.util.Arrays;

class OFPortDescPropBsnDriverInfoJsonVer14 implements OFPortDescPropBsnDriverInfoJson {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescPropBsnDriverInfoJsonVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 12;

        private final static byte[] DEFAULT_DRIVER_INFO_JSON = new byte[0];

    // OF message fields
    private final byte[] driverInfoJson;
//
    // Immutable default instance
    final static OFPortDescPropBsnDriverInfoJsonVer14 DEFAULT = new OFPortDescPropBsnDriverInfoJsonVer14(
        DEFAULT_DRIVER_INFO_JSON
    );

    // package private constructor - used by readers, builders, and factory
    OFPortDescPropBsnDriverInfoJsonVer14(byte[] driverInfoJson) {
        if(driverInfoJson == null) {
            throw new NullPointerException("OFPortDescPropBsnDriverInfoJsonVer14: property driverInfoJson cannot be null");
        }
        this.driverInfoJson = driverInfoJson;
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
        return 0x7L;
    }

    @Override
    public byte[] getDriverInfoJson() {
        return driverInfoJson;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFPortDescPropBsnDriverInfoJson.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDescPropBsnDriverInfoJson.Builder {
        final OFPortDescPropBsnDriverInfoJsonVer14 parentMessage;

        // OF message fields
        private boolean driverInfoJsonSet;
        private byte[] driverInfoJson;

        BuilderWithParent(OFPortDescPropBsnDriverInfoJsonVer14 parentMessage) {
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
        return 0x7L;
    }

    @Override
    public OFPortDescPropBsnDriverInfoJson.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public byte[] getDriverInfoJson() {
        return driverInfoJson;
    }

    @Override
    public OFPortDescPropBsnDriverInfoJson.Builder setDriverInfoJson(byte[] driverInfoJson) {
        this.driverInfoJson = driverInfoJson;
        this.driverInfoJsonSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFPortDescPropBsnDriverInfoJson build() {
                byte[] driverInfoJson = this.driverInfoJsonSet ? this.driverInfoJson : parentMessage.driverInfoJson;
                if(driverInfoJson == null)
                    throw new NullPointerException("Property driverInfoJson must not be null");

                //
                return new OFPortDescPropBsnDriverInfoJsonVer14(
                    driverInfoJson
                );
        }

    }

    static class Builder implements OFPortDescPropBsnDriverInfoJson.Builder {
        // OF message fields
        private boolean driverInfoJsonSet;
        private byte[] driverInfoJson;

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
        return 0x7L;
    }

    @Override
    public OFPortDescPropBsnDriverInfoJson.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public byte[] getDriverInfoJson() {
        return driverInfoJson;
    }

    @Override
    public OFPortDescPropBsnDriverInfoJson.Builder setDriverInfoJson(byte[] driverInfoJson) {
        this.driverInfoJson = driverInfoJson;
        this.driverInfoJsonSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFPortDescPropBsnDriverInfoJson build() {
            byte[] driverInfoJson = this.driverInfoJsonSet ? this.driverInfoJson : DEFAULT_DRIVER_INFO_JSON;
            if(driverInfoJson == null)
                throw new NullPointerException("Property driverInfoJson must not be null");


            return new OFPortDescPropBsnDriverInfoJsonVer14(
                    driverInfoJson
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFPortDescPropBsnDriverInfoJson> {
        @Override
        public OFPortDescPropBsnDriverInfoJson readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0xffff
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=0xffff(0xffff), got="+type);
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
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property expType == 0x7L
            int expType = bb.readInt();
            if(expType != 0x7)
                throw new OFParseError("Wrong expType: Expected=0x7L(0x7L), got="+expType);
            byte[] driverInfoJson = ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));

            OFPortDescPropBsnDriverInfoJsonVer14 portDescPropBsnDriverInfoJsonVer14 = new OFPortDescPropBsnDriverInfoJsonVer14(
                    driverInfoJson
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescPropBsnDriverInfoJsonVer14);
            return portDescPropBsnDriverInfoJsonVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescPropBsnDriverInfoJsonVer14Funnel FUNNEL = new OFPortDescPropBsnDriverInfoJsonVer14Funnel();
    static class OFPortDescPropBsnDriverInfoJsonVer14Funnel implements Funnel<OFPortDescPropBsnDriverInfoJsonVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescPropBsnDriverInfoJsonVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0xffff
            sink.putShort((short) 0xffff);
            // FIXME: skip funnel of length
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property expType = 0x7L
            sink.putInt(0x7);
            sink.putBytes(message.driverInfoJson);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescPropBsnDriverInfoJsonVer14> {
        @Override
        public void write(ByteBuf bb, OFPortDescPropBsnDriverInfoJsonVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 0xffff
            bb.writeShort((short) 0xffff);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property expType = 0x7L
            bb.writeInt(0x7);
            bb.writeBytes(message.driverInfoJson);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescPropBsnDriverInfoJsonVer14(");
        b.append("driverInfoJson=").append(Arrays.toString(driverInfoJson));
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
        OFPortDescPropBsnDriverInfoJsonVer14 other = (OFPortDescPropBsnDriverInfoJsonVer14) obj;

        if (!Arrays.equals(driverInfoJson, other.driverInfoJson))
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + Arrays.hashCode(driverInfoJson);
        return result;
    }

}
