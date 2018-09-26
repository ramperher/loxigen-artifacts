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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnSetPktinSuppressionRequestVer15 implements OFBsnSetPktinSuppressionRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnSetPktinSuppressionRequestVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 32;

        private final static long DEFAULT_XID = 0x0L;
        private final static boolean DEFAULT_ENABLED = false;
        private final static int DEFAULT_IDLE_TIMEOUT = 0x0;
        private final static int DEFAULT_HARD_TIMEOUT = 0x0;
        private final static int DEFAULT_PRIORITY = 0x0;
        private final static U64 DEFAULT_COOKIE = U64.ZERO;

    // OF message fields
    private final long xid;
    private final boolean enabled;
    private final int idleTimeout;
    private final int hardTimeout;
    private final int priority;
    private final U64 cookie;
//
    // Immutable default instance
    final static OFBsnSetPktinSuppressionRequestVer15 DEFAULT = new OFBsnSetPktinSuppressionRequestVer15(
        DEFAULT_XID, DEFAULT_ENABLED, DEFAULT_IDLE_TIMEOUT, DEFAULT_HARD_TIMEOUT, DEFAULT_PRIORITY, DEFAULT_COOKIE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnSetPktinSuppressionRequestVer15(long xid, boolean enabled, int idleTimeout, int hardTimeout, int priority, U64 cookie) {
        if(cookie == null) {
            throw new NullPointerException("OFBsnSetPktinSuppressionRequestVer15: property cookie cannot be null");
        }
        this.xid = xid;
        this.enabled = enabled;
        this.idleTimeout = idleTimeout;
        this.hardTimeout = hardTimeout;
        this.priority = priority;
        this.cookie = cookie;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xbL;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }



    public OFBsnSetPktinSuppressionRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnSetPktinSuppressionRequest.Builder {
        final OFBsnSetPktinSuppressionRequestVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean enabledSet;
        private boolean enabled;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean prioritySet;
        private int priority;
        private boolean cookieSet;
        private U64 cookie;

        BuilderWithParent(OFBsnSetPktinSuppressionRequestVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xbL;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setEnabled(boolean enabled) {
        this.enabled = enabled;
        this.enabledSet = true;
        return this;
    }
    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }


        @Override
        public OFBsnSetPktinSuppressionRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                boolean enabled = this.enabledSet ? this.enabled : parentMessage.enabled;
                int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : parentMessage.idleTimeout;
                int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : parentMessage.hardTimeout;
                int priority = this.prioritySet ? this.priority : parentMessage.priority;
                U64 cookie = this.cookieSet ? this.cookie : parentMessage.cookie;
                if(cookie == null)
                    throw new NullPointerException("Property cookie must not be null");

                //
                return new OFBsnSetPktinSuppressionRequestVer15(
                    xid,
                    enabled,
                    idleTimeout,
                    hardTimeout,
                    priority,
                    cookie
                );
        }

    }

    static class Builder implements OFBsnSetPktinSuppressionRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean enabledSet;
        private boolean enabled;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean prioritySet;
        private int priority;
        private boolean cookieSet;
        private U64 cookie;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xbL;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setEnabled(boolean enabled) {
        this.enabled = enabled;
        this.enabledSet = true;
        return this;
    }
    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFBsnSetPktinSuppressionRequest.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
//
        @Override
        public OFBsnSetPktinSuppressionRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            boolean enabled = this.enabledSet ? this.enabled : DEFAULT_ENABLED;
            int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : DEFAULT_IDLE_TIMEOUT;
            int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : DEFAULT_HARD_TIMEOUT;
            int priority = this.prioritySet ? this.priority : DEFAULT_PRIORITY;
            U64 cookie = this.cookieSet ? this.cookie : DEFAULT_COOKIE;
            if(cookie == null)
                throw new NullPointerException("Property cookie must not be null");


            return new OFBsnSetPktinSuppressionRequestVer15(
                    xid,
                    enabled,
                    idleTimeout,
                    hardTimeout,
                    priority,
                    cookie
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFBsnSetPktinSuppressionRequest> {
        @Override
        public OFBsnSetPktinSuppressionRequest readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 32)
                throw new OFParseError("Wrong length: Expected=32(32), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0xbL
            int subtype = bb.readInt();
            if(subtype != 0xb)
                throw new OFParseError("Wrong subtype: Expected=0xbL(0xbL), got="+subtype);
            boolean enabled = (bb.readByte() != 0);
            // pad: 1 bytes
            bb.skipBytes(1);
            int idleTimeout = U16.f(bb.readShort());
            int hardTimeout = U16.f(bb.readShort());
            int priority = U16.f(bb.readShort());
            U64 cookie = U64.ofRaw(bb.readLong());

            OFBsnSetPktinSuppressionRequestVer15 bsnSetPktinSuppressionRequestVer15 = new OFBsnSetPktinSuppressionRequestVer15(
                    xid,
                      enabled,
                      idleTimeout,
                      hardTimeout,
                      priority,
                      cookie
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnSetPktinSuppressionRequestVer15);
            return bsnSetPktinSuppressionRequestVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnSetPktinSuppressionRequestVer15Funnel FUNNEL = new OFBsnSetPktinSuppressionRequestVer15Funnel();
    static class OFBsnSetPktinSuppressionRequestVer15Funnel implements Funnel<OFBsnSetPktinSuppressionRequestVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnSetPktinSuppressionRequestVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 32
            sink.putShort((short) 0x20);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0xbL
            sink.putInt(0xb);
            sink.putBoolean(message.enabled);
            // skip pad (1 bytes)
            sink.putInt(message.idleTimeout);
            sink.putInt(message.hardTimeout);
            sink.putInt(message.priority);
            message.cookie.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnSetPktinSuppressionRequestVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnSetPktinSuppressionRequestVer15 message) {
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 32
            bb.writeShort((short) 0x20);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0xbL
            bb.writeInt(0xb);
            bb.writeByte(message.enabled ? 1 : 0);
            // pad: 1 bytes
            bb.writeZero(1);
            bb.writeShort(U16.t(message.idleTimeout));
            bb.writeShort(U16.t(message.hardTimeout));
            bb.writeShort(U16.t(message.priority));
            bb.writeLong(message.cookie.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnSetPktinSuppressionRequestVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("enabled=").append(enabled);
        b.append(", ");
        b.append("idleTimeout=").append(idleTimeout);
        b.append(", ");
        b.append("hardTimeout=").append(hardTimeout);
        b.append(", ");
        b.append("priority=").append(priority);
        b.append(", ");
        b.append("cookie=").append(cookie);
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
        OFBsnSetPktinSuppressionRequestVer15 other = (OFBsnSetPktinSuppressionRequestVer15) obj;

        if( xid != other.xid)
            return false;
        if( enabled != other.enabled)
            return false;
        if( idleTimeout != other.idleTimeout)
            return false;
        if( hardTimeout != other.hardTimeout)
            return false;
        if( priority != other.priority)
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
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
        OFBsnSetPktinSuppressionRequestVer15 other = (OFBsnSetPktinSuppressionRequestVer15) obj;

        // ignore XID
        if( enabled != other.enabled)
            return false;
        if( idleTimeout != other.idleTimeout)
            return false;
        if( hardTimeout != other.hardTimeout)
            return false;
        if( priority != other.priority)
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + (enabled ? 1231 : 1237);
        result = prime * result + idleTimeout;
        result = prime * result + hardTimeout;
        result = prime * result + priority;
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + (enabled ? 1231 : 1237);
        result = prime * result + idleTimeout;
        result = prime * result + hardTimeout;
        result = prime * result + priority;
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        return result;
    }

}
