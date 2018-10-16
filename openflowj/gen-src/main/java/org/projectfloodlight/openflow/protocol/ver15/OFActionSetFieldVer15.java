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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionSetFieldVer15 implements OFActionSetField {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetFieldVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 8;


    // OF message fields
    private final OFOxm<?> field;
//

    // package private constructor - used by readers, builders, and factory
    OFActionSetFieldVer15(OFOxm<?> field) {
        if(field == null) {
            throw new NullPointerException("OFActionSetFieldVer15: property field cannot be null");
        }
        this.field = field;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_FIELD;
    }

    @Override
    public OFOxm<?> getField() {
        return field;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFActionSetField.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetField.Builder {
        final OFActionSetFieldVer15 parentMessage;

        // OF message fields
        private boolean fieldSet;
        private OFOxm<?> field;

        BuilderWithParent(OFActionSetFieldVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_FIELD;
    }

    @Override
    public OFOxm<?> getField() {
        return field;
    }

    @Override
    public OFActionSetField.Builder setField(OFOxm<?> field) {
        this.field = field;
        this.fieldSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFActionSetField build() {
                OFOxm<?> field = this.fieldSet ? this.field : parentMessage.field;
                if(field == null)
                    throw new NullPointerException("Property field must not be null");

                //
                return new OFActionSetFieldVer15(
                    field
                );
        }

    }

    static class Builder implements OFActionSetField.Builder {
        // OF message fields
        private boolean fieldSet;
        private OFOxm<?> field;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_FIELD;
    }

    @Override
    public OFOxm<?> getField() {
        return field;
    }

    @Override
    public OFActionSetField.Builder setField(OFOxm<?> field) {
        this.field = field;
        this.fieldSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFActionSetField build() {
            if(!this.fieldSet)
                throw new IllegalStateException("Property field doesn't have default value -- must be set");
            if(field == null)
                throw new NullPointerException("Property field must not be null");


            return new OFActionSetFieldVer15(
                    field
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFActionSetField> {
        @Override
        public OFActionSetField readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 25
            short type = bb.readShort();
            if(type != (short) 0x19)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_FIELD(25), got="+type);
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
            OFOxm<?> field = OFOxmVer15.READER.readFrom(bb);
            // align message to 8 bytes (length contains aligned value)
            bb.skipBytes(length - (bb.readerIndex() - start));

            OFActionSetFieldVer15 actionSetFieldVer15 = new OFActionSetFieldVer15(
                    field
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetFieldVer15);
            return actionSetFieldVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetFieldVer15Funnel FUNNEL = new OFActionSetFieldVer15Funnel();
    static class OFActionSetFieldVer15Funnel implements Funnel<OFActionSetFieldVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetFieldVer15 message, PrimitiveSink sink) {
            // fixed value property type = 25
            sink.putShort((short) 0x19);
            // FIXME: skip funnel of length
            message.field.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetFieldVer15> {
        @Override
        public void write(ByteBuf bb, OFActionSetFieldVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 25
            bb.writeShort((short) 0x19);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            message.field.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            int alignedLength = ((length + 7)/8 * 8);
            bb.setShort(lengthIndex, alignedLength);
            // align message to 8 bytes
            bb.writeZero(alignedLength - length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetFieldVer15(");
        b.append("field=").append(field);
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
        OFActionSetFieldVer15 other = (OFActionSetFieldVer15) obj;

        if (field == null) {
            if (other.field != null)
                return false;
        } else if (!field.equals(other.field))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((field == null) ? 0 : field.hashCode());
        return result;
    }

}
