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

class OFPortDescPropBsnForwardErrorCorrectionVer14 implements OFPortDescPropBsnForwardErrorCorrection {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescPropBsnForwardErrorCorrectionVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 20;

        private final static long DEFAULT_ENABLED = 0x0L;

    // OF message fields
    private final OFBsnFecConfigState configured;
    private final long enabled;
//

    // package private constructor - used by readers, builders, and factory
    OFPortDescPropBsnForwardErrorCorrectionVer14(OFBsnFecConfigState configured, long enabled) {
        if(configured == null) {
            throw new NullPointerException("OFPortDescPropBsnForwardErrorCorrectionVer14: property configured cannot be null");
        }
        this.configured = configured;
        this.enabled = enabled;
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
        return 0x2L;
    }

    @Override
    public OFBsnFecConfigState getConfigured() {
        return configured;
    }

    @Override
    public long getEnabled() {
        return enabled;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFPortDescPropBsnForwardErrorCorrection.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDescPropBsnForwardErrorCorrection.Builder {
        final OFPortDescPropBsnForwardErrorCorrectionVer14 parentMessage;

        // OF message fields
        private boolean configuredSet;
        private OFBsnFecConfigState configured;
        private boolean enabledSet;
        private long enabled;

        BuilderWithParent(OFPortDescPropBsnForwardErrorCorrectionVer14 parentMessage) {
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
        return 0x2L;
    }

    @Override
    public OFPortDescPropBsnForwardErrorCorrection.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public OFBsnFecConfigState getConfigured() {
        return configured;
    }

    @Override
    public OFPortDescPropBsnForwardErrorCorrection.Builder setConfigured(OFBsnFecConfigState configured) {
        this.configured = configured;
        this.configuredSet = true;
        return this;
    }
    @Override
    public long getEnabled() {
        return enabled;
    }

    @Override
    public OFPortDescPropBsnForwardErrorCorrection.Builder setEnabled(long enabled) {
        this.enabled = enabled;
        this.enabledSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFPortDescPropBsnForwardErrorCorrection build() {
                OFBsnFecConfigState configured = this.configuredSet ? this.configured : parentMessage.configured;
                if(configured == null)
                    throw new NullPointerException("Property configured must not be null");
                long enabled = this.enabledSet ? this.enabled : parentMessage.enabled;

                //
                return new OFPortDescPropBsnForwardErrorCorrectionVer14(
                    configured,
                    enabled
                );
        }

    }

    static class Builder implements OFPortDescPropBsnForwardErrorCorrection.Builder {
        // OF message fields
        private boolean configuredSet;
        private OFBsnFecConfigState configured;
        private boolean enabledSet;
        private long enabled;

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
        return 0x2L;
    }

    @Override
    public OFPortDescPropBsnForwardErrorCorrection.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public OFBsnFecConfigState getConfigured() {
        return configured;
    }

    @Override
    public OFPortDescPropBsnForwardErrorCorrection.Builder setConfigured(OFBsnFecConfigState configured) {
        this.configured = configured;
        this.configuredSet = true;
        return this;
    }
    @Override
    public long getEnabled() {
        return enabled;
    }

    @Override
    public OFPortDescPropBsnForwardErrorCorrection.Builder setEnabled(long enabled) {
        this.enabled = enabled;
        this.enabledSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFPortDescPropBsnForwardErrorCorrection build() {
            if(!this.configuredSet)
                throw new IllegalStateException("Property configured doesn't have default value -- must be set");
            if(configured == null)
                throw new NullPointerException("Property configured must not be null");
            long enabled = this.enabledSet ? this.enabled : DEFAULT_ENABLED;


            return new OFPortDescPropBsnForwardErrorCorrectionVer14(
                    configured,
                    enabled
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFPortDescPropBsnForwardErrorCorrection> {
        @Override
        public OFPortDescPropBsnForwardErrorCorrection readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0xffff
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=0xffff(0xffff), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 20)
                throw new OFParseError("Wrong length: Expected=20(20), got="+length);
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
            // fixed value property expType == 0x2L
            int expType = bb.readInt();
            if(expType != 0x2)
                throw new OFParseError("Wrong expType: Expected=0x2L(0x2L), got="+expType);
            OFBsnFecConfigState configured = OFBsnFecConfigStateSerializerVer14.readFrom(bb);
            long enabled = U32.f(bb.readInt());

            OFPortDescPropBsnForwardErrorCorrectionVer14 portDescPropBsnForwardErrorCorrectionVer14 = new OFPortDescPropBsnForwardErrorCorrectionVer14(
                    configured,
                      enabled
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescPropBsnForwardErrorCorrectionVer14);
            return portDescPropBsnForwardErrorCorrectionVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescPropBsnForwardErrorCorrectionVer14Funnel FUNNEL = new OFPortDescPropBsnForwardErrorCorrectionVer14Funnel();
    static class OFPortDescPropBsnForwardErrorCorrectionVer14Funnel implements Funnel<OFPortDescPropBsnForwardErrorCorrectionVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescPropBsnForwardErrorCorrectionVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0xffff
            sink.putShort((short) 0xffff);
            // fixed value property length = 20
            sink.putShort((short) 0x14);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property expType = 0x2L
            sink.putInt(0x2);
            OFBsnFecConfigStateSerializerVer14.putTo(message.configured, sink);
            sink.putLong(message.enabled);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescPropBsnForwardErrorCorrectionVer14> {
        @Override
        public void write(ByteBuf bb, OFPortDescPropBsnForwardErrorCorrectionVer14 message) {
            // fixed value property type = 0xffff
            bb.writeShort((short) 0xffff);
            // fixed value property length = 20
            bb.writeShort((short) 0x14);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property expType = 0x2L
            bb.writeInt(0x2);
            OFBsnFecConfigStateSerializerVer14.writeTo(bb, message.configured);
            bb.writeInt(U32.t(message.enabled));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescPropBsnForwardErrorCorrectionVer14(");
        b.append("configured=").append(configured);
        b.append(", ");
        b.append("enabled=").append(enabled);
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
        OFPortDescPropBsnForwardErrorCorrectionVer14 other = (OFPortDescPropBsnForwardErrorCorrectionVer14) obj;

        if (configured == null) {
            if (other.configured != null)
                return false;
        } else if (!configured.equals(other.configured))
            return false;
        if( enabled != other.enabled)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((configured == null) ? 0 : configured.hashCode());
        result = prime *  (int) (enabled ^ (enabled >>> 32));
        return result;
    }

}
