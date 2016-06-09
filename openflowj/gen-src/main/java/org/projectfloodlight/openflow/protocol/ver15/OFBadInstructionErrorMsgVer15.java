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
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBadInstructionErrorMsgVer15 implements OFBadInstructionErrorMsg {
    private static final Logger logger = LoggerFactory.getLogger(OFBadInstructionErrorMsgVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 12;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFErrorCauseData DEFAULT_DATA = OFErrorCauseData.NONE;

    // OF message fields
    private final long xid;
    private final OFBadInstructionCode code;
    private final OFErrorCauseData data;
//

    // package private constructor - used by readers, builders, and factory
    OFBadInstructionErrorMsgVer15(long xid, OFBadInstructionCode code, OFErrorCauseData data) {
        if(code == null) {
            throw new NullPointerException("OFBadInstructionErrorMsgVer15: property code cannot be null");
        }
        if(data == null) {
            throw new NullPointerException("OFBadInstructionErrorMsgVer15: property data cannot be null");
        }
        this.xid = xid;
        this.code = code;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFErrorType getErrType() {
        return OFErrorType.BAD_INSTRUCTION;
    }

    @Override
    public OFBadInstructionCode getCode() {
        return code;
    }

    @Override
    public OFErrorCauseData getData() {
        return data;
    }



    public OFBadInstructionErrorMsg.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBadInstructionErrorMsg.Builder {
        final OFBadInstructionErrorMsgVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean codeSet;
        private OFBadInstructionCode code;
        private boolean dataSet;
        private OFErrorCauseData data;

        BuilderWithParent(OFBadInstructionErrorMsgVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBadInstructionErrorMsg.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFErrorType getErrType() {
        return OFErrorType.BAD_INSTRUCTION;
    }

    @Override
    public OFBadInstructionCode getCode() {
        return code;
    }

    @Override
    public OFBadInstructionErrorMsg.Builder setCode(OFBadInstructionCode code) {
        this.code = code;
        this.codeSet = true;
        return this;
    }
    @Override
    public OFErrorCauseData getData() {
        return data;
    }

    @Override
    public OFBadInstructionErrorMsg.Builder setData(OFErrorCauseData data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }


        @Override
        public OFBadInstructionErrorMsg build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFBadInstructionCode code = this.codeSet ? this.code : parentMessage.code;
                if(code == null)
                    throw new NullPointerException("Property code must not be null");
                OFErrorCauseData data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFBadInstructionErrorMsgVer15(
                    xid,
                    code,
                    data
                );
        }

    }

    static class Builder implements OFBadInstructionErrorMsg.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean codeSet;
        private OFBadInstructionCode code;
        private boolean dataSet;
        private OFErrorCauseData data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBadInstructionErrorMsg.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFErrorType getErrType() {
        return OFErrorType.BAD_INSTRUCTION;
    }

    @Override
    public OFBadInstructionCode getCode() {
        return code;
    }

    @Override
    public OFBadInstructionErrorMsg.Builder setCode(OFBadInstructionCode code) {
        this.code = code;
        this.codeSet = true;
        return this;
    }
    @Override
    public OFErrorCauseData getData() {
        return data;
    }

    @Override
    public OFBadInstructionErrorMsg.Builder setData(OFErrorCauseData data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
//
        @Override
        public OFBadInstructionErrorMsg build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.codeSet)
                throw new IllegalStateException("Property code doesn't have default value -- must be set");
            if(code == null)
                throw new NullPointerException("Property code must not be null");
            OFErrorCauseData data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFBadInstructionErrorMsgVer15(
                    xid,
                    code,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBadInstructionErrorMsg> {
        @Override
        public OFBadInstructionErrorMsg readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 1
            byte type = bb.readByte();
            if(type != (byte) 0x1)
                throw new OFParseError("Wrong type: Expected=OFType.ERROR(1), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property errType == 3
            short errType = bb.readShort();
            if(errType != (short) 0x3)
                throw new OFParseError("Wrong errType: Expected=OFErrorType.BAD_INSTRUCTION(3), got="+errType);
            OFBadInstructionCode code = OFBadInstructionCodeSerializerVer15.readFrom(bb);
            OFErrorCauseData data = OFErrorCauseData.read(bb, length - (bb.readerIndex() - start), OFVersion.OF_15);

            OFBadInstructionErrorMsgVer15 badInstructionErrorMsgVer15 = new OFBadInstructionErrorMsgVer15(
                    xid,
                      code,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", badInstructionErrorMsgVer15);
            return badInstructionErrorMsgVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBadInstructionErrorMsgVer15Funnel FUNNEL = new OFBadInstructionErrorMsgVer15Funnel();
    static class OFBadInstructionErrorMsgVer15Funnel implements Funnel<OFBadInstructionErrorMsgVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBadInstructionErrorMsgVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 1
            sink.putByte((byte) 0x1);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property errType = 3
            sink.putShort((short) 0x3);
            OFBadInstructionCodeSerializerVer15.putTo(message.code, sink);
            message.data.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBadInstructionErrorMsgVer15> {
        @Override
        public void write(ByteBuf bb, OFBadInstructionErrorMsgVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 1
            bb.writeByte((byte) 0x1);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property errType = 3
            bb.writeShort((short) 0x3);
            OFBadInstructionCodeSerializerVer15.writeTo(bb, message.code);
            message.data.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBadInstructionErrorMsgVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("code=").append(code);
        b.append(", ");
        b.append("data=").append(data);
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
        OFBadInstructionErrorMsgVer15 other = (OFBadInstructionErrorMsgVer15) obj;

        if( xid != other.xid)
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
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
        OFBadInstructionErrorMsgVer15 other = (OFBadInstructionErrorMsgVer15) obj;

        // ignore XID
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

}
