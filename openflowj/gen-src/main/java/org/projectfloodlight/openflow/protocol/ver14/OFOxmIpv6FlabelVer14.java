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

class OFOxmIpv6FlabelVer14 implements OFOxmIpv6Flabel {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpv6FlabelVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static IPv6FlowLabel DEFAULT_VALUE = IPv6FlowLabel.NONE;

    // OF message fields
    private final IPv6FlowLabel value;
//
    // Immutable default instance
    final static OFOxmIpv6FlabelVer14 DEFAULT = new OFOxmIpv6FlabelVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpv6FlabelVer14(IPv6FlowLabel value) {
        if(value == null) {
            throw new NullPointerException("OFOxmIpv6FlabelVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003804L;
    }

    @Override
    public IPv6FlowLabel getValue() {
        return value;
    }

    @Override
    public MatchField<IPv6FlowLabel> getMatchField() {
        return MatchField.IPV6_FLABEL;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<IPv6FlowLabel> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public IPv6FlowLabel getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmIpv6Flabel.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpv6Flabel.Builder {
        final OFOxmIpv6FlabelVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv6FlowLabel value;

        BuilderWithParent(OFOxmIpv6FlabelVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003804L;
    }

    @Override
    public IPv6FlowLabel getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6Flabel.Builder setValue(IPv6FlowLabel value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6FlowLabel> getMatchField() {
        return MatchField.IPV6_FLABEL;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv6FlowLabel> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public IPv6FlowLabel getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmIpv6Flabel build() {
                IPv6FlowLabel value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmIpv6FlabelVer14(
                    value
                );
        }

    }

    static class Builder implements OFOxmIpv6Flabel.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv6FlowLabel value;

    @Override
    public long getTypeLen() {
        return 0x80003804L;
    }

    @Override
    public IPv6FlowLabel getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6Flabel.Builder setValue(IPv6FlowLabel value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6FlowLabel> getMatchField() {
        return MatchField.IPV6_FLABEL;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv6FlowLabel> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public IPv6FlowLabel getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmIpv6Flabel build() {
            IPv6FlowLabel value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmIpv6FlabelVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpv6Flabel> {
        @Override
        public OFOxmIpv6Flabel readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80003804L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003804)
                throw new OFParseError("Wrong typeLen: Expected=0x80003804L(0x80003804L), got="+typeLen);
            IPv6FlowLabel value = IPv6FlowLabel.read4Bytes(bb);

            OFOxmIpv6FlabelVer14 oxmIpv6FlabelVer14 = new OFOxmIpv6FlabelVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpv6FlabelVer14);
            return oxmIpv6FlabelVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpv6FlabelVer14Funnel FUNNEL = new OFOxmIpv6FlabelVer14Funnel();
    static class OFOxmIpv6FlabelVer14Funnel implements Funnel<OFOxmIpv6FlabelVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpv6FlabelVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003804L
            sink.putInt((int) 0x80003804);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpv6FlabelVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmIpv6FlabelVer14 message) {
            // fixed value property typeLen = 0x80003804L
            bb.writeInt((int) 0x80003804);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpv6FlabelVer14(");
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
        OFOxmIpv6FlabelVer14 other = (OFOxmIpv6FlabelVer14) obj;

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
