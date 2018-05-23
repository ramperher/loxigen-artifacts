// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBsnModuleEepromCmplnceType;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFBsnModuleEepromCmplnceTypeSerializerVer14 {

    public final static byte BSN_MODULE_EEPROM_COMPLIANCE_TYPE_UNSPECIFIED_VAL = (byte) 0x0;
    public final static byte BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_PASSIVE_VAL = (byte) 0x4;
    public final static byte BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_ACTIVE_VAL = (byte) 0x8;

    public static Set<OFBsnModuleEepromCmplnceType> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFBsnModuleEepromCmplnceType> set) {
        bb.writeByte(toWireValue(set));
    }

    public static void putTo(Set<OFBsnModuleEepromCmplnceType> set, PrimitiveSink sink) {
        sink.putByte(toWireValue(set));
    }


    public static Set<OFBsnModuleEepromCmplnceType> ofWireValue(byte val) {
        EnumSet<OFBsnModuleEepromCmplnceType> set = EnumSet.noneOf(OFBsnModuleEepromCmplnceType.class);

        if((val & BSN_MODULE_EEPROM_COMPLIANCE_TYPE_UNSPECIFIED_VAL) != 0)
            set.add(OFBsnModuleEepromCmplnceType.BSN_MODULE_EEPROM_COMPLIANCE_TYPE_UNSPECIFIED);
        if((val & BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_PASSIVE_VAL) != 0)
            set.add(OFBsnModuleEepromCmplnceType.BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_PASSIVE);
        if((val & BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_ACTIVE_VAL) != 0)
            set.add(OFBsnModuleEepromCmplnceType.BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_ACTIVE);
        return Collections.unmodifiableSet(set);
    }

    public static byte toWireValue(Set<OFBsnModuleEepromCmplnceType> set) {
        byte wireValue = 0;

        for(OFBsnModuleEepromCmplnceType e: set) {
            switch(e) {
                case BSN_MODULE_EEPROM_COMPLIANCE_TYPE_UNSPECIFIED:
                    wireValue |= BSN_MODULE_EEPROM_COMPLIANCE_TYPE_UNSPECIFIED_VAL;
                    break;
                case BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_PASSIVE:
                    wireValue |= BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_PASSIVE_VAL;
                    break;
                case BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_ACTIVE:
                    wireValue |= BSN_MODULE_EEPROM_COMPLIANCE_TYPE_CU_ACTIVE_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFBsnModuleEepromCmplnceType in version 1.4: " + e);
            }
        }
        return wireValue;
    }

}
