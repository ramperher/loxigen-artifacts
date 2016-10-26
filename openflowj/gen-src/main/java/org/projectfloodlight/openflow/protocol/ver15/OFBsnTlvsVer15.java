// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
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
import java.util.List;


public class OFBsnTlvsVer15 implements OFBsnTlvs {
    public final static OFBsnTlvsVer15 INSTANCE = new OFBsnTlvsVer15();




    public OFBsnTlvActorKey.Builder buildActorKey() {
        return new OFBsnTlvActorKeyVer15.Builder();
    }
    public OFBsnTlvActorKey actorKey(int value) {
        return new OFBsnTlvActorKeyVer15(
                value
                    );
    }

    public OFBsnTlvActorPortNum.Builder buildActorPortNum() {
        return new OFBsnTlvActorPortNumVer15.Builder();
    }
    public OFBsnTlvActorPortNum actorPortNum(int value) {
        return new OFBsnTlvActorPortNumVer15(
                value
                    );
    }

    public OFBsnTlvActorPortPriority.Builder buildActorPortPriority() {
        return new OFBsnTlvActorPortPriorityVer15.Builder();
    }
    public OFBsnTlvActorPortPriority actorPortPriority(int value) {
        return new OFBsnTlvActorPortPriorityVer15(
                value
                    );
    }

    public OFBsnTlvActorState.Builder buildActorState() {
        return new OFBsnTlvActorStateVer15.Builder();
    }
    public OFBsnTlvActorState actorState(Set<OFBsnLacpState> value) {
        return new OFBsnTlvActorStateVer15(
                value
                    );
    }

    public OFBsnTlvActorSystemMac.Builder buildActorSystemMac() {
        return new OFBsnTlvActorSystemMacVer15.Builder();
    }
    public OFBsnTlvActorSystemMac actorSystemMac(MacAddress value) {
        return new OFBsnTlvActorSystemMacVer15(
                value
                    );
    }

    public OFBsnTlvActorSystemPriority.Builder buildActorSystemPriority() {
        return new OFBsnTlvActorSystemPriorityVer15.Builder();
    }
    public OFBsnTlvActorSystemPriority actorSystemPriority(int value) {
        return new OFBsnTlvActorSystemPriorityVer15(
                value
                    );
    }

    public OFBsnTlvAnchor.Builder buildAnchor() {
        return new OFBsnTlvAnchorVer15.Builder();
    }
    public OFBsnTlvAnchor anchor(OFBsnAnchor value) {
        return new OFBsnTlvAnchorVer15(
                value
                    );
    }

    public OFBsnTlvApplyBytes.Builder buildApplyBytes() {
        return new OFBsnTlvApplyBytesVer15.Builder();
    }
    public OFBsnTlvApplyBytes applyBytes(U64 value) {
        return new OFBsnTlvApplyBytesVer15(
                value
                    );
    }

    public OFBsnTlvApplyPackets.Builder buildApplyPackets() {
        return new OFBsnTlvApplyPacketsVer15.Builder();
    }
    public OFBsnTlvApplyPackets applyPackets(U64 value) {
        return new OFBsnTlvApplyPacketsVer15(
                value
                    );
    }

    public OFBsnTlvBroadcastQueryTimeout.Builder buildBroadcastQueryTimeout() {
        return new OFBsnTlvBroadcastQueryTimeoutVer15.Builder();
    }
    public OFBsnTlvBroadcastQueryTimeout broadcastQueryTimeout(long value) {
        return new OFBsnTlvBroadcastQueryTimeoutVer15(
                value
                    );
    }

    public OFBsnTlvBroadcastRate.Builder buildBroadcastRate() {
        return new OFBsnTlvBroadcastRateVer15.Builder();
    }
    public OFBsnTlvBroadcastRate broadcastRate(long value) {
        return new OFBsnTlvBroadcastRateVer15(
                value
                    );
    }

    public OFBsnTlvBucket.Builder buildBucket() {
        return new OFBsnTlvBucketVer15.Builder();
    }
    public OFBsnTlvBucket bucket(List<OFBsnTlv> value) {
        return new OFBsnTlvBucketVer15(
                value
                    );
    }

    public OFBsnTlvCircuitId.Builder buildCircuitId() {
        return new OFBsnTlvCircuitIdVer15.Builder();
    }
    public OFBsnTlvCircuitId circuitId(byte[] value) {
        return new OFBsnTlvCircuitIdVer15(
                value
                    );
    }

    public OFBsnTlvConvergenceStatus.Builder buildConvergenceStatus() {
        return new OFBsnTlvConvergenceStatusVer15.Builder();
    }
    public OFBsnTlvConvergenceStatus convergenceStatus(short value) {
        return new OFBsnTlvConvergenceStatusVer15(
                value
                    );
    }

    public OFBsnTlvCpuLag cpuLag() {
        return OFBsnTlvCpuLagVer15.INSTANCE;
    }

    public OFBsnTlvCrcEnabled.Builder buildCrcEnabled() {
        return new OFBsnTlvCrcEnabledVer15.Builder();
    }
    public OFBsnTlvCrcEnabled crcEnabled(short value) {
        return new OFBsnTlvCrcEnabledVer15(
                value
                    );
    }

