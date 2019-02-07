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

abstract class OFHeaderTypeVer15 {
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 4;


    public final static OFHeaderTypeVer15.Reader READER = new Reader();

    static class Reader extends AbstractOFMessageReader<OFHeaderType> {
        @Override
        public OFHeaderType readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            OFHeaderTypeNamespace namespace = OFHeaderTypeNamespaceSerializerVer15.readFrom(bb);
            switch(namespace) {
               default:
                   context.getUnparsedHandler().unparsedMessage(OFHeaderTypeVer15.class, "namespace", namespace);
            }
            U16.f(bb.readShort());
            // will only reach here if the discriminator turns up nothing.
                   // OFHeaderTypeVer15 is variable length, and length field not read before discriminator.
                   // Cannot carry on after parse error
            throw new OFParseError("Could not parse message version and length not known, so cannot be skipped");
        }
    }
}
