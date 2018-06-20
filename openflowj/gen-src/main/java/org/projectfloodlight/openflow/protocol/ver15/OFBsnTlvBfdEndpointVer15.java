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

class OFBsnTlvBfdEndpointVer15 implements OFBsnTlvBfdEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvBfdEndpointVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 5;


    // OF message fields
    private final OFBsnBfdEndpoint value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvBfdEndpointVer15(OFBsnBfdEndpoint value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvBfdEndpointVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xb0;
    }

    @Override
    public OFBsnBfdEndpoint getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnTlvBfdEndpoint.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvBfdEndpoint.Builder {
        final OFBsnTlvBfdEndpointVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBsnBfdEndpoint value;

        BuilderWithParent(OFBsnTlvBfdEndpointVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xb0;
    }

    @Override
    public OFBsnBfdEndpoint getValue() {
        return value;
    }

    @Override
    public OFBsnTlvBfdEndpoint.Builder setValue(OFBsnBfdEndpoint value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnTlvBfdEndpoint build() {
                OFBsnBfdEndpoint value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvBfdEndpointVer15(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvBfdEndpoint.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBsnBfdEndpoint value;

    @Override
    public int getType() {
        return 0xb0;
    }

    @Override
    public OFBsnBfdEndpoint getValue() {
        return value;
    }

    @Override
    public OFBsnTlvBfdEndpoint.Builder setValue(OFBsnBfdEndpoint value) {
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
        public OFBsnTlvBfdEndpoint build() {
            if(!this.valueSet)
                throw new IllegalStateException("Property value doesn't have default value -- must be set");
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvBfdEndpointVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvBfdEndpoint> {
        @Override
        public OFBsnTlvBfdEndpoint readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0xb0
            short type = bb.readShort();
            if(type != (short) 0xb0)
                throw new OFParseError("Wrong type: Expected=0xb0(0xb0), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 5)
                throw new OFParseError("Wrong length: Expected=5(5), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            OFBsnBfdEndpoint value = OFBsnBfdEndpointSerializerVer15.readFrom(bb);

            OFBsnTlvBfdEndpointVer15 bsnTlvBfdEndpointVer15 = new OFBsnTlvBfdEndpointVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvBfdEndpointVer15);
            return bsnTlvBfdEndpointVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvBfdEndpointVer15Funnel FUNNEL = new OFBsnTlvBfdEndpointVer15Funnel();
    static class OFBsnTlvBfdEndpointVer15Funnel implements Funnel<OFBsnTlvBfdEndpointVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvBfdEndpointVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0xb0
            sink.putShort((short) 0xb0);
            // fixed value property length = 5
            sink.putShort((short) 0x5);
            OFBsnBfdEndpointSerializerVer15.putTo(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvBfdEndpointVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvBfdEndpointVer15 message) {
            // fixed value property type = 0xb0
            bb.writeShort((short) 0xb0);
            // fixed value property length = 5
            bb.writeShort((short) 0x5);
            OFBsnBfdEndpointSerializerVer15.writeTo(bb, message.value);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvBfdEndpointVer15(");
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
        OFBsnTlvBfdEndpointVer15 other = (OFBsnTlvBfdEndpointVer15) obj;

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
