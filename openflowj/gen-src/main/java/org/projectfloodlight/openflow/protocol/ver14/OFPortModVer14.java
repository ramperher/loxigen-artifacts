// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFPortModVer14 implements OFPortMod {
    private static final Logger logger = LoggerFactory.getLogger(OFPortModVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 32;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static MacAddress DEFAULT_HW_ADDR = MacAddress.NONE;
        private final static Set<OFPortConfig> DEFAULT_CONFIG = ImmutableSet.<OFPortConfig>of();
        private final static Set<OFPortConfig> DEFAULT_MASK = ImmutableSet.<OFPortConfig>of();
        private final static List<OFPortModProp> DEFAULT_PROPERTIES = ImmutableList.<OFPortModProp>of();

    // OF message fields
    private final long xid;
    private final OFPort portNo;
    private final MacAddress hwAddr;
    private final Set<OFPortConfig> config;
    private final Set<OFPortConfig> mask;
    private final List<OFPortModProp> properties;
//
    // Immutable default instance
    final static OFPortModVer14 DEFAULT = new OFPortModVer14(
        DEFAULT_XID, DEFAULT_PORT_NO, DEFAULT_HW_ADDR, DEFAULT_CONFIG, DEFAULT_MASK, DEFAULT_PROPERTIES
    );

    // package private constructor - used by readers, builders, and factory
    OFPortModVer14(long xid, OFPort portNo, MacAddress hwAddr, Set<OFPortConfig> config, Set<OFPortConfig> mask, List<OFPortModProp> properties) {
        if(portNo == null) {
            throw new NullPointerException("OFPortModVer14: property portNo cannot be null");
        }
        if(hwAddr == null) {
            throw new NullPointerException("OFPortModVer14: property hwAddr cannot be null");
        }
        if(config == null) {
            throw new NullPointerException("OFPortModVer14: property config cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFPortModVer14: property mask cannot be null");
        }
        if(properties == null) {
            throw new NullPointerException("OFPortModVer14: property properties cannot be null");
        }
        this.xid = xid;
        this.portNo = portNo;
        this.hwAddr = hwAddr;
        this.config = config;
        this.mask = mask;
        this.properties = properties;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public Set<OFPortConfig> getMask() {
        return mask;
    }

    @Override
    public long getAdvertise()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property advertise not supported in version 1.4");
    }

    @Override
    public List<OFPortModProp> getProperties() {
        return properties;
    }



    public OFPortMod.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortMod.Builder {
        final OFPortModVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean configSet;
        private Set<OFPortConfig> config;
        private boolean maskSet;
        private Set<OFPortConfig> mask;
        private boolean propertiesSet;
        private List<OFPortModProp> properties;

        BuilderWithParent(OFPortModVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortMod.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortMod.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public OFPortMod.Builder setConfig(Set<OFPortConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getMask() {
        return mask;
    }

    @Override
    public OFPortMod.Builder setMask(Set<OFPortConfig> mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public long getAdvertise()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property advertise not supported in version 1.4");
    }

    @Override
    public OFPortMod.Builder setAdvertise(long advertise) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property advertise not supported in version 1.4");
    }
    @Override
    public List<OFPortModProp> getProperties() {
        return properties;
    }

    @Override
    public OFPortMod.Builder setProperties(List<OFPortModProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }


        @Override
        public OFPortMod build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : parentMessage.hwAddr;
                if(hwAddr == null)
                    throw new NullPointerException("Property hwAddr must not be null");
                Set<OFPortConfig> config = this.configSet ? this.config : parentMessage.config;
                if(config == null)
                    throw new NullPointerException("Property config must not be null");
                Set<OFPortConfig> mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");
                List<OFPortModProp> properties = this.propertiesSet ? this.properties : parentMessage.properties;
                if(properties == null)
                    throw new NullPointerException("Property properties must not be null");

                //
                return new OFPortModVer14(
                    xid,
                    portNo,
                    hwAddr,
                    config,
                    mask,
                    properties
                );
        }

    }

    static class Builder implements OFPortMod.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean configSet;
        private Set<OFPortConfig> config;
        private boolean maskSet;
        private Set<OFPortConfig> mask;
        private boolean propertiesSet;
        private List<OFPortModProp> properties;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortMod.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortMod.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public OFPortMod.Builder setConfig(Set<OFPortConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getMask() {
        return mask;
    }

    @Override
    public OFPortMod.Builder setMask(Set<OFPortConfig> mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public long getAdvertise()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property advertise not supported in version 1.4");
    }

    @Override
    public OFPortMod.Builder setAdvertise(long advertise) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property advertise not supported in version 1.4");
    }
    @Override
    public List<OFPortModProp> getProperties() {
        return properties;
    }

    @Override
    public OFPortMod.Builder setProperties(List<OFPortModProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
//
        @Override
        public OFPortMod build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : DEFAULT_HW_ADDR;
            if(hwAddr == null)
                throw new NullPointerException("Property hwAddr must not be null");
            Set<OFPortConfig> config = this.configSet ? this.config : DEFAULT_CONFIG;
            if(config == null)
                throw new NullPointerException("Property config must not be null");
            Set<OFPortConfig> mask = this.maskSet ? this.mask : DEFAULT_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");
            List<OFPortModProp> properties = this.propertiesSet ? this.properties : DEFAULT_PROPERTIES;
            if(properties == null)
                throw new NullPointerException("Property properties must not be null");


            return new OFPortModVer14(
                    xid,
                    portNo,
                    hwAddr,
                    config,
                    mask,
                    properties
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFPortMod> {
        @Override
        public OFPortMod readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 16
            byte type = bb.readByte();
            if(type != (byte) 0x10)
                throw new OFParseError("Wrong type: Expected=OFType.PORT_MOD(16), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            OFPort portNo = OFPort.read4Bytes(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            MacAddress hwAddr = MacAddress.read6Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);
            Set<OFPortConfig> config = OFPortConfigSerializerVer14.readFrom(bb);
            Set<OFPortConfig> mask = OFPortConfigSerializerVer14.readFrom(bb);
            List<OFPortModProp> properties = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFPortModPropVer14.READER);

            OFPortModVer14 portModVer14 = new OFPortModVer14(
                    xid,
                      portNo,
                      hwAddr,
                      config,
                      mask,
                      properties
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portModVer14);
            return portModVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortModVer14Funnel FUNNEL = new OFPortModVer14Funnel();
    static class OFPortModVer14Funnel implements Funnel<OFPortModVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortModVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 16
            sink.putByte((byte) 0x10);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            message.portNo.putTo(sink);
            // skip pad (4 bytes)
            message.hwAddr.putTo(sink);
            // skip pad (2 bytes)
            OFPortConfigSerializerVer14.putTo(message.config, sink);
            OFPortConfigSerializerVer14.putTo(message.mask, sink);
            FunnelUtils.putList(message.properties, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortModVer14> {
        @Override
        public void write(ByteBuf bb, OFPortModVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 16
            bb.writeByte((byte) 0x10);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            message.portNo.write4Bytes(bb);
            // pad: 4 bytes
            bb.writeZero(4);
            message.hwAddr.write6Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);
            OFPortConfigSerializerVer14.writeTo(bb, message.config);
            OFPortConfigSerializerVer14.writeTo(bb, message.mask);
            ChannelUtils.writeList(bb, message.properties);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortModVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("hwAddr=").append(hwAddr);
        b.append(", ");
        b.append("config=").append(config);
        b.append(", ");
        b.append("mask=").append(mask);
        b.append(", ");
        b.append("properties=").append(properties);
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
        OFPortModVer14 other = (OFPortModVer14) obj;

        if( xid != other.xid)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (hwAddr == null) {
            if (other.hwAddr != null)
                return false;
        } else if (!hwAddr.equals(other.hwAddr))
            return false;
        if (config == null) {
            if (other.config != null)
                return false;
        } else if (!config.equals(other.config))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        if (properties == null) {
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
            return false;
        return true;
    }

    @Override
    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFPortModVer14 other = (OFPortModVer14) obj;

        // ignore XID
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (hwAddr == null) {
            if (other.hwAddr != null)
                return false;
        } else if (!hwAddr.equals(other.hwAddr))
            return false;
        if (config == null) {
            if (other.config != null)
                return false;
        } else if (!config.equals(other.config))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        if (properties == null) {
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + ((hwAddr == null) ? 0 : hwAddr.hashCode());
        result = prime * result + ((config == null) ? 0 : config.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + ((hwAddr == null) ? 0 : hwAddr.hashCode());
        result = prime * result + ((config == null) ? 0 : config.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

}
