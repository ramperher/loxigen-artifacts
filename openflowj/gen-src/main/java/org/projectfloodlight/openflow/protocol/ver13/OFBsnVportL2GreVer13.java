// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnVportL2GreVer13 implements OFBsnVportL2Gre {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnVportL2GreVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 64;

        private final static Set<OFBsnVportL2GreFlags> DEFAULT_FLAGS = ImmutableSet.<OFBsnVportL2GreFlags>of();
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static OFPort DEFAULT_LOOPBACK_PORT_NO = OFPort.ANY;
        private final static MacAddress DEFAULT_LOCAL_MAC = MacAddress.NONE;
        private final static MacAddress DEFAULT_NH_MAC = MacAddress.NONE;
        private final static IPv4Address DEFAULT_SRC_IP = IPv4Address.NONE;
        private final static IPv4Address DEFAULT_DST_IP = IPv4Address.NONE;
        private final static short DEFAULT_DSCP = (short) 0x0;
        private final static short DEFAULT_TTL = (short) 0x0;
        private final static long DEFAULT_VPN = 0x0L;
        private final static long DEFAULT_RATE_LIMIT = 0x0L;
        private final static String DEFAULT_IF_NAME = "";

    // OF message fields
    private final Set<OFBsnVportL2GreFlags> flags;
    private final OFPort portNo;
    private final OFPort loopbackPortNo;
    private final MacAddress localMac;
    private final MacAddress nhMac;
    private final IPv4Address srcIp;
    private final IPv4Address dstIp;
    private final short dscp;
    private final short ttl;
    private final long vpn;
    private final long rateLimit;
    private final String ifName;
