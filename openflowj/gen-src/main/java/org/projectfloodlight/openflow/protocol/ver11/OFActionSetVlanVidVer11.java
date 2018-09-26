// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

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

class OFActionSetVlanVidVer11 implements OFActionSetVlanVid {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetVlanVidVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 8;

        private final static VlanVid DEFAULT_VLAN_VID = VlanVid.ZERO;

    // OF message fields
    private final VlanVid vlanVid;
//
    // Immutable default instance
    final static OFActionSetVlanVidVer11 DEFAULT = new OFActionSetVlanVidVer11(
        DEFAULT_VLAN_VID
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetVlanVidVer11(VlanVid vlanVid) {
        if(vlanVid == null) {
            throw new NullPointerException("OFActionSetVlanVidVer11: property vlanVid cannot be null");
        }
        this.vlanVid = vlanVid;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_VID;
    }

    @Override
    public VlanVid getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFActionSetVlanVid.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetVlanVid.Builder {
        final OFActionSetVlanVidVer11 parentMessage;

        // OF message fields
        private boolean vlanVidSet;
        private VlanVid vlanVid;

        BuilderWithParent(OFActionSetVlanVidVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_VID;
    }

    @Override
    public VlanVid getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFActionSetVlanVid.Builder setVlanVid(VlanVid vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFActionSetVlanVid build() {
                VlanVid vlanVid = this.vlanVidSet ? this.vlanVid : parentMessage.vlanVid;
                if(vlanVid == null)
                    throw new NullPointerException("Property vlanVid must not be null");

                //
                return new OFActionSetVlanVidVer11(
                    vlanVid
                );
        }

    }

    static class Builder implements OFActionSetVlanVid.Builder {
        // OF message fields
        private boolean vlanVidSet;
        private VlanVid vlanVid;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_VID;
    }

    @Override
    public VlanVid getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFActionSetVlanVid.Builder setVlanVid(VlanVid vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFActionSetVlanVid build() {
            VlanVid vlanVid = this.vlanVidSet ? this.vlanVid : DEFAULT_VLAN_VID;
            if(vlanVid == null)
                throw new NullPointerException("Property vlanVid must not be null");


            return new OFActionSetVlanVidVer11(
                    vlanVid
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFActionSetVlanVid> {
        @Override
        public OFActionSetVlanVid readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_VLAN_VID(1), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            VlanVid vlanVid = VlanVid.read2Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);

            OFActionSetVlanVidVer11 actionSetVlanVidVer11 = new OFActionSetVlanVidVer11(
                    vlanVid
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetVlanVidVer11);
            return actionSetVlanVidVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetVlanVidVer11Funnel FUNNEL = new OFActionSetVlanVidVer11Funnel();
    static class OFActionSetVlanVidVer11Funnel implements Funnel<OFActionSetVlanVidVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetVlanVidVer11 message, PrimitiveSink sink) {
            // fixed value property type = 1
            sink.putShort((short) 0x1);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.vlanVid.putTo(sink);
            // skip pad (2 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetVlanVidVer11> {
        @Override
        public void write(ByteBuf bb, OFActionSetVlanVidVer11 message) {
            // fixed value property type = 1
            bb.writeShort((short) 0x1);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.vlanVid.write2Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetVlanVidVer11(");
        b.append("vlanVid=").append(vlanVid);
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
        OFActionSetVlanVidVer11 other = (OFActionSetVlanVidVer11) obj;

        if (vlanVid == null) {
            if (other.vlanVid != null)
                return false;
        } else if (!vlanVid.equals(other.vlanVid))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((vlanVid == null) ? 0 : vlanVid.hashCode());
        return result;
    }

}