    public OFBsnTlvData.Builder buildData() {
        return new OFBsnTlvDataVer15.Builder();
    }
    public OFBsnTlvData data(byte[] value) {
        return new OFBsnTlvDataVer15(
                value
                    );
    }

    public OFBsnTlvDataMask.Builder buildDataMask() {
        return new OFBsnTlvDataMaskVer15.Builder();
    }
    public OFBsnTlvDataMask dataMask(byte[] value) {
        return new OFBsnTlvDataMaskVer15(
                value
                    );
    }

    public OFBsnTlvDecap.Builder buildDecap() {
        return new OFBsnTlvDecapVer15.Builder();
    }
    public OFBsnTlvDecap decap(OFBsnDecap value) {
        return new OFBsnTlvDecapVer15(
                value
                    );
    }

    public OFBsnTlvDisableSrcMacCheck disableSrcMacCheck() {
        return OFBsnTlvDisableSrcMacCheckVer15.INSTANCE;
    }

    public OFBsnTlvDrop drop() {
        return OFBsnTlvDropVer15.INSTANCE;
    }

    public OFBsnTlvDscp.Builder buildDscp() {
        return new OFBsnTlvDscpVer15.Builder();
    }
    public OFBsnTlvDscp dscp(int value) {
        return new OFBsnTlvDscpVer15(
                value
                    );
    }

    public OFBsnTlvEcn.Builder buildEcn() {
        return new OFBsnTlvEcnVer15.Builder();
    }
    public OFBsnTlvEcn ecn(short value) {
        return new OFBsnTlvEcnVer15(
                value
                    );
    }

    public OFBsnTlvEgressOnly egressOnly() {
        return OFBsnTlvEgressOnlyVer15.INSTANCE;
    }

    public OFBsnTlvEgressPortGroupId.Builder buildEgressPortGroupId() {
        return new OFBsnTlvEgressPortGroupIdVer15.Builder();
    }
    public OFBsnTlvEgressPortGroupId egressPortGroupId(long value) {
        return new OFBsnTlvEgressPortGroupIdVer15(
                value
                    );
    }

    public OFBsnTlvEthDst.Builder buildEthDst() {
        return new OFBsnTlvEthDstVer15.Builder();
    }
    public OFBsnTlvEthDst ethDst(MacAddress value) {
        return new OFBsnTlvEthDstVer15(
                value
                    );
    }

    public OFBsnTlvEthSrc.Builder buildEthSrc() {
        return new OFBsnTlvEthSrcVer15.Builder();
    }
    public OFBsnTlvEthSrc ethSrc(MacAddress value) {
        return new OFBsnTlvEthSrcVer15(
                value
                    );
    }

    public OFBsnTlvEthType.Builder buildEthType() {
        return new OFBsnTlvEthTypeVer15.Builder();
    }
    public OFBsnTlvEthType ethType(int value) {
        return new OFBsnTlvEthTypeVer15(
                value
                    );
    }

    public OFBsnTlvExternalGatewayIp.Builder buildExternalGatewayIp() {
        return new OFBsnTlvExternalGatewayIpVer15.Builder();
    }
    public OFBsnTlvExternalGatewayIp externalGatewayIp(IPv4Address value) {
        return new OFBsnTlvExternalGatewayIpVer15(
                value
                    );
    }

    public OFBsnTlvExternalGatewayMac.Builder buildExternalGatewayMac() {
        return new OFBsnTlvExternalGatewayMacVer15.Builder();
    }
    public OFBsnTlvExternalGatewayMac externalGatewayMac(MacAddress value) {
        return new OFBsnTlvExternalGatewayMacVer15(
                value
                    );
    }

    public OFBsnTlvExternalIp.Builder buildExternalIp() {
        return new OFBsnTlvExternalIpVer15.Builder();
    }
    public OFBsnTlvExternalIp externalIp(IPv4Address value) {
        return new OFBsnTlvExternalIpVer15(
                value
                    );
    }

    public OFBsnTlvExternalMac.Builder buildExternalMac() {
        return new OFBsnTlvExternalMacVer15.Builder();
    }
    public OFBsnTlvExternalMac externalMac(MacAddress value) {
        return new OFBsnTlvExternalMacVer15(
                value
                    );
    }

    public OFBsnTlvExternalNetmask.Builder buildExternalNetmask() {
        return new OFBsnTlvExternalNetmaskVer15.Builder();
    }
    public OFBsnTlvExternalNetmask externalNetmask(IPv4Address value) {
        return new OFBsnTlvExternalNetmaskVer15(
                value
                    );
    }

    public OFBsnTlvGenerationId.Builder buildGenerationId() {
        return new OFBsnTlvGenerationIdVer15.Builder();
    }
    public OFBsnTlvGenerationId generationId(U64 value) {
        return new OFBsnTlvGenerationIdVer15(
                value
                    );
    }

