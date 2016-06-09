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

class OFOxmTunnelIdVer14 implements OFOxmTunnelId {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmTunnelIdVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 12;

        private final static U64 DEFAULT_VALUE = U64.ZERO;

    // OF message fields
    private final U64 value;
//
    // Immutable default instance
    final static OFOxmTunnelIdVer14 DEFAULT = new OFOxmTunnelIdVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmTunnelIdVer14(U64 value) {
        if(value == null) {
            throw new NullPointerException("OFOxmTunnelIdVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80004c08L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public MatchField<U64> getMatchField() {
        return MatchField.TUNNEL_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<U64> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public U64 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmTunnelId.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmTunnelId.Builder {
        final OFOxmTunnelIdVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U64 value;

        BuilderWithParent(OFOxmTunnelIdVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80004c08L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFOxmTunnelId.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U64> getMatchField() {
        return MatchField.TUNNEL_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U64> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public U64 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmTunnelId build() {
                U64 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmTunnelIdVer14(
                    value
                );
        }

    }

    static class Builder implements OFOxmTunnelId.Builder {
        // OF message fields
        private boolean valueSet;
        private U64 value;

    @Override
    public long getTypeLen() {
        return 0x80004c08L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFOxmTunnelId.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U64> getMatchField() {
        return MatchField.TUNNEL_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U64> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public U64 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmTunnelId build() {
            U64 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmTunnelIdVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmTunnelId> {
        @Override
        public OFOxmTunnelId readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80004c08L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80004c08)
                throw new OFParseError("Wrong typeLen: Expected=0x80004c08L(0x80004c08L), got="+typeLen);
            U64 value = U64.ofRaw(bb.readLong());

            OFOxmTunnelIdVer14 oxmTunnelIdVer14 = new OFOxmTunnelIdVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmTunnelIdVer14);
            return oxmTunnelIdVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmTunnelIdVer14Funnel FUNNEL = new OFOxmTunnelIdVer14Funnel();
    static class OFOxmTunnelIdVer14Funnel implements Funnel<OFOxmTunnelIdVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmTunnelIdVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80004c08L
            sink.putInt((int) 0x80004c08);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmTunnelIdVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmTunnelIdVer14 message) {
            // fixed value property typeLen = 0x80004c08L
            bb.writeInt((int) 0x80004c08);
            bb.writeLong(message.value.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmTunnelIdVer14(");
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
        OFOxmTunnelIdVer14 other = (OFOxmTunnelIdVer14) obj;

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
