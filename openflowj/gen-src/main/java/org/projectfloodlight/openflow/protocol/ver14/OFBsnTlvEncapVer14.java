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

class OFBsnTlvEncapVer14 implements OFBsnTlvEncap {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvEncapVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 5;


    // OF message fields
    private final OFBsnEncap value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvEncapVer14(OFBsnEncap value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvEncapVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xaf;
    }

    @Override
    public OFBsnEncap getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvEncap.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvEncap.Builder {
        final OFBsnTlvEncapVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBsnEncap value;

        BuilderWithParent(OFBsnTlvEncapVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xaf;
    }

    @Override
    public OFBsnEncap getValue() {
        return value;
    }

    @Override
    public OFBsnTlvEncap.Builder setValue(OFBsnEncap value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvEncap build() {
                OFBsnEncap value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvEncapVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvEncap.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBsnEncap value;

    @Override
    public int getType() {
        return 0xaf;
    }

    @Override
    public OFBsnEncap getValue() {
        return value;
    }

    @Override
    public OFBsnTlvEncap.Builder setValue(OFBsnEncap value) {
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
        public OFBsnTlvEncap build() {
            if(!this.valueSet)
                throw new IllegalStateException("Property value doesn't have default value -- must be set");
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvEncapVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnTlvEncap> {
        @Override
        public OFBsnTlvEncap readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0xaf
            short type = bb.readShort();
            if(type != (short) 0xaf)
                throw new OFParseError("Wrong type: Expected=0xaf(0xaf), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 5)
                throw new OFParseError("Wrong length: Expected=5(5), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            OFBsnEncap value = OFBsnEncapSerializerVer14.readFrom(bb);

            OFBsnTlvEncapVer14 bsnTlvEncapVer14 = new OFBsnTlvEncapVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvEncapVer14);
            return bsnTlvEncapVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvEncapVer14Funnel FUNNEL = new OFBsnTlvEncapVer14Funnel();
    static class OFBsnTlvEncapVer14Funnel implements Funnel<OFBsnTlvEncapVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvEncapVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0xaf
            sink.putShort((short) 0xaf);
            // fixed value property length = 5
            sink.putShort((short) 0x5);
            OFBsnEncapSerializerVer14.putTo(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvEncapVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvEncapVer14 message) {
            // fixed value property type = 0xaf
            bb.writeShort((short) 0xaf);
            // fixed value property length = 5
            bb.writeShort((short) 0x5);
            OFBsnEncapSerializerVer14.writeTo(bb, message.value);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvEncapVer14(");
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
        OFBsnTlvEncapVer14 other = (OFBsnTlvEncapVer14) obj;

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