    public OFBsnTlvHashGtpHeaderMatch.Builder buildHashGtpHeaderMatch() {
        return new OFBsnTlvHashGtpHeaderMatchVer15.Builder();
    }
    public OFBsnTlvHashGtpHeaderMatch hashGtpHeaderMatch(short firstHeaderByte, short firstHeaderMask) {
        return new OFBsnTlvHashGtpHeaderMatchVer15(
                firstHeaderByte,
                      firstHeaderMask
                    );
    }

    public OFBsnTlvHashGtpPortMatch.Builder buildHashGtpPortMatch() {
        return new OFBsnTlvHashGtpPortMatchVer15.Builder();
    }

    public OFBsnTlvHashPacketField.Builder buildHashPacketField() {
        return new OFBsnTlvHashPacketFieldVer15.Builder();
    }
    public OFBsnTlvHashPacketField hashPacketField(Set<OFBsnHashPacketField> value) {
        return new OFBsnTlvHashPacketFieldVer15(
                value
                    );
    }

    public OFBsnTlvHashPacketType.Builder buildHashPacketType() {
        return new OFBsnTlvHashPacketTypeVer15.Builder();
    }
    public OFBsnTlvHashPacketType hashPacketType(OFBsnHashPacketType value) {
        return new OFBsnTlvHashPacketTypeVer15(
                value
                    );
    }

    public OFBsnTlvHashSeed.Builder buildHashSeed() {
        return new OFBsnTlvHashSeedVer15.Builder();
    }
    public OFBsnTlvHashSeed hashSeed(long seed1, long seed2) {
        return new OFBsnTlvHashSeedVer15(
                seed1,
                      seed2
                    );
    }

    public OFBsnTlvHashType.Builder buildHashType() {
        return new OFBsnTlvHashTypeVer15.Builder();
    }
    public OFBsnTlvHashType hashType(OFBsnHashType value) {
        return new OFBsnTlvHashTypeVer15(
                value
                    );
    }

    public OFBsnTlvHeaderSize.Builder buildHeaderSize() {
        return new OFBsnTlvHeaderSizeVer15.Builder();
    }
    public OFBsnTlvHeaderSize headerSize(long value) {
        return new OFBsnTlvHeaderSizeVer15(
                value
                    );
    }

    public OFBsnTlvIcmpCode.Builder buildIcmpCode() {
        return new OFBsnTlvIcmpCodeVer15.Builder();
    }
    public OFBsnTlvIcmpCode icmpCode(short value) {
        return new OFBsnTlvIcmpCodeVer15(
                value
                    );
    }

    public OFBsnTlvIcmpId.Builder buildIcmpId() {
        return new OFBsnTlvIcmpIdVer15.Builder();
    }
    public OFBsnTlvIcmpId icmpId(int value) {
        return new OFBsnTlvIcmpIdVer15(
                value
                    );
    }

    public OFBsnTlvIcmpType.Builder buildIcmpType() {
        return new OFBsnTlvIcmpTypeVer15.Builder();
    }
    public OFBsnTlvIcmpType icmpType(short value) {
        return new OFBsnTlvIcmpTypeVer15(
                value
                    );
    }

    public OFBsnTlvIcmpv6Chksum.Builder buildIcmpv6Chksum() {
        return new OFBsnTlvIcmpv6ChksumVer15.Builder();
    }
    public OFBsnTlvIcmpv6Chksum icmpv6Chksum(int value) {
        return new OFBsnTlvIcmpv6ChksumVer15(
                value
                    );
    }

    public OFBsnTlvIdleNotification idleNotification() {
        return OFBsnTlvIdleNotificationVer15.INSTANCE;
    }

    public OFBsnTlvIdleTime.Builder buildIdleTime() {
        return new OFBsnTlvIdleTimeVer15.Builder();
    }
    public OFBsnTlvIdleTime idleTime(U64 value) {
        return new OFBsnTlvIdleTimeVer15(
                value
                    );
    }

    public OFBsnTlvIdleTimeout.Builder buildIdleTimeout() {
        return new OFBsnTlvIdleTimeoutVer15.Builder();
    }
    public OFBsnTlvIdleTimeout idleTimeout(long value) {
        return new OFBsnTlvIdleTimeoutVer15(
                value
                    );
    }

    public OFBsnTlvIgmpSnooping igmpSnooping() {
        return OFBsnTlvIgmpSnoopingVer15.INSTANCE;
    }

    public OFBsnTlvIngressPortGroupId.Builder buildIngressPortGroupId() {
        return new OFBsnTlvIngressPortGroupIdVer15.Builder();
    }
    public OFBsnTlvIngressPortGroupId ingressPortGroupId(long value) {
        return new OFBsnTlvIngressPortGroupIdVer15(
                value
                    );
    }

    public OFBsnTlvInternalGatewayMac.Builder buildInternalGatewayMac() {
        return new OFBsnTlvInternalGatewayMacVer15.Builder();
    }
    public OFBsnTlvInternalGatewayMac internalGatewayMac(MacAddress value) {
        return new OFBsnTlvInternalGatewayMacVer15(
                value
                    );
    }

