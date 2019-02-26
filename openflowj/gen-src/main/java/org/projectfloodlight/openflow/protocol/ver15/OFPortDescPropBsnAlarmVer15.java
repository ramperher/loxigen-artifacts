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
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFPortDescPropBsnAlarmVer15 implements OFPortDescPropBsnAlarm {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescPropBsnAlarmVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 31;

        private final static Set<OFBsnModuleEepromAlarmSet> DEFAULT_ALARM_SET = ImmutableSet.<OFBsnModuleEepromAlarmSet>of();
        private final static long DEFAULT_HIGH = 0x0L;
        private final static long DEFAULT_HIGH_WARN = 0x0L;
        private final static long DEFAULT_LOW = 0x0L;
        private final static long DEFAULT_LOW_WARN = 0x0L;
        private final static Set<OFBsnModuleEepromDiagType> DEFAULT_ALARM_TYPE = ImmutableSet.<OFBsnModuleEepromDiagType>of();
        private final static Set<OFBsnUnitType> DEFAULT_UNIT = ImmutableSet.<OFBsnUnitType>of();

    // OF message fields
    private final Set<OFBsnModuleEepromAlarmSet> alarmSet;
    private final long high;
    private final long highWarn;
    private final long low;
    private final long lowWarn;
    private final Set<OFBsnModuleEepromDiagType> alarmType;
    private final Set<OFBsnUnitType> unit;
//
    // Immutable default instance
    final static OFPortDescPropBsnAlarmVer15 DEFAULT = new OFPortDescPropBsnAlarmVer15(
        DEFAULT_ALARM_SET, DEFAULT_HIGH, DEFAULT_HIGH_WARN, DEFAULT_LOW, DEFAULT_LOW_WARN, DEFAULT_ALARM_TYPE, DEFAULT_UNIT
    );

    // package private constructor - used by readers, builders, and factory
    OFPortDescPropBsnAlarmVer15(Set<OFBsnModuleEepromAlarmSet> alarmSet, long high, long highWarn, long low, long lowWarn, Set<OFBsnModuleEepromDiagType> alarmType, Set<OFBsnUnitType> unit) {
        if(alarmSet == null) {
            throw new NullPointerException("OFPortDescPropBsnAlarmVer15: property alarmSet cannot be null");
        }
        if(alarmType == null) {
            throw new NullPointerException("OFPortDescPropBsnAlarmVer15: property alarmType cannot be null");
        }
        if(unit == null) {
            throw new NullPointerException("OFPortDescPropBsnAlarmVer15: property unit cannot be null");
        }
        this.alarmSet = alarmSet;
        this.high = high;
        this.highWarn = highWarn;
        this.low = low;
        this.lowWarn = lowWarn;
        this.alarmType = alarmType;
        this.unit = unit;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x8L;
    }

    @Override
    public Set<OFBsnModuleEepromAlarmSet> getAlarmSet() {
        return alarmSet;
    }

    @Override
    public long getHigh() {
        return high;
    }

    @Override
    public long getHighWarn() {
        return highWarn;
    }

    @Override
    public long getLow() {
        return low;
    }

    @Override
    public long getLowWarn() {
        return lowWarn;
    }

    @Override
    public Set<OFBsnModuleEepromDiagType> getAlarmType() {
        return alarmType;
    }

    @Override
    public Set<OFBsnUnitType> getUnit() {
        return unit;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFPortDescPropBsnAlarm.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDescPropBsnAlarm.Builder {
        final OFPortDescPropBsnAlarmVer15 parentMessage;

        // OF message fields
        private boolean alarmSetSet;
        private Set<OFBsnModuleEepromAlarmSet> alarmSet;
        private boolean highSet;
        private long high;
        private boolean highWarnSet;
        private long highWarn;
        private boolean lowSet;
        private long low;
        private boolean lowWarnSet;
        private long lowWarn;
        private boolean alarmTypeSet;
        private Set<OFBsnModuleEepromDiagType> alarmType;
        private boolean unitSet;
        private Set<OFBsnUnitType> unit;

        BuilderWithParent(OFPortDescPropBsnAlarmVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x8L;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public Set<OFBsnModuleEepromAlarmSet> getAlarmSet() {
        return alarmSet;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setAlarmSet(Set<OFBsnModuleEepromAlarmSet> alarmSet) {
        this.alarmSet = alarmSet;
        this.alarmSetSet = true;
        return this;
    }
    @Override
    public long getHigh() {
        return high;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setHigh(long high) {
        this.high = high;
        this.highSet = true;
        return this;
    }
    @Override
    public long getHighWarn() {
        return highWarn;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setHighWarn(long highWarn) {
        this.highWarn = highWarn;
        this.highWarnSet = true;
        return this;
    }
    @Override
    public long getLow() {
        return low;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setLow(long low) {
        this.low = low;
        this.lowSet = true;
        return this;
    }
    @Override
    public long getLowWarn() {
        return lowWarn;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setLowWarn(long lowWarn) {
        this.lowWarn = lowWarn;
        this.lowWarnSet = true;
        return this;
    }
    @Override
    public Set<OFBsnModuleEepromDiagType> getAlarmType() {
        return alarmType;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setAlarmType(Set<OFBsnModuleEepromDiagType> alarmType) {
        this.alarmType = alarmType;
        this.alarmTypeSet = true;
        return this;
    }
    @Override
    public Set<OFBsnUnitType> getUnit() {
        return unit;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setUnit(Set<OFBsnUnitType> unit) {
        this.unit = unit;
        this.unitSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFPortDescPropBsnAlarm build() {
                Set<OFBsnModuleEepromAlarmSet> alarmSet = this.alarmSetSet ? this.alarmSet : parentMessage.alarmSet;
                if(alarmSet == null)
                    throw new NullPointerException("Property alarmSet must not be null");
                long high = this.highSet ? this.high : parentMessage.high;
                long highWarn = this.highWarnSet ? this.highWarn : parentMessage.highWarn;
                long low = this.lowSet ? this.low : parentMessage.low;
                long lowWarn = this.lowWarnSet ? this.lowWarn : parentMessage.lowWarn;
                Set<OFBsnModuleEepromDiagType> alarmType = this.alarmTypeSet ? this.alarmType : parentMessage.alarmType;
                if(alarmType == null)
                    throw new NullPointerException("Property alarmType must not be null");
                Set<OFBsnUnitType> unit = this.unitSet ? this.unit : parentMessage.unit;
                if(unit == null)
                    throw new NullPointerException("Property unit must not be null");

                //
                return new OFPortDescPropBsnAlarmVer15(
                    alarmSet,
                    high,
                    highWarn,
                    low,
                    lowWarn,
                    alarmType,
                    unit
                );
        }

    }

    static class Builder implements OFPortDescPropBsnAlarm.Builder {
        // OF message fields
        private boolean alarmSetSet;
        private Set<OFBsnModuleEepromAlarmSet> alarmSet;
        private boolean highSet;
        private long high;
        private boolean highWarnSet;
        private long highWarn;
        private boolean lowSet;
        private long low;
        private boolean lowWarnSet;
        private long lowWarn;
        private boolean alarmTypeSet;
        private Set<OFBsnModuleEepromDiagType> alarmType;
        private boolean unitSet;
        private Set<OFBsnUnitType> unit;

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x8L;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public Set<OFBsnModuleEepromAlarmSet> getAlarmSet() {
        return alarmSet;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setAlarmSet(Set<OFBsnModuleEepromAlarmSet> alarmSet) {
        this.alarmSet = alarmSet;
        this.alarmSetSet = true;
        return this;
    }
    @Override
    public long getHigh() {
        return high;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setHigh(long high) {
        this.high = high;
        this.highSet = true;
        return this;
    }
    @Override
    public long getHighWarn() {
        return highWarn;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setHighWarn(long highWarn) {
        this.highWarn = highWarn;
        this.highWarnSet = true;
        return this;
    }
    @Override
    public long getLow() {
        return low;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setLow(long low) {
        this.low = low;
        this.lowSet = true;
        return this;
    }
    @Override
    public long getLowWarn() {
        return lowWarn;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setLowWarn(long lowWarn) {
        this.lowWarn = lowWarn;
        this.lowWarnSet = true;
        return this;
    }
    @Override
    public Set<OFBsnModuleEepromDiagType> getAlarmType() {
        return alarmType;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setAlarmType(Set<OFBsnModuleEepromDiagType> alarmType) {
        this.alarmType = alarmType;
        this.alarmTypeSet = true;
        return this;
    }
    @Override
    public Set<OFBsnUnitType> getUnit() {
        return unit;
    }

    @Override
    public OFPortDescPropBsnAlarm.Builder setUnit(Set<OFBsnUnitType> unit) {
        this.unit = unit;
        this.unitSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFPortDescPropBsnAlarm build() {
            Set<OFBsnModuleEepromAlarmSet> alarmSet = this.alarmSetSet ? this.alarmSet : DEFAULT_ALARM_SET;
            if(alarmSet == null)
                throw new NullPointerException("Property alarmSet must not be null");
            long high = this.highSet ? this.high : DEFAULT_HIGH;
            long highWarn = this.highWarnSet ? this.highWarn : DEFAULT_HIGH_WARN;
            long low = this.lowSet ? this.low : DEFAULT_LOW;
            long lowWarn = this.lowWarnSet ? this.lowWarn : DEFAULT_LOW_WARN;
            Set<OFBsnModuleEepromDiagType> alarmType = this.alarmTypeSet ? this.alarmType : DEFAULT_ALARM_TYPE;
            if(alarmType == null)
                throw new NullPointerException("Property alarmType must not be null");
            Set<OFBsnUnitType> unit = this.unitSet ? this.unit : DEFAULT_UNIT;
            if(unit == null)
                throw new NullPointerException("Property unit must not be null");


            return new OFPortDescPropBsnAlarmVer15(
                    alarmSet,
                    high,
                    highWarn,
                    low,
                    lowWarn,
                    alarmType,
                    unit
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortDescPropBsnAlarm> {
        @Override
        public OFPortDescPropBsnAlarm readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0xffff
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=0xffff(0xffff), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 31)
                throw new OFParseError("Wrong length: Expected=31(31), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property expType == 0x8L
            int expType = bb.readInt();
            if(expType != 0x8)
                throw new OFParseError("Wrong expType: Expected=0x8L(0x8L), got="+expType);
            Set<OFBsnModuleEepromAlarmSet> alarmSet = OFBsnModuleEepromAlarmSetSerializerVer15.readFrom(bb);
            long high = U32.f(bb.readInt());
            long highWarn = U32.f(bb.readInt());
            long low = U32.f(bb.readInt());
            long lowWarn = U32.f(bb.readInt());
            Set<OFBsnModuleEepromDiagType> alarmType = OFBsnModuleEepromDiagTypeSerializerVer15.readFrom(bb);
            Set<OFBsnUnitType> unit = OFBsnUnitTypeSerializerVer15.readFrom(bb);

            OFPortDescPropBsnAlarmVer15 portDescPropBsnAlarmVer15 = new OFPortDescPropBsnAlarmVer15(
                    alarmSet,
                      high,
                      highWarn,
                      low,
                      lowWarn,
                      alarmType,
                      unit
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescPropBsnAlarmVer15);
            return portDescPropBsnAlarmVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescPropBsnAlarmVer15Funnel FUNNEL = new OFPortDescPropBsnAlarmVer15Funnel();
    static class OFPortDescPropBsnAlarmVer15Funnel implements Funnel<OFPortDescPropBsnAlarmVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescPropBsnAlarmVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0xffff
            sink.putShort((short) 0xffff);
            // fixed value property length = 31
            sink.putShort((short) 0x1f);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property expType = 0x8L
            sink.putInt(0x8);
            OFBsnModuleEepromAlarmSetSerializerVer15.putTo(message.alarmSet, sink);
            sink.putLong(message.high);
            sink.putLong(message.highWarn);
            sink.putLong(message.low);
            sink.putLong(message.lowWarn);
            OFBsnModuleEepromDiagTypeSerializerVer15.putTo(message.alarmType, sink);
            OFBsnUnitTypeSerializerVer15.putTo(message.unit, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescPropBsnAlarmVer15> {
        @Override
        public void write(ByteBuf bb, OFPortDescPropBsnAlarmVer15 message) {
            // fixed value property type = 0xffff
            bb.writeShort((short) 0xffff);
            // fixed value property length = 31
            bb.writeShort((short) 0x1f);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property expType = 0x8L
            bb.writeInt(0x8);
            OFBsnModuleEepromAlarmSetSerializerVer15.writeTo(bb, message.alarmSet);
            bb.writeInt(U32.t(message.high));
            bb.writeInt(U32.t(message.highWarn));
            bb.writeInt(U32.t(message.low));
            bb.writeInt(U32.t(message.lowWarn));
            OFBsnModuleEepromDiagTypeSerializerVer15.writeTo(bb, message.alarmType);
            OFBsnUnitTypeSerializerVer15.writeTo(bb, message.unit);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescPropBsnAlarmVer15(");
        b.append("alarmSet=").append(alarmSet);
        b.append(", ");
        b.append("high=").append(high);
        b.append(", ");
        b.append("highWarn=").append(highWarn);
        b.append(", ");
        b.append("low=").append(low);
        b.append(", ");
        b.append("lowWarn=").append(lowWarn);
        b.append(", ");
        b.append("alarmType=").append(alarmType);
        b.append(", ");
        b.append("unit=").append(unit);
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
        OFPortDescPropBsnAlarmVer15 other = (OFPortDescPropBsnAlarmVer15) obj;

        if (alarmSet == null) {
            if (other.alarmSet != null)
                return false;
        } else if (!alarmSet.equals(other.alarmSet))
            return false;
        if( high != other.high)
            return false;
        if( highWarn != other.highWarn)
            return false;
        if( low != other.low)
            return false;
        if( lowWarn != other.lowWarn)
            return false;
        if (alarmType == null) {
            if (other.alarmType != null)
                return false;
        } else if (!alarmType.equals(other.alarmType))
            return false;
        if (unit == null) {
            if (other.unit != null)
                return false;
        } else if (!unit.equals(other.unit))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((alarmSet == null) ? 0 : alarmSet.hashCode());
        result = prime *  (int) (high ^ (high >>> 32));
        result = prime *  (int) (highWarn ^ (highWarn >>> 32));
        result = prime *  (int) (low ^ (low >>> 32));
        result = prime *  (int) (lowWarn ^ (lowWarn >>> 32));
        result = prime * result + ((alarmType == null) ? 0 : alarmType.hashCode());
        result = prime * result + ((unit == null) ? 0 : unit.hashCode());
        return result;
    }

}