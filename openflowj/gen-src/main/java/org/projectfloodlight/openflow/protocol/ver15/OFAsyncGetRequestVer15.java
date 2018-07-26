// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFAsyncGetRequestVer15 implements OFAsyncGetRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFAsyncGetRequestVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 8;

        private final static long DEFAULT_XID = 0x0L;
        private final static List<OFAsyncConfigProp> DEFAULT_PROPERTIES = ImmutableList.<OFAsyncConfigProp>of();

    // OF message fields
    private final long xid;
    private final List<OFAsyncConfigProp> properties;
//
    // Immutable default instance
    final static OFAsyncGetRequestVer15 DEFAULT = new OFAsyncGetRequestVer15(
        DEFAULT_XID, DEFAULT_PROPERTIES
    );

    // package private constructor - used by readers, builders, and factory
    OFAsyncGetRequestVer15(long xid, List<OFAsyncConfigProp> properties) {
        if(properties == null) {
            throw new NullPointerException("OFAsyncGetRequestVer15: property properties cannot be null");
        }
        this.xid = xid;
        this.properties = properties;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.GET_ASYNC_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getPacketInMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property packetInMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public long getPacketInMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property packetInMaskSlave not supported in version 1.5");
    }

    @Override
    public long getPortStatusMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property portStatusMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public long getPortStatusMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property portStatusMaskSlave not supported in version 1.5");
    }

    @Override
    public long getFlowRemovedMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flowRemovedMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public long getFlowRemovedMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flowRemovedMaskSlave not supported in version 1.5");
    }

    @Override
    public List<OFAsyncConfigProp> getProperties() {
        return properties;
    }



    public OFAsyncGetRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFAsyncGetRequest.Builder {
        final OFAsyncGetRequestVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean propertiesSet;
        private List<OFAsyncConfigProp> properties;

        BuilderWithParent(OFAsyncGetRequestVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.GET_ASYNC_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAsyncGetRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getPacketInMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property packetInMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskEqualMaster(long packetInMaskEqualMaster) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property packetInMaskEqualMaster not supported in version 1.5");
    }
    @Override
    public long getPacketInMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property packetInMaskSlave not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskSlave(long packetInMaskSlave) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property packetInMaskSlave not supported in version 1.5");
    }
    @Override
    public long getPortStatusMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property portStatusMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskEqualMaster(long portStatusMaskEqualMaster) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property portStatusMaskEqualMaster not supported in version 1.5");
    }
    @Override
    public long getPortStatusMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property portStatusMaskSlave not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskSlave(long portStatusMaskSlave) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property portStatusMaskSlave not supported in version 1.5");
    }
    @Override
    public long getFlowRemovedMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flowRemovedMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskEqualMaster(long flowRemovedMaskEqualMaster) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property flowRemovedMaskEqualMaster not supported in version 1.5");
    }
    @Override
    public long getFlowRemovedMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flowRemovedMaskSlave not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskSlave(long flowRemovedMaskSlave) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property flowRemovedMaskSlave not supported in version 1.5");
    }
    @Override
    public List<OFAsyncConfigProp> getProperties() {
        return properties;
    }

    @Override
    public OFAsyncGetRequest.Builder setProperties(List<OFAsyncConfigProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }


        @Override
        public OFAsyncGetRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                List<OFAsyncConfigProp> properties = this.propertiesSet ? this.properties : parentMessage.properties;
                if(properties == null)
                    throw new NullPointerException("Property properties must not be null");

                //
                return new OFAsyncGetRequestVer15(
                    xid,
                    properties
                );
        }

    }

    static class Builder implements OFAsyncGetRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean propertiesSet;
        private List<OFAsyncConfigProp> properties;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.GET_ASYNC_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAsyncGetRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getPacketInMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property packetInMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskEqualMaster(long packetInMaskEqualMaster) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property packetInMaskEqualMaster not supported in version 1.5");
    }
    @Override
    public long getPacketInMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property packetInMaskSlave not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskSlave(long packetInMaskSlave) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property packetInMaskSlave not supported in version 1.5");
    }
    @Override
    public long getPortStatusMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property portStatusMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskEqualMaster(long portStatusMaskEqualMaster) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property portStatusMaskEqualMaster not supported in version 1.5");
    }
    @Override
    public long getPortStatusMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property portStatusMaskSlave not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskSlave(long portStatusMaskSlave) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property portStatusMaskSlave not supported in version 1.5");
    }
    @Override
    public long getFlowRemovedMaskEqualMaster()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flowRemovedMaskEqualMaster not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskEqualMaster(long flowRemovedMaskEqualMaster) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property flowRemovedMaskEqualMaster not supported in version 1.5");
    }
    @Override
    public long getFlowRemovedMaskSlave()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flowRemovedMaskSlave not supported in version 1.5");
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskSlave(long flowRemovedMaskSlave) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property flowRemovedMaskSlave not supported in version 1.5");
    }
    @Override
    public List<OFAsyncConfigProp> getProperties() {
        return properties;
    }

    @Override
    public OFAsyncGetRequest.Builder setProperties(List<OFAsyncConfigProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
//
        @Override
        public OFAsyncGetRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            List<OFAsyncConfigProp> properties = this.propertiesSet ? this.properties : DEFAULT_PROPERTIES;
            if(properties == null)
                throw new NullPointerException("Property properties must not be null");


            return new OFAsyncGetRequestVer15(
                    xid,
                    properties
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFAsyncGetRequest> {
        @Override
        public OFAsyncGetRequest readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 26
            byte type = bb.readByte();
            if(type != (byte) 0x1a)
                throw new OFParseError("Wrong type: Expected=OFType.GET_ASYNC_REQUEST(26), got="+type);
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
            List<OFAsyncConfigProp> properties = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFAsyncConfigPropVer15.READER);

            OFAsyncGetRequestVer15 asyncGetRequestVer15 = new OFAsyncGetRequestVer15(
                    xid,
                      properties
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", asyncGetRequestVer15);
            return asyncGetRequestVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFAsyncGetRequestVer15Funnel FUNNEL = new OFAsyncGetRequestVer15Funnel();
    static class OFAsyncGetRequestVer15Funnel implements Funnel<OFAsyncGetRequestVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFAsyncGetRequestVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 26
            sink.putByte((byte) 0x1a);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            FunnelUtils.putList(message.properties, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFAsyncGetRequestVer15> {
        @Override
        public void write(ByteBuf bb, OFAsyncGetRequestVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 26
            bb.writeByte((byte) 0x1a);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            ChannelUtils.writeList(bb, message.properties);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFAsyncGetRequestVer15(");
        b.append("xid=").append(xid);
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
        OFAsyncGetRequestVer15 other = (OFAsyncGetRequestVer15) obj;

        if( xid != other.xid)
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
        OFAsyncGetRequestVer15 other = (OFAsyncGetRequestVer15) obj;

        // ignore XID
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
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

}
