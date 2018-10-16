// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;

abstract class OFInstructionIdVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 4;


    public final static OFInstructionIdVer14.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFInstructionId> {
        @Override
        public OFInstructionId readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            switch(type) {
               case (short) 0x4:
                   bb.readerIndex(start);
                   // discriminator value OFInstructionType.APPLY_ACTIONS=4 for class OFInstructionIdApplyActionsVer14
                   return OFInstructionIdApplyActionsVer14.READER.readFrom(context, bb);
               case (short) 0xffff:
                   bb.readerIndex(start);
                   // discriminator value OFInstructionType.EXPERIMENTER=65535 for class OFInstructionIdExperimenterVer14
                   return OFInstructionIdExperimenterVer14.READER.readFrom(context, bb);
               case (short) 0x5:
                   bb.readerIndex(start);
                   // discriminator value OFInstructionType.CLEAR_ACTIONS=5 for class OFInstructionIdClearActionsVer14
                   return OFInstructionIdClearActionsVer14.READER.readFrom(context, bb);
               case (short) 0x1:
                   bb.readerIndex(start);
                   // discriminator value OFInstructionType.GOTO_TABLE=1 for class OFInstructionIdGotoTableVer14
                   return OFInstructionIdGotoTableVer14.READER.readFrom(context, bb);
               case (short) 0x6:
                   bb.readerIndex(start);
                   // discriminator value OFInstructionType.METER=6 for class OFInstructionIdMeterVer14
                   return OFInstructionIdMeterVer14.READER.readFrom(context, bb);
               case (short) 0x3:
                   bb.readerIndex(start);
                   // discriminator value OFInstructionType.WRITE_ACTIONS=3 for class OFInstructionIdWriteActionsVer14
                   return OFInstructionIdWriteActionsVer14.READER.readFrom(context, bb);
               case (short) 0x2:
                   bb.readerIndex(start);
                   // discriminator value OFInstructionType.WRITE_METADATA=2 for class OFInstructionIdWriteMetadataVer14
                   return OFInstructionIdWriteMetadataVer14.READER.readFrom(context, bb);
               default:
                   context.getUnparsedHandler().unparsedMessage(OFInstructionIdVer14.class, "type", type);
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
