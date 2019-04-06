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
import java.util.List;

abstract class OFFlowModVer10 {
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 72;


    public final static OFFlowModVer10.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFFlowMod> {
        @Override
        public OFFlowMod readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 14
            byte type = bb.readByte();
            if(type != (byte) 0xe)
                throw new OFParseError("Wrong type: Expected=OFType.FLOW_MOD(14), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if( ( bb.readableBytes() + (bb.readerIndex() - start)) < length ) {
                // message not yet fully read
                bb.readerIndex(start);
                return null;
            }
            U32.f(bb.readInt());
            ChannelUtilsVer10.readOFMatch(context, bb);
            U64.ofRaw(bb.readLong());
            short command = bb.readShort();
            switch(command) {
               case (short) 0x0:
                   bb.readerIndex(start);
                   // discriminator value OFFlowModCommand.ADD=0 for class OFFlowAddVer10
                   return OFFlowAddVer10.READER.readFrom(context, bb);
               case (short) 0x3:
                   bb.readerIndex(start);
                   // discriminator value OFFlowModCommand.DELETE=3 for class OFFlowDeleteVer10
                   return OFFlowDeleteVer10.READER.readFrom(context, bb);
               case (short) 0x4:
                   bb.readerIndex(start);
                   // discriminator value OFFlowModCommand.DELETE_STRICT=4 for class OFFlowDeleteStrictVer10
                   return OFFlowDeleteStrictVer10.READER.readFrom(context, bb);
               case (short) 0x1:
                   bb.readerIndex(start);
                   // discriminator value OFFlowModCommand.MODIFY=1 for class OFFlowModifyVer10
                   return OFFlowModifyVer10.READER.readFrom(context, bb);
               case (short) 0x2:
                   bb.readerIndex(start);
                   // discriminator value OFFlowModCommand.MODIFY_STRICT=2 for class OFFlowModifyStrictVer10
                   return OFFlowModifyStrictVer10.READER.readFrom(context, bb);
               default:
                   context.getUnparsedHandler().unparsedMessage(OFFlowModVer10.class, "command", command);
            }
            U16.f(bb.readShort());
            U16.f(bb.readShort());
            U16.f(bb.readShort());
            OFBufferId.of(bb.readInt());
            OFPort.read2Bytes(bb);
            OFFlowModFlagsSerializerVer10.readFrom(bb);
            ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFActionVer10.READER);
            // will only reach here if the discriminator turns up nothing.
            bb.skipBytes(length - (bb.readerIndex() - start));
            return null;
        }
    }
}
