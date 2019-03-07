// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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

abstract class OFMessageVer10 {
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 8;


    public final static OFMessageVer10.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFMessage> {
        @Override
        public OFMessage readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            byte type = bb.readByte();
            switch(type) {
               case (byte) 0x11:
                   bb.readerIndex(start);
                   // discriminator value OFType.STATS_REPLY=17 for class OFStatsReplyVer10
                   return OFStatsReplyVer10.READER.readFrom(context, bb);
               case (byte) 0x10:
                   bb.readerIndex(start);
                   // discriminator value OFType.STATS_REQUEST=16 for class OFStatsRequestVer10
                   return OFStatsRequestVer10.READER.readFrom(context, bb);
               case (byte) 0x1:
                   bb.readerIndex(start);
                   // discriminator value OFType.ERROR=1 for class OFErrorMsgVer10
                   return OFErrorMsgVer10.READER.readFrom(context, bb);
               case (byte) 0x13:
                   bb.readerIndex(start);
                   // discriminator value OFType.BARRIER_REPLY=19 for class OFBarrierReplyVer10
                   return OFBarrierReplyVer10.READER.readFrom(context, bb);
               case (byte) 0x12:
                   bb.readerIndex(start);
                   // discriminator value OFType.BARRIER_REQUEST=18 for class OFBarrierRequestVer10
                   return OFBarrierRequestVer10.READER.readFrom(context, bb);
               case (byte) 0x4:
                   bb.readerIndex(start);
                   // discriminator value OFType.EXPERIMENTER=4 for class OFExperimenterVer10
                   return OFExperimenterVer10.READER.readFrom(context, bb);
               case (byte) 0x3:
                   bb.readerIndex(start);
                   // discriminator value OFType.ECHO_REPLY=3 for class OFEchoReplyVer10
                   return OFEchoReplyVer10.READER.readFrom(context, bb);
               case (byte) 0x2:
                   bb.readerIndex(start);
                   // discriminator value OFType.ECHO_REQUEST=2 for class OFEchoRequestVer10
                   return OFEchoRequestVer10.READER.readFrom(context, bb);
               case (byte) 0x6:
                   bb.readerIndex(start);
                   // discriminator value OFType.FEATURES_REPLY=6 for class OFFeaturesReplyVer10
                   return OFFeaturesReplyVer10.READER.readFrom(context, bb);
               case (byte) 0x5:
                   bb.readerIndex(start);
                   // discriminator value OFType.FEATURES_REQUEST=5 for class OFFeaturesRequestVer10
                   return OFFeaturesRequestVer10.READER.readFrom(context, bb);
               case (byte) 0xe:
                   bb.readerIndex(start);
                   // discriminator value OFType.FLOW_MOD=14 for class OFFlowModVer10
                   return OFFlowModVer10.READER.readFrom(context, bb);
               case (byte) 0xb:
                   bb.readerIndex(start);
                   // discriminator value OFType.FLOW_REMOVED=11 for class OFFlowRemovedVer10
                   return OFFlowRemovedVer10.READER.readFrom(context, bb);
               case (byte) 0x8:
                   bb.readerIndex(start);
                   // discriminator value OFType.GET_CONFIG_REPLY=8 for class OFGetConfigReplyVer10
                   return OFGetConfigReplyVer10.READER.readFrom(context, bb);
               case (byte) 0x7:
                   bb.readerIndex(start);
                   // discriminator value OFType.GET_CONFIG_REQUEST=7 for class OFGetConfigRequestVer10
                   return OFGetConfigRequestVer10.READER.readFrom(context, bb);
               case (byte) 0x0:
                   bb.readerIndex(start);
                   // discriminator value OFType.HELLO=0 for class OFHelloVer10
                   return OFHelloVer10.READER.readFrom(context, bb);
               case (byte) 0xa:
                   bb.readerIndex(start);
                   // discriminator value OFType.PACKET_IN=10 for class OFPacketInVer10
                   return OFPacketInVer10.READER.readFrom(context, bb);
               case (byte) 0xd:
                   bb.readerIndex(start);
                   // discriminator value OFType.PACKET_OUT=13 for class OFPacketOutVer10
                   return OFPacketOutVer10.READER.readFrom(context, bb);
               case (byte) 0xf:
                   bb.readerIndex(start);
                   // discriminator value OFType.PORT_MOD=15 for class OFPortModVer10
                   return OFPortModVer10.READER.readFrom(context, bb);
               case (byte) 0xc:
                   bb.readerIndex(start);
                   // discriminator value OFType.PORT_STATUS=12 for class OFPortStatusVer10
                   return OFPortStatusVer10.READER.readFrom(context, bb);
               case (byte) 0x15:
                   bb.readerIndex(start);
                   // discriminator value OFType.QUEUE_GET_CONFIG_REPLY=21 for class OFQueueGetConfigReplyVer10
                   return OFQueueGetConfigReplyVer10.READER.readFrom(context, bb);
               case (byte) 0x14:
                   bb.readerIndex(start);
                   // discriminator value OFType.QUEUE_GET_CONFIG_REQUEST=20 for class OFQueueGetConfigRequestVer10
                   return OFQueueGetConfigRequestVer10.READER.readFrom(context, bb);
               case (byte) 0x9:
                   bb.readerIndex(start);
                   // discriminator value OFType.SET_CONFIG=9 for class OFSetConfigVer10
                   return OFSetConfigVer10.READER.readFrom(context, bb);
               // skip OFTableModVer10 - excluded from generation
               default:
                   context.getUnparsedHandler().unparsedMessage(OFMessageVer10.class, "type", type);
            }
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if( ( bb.readableBytes() + (bb.readerIndex() - start)) < length ) {
                // message not yet fully read
                bb.readerIndex(start);
                return null;
            }
            U32.f(bb.readInt());
            // will only reach here if the discriminator turns up nothing.
            bb.skipBytes(length - (bb.readerIndex() - start));
            return null;
        }
    }
}
