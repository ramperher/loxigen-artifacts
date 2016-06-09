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
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFTableStatusVer14 implements OFTableStatus {
    private static final Logger logger = LoggerFactory.getLogger(OFTableStatusVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 28;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_ROLE = 0x0L;

    // OF message fields
    private final long xid;
    private final long role;
    private final OFTableReason reason;
    private final OFTableDesc table;
//

    // package private constructor - used by readers, builders, and factory
    OFTableStatusVer14(long xid, long role, OFTableReason reason, OFTableDesc table) {
        if(reason == null) {
            throw new NullPointerException("OFTableStatusVer14: property reason cannot be null");
        }
        if(table == null) {
            throw new NullPointerException("OFTableStatusVer14: property table cannot be null");
        }
        this.xid = xid;
        this.role = role;
        this.reason = reason;
        this.table = table;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.TABLE_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFTableReason getReason() {
        return reason;
    }

    @Override
    public OFTableDesc getTable() {
        return table;
    }

    @Override
    public long getRole() {
        return role;
    }



    public OFTableStatus.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableStatus.Builder {
        final OFTableStatusVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean roleSet;
        private long role;
        private boolean reasonSet;
        private OFTableReason reason;
        private boolean tableSet;
        private OFTableDesc table;

        BuilderWithParent(OFTableStatusVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.TABLE_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFTableStatus.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFTableReason getReason() {
        return reason;
    }

    @Override
    public OFTableStatus.Builder setReason(OFTableReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public OFTableDesc getTable() {
        return table;
    }

    @Override
    public OFTableStatus.Builder setTable(OFTableDesc table) {
        this.table = table;
        this.tableSet = true;
        return this;
    }
    @Override
    public long getRole() {
        return role;
    }

    @Override
    public OFTableStatus.Builder setRole(long role) {
        this.role = role;
        this.roleSet = true;
        return this;
    }


        @Override
        public OFTableStatus build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long role = this.roleSet ? this.role : parentMessage.role;
                OFTableReason reason = this.reasonSet ? this.reason : parentMessage.reason;
                if(reason == null)
                    throw new NullPointerException("Property reason must not be null");
                OFTableDesc table = this.tableSet ? this.table : parentMessage.table;
                if(table == null)
                    throw new NullPointerException("Property table must not be null");

                //
                return new OFTableStatusVer14(
                    xid,
                    role,
                    reason,
                    table
                );
        }

    }

    static class Builder implements OFTableStatus.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean roleSet;
        private long role;
        private boolean reasonSet;
        private OFTableReason reason;
        private boolean tableSet;
        private OFTableDesc table;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.TABLE_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFTableStatus.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFTableReason getReason() {
        return reason;
    }

    @Override
    public OFTableStatus.Builder setReason(OFTableReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public OFTableDesc getTable() {
        return table;
    }

    @Override
    public OFTableStatus.Builder setTable(OFTableDesc table) {
        this.table = table;
        this.tableSet = true;
        return this;
    }
    @Override
    public long getRole() {
        return role;
    }

    @Override
    public OFTableStatus.Builder setRole(long role) {
        this.role = role;
        this.roleSet = true;
        return this;
    }
//
        @Override
        public OFTableStatus build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long role = this.roleSet ? this.role : DEFAULT_ROLE;
            if(!this.reasonSet)
                throw new IllegalStateException("Property reason doesn't have default value -- must be set");
            if(reason == null)
                throw new NullPointerException("Property reason must not be null");
            if(!this.tableSet)
                throw new IllegalStateException("Property table doesn't have default value -- must be set");
            if(table == null)
                throw new NullPointerException("Property table must not be null");


            return new OFTableStatusVer14(
                    xid,
                    role,
                    reason,
                    table
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFTableStatus> {
        @Override
        public OFTableStatus readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 31
            byte type = bb.readByte();
            if(type != (byte) 0x1f)
                throw new OFParseError("Wrong type: Expected=OFType.TABLE_STATUS(31), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 28)
                throw new OFParseError("Wrong length: Expected=28(28), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            long role = U32.f(bb.readInt());
            OFTableReason reason = OFTableReasonSerializerVer14.readFrom(bb);
            // pad: 7 bytes
            bb.skipBytes(7);
            OFTableDesc table = OFTableDescVer14.READER.readFrom(bb);

            OFTableStatusVer14 tableStatusVer14 = new OFTableStatusVer14(
                    xid,
                      role,
                      reason,
                      table
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableStatusVer14);
            return tableStatusVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableStatusVer14Funnel FUNNEL = new OFTableStatusVer14Funnel();
    static class OFTableStatusVer14Funnel implements Funnel<OFTableStatusVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableStatusVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 31
            sink.putByte((byte) 0x1f);
            // fixed value property length = 28
            sink.putShort((short) 0x1c);
            sink.putLong(message.xid);
            sink.putLong(message.role);
            OFTableReasonSerializerVer14.putTo(message.reason, sink);
            // skip pad (7 bytes)
            message.table.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableStatusVer14> {
        @Override
        public void write(ByteBuf bb, OFTableStatusVer14 message) {
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 31
            bb.writeByte((byte) 0x1f);
            // fixed value property length = 28
            bb.writeShort((short) 0x1c);
            bb.writeInt(U32.t(message.xid));
            bb.writeInt(U32.t(message.role));
            OFTableReasonSerializerVer14.writeTo(bb, message.reason);
            // pad: 7 bytes
            bb.writeZero(7);
            message.table.writeTo(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableStatusVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("role=").append(role);
        b.append(", ");
        b.append("reason=").append(reason);
        b.append(", ");
        b.append("table=").append(table);
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
        OFTableStatusVer14 other = (OFTableStatusVer14) obj;

        if( xid != other.xid)
            return false;
        if( role != other.role)
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (table == null) {
            if (other.table != null)
                return false;
        } else if (!table.equals(other.table))
            return false;
        return true;
    }

    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFTableStatusVer14 other = (OFTableStatusVer14) obj;

        // ignore XID
        if( role != other.role)
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (table == null) {
            if (other.table != null)
                return false;
        } else if (!table.equals(other.table))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime *  (int) (role ^ (role >>> 32));
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + ((table == null) ? 0 : table.hashCode());
        return result;
    }

}
