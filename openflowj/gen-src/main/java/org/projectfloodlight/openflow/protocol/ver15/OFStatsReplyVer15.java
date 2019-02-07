// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;

abstract class OFStatsReplyVer15 {
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 16;


    public final static OFStatsReplyVer15.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFStatsReply> {
        @Override
        public OFStatsReply readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 19
            byte type = bb.readByte();
            if(type != (byte) 0x13)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY(19), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if( ( bb.readableBytes() + (bb.readerIndex() - start)) < length ) {
                // message not yet fully read
                bb.readerIndex(start);
                return null;
            }
            U32.f(bb.readInt());
            short statsType = bb.readShort();
            switch(statsType) {
               case (short) 0x2:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.AGGREGATE=2 for class OFAggregateStatsReplyVer15
                   return OFAggregateStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0xffff:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.EXPERIMENTER=65535 for class OFExperimenterStatsReplyVer15
                   return OFExperimenterStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x0:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.DESC=0 for class OFDescStatsReplyVer15
                   return OFDescStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x1:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.FLOW=1 for class OFFlowStatsReplyVer15
                   return OFFlowStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x4:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.PORT=4 for class OFPortStatsReplyVer15
                   return OFPortStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x5:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.QUEUE=5 for class OFQueueStatsReplyVer15
                   return OFQueueStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x3:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.TABLE=3 for class OFTableStatsReplyVer15
                   return OFTableStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x7:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.GROUP_DESC=7 for class OFGroupDescStatsReplyVer15
                   return OFGroupDescStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x6:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.GROUP=6 for class OFGroupStatsReplyVer15
                   return OFGroupStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x8:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.GROUP_FEATURES=8 for class OFGroupFeaturesStatsReplyVer15
                   return OFGroupFeaturesStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0xa:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.METER_CONFIG=10 for class OFMeterConfigStatsReplyVer15
                   return OFMeterConfigStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0xb:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.METER_FEATURES=11 for class OFMeterFeaturesStatsReplyVer15
                   return OFMeterFeaturesStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x9:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.METER=9 for class OFMeterStatsReplyVer15
                   return OFMeterStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0xd:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.PORT_DESC=13 for class OFPortDescStatsReplyVer15
                   return OFPortDescStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0xc:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.TABLE_FEATURES=12 for class OFTableFeaturesStatsReplyVer15
                   return OFTableFeaturesStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0xf:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.QUEUE_DESC=15 for class OFQueueDescStatsReplyVer15
                   return OFQueueDescStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0xe:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.TABLE_DESC=14 for class OFTableDescStatsReplyVer15
                   return OFTableDescStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x13:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.BUNDLE_FEATURES=19 for class OFBundleFeaturesStatsReplyVer15
                   return OFBundleFeaturesStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x12:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.CONTROLLER_STATUS=18 for class OFControllerStatusStatsReplyVer15
                   return OFControllerStatusStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x11:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.FLOW_LIGHTWEIGHT=17 for class OFFlowLightweightStatsReplyVer15
                   return OFFlowLightweightStatsReplyVer15.READER.readFrom(context, bb);
               case (short) 0x10:
                   bb.readerIndex(start);
                   // discriminator value OFStatsType.FLOW_MONITOR=16 for class OFFlowMonitorReplyVer15
                   return OFFlowMonitorReplyVer15.READER.readFrom(context, bb);
               default:
                   context.getUnparsedHandler().unparsedMessage(OFStatsReplyVer15.class, "statsType", statsType);
            }
            OFStatsReplyFlagsSerializerVer15.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            // will only reach here if the discriminator turns up nothing.
            bb.skipBytes(length - (bb.readerIndex() - start));
            return null;
        }
    }
}