    public OFBsnTlvInternalMac.Builder buildInternalMac() {
        return new OFBsnTlvInternalMacVer15.Builder();
    }
    public OFBsnTlvInternalMac internalMac(MacAddress value) {
        return new OFBsnTlvInternalMacVer15(
                value
                    );
    }

    public OFBsnTlvInterval.Builder buildInterval() {
        return new OFBsnTlvIntervalVer15.Builder();
    }
    public OFBsnTlvInterval interval(long value) {
        return new OFBsnTlvIntervalVer15(
                value
                    );
    }

    public OFBsnTlvIpProto.Builder buildIpProto() {
        return new OFBsnTlvIpProtoVer15.Builder();
    }
    public OFBsnTlvIpProto ipProto(short value) {
        return new OFBsnTlvIpProtoVer15(
                value
                    );
    }

    public OFBsnTlvIpv4.Builder buildIpv4() {
        return new OFBsnTlvIpv4Ver15.Builder();
    }
    public OFBsnTlvIpv4 ipv4(IPv4Address value) {
        return new OFBsnTlvIpv4Ver15(
                value
                    );
    }

    public OFBsnTlvIpv4Dst.Builder buildIpv4Dst() {
        return new OFBsnTlvIpv4DstVer15.Builder();
    }
    public OFBsnTlvIpv4Dst ipv4Dst(IPv4Address value) {
        return new OFBsnTlvIpv4DstVer15(
                value
                    );
    }

    public OFBsnTlvIpv4Netmask.Builder buildIpv4Netmask() {
        return new OFBsnTlvIpv4NetmaskVer15.Builder();
    }
    public OFBsnTlvIpv4Netmask ipv4Netmask(IPv4Address value) {
        return new OFBsnTlvIpv4NetmaskVer15(
                value
                    );
    }

    public OFBsnTlvIpv4Src.Builder buildIpv4Src() {
        return new OFBsnTlvIpv4SrcVer15.Builder();
    }
    public OFBsnTlvIpv4Src ipv4Src(IPv4Address value) {
        return new OFBsnTlvIpv4SrcVer15(
                value
                    );
    }

    public OFBsnTlvIpv6.Builder buildIpv6() {
        return new OFBsnTlvIpv6Ver15.Builder();
    }
    public OFBsnTlvIpv6 ipv6(IPv6Address value) {
        return new OFBsnTlvIpv6Ver15(
                value
                    );
    }

    public OFBsnTlvIpv6Dst.Builder buildIpv6Dst() {
        return new OFBsnTlvIpv6DstVer15.Builder();
    }
    public OFBsnTlvIpv6Dst ipv6Dst(IPv6Address value) {
        return new OFBsnTlvIpv6DstVer15(
                value
                    );
    }

    public OFBsnTlvIpv6Prefix.Builder buildIpv6Prefix() {
        return new OFBsnTlvIpv6PrefixVer15.Builder();
    }
    public OFBsnTlvIpv6Prefix ipv6Prefix(IPv6Address value, short prefixLength) {
        return new OFBsnTlvIpv6PrefixVer15(
                value,
                      prefixLength
                    );
    }

    public OFBsnTlvIpv6Src.Builder buildIpv6Src() {
        return new OFBsnTlvIpv6SrcVer15.Builder();
    }
    public OFBsnTlvIpv6Src ipv6Src(IPv6Address value) {
        return new OFBsnTlvIpv6SrcVer15(
                value
                    );
    }

    public OFBsnTlvKnownMulticastRate.Builder buildKnownMulticastRate() {
        return new OFBsnTlvKnownMulticastRateVer15.Builder();
    }
    public OFBsnTlvKnownMulticastRate knownMulticastRate(long value) {
        return new OFBsnTlvKnownMulticastRateVer15(
                value
                    );
    }

    public OFBsnTlvL2MulticastLookup l2MulticastLookup() {
        return OFBsnTlvL2MulticastLookupVer15.INSTANCE;
    }

    public OFBsnTlvL3DstClassId.Builder buildL3DstClassId() {
        return new OFBsnTlvL3DstClassIdVer15.Builder();
    }
    public OFBsnTlvL3DstClassId l3DstClassId(long value) {
        return new OFBsnTlvL3DstClassIdVer15(
                value
                    );
    }

    public OFBsnTlvL3InterfaceClassId.Builder buildL3InterfaceClassId() {
        return new OFBsnTlvL3InterfaceClassIdVer15.Builder();
    }
    public OFBsnTlvL3InterfaceClassId l3InterfaceClassId(long value) {
        return new OFBsnTlvL3InterfaceClassIdVer15(
                value
                    );
    }

    public OFBsnTlvL3SrcClassId.Builder buildL3SrcClassId() {
        return new OFBsnTlvL3SrcClassIdVer15.Builder();
    }
    public OFBsnTlvL3SrcClassId l3SrcClassId(long value) {
        return new OFBsnTlvL3SrcClassIdVer15(
                value
                    );
    }

    public OFBsnTlvLoopbackPort.Builder buildLoopbackPort() {
        return new OFBsnTlvLoopbackPortVer15.Builder();
    }
    public OFBsnTlvLoopbackPort loopbackPort(OFPort value) {
        return new OFBsnTlvLoopbackPortVer15(
                value
                    );
    }

