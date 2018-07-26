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

class OFControllerStatusEntryVer15 implements OFControllerStatusEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFControllerStatusEntryVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 16;

        private final static int DEFAULT_SHORT_ID = 0x0;
        private final static List<OFControllerStatusProp> DEFAULT_PROPERTIES = ImmutableList.<OFControllerStatusProp>of();

    // OF message fields
    private final int shortId;
    private final OFControllerRole role;
    private final OFControllerStatusReason reason;
    private final OFControlChannelStatus channelStatus;
    private final List<OFControllerStatusProp> properties;
//

    // package private constructor - used by readers, builders, and factory
    OFControllerStatusEntryVer15(int shortId, OFControllerRole role, OFControllerStatusReason reason, OFControlChannelStatus channelStatus, List<OFControllerStatusProp> properties) {
        if(role == null) {
            throw new NullPointerException("OFControllerStatusEntryVer15: property role cannot be null");
        }
        if(reason == null) {
            throw new NullPointerException("OFControllerStatusEntryVer15: property reason cannot be null");
        }
        if(channelStatus == null) {
            throw new NullPointerException("OFControllerStatusEntryVer15: property channelStatus cannot be null");
        }
        if(properties == null) {
            throw new NullPointerException("OFControllerStatusEntryVer15: property properties cannot be null");
        }
        this.shortId = shortId;
        this.role = role;
        this.reason = reason;
        this.channelStatus = channelStatus;
        this.properties = properties;
    }

    // Accessors for OF message fields
    @Override
    public int getShortId() {
        return shortId;
    }

    @Override
    public OFControllerRole getRole() {
        return role;
    }

    @Override
    public OFControllerStatusReason getReason() {
        return reason;
    }

    @Override
    public OFControlChannelStatus getChannelStatus() {
        return channelStatus;
    }

    @Override
    public List<OFControllerStatusProp> getProperties() {
        return properties;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFControllerStatusEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFControllerStatusEntry.Builder {
        final OFControllerStatusEntryVer15 parentMessage;

        // OF message fields
        private boolean shortIdSet;
        private int shortId;
        private boolean roleSet;
        private OFControllerRole role;
        private boolean reasonSet;
        private OFControllerStatusReason reason;
        private boolean channelStatusSet;
        private OFControlChannelStatus channelStatus;
        private boolean propertiesSet;
        private List<OFControllerStatusProp> properties;

        BuilderWithParent(OFControllerStatusEntryVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getShortId() {
        return shortId;
    }

    @Override
    public OFControllerStatusEntry.Builder setShortId(int shortId) {
        this.shortId = shortId;
        this.shortIdSet = true;
        return this;
    }
    @Override
    public OFControllerRole getRole() {
        return role;
    }

    @Override
    public OFControllerStatusEntry.Builder setRole(OFControllerRole role) {
        this.role = role;
        this.roleSet = true;
        return this;
    }
    @Override
    public OFControllerStatusReason getReason() {
        return reason;
    }

    @Override
    public OFControllerStatusEntry.Builder setReason(OFControllerStatusReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public OFControlChannelStatus getChannelStatus() {
        return channelStatus;
    }

    @Override
    public OFControllerStatusEntry.Builder setChannelStatus(OFControlChannelStatus channelStatus) {
        this.channelStatus = channelStatus;
        this.channelStatusSet = true;
        return this;
    }
    @Override
    public List<OFControllerStatusProp> getProperties() {
        return properties;
    }

    @Override
    public OFControllerStatusEntry.Builder setProperties(List<OFControllerStatusProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFControllerStatusEntry build() {
                int shortId = this.shortIdSet ? this.shortId : parentMessage.shortId;
                OFControllerRole role = this.roleSet ? this.role : parentMessage.role;
                if(role == null)
                    throw new NullPointerException("Property role must not be null");
                OFControllerStatusReason reason = this.reasonSet ? this.reason : parentMessage.reason;
                if(reason == null)
                    throw new NullPointerException("Property reason must not be null");
                OFControlChannelStatus channelStatus = this.channelStatusSet ? this.channelStatus : parentMessage.channelStatus;
                if(channelStatus == null)
                    throw new NullPointerException("Property channelStatus must not be null");
                List<OFControllerStatusProp> properties = this.propertiesSet ? this.properties : parentMessage.properties;
                if(properties == null)
                    throw new NullPointerException("Property properties must not be null");

                //
                return new OFControllerStatusEntryVer15(
                    shortId,
                    role,
                    reason,
                    channelStatus,
                    properties
                );
        }

    }

    static class Builder implements OFControllerStatusEntry.Builder {
        // OF message fields
        private boolean shortIdSet;
        private int shortId;
        private boolean roleSet;
        private OFControllerRole role;
        private boolean reasonSet;
        private OFControllerStatusReason reason;
        private boolean channelStatusSet;
        private OFControlChannelStatus channelStatus;
        private boolean propertiesSet;
        private List<OFControllerStatusProp> properties;

    @Override
    public int getShortId() {
        return shortId;
    }

    @Override
    public OFControllerStatusEntry.Builder setShortId(int shortId) {
        this.shortId = shortId;
        this.shortIdSet = true;
        return this;
    }
    @Override
    public OFControllerRole getRole() {
        return role;
    }

    @Override
    public OFControllerStatusEntry.Builder setRole(OFControllerRole role) {
        this.role = role;
        this.roleSet = true;
        return this;
    }
    @Override
    public OFControllerStatusReason getReason() {
        return reason;
    }

    @Override
    public OFControllerStatusEntry.Builder setReason(OFControllerStatusReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public OFControlChannelStatus getChannelStatus() {
        return channelStatus;
    }

    @Override
    public OFControllerStatusEntry.Builder setChannelStatus(OFControlChannelStatus channelStatus) {
        this.channelStatus = channelStatus;
        this.channelStatusSet = true;
        return this;
    }
    @Override
    public List<OFControllerStatusProp> getProperties() {
        return properties;
    }

    @Override
    public OFControllerStatusEntry.Builder setProperties(List<OFControllerStatusProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFControllerStatusEntry build() {
            int shortId = this.shortIdSet ? this.shortId : DEFAULT_SHORT_ID;
            if(!this.roleSet)
                throw new IllegalStateException("Property role doesn't have default value -- must be set");
            if(role == null)
                throw new NullPointerException("Property role must not be null");
            if(!this.reasonSet)
                throw new IllegalStateException("Property reason doesn't have default value -- must be set");
            if(reason == null)
                throw new NullPointerException("Property reason must not be null");
            if(!this.channelStatusSet)
                throw new IllegalStateException("Property channelStatus doesn't have default value -- must be set");
            if(channelStatus == null)
                throw new NullPointerException("Property channelStatus must not be null");
            List<OFControllerStatusProp> properties = this.propertiesSet ? this.properties : DEFAULT_PROPERTIES;
            if(properties == null)
                throw new NullPointerException("Property properties must not be null");


            return new OFControllerStatusEntryVer15(
                    shortId,
                    role,
                    reason,
                    channelStatus,
                    properties
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFControllerStatusEntry> {
        @Override
        public OFControllerStatusEntry readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
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
            int shortId = U16.f(bb.readShort());
            OFControllerRole role = OFControllerRoleSerializerVer15.readFrom(bb);
            OFControllerStatusReason reason = OFControllerStatusReasonSerializerVer15.readFrom(bb);
            OFControlChannelStatus channelStatus = OFControlChannelStatusSerializerVer15.readFrom(bb);
            // pad: 6 bytes
            bb.skipBytes(6);
            List<OFControllerStatusProp> properties = ChannelUtils.readList(context, bb, length - (bb.readerIndex() - start), OFControllerStatusPropVer15.READER);

            OFControllerStatusEntryVer15 controllerStatusEntryVer15 = new OFControllerStatusEntryVer15(
                    shortId,
                      role,
                      reason,
                      channelStatus,
                      properties
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", controllerStatusEntryVer15);
            return controllerStatusEntryVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFControllerStatusEntryVer15Funnel FUNNEL = new OFControllerStatusEntryVer15Funnel();
    static class OFControllerStatusEntryVer15Funnel implements Funnel<OFControllerStatusEntryVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFControllerStatusEntryVer15 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            sink.putInt(message.shortId);
            OFControllerRoleSerializerVer15.putTo(message.role, sink);
            OFControllerStatusReasonSerializerVer15.putTo(message.reason, sink);
            OFControlChannelStatusSerializerVer15.putTo(message.channelStatus, sink);
            // skip pad (6 bytes)
            FunnelUtils.putList(message.properties, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFControllerStatusEntryVer15> {
        @Override
        public void write(ByteBuf bb, OFControllerStatusEntryVer15 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeShort(U16.t(message.shortId));
            OFControllerRoleSerializerVer15.writeTo(bb, message.role);
            OFControllerStatusReasonSerializerVer15.writeTo(bb, message.reason);
            OFControlChannelStatusSerializerVer15.writeTo(bb, message.channelStatus);
            // pad: 6 bytes
            bb.writeZero(6);
            ChannelUtils.writeList(bb, message.properties);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFControllerStatusEntryVer15(");
        b.append("shortId=").append(shortId);
        b.append(", ");
        b.append("role=").append(role);
        b.append(", ");
        b.append("reason=").append(reason);
        b.append(", ");
        b.append("channelStatus=").append(channelStatus);
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
        OFControllerStatusEntryVer15 other = (OFControllerStatusEntryVer15) obj;

        if( shortId != other.shortId)
            return false;
        if (role == null) {
            if (other.role != null)
                return false;
        } else if (!role.equals(other.role))
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (channelStatus == null) {
            if (other.channelStatus != null)
                return false;
        } else if (!channelStatus.equals(other.channelStatus))
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

        result = prime * result + shortId;
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + ((channelStatus == null) ? 0 : channelStatus.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

}
