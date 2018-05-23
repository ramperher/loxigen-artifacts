// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBsnUnitType;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFBsnUnitTypeSerializerVer15 {

    public final static byte BSN_UNIT_NONE_VAL = (byte) 0x0;
    public final static byte BSN_UNIT_AMP_VAL = (byte) 0x2;
    public final static byte BSN_UNIT_VOL_VAL = (byte) 0x3;
    public final static byte BSN_UNIT_KM_VAL = (byte) 0x4;
    public final static byte BSN_UNIT_M_VAL = (byte) 0x5;
    public final static byte BSN_UNIT_S_VAL = (byte) 0x6;
    public final static byte BSN_UNIT_C_VAL = (byte) 0x7;
    public final static byte BSN_UNIT_F_VAL = (byte) 0x8;
    public final static byte BSN_UNIT_BD_VAL = (byte) 0x9;
    public final static byte BSN_UNIT_MBD_VAL = (byte) 0xa;
    public final static byte BSN_UNIT_UA_VAL = (byte) 0xb;
    public final static byte BSN_UNIT_UW_VAL = (byte) 0xc;
    public final static byte BSN_UNIT_MC_VAL = (byte) 0xd;
    public final static byte BSN_UNIT_MV_VAL = (byte) 0xe;
    public final static byte BSN_UNIT_NM_VAL = (byte) 0xf;

    public static Set<OFBsnUnitType> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFBsnUnitType> set) {
        bb.writeByte(toWireValue(set));
    }

    public static void putTo(Set<OFBsnUnitType> set, PrimitiveSink sink) {
        sink.putByte(toWireValue(set));
    }


    public static Set<OFBsnUnitType> ofWireValue(byte val) {
        EnumSet<OFBsnUnitType> set = EnumSet.noneOf(OFBsnUnitType.class);

        if((val & BSN_UNIT_NONE_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_NONE);
        if((val & BSN_UNIT_AMP_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_AMP);
        if((val & BSN_UNIT_VOL_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_VOL);
        if((val & BSN_UNIT_KM_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_KM);
        if((val & BSN_UNIT_M_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_M);
        if((val & BSN_UNIT_S_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_S);
        if((val & BSN_UNIT_C_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_C);
        if((val & BSN_UNIT_F_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_F);
        if((val & BSN_UNIT_BD_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_BD);
        if((val & BSN_UNIT_MBD_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_MBD);
        if((val & BSN_UNIT_UA_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_UA);
        if((val & BSN_UNIT_UW_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_UW);
        if((val & BSN_UNIT_MC_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_MC);
        if((val & BSN_UNIT_MV_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_MV);
        if((val & BSN_UNIT_NM_VAL) != 0)
            set.add(OFBsnUnitType.BSN_UNIT_NM);
        return Collections.unmodifiableSet(set);
    }

    public static byte toWireValue(Set<OFBsnUnitType> set) {
        byte wireValue = 0;

        for(OFBsnUnitType e: set) {
            switch(e) {
                case BSN_UNIT_NONE:
                    wireValue |= BSN_UNIT_NONE_VAL;
                    break;
                case BSN_UNIT_AMP:
                    wireValue |= BSN_UNIT_AMP_VAL;
                    break;
                case BSN_UNIT_VOL:
                    wireValue |= BSN_UNIT_VOL_VAL;
                    break;
                case BSN_UNIT_KM:
                    wireValue |= BSN_UNIT_KM_VAL;
                    break;
                case BSN_UNIT_M:
                    wireValue |= BSN_UNIT_M_VAL;
                    break;
                case BSN_UNIT_S:
                    wireValue |= BSN_UNIT_S_VAL;
                    break;
                case BSN_UNIT_C:
                    wireValue |= BSN_UNIT_C_VAL;
                    break;
                case BSN_UNIT_F:
                    wireValue |= BSN_UNIT_F_VAL;
                    break;
                case BSN_UNIT_BD:
                    wireValue |= BSN_UNIT_BD_VAL;
                    break;
                case BSN_UNIT_MBD:
                    wireValue |= BSN_UNIT_MBD_VAL;
                    break;
                case BSN_UNIT_UA:
                    wireValue |= BSN_UNIT_UA_VAL;
                    break;
                case BSN_UNIT_UW:
                    wireValue |= BSN_UNIT_UW_VAL;
                    break;
                case BSN_UNIT_MC:
                    wireValue |= BSN_UNIT_MC_VAL;
                    break;
                case BSN_UNIT_MV:
                    wireValue |= BSN_UNIT_MV_VAL;
                    break;
                case BSN_UNIT_NM:
                    wireValue |= BSN_UNIT_NM_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFBsnUnitType in version 1.5: " + e);
            }
        }
        return wireValue;
    }

}