    public OFBsnTlvMac.Builder buildMac() {
        return new OFBsnTlvMacVer15.Builder();
    }
    public OFBsnTlvMac mac(MacAddress value) {
        return new OFBsnTlvMacVer15(
                value
                    );
    }

    public OFBsnTlvMacMask.Builder buildMacMask() {
        return new OFBsnTlvMacMaskVer15.Builder();
    }
    public OFBsnTlvMacMask macMask(MacAddress value) {
        return new OFBsnTlvMacMaskVer15(
                value
                    );
    }

    public OFBsnTlvMcgTypeVxlan mcgTypeVxlan() {
        return OFBsnTlvMcgTypeVxlanVer15.INSTANCE;
    }

    public OFBsnTlvMissPackets.Builder buildMissPackets() {
        return new OFBsnTlvMissPacketsVer15.Builder();
    }
    public OFBsnTlvMissPackets missPackets(U64 value) {
        return new OFBsnTlvMissPacketsVer15(
                value
                    );
    }

    public OFBsnTlvMplsControlWord.Builder buildMplsControlWord() {
        return new OFBsnTlvMplsControlWordVer15.Builder();
    }
    public OFBsnTlvMplsControlWord mplsControlWord(short value) {
        return new OFBsnTlvMplsControlWordVer15(
                value
                    );
    }

    public OFBsnTlvMplsLabel.Builder buildMplsLabel() {
        return new OFBsnTlvMplsLabelVer15.Builder();
    }
    public OFBsnTlvMplsLabel mplsLabel(long value) {
        return new OFBsnTlvMplsLabelVer15(
                value
                    );
    }

    public OFBsnTlvMplsSequenced.Builder buildMplsSequenced() {
        return new OFBsnTlvMplsSequencedVer15.Builder();
    }
    public OFBsnTlvMplsSequenced mplsSequenced(short value) {
        return new OFBsnTlvMplsSequencedVer15(
                value
                    );
    }

    public OFBsnTlvMulticastInterfaceId.Builder buildMulticastInterfaceId() {
        return new OFBsnTlvMulticastInterfaceIdVer15.Builder();
    }
    public OFBsnTlvMulticastInterfaceId multicastInterfaceId(long value) {
        return new OFBsnTlvMulticastInterfaceIdVer15(
                value
                    );
    }

    public OFBsnTlvName.Builder buildName() {
        return new OFBsnTlvNameVer15.Builder();
    }
    public OFBsnTlvName name(byte[] value) {
        return new OFBsnTlvNameVer15(
                value
                    );
    }

    public OFBsnTlvNdpOffload ndpOffload() {
        return OFBsnTlvNdpOffloadVer15.INSTANCE;
    }

    public OFBsnTlvNdpStatic ndpStatic() {
        return OFBsnTlvNdpStaticVer15.INSTANCE;
    }

    public OFBsnTlvNegate negate() {
        return OFBsnTlvNegateVer15.INSTANCE;
    }

    public OFBsnTlvNextHopIpv4.Builder buildNextHopIpv4() {
        return new OFBsnTlvNextHopIpv4Ver15.Builder();
    }
    public OFBsnTlvNextHopIpv4 nextHopIpv4(IPv4Address value) {
        return new OFBsnTlvNextHopIpv4Ver15(
                value
                    );
    }

    public OFBsnTlvNextHopMac.Builder buildNextHopMac() {
        return new OFBsnTlvNextHopMacVer15.Builder();
    }
    public OFBsnTlvNextHopMac nextHopMac(MacAddress value) {
        return new OFBsnTlvNextHopMacVer15(
                value
                    );
    }

    public OFBsnTlvNexthopTypeVxlan nexthopTypeVxlan() {
        return OFBsnTlvNexthopTypeVxlanVer15.INSTANCE;
    }

    public OFBsnTlvOffset.Builder buildOffset() {
        return new OFBsnTlvOffsetVer15.Builder();
    }
    public OFBsnTlvOffset offset(int value) {
        return new OFBsnTlvOffsetVer15(
                value
                    );
    }

    public OFBsnTlvParentPort.Builder buildParentPort() {
        return new OFBsnTlvParentPortVer15.Builder();
    }
    public OFBsnTlvParentPort parentPort(OFPort value) {
        return new OFBsnTlvParentPortVer15(
                value
                    );
    }

    public OFBsnTlvPartnerKey.Builder buildPartnerKey() {
        return new OFBsnTlvPartnerKeyVer15.Builder();
    }
    public OFBsnTlvPartnerKey partnerKey(int value) {
        return new OFBsnTlvPartnerKeyVer15(
                value
                    );
    }

    public OFBsnTlvPartnerPortNum.Builder buildPartnerPortNum() {
        return new OFBsnTlvPartnerPortNumVer15.Builder();
    }
    public OFBsnTlvPartnerPortNum partnerPortNum(int value) {
        return new OFBsnTlvPartnerPortNumVer15(
                value
                    );
    }

