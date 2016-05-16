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

class OFOxmPbbUcaVer15 implements OFOxmPbbUca {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmPbbUcaVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 5;

        private final static OFBooleanValue DEFAULT_VALUE = OFBooleanValue.FALSE;

    // OF message fields
    private final OFBooleanValue value;
//
    // Immutable default instance
    final static OFOxmPbbUcaVer15 DEFAULT = new OFOxmPbbUcaVer15(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmPbbUcaVer15(OFBooleanValue value) {
        if(value == null) {
            throw new NullPointerException("OFOxmPbbUcaVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80005201L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.PBB_UCA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFBooleanValue> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFOxmPbbUca.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmPbbUca.Builder {
        final OFOxmPbbUcaVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;

        BuilderWithParent(OFOxmPbbUcaVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80005201L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmPbbUca.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.PBB_UCA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFOxmPbbUca build() {
                OFBooleanValue value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmPbbUcaVer15(
                    value
                );
        }

    }

    static class Builder implements OFOxmPbbUca.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;

    @Override
    public long getTypeLen() {
        return 0x80005201L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmPbbUca.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.PBB_UCA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFOxmPbbUca build() {
            OFBooleanValue value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmPbbUcaVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmPbbUca> {
        @Override
        public OFOxmPbbUca readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80005201L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80005201)
                throw new OFParseError("Wrong typeLen: Expected=0x80005201L(0x80005201L), got="+typeLen);
            OFBooleanValue value = OFBooleanValue.of(bb.readByte() != 0);

            OFOxmPbbUcaVer15 oxmPbbUcaVer15 = new OFOxmPbbUcaVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmPbbUcaVer15);
            return oxmPbbUcaVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmPbbUcaVer15Funnel FUNNEL = new OFOxmPbbUcaVer15Funnel();
    static class OFOxmPbbUcaVer15Funnel implements Funnel<OFOxmPbbUcaVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmPbbUcaVer15 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80005201L
            sink.putInt((int) 0x80005201);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmPbbUcaVer15> {
        @Override
        public void write(ByteBuf bb, OFOxmPbbUcaVer15 message) {
            // fixed value property typeLen = 0x80005201L
            bb.writeInt((int) 0x80005201);
            bb.writeByte(message.value.getInt());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmPbbUcaVer15(");
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
        OFOxmPbbUcaVer15 other = (OFOxmPbbUcaVer15) obj;

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