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

abstract class OFActionBsnVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 16;


    public final static OFActionBsnVer13.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFActionBsn> {
        @Override
        public OFActionBsn readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFActionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if( ( bb.readableBytes() + (bb.readerIndex() - start)) < length ) {
                // message not yet fully read
                bb.readerIndex(start);
                return null;
            }
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            int subtype = bb.readInt();
            switch(subtype) {
               case 0x4:
                   bb.readerIndex(start);
                   // discriminator value 0x4L=0x4L for class OFActionBsnChecksumVer13
                   return OFActionBsnChecksumVer13.READER.readFrom(context, bb);
               case 0x1:
                   bb.readerIndex(start);
                   // discriminator value 0x1L=0x1L for class OFActionBsnMirrorVer13
                   return OFActionBsnMirrorVer13.READER.readFrom(context, bb);
               case 0x2:
                   bb.readerIndex(start);
                   // discriminator value 0x2L=0x2L for class OFActionBsnSetTunnelDstVer13
                   return OFActionBsnSetTunnelDstVer13.READER.readFrom(context, bb);
               case 0x5:
                   bb.readerIndex(start);
                   // discriminator value 0x5L=0x5L for class OFActionBsnGentableVer13
                   return OFActionBsnGentableVer13.READER.readFrom(context, bb);
               default:
                   context.getUnparsedHandler().unparsedMessage(OFActionBsnVer13.class, "subtype", subtype);
            }
            // pad: 4 bytes
            bb.skipBytes(4);
            // will only reach here if the discriminator turns up nothing.
            bb.skipBytes(length - (bb.readerIndex() - start));
            return null;
        }
    }
}