    public OFBsnTlvPartnerPortPriority.Builder buildPartnerPortPriority() {
        return new OFBsnTlvPartnerPortPriorityVer15.Builder();
    }
    public OFBsnTlvPartnerPortPriority partnerPortPriority(int value) {
        return new OFBsnTlvPartnerPortPriorityVer15(
                value
                    );
    }

    public OFBsnTlvPartnerState.Builder buildPartnerState() {
        return new OFBsnTlvPartnerStateVer15.Builder();
    }
    public OFBsnTlvPartnerState partnerState(Set<OFBsnLacpState> value) {
        return new OFBsnTlvPartnerStateVer15(
                value
                    );
    }

    public OFBsnTlvPartnerSystemMac.Builder buildPartnerSystemMac() {
        return new OFBsnTlvPartnerSystemMacVer15.Builder();
    }
    public OFBsnTlvPartnerSystemMac partnerSystemMac(MacAddress value) {
        return new OFBsnTlvPartnerSystemMacVer15(
                value
                    );
    }

    public OFBsnTlvPartnerSystemPriority.Builder buildPartnerSystemPriority() {
        return new OFBsnTlvPartnerSystemPriorityVer15.Builder();
    }
    public OFBsnTlvPartnerSystemPriority partnerSystemPriority(int value) {
        return new OFBsnTlvPartnerSystemPriorityVer15(
                value
                    );
    }

    public OFBsnTlvPort.Builder buildPort() {
        return new OFBsnTlvPortVer15.Builder();
    }
    public OFBsnTlvPort port(OFPort value) {
        return new OFBsnTlvPortVer15(
                value
                    );
    }

    public OFBsnTlvPortUsage.Builder buildPortUsage() {
        return new OFBsnTlvPortUsageVer15.Builder();
    }
    public OFBsnTlvPortUsage portUsage(OFBsnPortUsage value) {
        return new OFBsnTlvPortUsageVer15(
                value
                    );
    }

    public OFBsnTlvPortVxlanMode.Builder buildPortVxlanMode() {
        return new OFBsnTlvPortVxlanModeVer15.Builder();
    }
    public OFBsnTlvPortVxlanMode portVxlanMode(OFBsnPortVxlanMode value) {
        return new OFBsnTlvPortVxlanModeVer15(
                value
                    );
    }

    public OFBsnTlvPriority.Builder buildPriority() {
        return new OFBsnTlvPriorityVer15.Builder();
    }
    public OFBsnTlvPriority priority(long value) {
        return new OFBsnTlvPriorityVer15(
                value
                    );
    }

    public OFBsnTlvPushVlanOnIngress pushVlanOnIngress() {
        return OFBsnTlvPushVlanOnIngressVer15.INSTANCE;
    }

    public OFBsnTlvQosPriority.Builder buildQosPriority() {
        return new OFBsnTlvQosPriorityVer15.Builder();
    }
    public OFBsnTlvQosPriority qosPriority(long value) {
        return new OFBsnTlvQosPriorityVer15(
                value
                    );
    }

    public OFBsnTlvQueueId.Builder buildQueueId() {
        return new OFBsnTlvQueueIdVer15.Builder();
    }
    public OFBsnTlvQueueId queueId(long value) {
        return new OFBsnTlvQueueIdVer15(
                value
                    );
    }

    public OFBsnTlvQueueWeight.Builder buildQueueWeight() {
        return new OFBsnTlvQueueWeightVer15.Builder();
    }
    public OFBsnTlvQueueWeight queueWeight(long value) {
        return new OFBsnTlvQueueWeightVer15(
                value
                    );
    }

    public OFBsnTlvRateLimit.Builder buildRateLimit() {
        return new OFBsnTlvRateLimitVer15.Builder();
    }
    public OFBsnTlvRateLimit rateLimit(long value) {
        return new OFBsnTlvRateLimitVer15(
                value
                    );
    }

    public OFBsnTlvRateUnit.Builder buildRateUnit() {
        return new OFBsnTlvRateUnitVer15.Builder();
    }
    public OFBsnTlvRateUnit rateUnit(OFBsnRateUnit value) {
        return new OFBsnTlvRateUnitVer15(
                value
                    );
    }

    public OFBsnTlvReference.Builder buildReference() {
        return new OFBsnTlvReferenceVer15.Builder();
    }
    public OFBsnTlvReference reference(int tableId, List<OFBsnTlv> key) {
        return new OFBsnTlvReferenceVer15(
                tableId,
                      key
                    );
    }

    public OFBsnTlvReplyPackets.Builder buildReplyPackets() {
        return new OFBsnTlvReplyPacketsVer15.Builder();
    }
    public OFBsnTlvReplyPackets replyPackets(U64 value) {
        return new OFBsnTlvReplyPacketsVer15(
                value
                    );
    }

    public OFBsnTlvRequestPackets.Builder buildRequestPackets() {
        return new OFBsnTlvRequestPacketsVer15.Builder();
    }
    public OFBsnTlvRequestPackets requestPackets(U64 value) {
        return new OFBsnTlvRequestPacketsVer15(
                value
                    );
    }

