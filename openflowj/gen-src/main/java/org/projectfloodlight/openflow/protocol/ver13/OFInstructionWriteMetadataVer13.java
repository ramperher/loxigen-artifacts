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
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFInstructionWriteMetadataVer13 implements OFInstructionWriteMetadata {
    private static final Logger logger = LoggerFactory.getLogger(OFInstructionWriteMetadataVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 24;

        private final static U64 DEFAULT_METADATA = U64.ZERO;
        private final static U64 DEFAULT_METADATA_MASK = U64.ZERO;

    // OF message fields
    private final U64 metadata;
    private final U64 metadataMask;
//
    // Immutable default instance
    final static OFInstructionWriteMetadataVer13 DEFAULT = new OFInstructionWriteMetadataVer13(
        DEFAULT_METADATA, DEFAULT_METADATA_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFInstructionWriteMetadataVer13(U64 metadata, U64 metadataMask) {
        if(metadata == null) {
            throw new NullPointerException("OFInstructionWriteMetadataVer13: property metadata cannot be null");
        }
        if(metadataMask == null) {
            throw new NullPointerException("OFInstructionWriteMetadataVer13: property metadataMask cannot be null");
        }
        this.metadata = metadata;
        this.metadataMask = metadataMask;
    }

    // Accessors for OF message fields
    @Override
    public OFInstructionType getType() {
        return OFInstructionType.WRITE_METADATA;
    }

    @Override
    public U64 getMetadata() {
        return metadata;
    }

    @Override
    public U64 getMetadataMask() {
        return metadataMask;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFInstructionWriteMetadata.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFInstructionWriteMetadata.Builder {
        final OFInstructionWriteMetadataVer13 parentMessage;

        // OF message fields
        private boolean metadataSet;
        private U64 metadata;
        private boolean metadataMaskSet;
        private U64 metadataMask;

        BuilderWithParent(OFInstructionWriteMetadataVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFInstructionType getType() {
        return OFInstructionType.WRITE_METADATA;
    }

    @Override
    public U64 getMetadata() {
        return metadata;
    }

    @Override
    public OFInstructionWriteMetadata.Builder setMetadata(U64 metadata) {
        this.metadata = metadata;
        this.metadataSet = true;
        return this;
    }
    @Override
    public U64 getMetadataMask() {
        return metadataMask;
    }

    @Override
    public OFInstructionWriteMetadata.Builder setMetadataMask(U64 metadataMask) {
        this.metadataMask = metadataMask;
        this.metadataMaskSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFInstructionWriteMetadata build() {
                U64 metadata = this.metadataSet ? this.metadata : parentMessage.metadata;
                if(metadata == null)
                    throw new NullPointerException("Property metadata must not be null");
                U64 metadataMask = this.metadataMaskSet ? this.metadataMask : parentMessage.metadataMask;
                if(metadataMask == null)
                    throw new NullPointerException("Property metadataMask must not be null");

                //
                return new OFInstructionWriteMetadataVer13(
                    metadata,
                    metadataMask
                );
        }

    }

    static class Builder implements OFInstructionWriteMetadata.Builder {
        // OF message fields
        private boolean metadataSet;
        private U64 metadata;
        private boolean metadataMaskSet;
        private U64 metadataMask;

    @Override
    public OFInstructionType getType() {
        return OFInstructionType.WRITE_METADATA;
    }

    @Override
    public U64 getMetadata() {
        return metadata;
    }

    @Override
    public OFInstructionWriteMetadata.Builder setMetadata(U64 metadata) {
        this.metadata = metadata;
        this.metadataSet = true;
        return this;
    }
    @Override
    public U64 getMetadataMask() {
        return metadataMask;
    }

    @Override
    public OFInstructionWriteMetadata.Builder setMetadataMask(U64 metadataMask) {
        this.metadataMask = metadataMask;
        this.metadataMaskSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFInstructionWriteMetadata build() {
            U64 metadata = this.metadataSet ? this.metadata : DEFAULT_METADATA;
            if(metadata == null)
                throw new NullPointerException("Property metadata must not be null");
            U64 metadataMask = this.metadataMaskSet ? this.metadataMask : DEFAULT_METADATA_MASK;
            if(metadataMask == null)
                throw new NullPointerException("Property metadataMask must not be null");


            return new OFInstructionWriteMetadataVer13(
                    metadata,
                    metadataMask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader extends AbstractOFMessageReader<OFInstructionWriteMetadata> {
        @Override
        public OFInstructionWriteMetadata readFrom(OFMessageReaderContext context, ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 2
            short type = bb.readShort();
            if(type != (short) 0x2)
                throw new OFParseError("Wrong type: Expected=OFInstructionType.WRITE_METADATA(2), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 24)
                throw new OFParseError("Wrong length: Expected=24(24), got="+length);
            //
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // pad: 4 bytes
            bb.skipBytes(4);
            U64 metadata = U64.ofRaw(bb.readLong());
            U64 metadataMask = U64.ofRaw(bb.readLong());

            OFInstructionWriteMetadataVer13 instructionWriteMetadataVer13 = new OFInstructionWriteMetadataVer13(
                    metadata,
                      metadataMask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", instructionWriteMetadataVer13);
            return instructionWriteMetadataVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFInstructionWriteMetadataVer13Funnel FUNNEL = new OFInstructionWriteMetadataVer13Funnel();
    static class OFInstructionWriteMetadataVer13Funnel implements Funnel<OFInstructionWriteMetadataVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFInstructionWriteMetadataVer13 message, PrimitiveSink sink) {
            // fixed value property type = 2
            sink.putShort((short) 0x2);
            // fixed value property length = 24
            sink.putShort((short) 0x18);
            // skip pad (4 bytes)
            message.metadata.putTo(sink);
            message.metadataMask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFInstructionWriteMetadataVer13> {
        @Override
        public void write(ByteBuf bb, OFInstructionWriteMetadataVer13 message) {
            // fixed value property type = 2
            bb.writeShort((short) 0x2);
            // fixed value property length = 24
            bb.writeShort((short) 0x18);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeLong(message.metadata.getValue());
            bb.writeLong(message.metadataMask.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFInstructionWriteMetadataVer13(");
        b.append("metadata=").append(metadata);
        b.append(", ");
        b.append("metadataMask=").append(metadataMask);
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
        OFInstructionWriteMetadataVer13 other = (OFInstructionWriteMetadataVer13) obj;

        if (metadata == null) {
            if (other.metadata != null)
                return false;
        } else if (!metadata.equals(other.metadata))
            return false;
        if (metadataMask == null) {
            if (other.metadataMask != null)
                return false;
        } else if (!metadataMask.equals(other.metadataMask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
        result = prime * result + ((metadataMask == null) ? 0 : metadataMask.hashCode());
        return result;
    }

}
