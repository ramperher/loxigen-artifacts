// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBsnCml;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFBsnCmlSerializerVer13 {

    public final static short BSN_CML_NONE_VAL = (short) 0x0;
    public final static short BSN_CML_CPU_DROP_VAL = (short) 0x1;
    public final static short BSN_CML_FORWARD_VAL = (short) 0x2;
    public final static short BSN_CML_CPU_FORWARD_VAL = (short) 0x3;

    public static OFBsnCml readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBsnCml e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBsnCml e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBsnCml ofWireValue(short val) {
        switch(val) {
            case BSN_CML_NONE_VAL:
                return OFBsnCml.BSN_CML_NONE;
            case BSN_CML_CPU_DROP_VAL:
                return OFBsnCml.BSN_CML_CPU_DROP;
            case BSN_CML_FORWARD_VAL:
                return OFBsnCml.BSN_CML_FORWARD;
            case BSN_CML_CPU_FORWARD_VAL:
                return OFBsnCml.BSN_CML_CPU_FORWARD;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnCml in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFBsnCml e) {
        switch(e) {
            case BSN_CML_NONE:
                return BSN_CML_NONE_VAL;
            case BSN_CML_CPU_DROP:
                return BSN_CML_CPU_DROP_VAL;
            case BSN_CML_FORWARD:
                return BSN_CML_FORWARD_VAL;
            case BSN_CML_CPU_FORWARD:
                return BSN_CML_CPU_FORWARD_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnCml in version 1.3: " + e);
        }
    }

}
