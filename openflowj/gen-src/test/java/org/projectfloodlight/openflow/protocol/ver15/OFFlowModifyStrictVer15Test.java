// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import java.util.List;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;


@RunWith(Parameterized.class)
public class OFFlowModifyStrictVer15Test {
    OFFactory factory;

    final static byte[] FLOW_MODIFY_STRICT_SERIALIZED =
        new byte[] { 0x6, 0xe, 0x0, (byte) 0x80, 0x12, 0x34, 0x56, 0x78, (byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, 0x76, 0x54, 0x32, 0x10, (byte) 0xff, 0x0, (byte) 0xff, 0x0, (byte) 0xff, 0x0, (byte) 0xff, 0x0, 0x3, 0x2, 0x0, 0x5, 0x0, 0xa, 0x17, 0x70, 0x0, 0x0, 0x0, 0x32, 0x0, 0x0, 0x0, 0x6, 0x0, 0x0, 0x0, 0x8, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x3f, (byte) 0x80, 0x0, 0x1, 0x8, 0x0, 0x0, 0x0, 0x4, 0x0, 0x0, 0x0, 0x5, (byte) 0x80, 0x0, 0xa, 0x2, (byte) 0x86, (byte) 0xdd, (byte) 0x80, 0x0, 0x14, 0x1, 0x6, (byte) 0x80, 0x0, 0x35, 0x20, 0x1c, (byte) 0xca, (byte) 0xfe, 0x1c, (byte) 0xb1, 0x10, 0x1c, 0x0, 0x0, 0x28, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xf0, (byte) 0xff, (byte) 0xff, 0x1c, 0x2c, 0x3c, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x8, 0x4, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x8, 0x7, 0x0, 0x0, 0x0 };


    private final static int[] PREFIX_BYTES = { 0, 1, 4, 255, 65335 };
    private final static byte[] EMPTY_BYTES = new byte[65535];

    private final OFMessageReader<?> messageReader;

    @Parameters(name="{index}.MessageReader={0}")
    public static Iterable<Object> data() {
        return ImmutableList.<Object>of(
                OFFlowModifyStrictVer15.READER, OFFlowModVer15.READER, OFMessageVer15.READER
        );
    }

    public OFFlowModifyStrictVer15Test(OFMessageReader<?> messageReader) {
        this.messageReader = messageReader;
    }

    @Before
    public void setup() {
        factory = OFFactoryVer15.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFFlowModifyStrict.Builder builder = factory.buildFlowModifyStrict();
        builder
        .setXid(0x12345678)
        .setCookie(U64.parseHex("FEDCBA9876543210"))
        .setCookieMask(U64.parseHex("FF00FF00FF00FF00"))
        .setTableId(TableId.of(3))
        .setIdleTimeout(5)
        .setHardTimeout(10)
        .setPriority(6000)
        .setBufferId(OFBufferId.of(50))
        .setOutPort(OFPort.of(6))
        .setOutGroup(OFGroup.of(8))
        .setFlags(ImmutableSet.<OFFlowModFlags>of())
        .setMatch(
            factory.buildMatch()
                .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
                .setExact(MatchField.ETH_TYPE, EthType.IPv6)
                .setExact(MatchField.IP_PROTO, IpProtocol.TCP)
                .setMasked(MatchField.IPV6_SRC,
                       IPv6Address.of(0x1CCAFE1CB1101C00l, 0x0028000000000000l),
                       IPv6Address.of(0xFFFFFFFFFFF0FFFFl, 0x1C2C3C0000000000l))
            .build()
        )
        .setInstructions(
            ImmutableList.<OFInstruction>of(
                factory.instructions().gotoTable(TableId.of(4)),
                factory.instructions().gotoTable(TableId.of(7))
            )
        );;
        OFFlowModifyStrict flowModifyStrict = builder.build();
        ByteBuf bb = Unpooled.buffer();
        flowModifyStrict.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(FLOW_MODIFY_STRICT_SERIALIZED));
    }


    @Test
    public void testRead() throws Exception {
        ByteBuf input = Unpooled.copiedBuffer(FLOW_MODIFY_STRICT_SERIALIZED);

        Object flowModifyStrictRead = messageReader.readFrom(input);
        assertThat(flowModifyStrictRead, CoreMatchers.instanceOf(OFFlowModifyStrictVer15.class));
        OFFlowModifyStrict.Builder builder = factory.buildFlowModifyStrict();
        builder
        .setXid(0x12345678)
        .setCookie(U64.parseHex("FEDCBA9876543210"))
        .setCookieMask(U64.parseHex("FF00FF00FF00FF00"))
        .setTableId(TableId.of(3))
        .setIdleTimeout(5)
        .setHardTimeout(10)
        .setPriority(6000)
        .setBufferId(OFBufferId.of(50))
        .setOutPort(OFPort.of(6))
        .setOutGroup(OFGroup.of(8))
        .setFlags(ImmutableSet.<OFFlowModFlags>of())
        .setMatch(
            factory.buildMatch()
                .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
                .setExact(MatchField.ETH_TYPE, EthType.IPv6)
                .setExact(MatchField.IP_PROTO, IpProtocol.TCP)
                .setMasked(MatchField.IPV6_SRC,
                       IPv6Address.of(0x1CCAFE1CB1101C00l, 0x0028000000000000l),
                       IPv6Address.of(0xFFFFFFFFFFF0FFFFl, 0x1C2C3C0000000000l))
            .build()
        )
        .setInstructions(
            ImmutableList.<OFInstruction>of(
                factory.instructions().gotoTable(TableId.of(4)),
                factory.instructions().gotoTable(TableId.of(7))
            )
        );;
        OFFlowModifyStrict flowModifyStrictBuilt = builder.build();

        assertEquals(FLOW_MODIFY_STRICT_SERIALIZED.length, input.readerIndex());

        assertEquals(flowModifyStrictBuilt, flowModifyStrictRead);
        // FIXME: No java stanza in test_data for this class. Add to enable validation of read message
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
       ByteBuf msgBuffer = Unpooled.copiedBuffer(FLOW_MODIFY_STRICT_SERIALIZED);
       for (int prefixLength: PREFIX_BYTES) {
           ByteBuf prefixBuffer = Unpooled.wrappedBuffer(EMPTY_BYTES).slice(0, prefixLength);
           ByteBuf wholeBuffer = Unpooled.wrappedBuffer(prefixBuffer, msgBuffer);
           for (int partialLength = 0; partialLength < FLOW_MODIFY_STRICT_SERIALIZED.length - 1; partialLength++) {
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
       ByteBuf input = Unpooled.copiedBuffer(FLOW_MODIFY_STRICT_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFFlowModifyStrict flowModifyStrict = (OFFlowModifyStrict) messageReader.readFrom(input);
       assertEquals(FLOW_MODIFY_STRICT_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       flowModifyStrict.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(FLOW_MODIFY_STRICT_SERIALIZED));
   }

}