//
    // Immutable default instance
    final static OFBsnVportL2GreVer13 DEFAULT = new OFBsnVportL2GreVer13(
        DEFAULT_FLAGS, DEFAULT_PORT_NO, DEFAULT_LOOPBACK_PORT_NO, DEFAULT_LOCAL_MAC, DEFAULT_NH_MAC, DEFAULT_SRC_IP, DEFAULT_DST_IP, DEFAULT_DSCP, DEFAULT_TTL, DEFAULT_VPN, DEFAULT_RATE_LIMIT, DEFAULT_IF_NAME
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnVportL2GreVer13(Set<OFBsnVportL2GreFlags> flags, OFPort portNo, OFPort loopbackPortNo, MacAddress localMac, MacAddress nhMac, IPv4Address srcIp, IPv4Address dstIp, short dscp, short ttl, long vpn, long rateLimit, String ifName) {
        if(flags == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property flags cannot be null");
        }
        if(portNo == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property portNo cannot be null");
        }
        if(loopbackPortNo == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property loopbackPortNo cannot be null");
        }
        if(localMac == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property localMac cannot be null");
        }
        if(nhMac == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property nhMac cannot be null");
        }
        if(srcIp == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property srcIp cannot be null");
        }
        if(dstIp == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property dstIp cannot be null");
        }
        if(ifName == null) {
            throw new NullPointerException("OFBsnVportL2GreVer13: property ifName cannot be null");
        }
        this.flags = flags;
        this.portNo = portNo;
        this.loopbackPortNo = loopbackPortNo;
        this.localMac = localMac;
        this.nhMac = nhMac;
        this.srcIp = srcIp;
        this.dstIp = dstIp;
        this.dscp = dscp;
        this.ttl = ttl;
        this.vpn = vpn;
        this.rateLimit = rateLimit;
        this.ifName = ifName;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public Set<OFBsnVportL2GreFlags> getFlags() {
        return flags;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPort getLoopbackPortNo() {
        return loopbackPortNo;
    }

    @Override
    public MacAddress getLocalMac() {
        return localMac;
    }

    @Override
    public MacAddress getNhMac() {
        return nhMac;
    }

    @Override
    public IPv4Address getSrcIp() {
        return srcIp;
    }

    @Override
    public IPv4Address getDstIp() {
        return dstIp;
    }

    @Override
    public short getDscp() {
        return dscp;
    }

    @Override
    public short getTtl() {
        return ttl;
    }

    @Override
    public long getVpn() {
        return vpn;
    }

    @Override
    public long getRateLimit() {
        return rateLimit;
    }

    @Override
    public String getIfName() {
        return ifName;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnVportL2Gre.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnVportL2Gre.Builder {
        final OFBsnVportL2GreVer13 parentMessage;

        // OF message fields
        private boolean flagsSet;
        private Set<OFBsnVportL2GreFlags> flags;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean loopbackPortNoSet;
        private OFPort loopbackPortNo;
        private boolean localMacSet;
        private MacAddress localMac;
        private boolean nhMacSet;
        private MacAddress nhMac;
        private boolean srcIpSet;
        private IPv4Address srcIp;
        private boolean dstIpSet;
        private IPv4Address dstIp;
        private boolean dscpSet;
        private short dscp;
        private boolean ttlSet;
        private short ttl;
        private boolean vpnSet;
        private long vpn;
        private boolean rateLimitSet;
        private long rateLimit;
        private boolean ifNameSet;
        private String ifName;

        BuilderWithParent(OFBsnVportL2GreVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public Set<OFBsnVportL2GreFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnVportL2Gre.Builder setFlags(Set<OFBsnVportL2GreFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnVportL2Gre.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public OFPort getLoopbackPortNo() {
        return loopbackPortNo;
    }

    @Override
    public OFBsnVportL2Gre.Builder setLoopbackPortNo(OFPort loopbackPortNo) {
        this.loopbackPortNo = loopbackPortNo;
        this.loopbackPortNoSet = true;
        return this;
    }
    @Override
    public MacAddress getLocalMac() {
        return localMac;
    }

    @Override
    public OFBsnVportL2Gre.Builder setLocalMac(MacAddress localMac) {
        this.localMac = localMac;
        this.localMacSet = true;
        return this;
    }
    @Override
    public MacAddress getNhMac() {
        return nhMac;
    }

    @Override
    public OFBsnVportL2Gre.Builder setNhMac(MacAddress nhMac) {
        this.nhMac = nhMac;
        this.nhMacSet = true;
        return this;
    }
    @Override
    public IPv4Address getSrcIp() {
        return srcIp;
    }

    @Override
    public OFBsnVportL2Gre.Builder setSrcIp(IPv4Address srcIp) {
        this.srcIp = srcIp;
        this.srcIpSet = true;
        return this;
    }
    @Override
    public IPv4Address getDstIp() {
        return dstIp;
    }

    @Override
    public OFBsnVportL2Gre.Builder setDstIp(IPv4Address dstIp) {
        this.dstIp = dstIp;
        this.dstIpSet = true;
        return this;
    }
    @Override
    public short getDscp() {
        return dscp;
    }

    @Override
    public OFBsnVportL2Gre.Builder setDscp(short dscp) {
        this.dscp = dscp;
        this.dscpSet = true;
        return this;
    }
    @Override
    public short getTtl() {
        return ttl;
    }

    @Override
    public OFBsnVportL2Gre.Builder setTtl(short ttl) {
        this.ttl = ttl;
        this.ttlSet = true;
        return this;
    }
    @Override
    public long getVpn() {
        return vpn;
    }

    @Override
    public OFBsnVportL2Gre.Builder setVpn(long vpn) {
        this.vpn = vpn;
        this.vpnSet = true;
        return this;
    }
    @Override
    public long getRateLimit() {
        return rateLimit;
    }

    @Override
    public OFBsnVportL2Gre.Builder setRateLimit(long rateLimit) {
        this.rateLimit = rateLimit;
        this.rateLimitSet = true;
        return this;
    }
    @Override
    public String getIfName() {
        return ifName;
    }

    @Override
    public OFBsnVportL2Gre.Builder setIfName(String ifName) {
        this.ifName = ifName;
        this.ifNameSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnVportL2Gre build() {
                Set<OFBsnVportL2GreFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                OFPort loopbackPortNo = this.loopbackPortNoSet ? this.loopbackPortNo : parentMessage.loopbackPortNo;
                if(loopbackPortNo == null)
                    throw new NullPointerException("Property loopbackPortNo must not be null");
                MacAddress localMac = this.localMacSet ? this.localMac : parentMessage.localMac;
                if(localMac == null)
                    throw new NullPointerException("Property localMac must not be null");
                MacAddress nhMac = this.nhMacSet ? this.nhMac : parentMessage.nhMac;
                if(nhMac == null)
                    throw new NullPointerException("Property nhMac must not be null");
                IPv4Address srcIp = this.srcIpSet ? this.srcIp : parentMessage.srcIp;
                if(srcIp == null)
                    throw new NullPointerException("Property srcIp must not be null");
                IPv4Address dstIp = this.dstIpSet ? this.dstIp : parentMessage.dstIp;
                if(dstIp == null)
                    throw new NullPointerException("Property dstIp must not be null");
                short dscp = this.dscpSet ? this.dscp : parentMessage.dscp;
                short ttl = this.ttlSet ? this.ttl : parentMessage.ttl;
                long vpn = this.vpnSet ? this.vpn : parentMessage.vpn;
                long rateLimit = this.rateLimitSet ? this.rateLimit : parentMessage.rateLimit;
                String ifName = this.ifNameSet ? this.ifName : parentMessage.ifName;
                if(ifName == null)
                    throw new NullPointerException("Property ifName must not be null");

                //
                return new OFBsnVportL2GreVer13(
                    flags,
                    portNo,
                    loopbackPortNo,
                    localMac,
                    nhMac,
                    srcIp,
                    dstIp,
                    dscp,
                    ttl,
                    vpn,
                    rateLimit,
                    ifName
                );
        }

    }

    static class Builder implements OFBsnVportL2Gre.Builder {
        // OF message fields
        private boolean flagsSet;
        private Set<OFBsnVportL2GreFlags> flags;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean loopbackPortNoSet;
        private OFPort loopbackPortNo;
        private boolean localMacSet;
        private MacAddress localMac;
        private boolean nhMacSet;
        private MacAddress nhMac;
        private boolean srcIpSet;
        private IPv4Address srcIp;
        private boolean dstIpSet;
        private IPv4Address dstIp;
        private boolean dscpSet;
        private short dscp;
        private boolean ttlSet;
        private short ttl;
        private boolean vpnSet;
        private long vpn;
        private boolean rateLimitSet;
        private long rateLimit;
        private boolean ifNameSet;
        private String ifName;

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public Set<OFBsnVportL2GreFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnVportL2Gre.Builder setFlags(Set<OFBsnVportL2GreFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnVportL2Gre.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public OFPort getLoopbackPortNo() {
        return loopbackPortNo;
    }

    @Override
    public OFBsnVportL2Gre.Builder setLoopbackPortNo(OFPort loopbackPortNo) {
        this.loopbackPortNo = loopbackPortNo;
        this.loopbackPortNoSet = true;
        return this;
    }
    @Override
    public MacAddress getLocalMac() {
        return localMac;
    }

    @Override
    public OFBsnVportL2Gre.Builder setLocalMac(MacAddress localMac) {
        this.localMac = localMac;
        this.localMacSet = true;
        return this;
    }
    @Override
    public MacAddress getNhMac() {
        return nhMac;
    }

    @Override
    public OFBsnVportL2Gre.Builder setNhMac(MacAddress nhMac) {
        this.nhMac = nhMac;
        this.nhMacSet = true;
        return this;
    }
    @Override
    public IPv4Address getSrcIp() {
        return srcIp;
    }

    @Override
    public OFBsnVportL2Gre.Builder setSrcIp(IPv4Address srcIp) {
        this.srcIp = srcIp;
        this.srcIpSet = true;
        return this;
    }
    @Override
    public IPv4Address getDstIp() {
        return dstIp;
    }

    @Override
    public OFBsnVportL2Gre.Builder setDstIp(IPv4Address dstIp) {
        this.dstIp = dstIp;
        this.dstIpSet = true;
        return this;
    }
    @Override
    public short getDscp() {
        return dscp;
    }

    @Override
    public OFBsnVportL2Gre.Builder setDscp(short dscp) {
        this.dscp = dscp;
        this.dscpSet = true;
        return this;
    }
    @Override
    public short getTtl() {
        return ttl;
    }

    @Override
    public OFBsnVportL2Gre.Builder setTtl(short ttl) {
        this.ttl = ttl;
        this.ttlSet = true;
        return this;
    }
    @Override
    public long getVpn() {
        return vpn;
    }

    @Override
    public OFBsnVportL2Gre.Builder setVpn(long vpn) {
        this.vpn = vpn;
        this.vpnSet = true;
        return this;
    }
    @Override
    public long getRateLimit() {
        return rateLimit;
    }

    @Override
    public OFBsnVportL2Gre.Builder setRateLimit(long rateLimit) {
        this.rateLimit = rateLimit;
        this.rateLimitSet = true;
        return this;
    }
    @Override
    public String getIfName() {
        return ifName;
    }

    @Override
    public OFBsnVportL2Gre.Builder setIfName(String ifName) {
        this.ifName = ifName;
        this.ifNameSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnVportL2Gre build() {
            Set<OFBsnVportL2GreFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            OFPort loopbackPortNo = this.loopbackPortNoSet ? this.loopbackPortNo : DEFAULT_LOOPBACK_PORT_NO;
            if(loopbackPortNo == null)
                throw new NullPointerException("Property loopbackPortNo must not be null");
            MacAddress localMac = this.localMacSet ? this.localMac : DEFAULT_LOCAL_MAC;
            if(localMac == null)
                throw new NullPointerException("Property localMac must not be null");
            MacAddress nhMac = this.nhMacSet ? this.nhMac : DEFAULT_NH_MAC;
            if(nhMac == null)
                throw new NullPointerException("Property nhMac must not be null");
            IPv4Address srcIp = this.srcIpSet ? this.srcIp : DEFAULT_SRC_IP;
            if(srcIp == null)
                throw new NullPointerException("Property srcIp must not be null");
            IPv4Address dstIp = this.dstIpSet ? this.dstIp : DEFAULT_DST_IP;
            if(dstIp == null)
                throw new NullPointerException("Property dstIp must not be null");
            short dscp = this.dscpSet ? this.dscp : DEFAULT_DSCP;
            short ttl = this.ttlSet ? this.ttl : DEFAULT_TTL;
            long vpn = this.vpnSet ? this.vpn : DEFAULT_VPN;
            long rateLimit = this.rateLimitSet ? this.rateLimit : DEFAULT_RATE_LIMIT;
            String ifName = this.ifNameSet ? this.ifName : DEFAULT_IF_NAME;
            if(ifName == null)
                throw new NullPointerException("Property ifName must not be null");


            return new OFBsnVportL2GreVer13(
                    flags,
                    portNo,
                    loopbackPortNo,
                    localMac,
                    nhMac,
                    srcIp,
                    dstIp,
                    dscp,
                    ttl,
                    vpn,
                    rateLimit,
                    ifName
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnVportL2Gre> {
        @Override
        public OFBsnVportL2Gre readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=0x1(0x1), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 64)
                throw new OFParseError("Wrong length: Expected=64(64), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            Set<OFBsnVportL2GreFlags> flags = OFBsnVportL2GreFlagsSerializerVer13.readFrom(bb);
            OFPort portNo = OFPort.read4Bytes(bb);
            OFPort loopbackPortNo = OFPort.read4Bytes(bb);
            MacAddress localMac = MacAddress.read6Bytes(bb);
            MacAddress nhMac = MacAddress.read6Bytes(bb);
            IPv4Address srcIp = IPv4Address.read4Bytes(bb);
            IPv4Address dstIp = IPv4Address.read4Bytes(bb);
            short dscp = U8.f(bb.readByte());
            short ttl = U8.f(bb.readByte());
            // pad: 2 bytes
            bb.skipBytes(2);
            long vpn = U32.f(bb.readInt());
            long rateLimit = U32.f(bb.readInt());
            String ifName = ChannelUtils.readFixedLengthString(bb, 16);

            OFBsnVportL2GreVer13 bsnVportL2GreVer13 = new OFBsnVportL2GreVer13(
                    flags,
                      portNo,
                      loopbackPortNo,
                      localMac,
                      nhMac,
                      srcIp,
                      dstIp,
                      dscp,
                      ttl,
                      vpn,
                      rateLimit,
                      ifName
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnVportL2GreVer13);
            return bsnVportL2GreVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnVportL2GreVer13Funnel FUNNEL = new OFBsnVportL2GreVer13Funnel();
    static class OFBsnVportL2GreVer13Funnel implements Funnel<OFBsnVportL2GreVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnVportL2GreVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x1
            sink.putShort((short) 0x1);
            // fixed value property length = 64
            sink.putShort((short) 0x40);
            OFBsnVportL2GreFlagsSerializerVer13.putTo(message.flags, sink);
            message.portNo.putTo(sink);
            message.loopbackPortNo.putTo(sink);
            message.localMac.putTo(sink);
            message.nhMac.putTo(sink);
            message.srcIp.putTo(sink);
            message.dstIp.putTo(sink);
            sink.putShort(message.dscp);
            sink.putShort(message.ttl);
            // skip pad (2 bytes)
            sink.putLong(message.vpn);
            sink.putLong(message.rateLimit);
            sink.putUnencodedChars(message.ifName);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnVportL2GreVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnVportL2GreVer13 message) {
            // fixed value property type = 0x1
            bb.writeShort((short) 0x1);
            // fixed value property length = 64
            bb.writeShort((short) 0x40);
            OFBsnVportL2GreFlagsSerializerVer13.writeTo(bb, message.flags);
            message.portNo.write4Bytes(bb);
            message.loopbackPortNo.write4Bytes(bb);
            message.localMac.write6Bytes(bb);
            message.nhMac.write6Bytes(bb);
            message.srcIp.write4Bytes(bb);
            message.dstIp.write4Bytes(bb);
            bb.writeByte(U8.t(message.dscp));
            bb.writeByte(U8.t(message.ttl));
            // pad: 2 bytes
            bb.writeZero(2);
            bb.writeInt(U32.t(message.vpn));
            bb.writeInt(U32.t(message.rateLimit));
            ChannelUtils.writeFixedLengthString(bb, message.ifName, 16);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnVportL2GreVer13(");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("loopbackPortNo=").append(loopbackPortNo);
        b.append(", ");
        b.append("localMac=").append(localMac);
        b.append(", ");
        b.append("nhMac=").append(nhMac);
        b.append(", ");
        b.append("srcIp=").append(srcIp);
        b.append(", ");
        b.append("dstIp=").append(dstIp);
        b.append(", ");
        b.append("dscp=").append(dscp);
        b.append(", ");
        b.append("ttl=").append(ttl);
        b.append(", ");
        b.append("vpn=").append(vpn);
        b.append(", ");
        b.append("rateLimit=").append(rateLimit);
        b.append(", ");
        b.append("ifName=").append(ifName);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnVportL2GreVer13 other = (OFBsnVportL2GreVer13) obj;

        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (loopbackPortNo == null) {
            if (other.loopbackPortNo != null)
                return false;
        } else if (!loopbackPortNo.equals(other.loopbackPortNo))
            return false;
        if (localMac == null) {
            if (other.localMac != null)
                return false;
        } else if (!localMac.equals(other.localMac))
            return false;
        if (nhMac == null) {
            if (other.nhMac != null)
                return false;
        } else if (!nhMac.equals(other.nhMac))
            return false;
        if (srcIp == null) {
            if (other.srcIp != null)
                return false;
        } else if (!srcIp.equals(other.srcIp))
            return false;
        if (dstIp == null) {
            if (other.dstIp != null)
                return false;
        } else if (!dstIp.equals(other.dstIp))
            return false;
        if( dscp != other.dscp)
            return false;
        if( ttl != other.ttl)
            return false;
        if( vpn != other.vpn)
            return false;
        if( rateLimit != other.rateLimit)
            return false;
        if (ifName == null) {
            if (other.ifName != null)
                return false;
        } else if (!ifName.equals(other.ifName))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + ((loopbackPortNo == null) ? 0 : loopbackPortNo.hashCode());
        result = prime * result + ((localMac == null) ? 0 : localMac.hashCode());
        result = prime * result + ((nhMac == null) ? 0 : nhMac.hashCode());
        result = prime * result + ((srcIp == null) ? 0 : srcIp.hashCode());
        result = prime * result + ((dstIp == null) ? 0 : dstIp.hashCode());
        result = prime * result + dscp;
        result = prime * result + ttl;
        result = prime *  (int) (vpn ^ (vpn >>> 32));
        result = prime *  (int) (rateLimit ^ (rateLimit >>> 32));
        result = prime * result + ((ifName == null) ? 0 : ifName.hashCode());
        return result;
    }

}