    public OFBsnTlvRxBytes.Builder buildRxBytes() {
        return new OFBsnTlvRxBytesVer15.Builder();
    }
    public OFBsnTlvRxBytes rxBytes(U64 value) {
        return new OFBsnTlvRxBytesVer15(
                value
                    );
    }

    public OFBsnTlvRxPackets.Builder buildRxPackets() {
        return new OFBsnTlvRxPacketsVer15.Builder();
    }
    public OFBsnTlvRxPackets rxPackets(U64 value) {
        return new OFBsnTlvRxPacketsVer15(
                value
                    );
    }

    public OFBsnTlvSamplingRate.Builder buildSamplingRate() {
        return new OFBsnTlvSamplingRateVer15.Builder();
    }
    public OFBsnTlvSamplingRate samplingRate(long value) {
        return new OFBsnTlvSamplingRateVer15(
                value
                    );
    }

    public OFBsnTlvSetLoopbackMode setLoopbackMode() {
        return OFBsnTlvSetLoopbackModeVer15.INSTANCE;
    }

    public OFBsnTlvStatus.Builder buildStatus() {
        return new OFBsnTlvStatusVer15.Builder();
    }
    public OFBsnTlvStatus status(OFBsnStatus value) {
        return new OFBsnTlvStatusVer15(
                value
                    );
    }

    public OFBsnTlvStripMplsL2OnIngress stripMplsL2OnIngress() {
        return OFBsnTlvStripMplsL2OnIngressVer15.INSTANCE;
    }

    public OFBsnTlvStripMplsL3OnIngress stripMplsL3OnIngress() {
        return OFBsnTlvStripMplsL3OnIngressVer15.INSTANCE;
    }

    public OFBsnTlvStripVlanOnEgress stripVlanOnEgress() {
        return OFBsnTlvStripVlanOnEgressVer15.INSTANCE;
    }

    public OFBsnTlvSubAgentId.Builder buildSubAgentId() {
        return new OFBsnTlvSubAgentIdVer15.Builder();
    }
    public OFBsnTlvSubAgentId subAgentId(long value) {
        return new OFBsnTlvSubAgentIdVer15(
                value
                    );
    }

    public OFBsnTlvTcpDst.Builder buildTcpDst() {
        return new OFBsnTlvTcpDstVer15.Builder();
    }
    public OFBsnTlvTcpDst tcpDst(int value) {
        return new OFBsnTlvTcpDstVer15(
                value
                    );
    }

    public OFBsnTlvTcpFlags.Builder buildTcpFlags() {
        return new OFBsnTlvTcpFlagsVer15.Builder();
    }
    public OFBsnTlvTcpFlags tcpFlags(int value) {
        return new OFBsnTlvTcpFlagsVer15(
                value
                    );
    }

    public OFBsnTlvTcpSrc.Builder buildTcpSrc() {
        return new OFBsnTlvTcpSrcVer15.Builder();
    }
    public OFBsnTlvTcpSrc tcpSrc(int value) {
        return new OFBsnTlvTcpSrcVer15(
                value
                    );
    }

    public OFBsnTlvTtl.Builder buildTtl() {
        return new OFBsnTlvTtlVer15.Builder();
    }
    public OFBsnTlvTtl ttl(int value) {
        return new OFBsnTlvTtlVer15(
                value
                    );
    }

    public OFBsnTlvTxBytes.Builder buildTxBytes() {
        return new OFBsnTlvTxBytesVer15.Builder();
    }
    public OFBsnTlvTxBytes txBytes(U64 value) {
        return new OFBsnTlvTxBytesVer15(
                value
                    );
    }

    public OFBsnTlvTxPackets.Builder buildTxPackets() {
        return new OFBsnTlvTxPacketsVer15.Builder();
    }
    public OFBsnTlvTxPackets txPackets(U64 value) {
        return new OFBsnTlvTxPacketsVer15(
                value
                    );
    }

    public OFBsnTlvUdfAnchor.Builder buildUdfAnchor() {
        return new OFBsnTlvUdfAnchorVer15.Builder();
    }
    public OFBsnTlvUdfAnchor udfAnchor(OFBsnUdfAnchor value) {
        return new OFBsnTlvUdfAnchorVer15(
                value
                    );
    }

    public OFBsnTlvUdfId.Builder buildUdfId() {
        return new OFBsnTlvUdfIdVer15.Builder();
    }
    public OFBsnTlvUdfId udfId(int value) {
        return new OFBsnTlvUdfIdVer15(
                value
                    );
    }

    public OFBsnTlvUdfLength.Builder buildUdfLength() {
        return new OFBsnTlvUdfLengthVer15.Builder();
    }
    public OFBsnTlvUdfLength udfLength(int value) {
        return new OFBsnTlvUdfLengthVer15(
                value
                    );
    }

    public OFBsnTlvUdfOffset.Builder buildUdfOffset() {
        return new OFBsnTlvUdfOffsetVer15.Builder();
    }
    public OFBsnTlvUdfOffset udfOffset(int value) {
        return new OFBsnTlvUdfOffsetVer15(
                value
                    );
    }

