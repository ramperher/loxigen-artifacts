// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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

abstract class OFExperimenterStatsReplyVer12 {
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int MINIMUM_LENGTH = 24;


    public final static OFExperimenterStatsReplyVer12.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFExperimenterStatsReply> {
        @Override
        public OFExperimenterStatsReply readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
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
            // fixed value property statsType == 65535
            short statsType = bb.readShort();
            if(statsType != (short) 0xffff)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.EXPERIMENTER(65535), got="+statsType);
            OFStatsReplyFlagsSerializerVer12.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            int experimenter = bb.readInt();
            switch(experimenter) {
               case 0x5c16c7:
                   bb.readerIndex(start);
                   // discriminator value 0x5c16c7L=0x5c16c7L for class OFBsnStatsReplyVer12
                   return OFBsnStatsReplyVer12.READER.readFrom(context, bb);
               default:
                   context.getUnparsedHandler().unparsedMessage(OFExperimenterStatsReplyVer12.class, "experimenter", experimenter);
            }
            U32.f(bb.readInt());
            ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));
            // will only reach here if the discriminator turns up nothing.
            bb.skipBytes(length - (bb.readerIndex() - start));
            return null;
        }
    }
}
