// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;
import java.util.Set;

abstract class OFActionIdVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;


    public final static OFActionIdVer13.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFActionId> {
        @Override
        public OFActionId readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            switch(type) {
               case (short) 0xffff:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.EXPERIMENTER=65535 for class OFActionIdExperimenterVer13
                   return OFActionIdExperimenterVer13.READER.readFrom(context, bb);
               case (short) 0xc:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.COPY_TTL_IN=12 for class OFActionIdCopyTtlInVer13
                   return OFActionIdCopyTtlInVer13.READER.readFrom(context, bb);
               case (short) 0xb:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.COPY_TTL_OUT=11 for class OFActionIdCopyTtlOutVer13
                   return OFActionIdCopyTtlOutVer13.READER.readFrom(context, bb);
               case (short) 0x10:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.DEC_MPLS_TTL=16 for class OFActionIdDecMplsTtlVer13
                   return OFActionIdDecMplsTtlVer13.READER.readFrom(context, bb);
               case (short) 0x18:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.DEC_NW_TTL=24 for class OFActionIdDecNwTtlVer13
                   return OFActionIdDecNwTtlVer13.READER.readFrom(context, bb);
               case (short) 0x16:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.GROUP=22 for class OFActionIdGroupVer13
                   return OFActionIdGroupVer13.READER.readFrom(context, bb);
               case (short) 0x0:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.OUTPUT=0 for class OFActionIdOutputVer13
                   return OFActionIdOutputVer13.READER.readFrom(context, bb);
               case (short) 0x14:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.POP_MPLS=20 for class OFActionIdPopMplsVer13
                   return OFActionIdPopMplsVer13.READER.readFrom(context, bb);
               case (short) 0x1b:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.POP_PBB=27 for class OFActionIdPopPbbVer13
                   return OFActionIdPopPbbVer13.READER.readFrom(context, bb);
               case (short) 0x12:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.POP_VLAN=18 for class OFActionIdPopVlanVer13
                   return OFActionIdPopVlanVer13.READER.readFrom(context, bb);
               case (short) 0x13:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.PUSH_MPLS=19 for class OFActionIdPushMplsVer13
                   return OFActionIdPushMplsVer13.READER.readFrom(context, bb);
               case (short) 0x1a:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.PUSH_PBB=26 for class OFActionIdPushPbbVer13
                   return OFActionIdPushPbbVer13.READER.readFrom(context, bb);
               case (short) 0x11:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.PUSH_VLAN=17 for class OFActionIdPushVlanVer13
                   return OFActionIdPushVlanVer13.READER.readFrom(context, bb);
               case (short) 0x19:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.SET_FIELD=25 for class OFActionIdSetFieldVer13
                   return OFActionIdSetFieldVer13.READER.readFrom(context, bb);
               case (short) 0xf:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.SET_MPLS_TTL=15 for class OFActionIdSetMplsTtlVer13
                   return OFActionIdSetMplsTtlVer13.READER.readFrom(context, bb);
               case (short) 0x17:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.SET_NW_TTL=23 for class OFActionIdSetNwTtlVer13
                   return OFActionIdSetNwTtlVer13.READER.readFrom(context, bb);
               case (short) 0x15:
                   bb.readerIndex(start);
                   // discriminator value OFActionType.SET_QUEUE=21 for class OFActionIdSetQueueVer13
                   return OFActionIdSetQueueVer13.READER.readFrom(context, bb);
               default:
                   context.getUnparsedHandler().unparsedMessage(OFActionIdVer13.class, "type", type);
            }
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if( ( bb.readableBytes() + (bb.readerIndex() - start)) < length ) {
                // message not yet fully read
                bb.readerIndex(start);
                return null;
            }
            // will only reach here if the discriminator turns up nothing.
            bb.skipBytes(length - (bb.readerIndex() - start));
            return null;
        }
    }
}
