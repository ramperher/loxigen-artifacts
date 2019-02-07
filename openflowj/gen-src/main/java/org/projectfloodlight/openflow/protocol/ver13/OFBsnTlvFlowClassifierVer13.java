// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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

class OFBsnTlvFlowClassifierVer13 implements OFBsnTlvFlowClassifier {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvFlowClassifierVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;


    // OF message fields
    private final OFBsnFlowClassifier value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvFlowClassifierVer13(OFBsnFlowClassifier value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvFlowClassifierVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xb8;
    }

    @Override
    public OFBsnFlowClassifier getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvFlowClassifier.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvFlowClassifier.Builder {
        final OFBsnTlvFlowClassifierVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBsnFlowClassifier value;

        BuilderWithParent(OFBsnTlvFlowClassifierVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xb8;
    }

    @Override
    public OFBsnFlowClassifier getValue() {
        return value;
    }

    @Override
    public OFBsnTlvFlowClassifier.Builder setValue(OFBsnFlowClassifier value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvFlowClassifier build() {
                OFBsnFlowClassifier value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvFlowClassifierVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvFlowClassifier.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBsnFlowClassifier value;

    @Override
    public int getType() {
        return 0xb8;
    }

    @Override
    public OFBsnFlowClassifier getValue() {
        return value;
    }

    @Override
    public OFBsnTlvFlowClassifier.Builder setValue(OFBsnFlowClassifier value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnTlvFlowClassifier build() {
            if(!this.valueSet)
                throw new IllegalStateException("Property value doesn't have default value -- must be set");
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvFlowClassifierVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnTlvFlowClassifier> {
        @Override
        public OFBsnTlvFlowClassifier readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0xb8
            short type = bb.readShort();
            if(type != (short) 0xb8)
                throw new OFParseError("Wrong type: Expected=0xb8(0xb8), got="+type);
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
            OFBsnFlowClassifier value = OFBsnFlowClassifierSerializerVer13.readFrom(bb);

            OFBsnTlvFlowClassifierVer13 bsnTlvFlowClassifierVer13 = new OFBsnTlvFlowClassifierVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvFlowClassifierVer13);
            return bsnTlvFlowClassifierVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvFlowClassifierVer13Funnel FUNNEL = new OFBsnTlvFlowClassifierVer13Funnel();
    static class OFBsnTlvFlowClassifierVer13Funnel implements Funnel<OFBsnTlvFlowClassifierVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvFlowClassifierVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0xb8
            sink.putShort((short) 0xb8);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            OFBsnFlowClassifierSerializerVer13.putTo(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvFlowClassifierVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvFlowClassifierVer13 message) {
            // fixed value property type = 0xb8
            bb.writeShort((short) 0xb8);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            OFBsnFlowClassifierSerializerVer13.writeTo(bb, message.value);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvFlowClassifierVer13(");
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
        OFBsnTlvFlowClassifierVer13 other = (OFBsnTlvFlowClassifierVer13) obj;

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
