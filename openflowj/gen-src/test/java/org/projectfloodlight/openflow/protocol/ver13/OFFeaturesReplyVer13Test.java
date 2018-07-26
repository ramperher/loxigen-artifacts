// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import java.util.List;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;


@RunWith(Parameterized.class)
public class OFFeaturesReplyVer13Test {
    OFFactory factory;

    final static byte[] FEATURES_REPLY_SERIALIZED =
        new byte[] { 0x4, 0x6, 0x0, 0x20, 0x12, 0x34, 0x56, 0x78, (byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, 0x76, 0x54, 0x32, 0x10, 0x0, 0x0, 0x0, 0x40, (byte) 0xc8, 0x5, 0x0, 0x0, 0x0, 0x0, 0x1, 0x1, 0x0, 0x0, 0x0, 0x0 };


    private final static int[] PREFIX_BYTES = { 0, 1, 4, 255, 65335 };
    private final static byte[] EMPTY_BYTES = new byte[65535];

    private final OFMessageReader<?> messageReader;

    @Parameters(name="{index}.MessageReader={0}")
    public static Iterable<Object> data() {
        return ImmutableList.<Object>of(
                OFFeaturesReplyVer13.READER, OFMessageVer13.READER
        );
    }

    public OFFeaturesReplyVer13Test(OFMessageReader<?> messageReader) {
        this.messageReader = messageReader;
    }

    @Before
    public void setup() {
        factory = OFFactoryVer13.INSTANCE;
    }

   // FIXME: No java stanza in test_data for this class. Add to support write test

    @Test
    public void testRead() throws Exception {
        ByteBuf input = Unpooled.copiedBuffer(FEATURES_REPLY_SERIALIZED);

        Object featuresReplyRead = messageReader.readFrom(input);
        assertThat(featuresReplyRead, CoreMatchers.instanceOf(OFFeaturesReplyVer13.class));
   }

    /**
     * Validates Reader handling of partial messages in the buffer.
     *
     * Ensures that readers deal with partially available messages, and that buffers
     * are returned unmodified. Also checks compatibility when the data is not at the start of
     * the buffer (readerIndex=0), but somewhere else (with the readerIndex appropriately set).
     */
   @Test
   public void testPartialRead() throws Exception {
       ByteBuf msgBuffer = Unpooled.copiedBuffer(FEATURES_REPLY_SERIALIZED);
       for (int prefixLength: PREFIX_BYTES) {
           ByteBuf prefixBuffer = Unpooled.wrappedBuffer(EMPTY_BYTES).slice(0, prefixLength);
           ByteBuf wholeBuffer = Unpooled.wrappedBuffer(prefixBuffer, msgBuffer);
           for (int partialLength = 0; partialLength < FEATURES_REPLY_SERIALIZED.length - 1; partialLength++) {
               int length = prefixLength + partialLength;
               ByteBuf slice = wholeBuffer.slice(0, length);
               slice.readerIndex(prefixLength);

               Object read = messageReader.readFrom(slice);

               assertNull("partial message should not be read", read);
               assertEquals("Reader index should be back at the start", prefixLength, slice.readerIndex());
           }

       }
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(FEATURES_REPLY_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFFeaturesReply featuresReply = (OFFeaturesReply) messageReader.readFrom(input);
       assertEquals(FEATURES_REPLY_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       featuresReply.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(FEATURES_REPLY_SERIALIZED));
   }

}