    public OFBsnTlvUdpDst.Builder buildUdpDst() {
        return new OFBsnTlvUdpDstVer15.Builder();
    }
    public OFBsnTlvUdpDst udpDst(int value) {
        return new OFBsnTlvUdpDstVer15(
                value
                    );
    }

    public OFBsnTlvUdpSrc.Builder buildUdpSrc() {
        return new OFBsnTlvUdpSrcVer15.Builder();
    }
    public OFBsnTlvUdpSrc udpSrc(int value) {
        return new OFBsnTlvUdpSrcVer15(
                value
                    );
    }

    public OFBsnTlvUint64List.Builder buildUint64List() {
        return new OFBsnTlvUint64ListVer15.Builder();
    }
    public OFBsnTlvUint64List uint64List(List<U64> value) {
        return new OFBsnTlvUint64ListVer15(
                value
                    );
    }

    public OFBsnTlvUnicastQueryTimeout.Builder buildUnicastQueryTimeout() {
        return new OFBsnTlvUnicastQueryTimeoutVer15.Builder();
    }
    public OFBsnTlvUnicastQueryTimeout unicastQueryTimeout(long value) {
        return new OFBsnTlvUnicastQueryTimeoutVer15(
                value
                    );
    }

    public OFBsnTlvUnicastRate.Builder buildUnicastRate() {
        return new OFBsnTlvUnicastRateVer15.Builder();
    }
    public OFBsnTlvUnicastRate unicastRate(long value) {
        return new OFBsnTlvUnicastRateVer15(
                value
                    );
    }

    public OFBsnTlvUnknownMulticastRate.Builder buildUnknownMulticastRate() {
        return new OFBsnTlvUnknownMulticastRateVer15.Builder();
    }
    public OFBsnTlvUnknownMulticastRate unknownMulticastRate(long value) {
        return new OFBsnTlvUnknownMulticastRateVer15(
                value
                    );
    }

    public OFBsnTlvUntagged untagged() {
        return OFBsnTlvUntaggedVer15.INSTANCE;
    }

    public OFBsnTlvUsePacketState.Builder buildUsePacketState() {
        return new OFBsnTlvUsePacketStateVer15.Builder();
    }
    public OFBsnTlvUsePacketState usePacketState(short value) {
        return new OFBsnTlvUsePacketStateVer15(
                value
                    );
    }

    public OFBsnTlvVfi.Builder buildVfi() {
        return new OFBsnTlvVfiVer15.Builder();
    }
    public OFBsnTlvVfi vfi(int value) {
        return new OFBsnTlvVfiVer15(
                value
                    );
    }

    public OFBsnTlvVfpClassId.Builder buildVfpClassId() {
        return new OFBsnTlvVfpClassIdVer15.Builder();
    }
    public OFBsnTlvVfpClassId vfpClassId(long value) {
        return new OFBsnTlvVfpClassIdVer15(
                value
                    );
    }

    public OFBsnTlvVlanMacList.Builder buildVlanMacList() {
        return new OFBsnTlvVlanMacListVer15.Builder();
    }
    public OFBsnTlvVlanMacList vlanMacList(List<OFBsnVlanMac> key) {
        return new OFBsnTlvVlanMacListVer15(
                key
                    );
    }

    public OFBsnTlvVlanPcp.Builder buildVlanPcp() {
        return new OFBsnTlvVlanPcpVer15.Builder();
    }
    public OFBsnTlvVlanPcp vlanPcp(short value) {
        return new OFBsnTlvVlanPcpVer15(
                value
                    );
    }

    public OFBsnTlvVlanVid.Builder buildVlanVid() {
        return new OFBsnTlvVlanVidVer15.Builder();
    }
    public OFBsnTlvVlanVid vlanVid(VlanVid value) {
        return new OFBsnTlvVlanVidVer15(
                value
                    );
    }

    public OFBsnTlvVlanVidMask.Builder buildVlanVidMask() {
        return new OFBsnTlvVlanVidMaskVer15.Builder();
    }
    public OFBsnTlvVlanVidMask vlanVidMask(int value) {
        return new OFBsnTlvVlanVidMaskVer15(
                value
                    );
    }

    public OFBsnTlvVni.Builder buildVni() {
        return new OFBsnTlvVniVer15.Builder();
    }
    public OFBsnTlvVni vni(long value) {
        return new OFBsnTlvVniVer15(
                value
                    );
    }

    public OFBsnTlvVpnKey.Builder buildVpnKey() {
        return new OFBsnTlvVpnKeyVer15.Builder();
    }
    public OFBsnTlvVpnKey vpnKey(long value) {
        return new OFBsnTlvVpnKeyVer15(
                value
                    );
    }

    public OFBsnTlvVrf.Builder buildVrf() {
        return new OFBsnTlvVrfVer15.Builder();
    }
    public OFBsnTlvVrf vrf(long value) {
        return new OFBsnTlvVrfVer15(
                value
                    );
    }

    public OFBsnTlvVxlanEgressLag vxlanEgressLag() {
        return OFBsnTlvVxlanEgressLagVer15.INSTANCE;
    }

    public OFMessageReader<OFBsnTlv> getReader() {
        return OFBsnTlvVer15.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_15;
    }
}
