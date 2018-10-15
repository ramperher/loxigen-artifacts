// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol.bsntlv;

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

public interface OFBsnTlvs {
    // Subfactories

    OFBsnTlvActorKey.Builder buildActorKey() throws UnsupportedOperationException;
    OFBsnTlvActorKey actorKey(int value);
    OFBsnTlvActorPortNum.Builder buildActorPortNum() throws UnsupportedOperationException;
    OFBsnTlvActorPortNum actorPortNum(int value);
    OFBsnTlvActorPortPriority.Builder buildActorPortPriority() throws UnsupportedOperationException;
    OFBsnTlvActorPortPriority actorPortPriority(int value);
    OFBsnTlvActorState.Builder buildActorState() throws UnsupportedOperationException;
    OFBsnTlvActorState actorState(Set<OFBsnLacpState> value);
    OFBsnTlvActorSystemMac.Builder buildActorSystemMac() throws UnsupportedOperationException;
    OFBsnTlvActorSystemMac actorSystemMac(MacAddress value);
    OFBsnTlvActorSystemPriority.Builder buildActorSystemPriority() throws UnsupportedOperationException;
    OFBsnTlvActorSystemPriority actorSystemPriority(int value);
    OFBsnTlvAnchor.Builder buildAnchor() throws UnsupportedOperationException;
    OFBsnTlvAnchor anchor(OFBsnAnchor value);
    OFBsnTlvApplyBytes.Builder buildApplyBytes() throws UnsupportedOperationException;
    OFBsnTlvApplyBytes applyBytes(U64 value);
    OFBsnTlvApplyPackets.Builder buildApplyPackets() throws UnsupportedOperationException;
    OFBsnTlvApplyPackets applyPackets(U64 value);
    OFBsnTlvAutoNegotiation.Builder buildAutoNegotiation() throws UnsupportedOperationException;
    OFBsnTlvAutoNegotiation autoNegotiation(OFBsnAutoNegotiationType value);
    OFBsnTlvBfdEndpoint.Builder buildBfdEndpoint() throws UnsupportedOperationException;
    OFBsnTlvBfdEndpoint bfdEndpoint(OFBsnBfdEndpoint value);
    OFBsnTlvBfdState.Builder buildBfdState() throws UnsupportedOperationException;
    OFBsnTlvBfdState bfdState(OFBsnBfdEndpointState value);
    OFBsnTlvBroadcastQueryTimeout.Builder buildBroadcastQueryTimeout() throws UnsupportedOperationException;
    OFBsnTlvBroadcastQueryTimeout broadcastQueryTimeout(long value);
    OFBsnTlvBroadcastRate.Builder buildBroadcastRate() throws UnsupportedOperationException;
    OFBsnTlvBroadcastRate broadcastRate(long value);
    OFBsnTlvBucket.Builder buildBucket() throws UnsupportedOperationException;
    OFBsnTlvBucket bucket(List<OFBsnTlv> value);
    OFBsnTlvCircuitId.Builder buildCircuitId() throws UnsupportedOperationException;
    OFBsnTlvCircuitId circuitId(byte[] value);
    OFBsnTlvConvergenceStatus.Builder buildConvergenceStatus() throws UnsupportedOperationException;
    OFBsnTlvConvergenceStatus convergenceStatus(short value);
    OFBsnTlvCpuLag cpuLag();
    OFBsnTlvCrcEnabled.Builder buildCrcEnabled() throws UnsupportedOperationException;
    OFBsnTlvCrcEnabled crcEnabled(short value);
    OFBsnTlvData.Builder buildData() throws UnsupportedOperationException;
    OFBsnTlvData data(byte[] value);
    OFBsnTlvDataMask.Builder buildDataMask() throws UnsupportedOperationException;
    OFBsnTlvDataMask dataMask(byte[] value);
    OFBsnTlvDecap.Builder buildDecap() throws UnsupportedOperationException;
    OFBsnTlvDecap decap(OFBsnDecap value);
    OFBsnTlvDisableSrcMacCheck disableSrcMacCheck();
    OFBsnTlvDrop drop();
    OFBsnTlvDscp.Builder buildDscp() throws UnsupportedOperationException;
    OFBsnTlvDscp dscp(int value);
    OFBsnTlvEcn.Builder buildEcn() throws UnsupportedOperationException;
    OFBsnTlvEcn ecn(short value);
    OFBsnTlvEgressOnly egressOnly();
    OFBsnTlvEgressPortGroupId.Builder buildEgressPortGroupId() throws UnsupportedOperationException;
    OFBsnTlvEgressPortGroupId egressPortGroupId(long value);
    OFBsnTlvEncap.Builder buildEncap() throws UnsupportedOperationException;
    OFBsnTlvEncap encap(OFBsnEncap value);
    OFBsnTlvEnhancedHashCapability.Builder buildEnhancedHashCapability() throws UnsupportedOperationException;
    OFBsnTlvEnhancedHashCapability enhancedHashCapability(Set<OFBsnEnhancedHashType> value);
    OFBsnTlvEthDst.Builder buildEthDst() throws UnsupportedOperationException;
    OFBsnTlvEthDst ethDst(MacAddress value);
    OFBsnTlvEthSrc.Builder buildEthSrc() throws UnsupportedOperationException;
    OFBsnTlvEthSrc ethSrc(MacAddress value);
    OFBsnTlvEthType.Builder buildEthType() throws UnsupportedOperationException;
    OFBsnTlvEthType ethType(int value);
    OFBsnTlvExternalGatewayIp.Builder buildExternalGatewayIp() throws UnsupportedOperationException;
    OFBsnTlvExternalGatewayIp externalGatewayIp(IPv4Address value);
    OFBsnTlvExternalGatewayMac.Builder buildExternalGatewayMac() throws UnsupportedOperationException;
    OFBsnTlvExternalGatewayMac externalGatewayMac(MacAddress value);
    OFBsnTlvExternalIp.Builder buildExternalIp() throws UnsupportedOperationException;
    OFBsnTlvExternalIp externalIp(IPv4Address value);
    OFBsnTlvExternalMac.Builder buildExternalMac() throws UnsupportedOperationException;
    OFBsnTlvExternalMac externalMac(MacAddress value);
    OFBsnTlvExternalNetmask.Builder buildExternalNetmask() throws UnsupportedOperationException;
    OFBsnTlvExternalNetmask externalNetmask(IPv4Address value);
    OFBsnTlvFabricPortRole.Builder buildFabricPortRole() throws UnsupportedOperationException;
    OFBsnTlvFabricPortRole fabricPortRole(OFBsnFabricPortRole value);
    OFBsnTlvFlood flood();
    OFBsnTlvFlowClassifier.Builder buildFlowClassifier() throws UnsupportedOperationException;
    OFBsnTlvFlowClassifier flowClassifier(OFBsnFlowClassifier value);
    OFBsnTlvFlowClassify flowClassify();
    OFBsnTlvFlowIdentifier.Builder buildFlowIdentifier() throws UnsupportedOperationException;
    OFBsnTlvFlowIdentifier flowIdentifier(long value);
    OFBsnTlvForceLinkUp forceLinkUp();
    OFBsnTlvForwardErrorCorrection.Builder buildForwardErrorCorrection() throws UnsupportedOperationException;
    OFBsnTlvForwardErrorCorrection forwardErrorCorrection(OFBsnForwardErrorCorrectionType value);
    OFBsnTlvGenerationId.Builder buildGenerationId() throws UnsupportedOperationException;
    OFBsnTlvGenerationId generationId(U64 value);
    OFBsnTlvHashAlgorithm.Builder buildHashAlgorithm() throws UnsupportedOperationException;
    OFBsnTlvHashAlgorithm hashAlgorithm(OFBsnHashAlgorithmType value);
    OFBsnTlvHashGtpHeaderMatch.Builder buildHashGtpHeaderMatch() throws UnsupportedOperationException;
    OFBsnTlvHashGtpHeaderMatch hashGtpHeaderMatch(short firstHeaderByte, short firstHeaderMask);
    OFBsnTlvHashGtpPortMatch.Builder buildHashGtpPortMatch() throws UnsupportedOperationException;
    OFBsnTlvHashPacketField.Builder buildHashPacketField() throws UnsupportedOperationException;
    OFBsnTlvHashPacketField hashPacketField(Set<OFBsnHashPacketField> value);
    OFBsnTlvHashPacketType.Builder buildHashPacketType() throws UnsupportedOperationException;
    OFBsnTlvHashPacketType hashPacketType(OFBsnHashPacketType value);
    OFBsnTlvHashSeed.Builder buildHashSeed() throws UnsupportedOperationException;
    OFBsnTlvHashSeed hashSeed(long seed1, long seed2);
    OFBsnTlvHashType.Builder buildHashType() throws UnsupportedOperationException;
    OFBsnTlvHashType hashType(OFBsnHashType value);
    OFBsnTlvHeaderSize.Builder buildHeaderSize() throws UnsupportedOperationException;
    OFBsnTlvHeaderSize headerSize(long value);
    OFBsnTlvIcmpCode.Builder buildIcmpCode() throws UnsupportedOperationException;
    OFBsnTlvIcmpCode icmpCode(short value);
    OFBsnTlvIcmpId.Builder buildIcmpId() throws UnsupportedOperationException;
    OFBsnTlvIcmpId icmpId(int value);
    OFBsnTlvIcmpType.Builder buildIcmpType() throws UnsupportedOperationException;
    OFBsnTlvIcmpType icmpType(short value);
    OFBsnTlvIcmpv6Chksum.Builder buildIcmpv6Chksum() throws UnsupportedOperationException;
    OFBsnTlvIcmpv6Chksum icmpv6Chksum(int value);
    OFBsnTlvIdentifier.Builder buildIdentifier() throws UnsupportedOperationException;
    OFBsnTlvIdentifier identifier(long value);
    OFBsnTlvIdleNotification idleNotification();
    OFBsnTlvIdleTime.Builder buildIdleTime() throws UnsupportedOperationException;
    OFBsnTlvIdleTime idleTime(U64 value);
    OFBsnTlvIdleTimeout.Builder buildIdleTimeout() throws UnsupportedOperationException;
    OFBsnTlvIdleTimeout idleTimeout(long value);
    OFBsnTlvIgmpSnooping igmpSnooping();
    OFBsnTlvIngressPortGroupId.Builder buildIngressPortGroupId() throws UnsupportedOperationException;
    OFBsnTlvIngressPortGroupId ingressPortGroupId(long value);
    OFBsnTlvInternalGatewayMac.Builder buildInternalGatewayMac() throws UnsupportedOperationException;
    OFBsnTlvInternalGatewayMac internalGatewayMac(MacAddress value);
    OFBsnTlvInternalMac.Builder buildInternalMac() throws UnsupportedOperationException;
    OFBsnTlvInternalMac internalMac(MacAddress value);
    OFBsnTlvInterval.Builder buildInterval() throws UnsupportedOperationException;
    OFBsnTlvInterval interval(long value);
    OFBsnTlvIpProto.Builder buildIpProto() throws UnsupportedOperationException;
    OFBsnTlvIpProto ipProto(short value);
    OFBsnTlvIpTunnelType.Builder buildIpTunnelType() throws UnsupportedOperationException;
    OFBsnTlvIpTunnelType ipTunnelType(OFBsnIpTunnelType value);
    OFBsnTlvIpv4.Builder buildIpv4() throws UnsupportedOperationException;
    OFBsnTlvIpv4 ipv4(IPv4Address value);
    OFBsnTlvIpv4Dst.Builder buildIpv4Dst() throws UnsupportedOperationException;
    OFBsnTlvIpv4Dst ipv4Dst(IPv4Address value);
    OFBsnTlvIpv4Netmask.Builder buildIpv4Netmask() throws UnsupportedOperationException;
    OFBsnTlvIpv4Netmask ipv4Netmask(IPv4Address value);
    OFBsnTlvIpv4Src.Builder buildIpv4Src() throws UnsupportedOperationException;
    OFBsnTlvIpv4Src ipv4Src(IPv4Address value);
    OFBsnTlvIpv6.Builder buildIpv6() throws UnsupportedOperationException;
    OFBsnTlvIpv6 ipv6(IPv6Address value);
    OFBsnTlvIpv6Dst.Builder buildIpv6Dst() throws UnsupportedOperationException;
    OFBsnTlvIpv6Dst ipv6Dst(IPv6Address value);
    OFBsnTlvIpv6Prefix.Builder buildIpv6Prefix() throws UnsupportedOperationException;
    OFBsnTlvIpv6Prefix ipv6Prefix(IPv6Address value, short prefixLength);
    OFBsnTlvIpv6Src.Builder buildIpv6Src() throws UnsupportedOperationException;
    OFBsnTlvIpv6Src ipv6Src(IPv6Address value);
    OFBsnTlvKnownMulticastRate.Builder buildKnownMulticastRate() throws UnsupportedOperationException;
    OFBsnTlvKnownMulticastRate knownMulticastRate(long value);
    OFBsnTlvL2MulticastLookup l2MulticastLookup();
    OFBsnTlvL3 l3();
    OFBsnTlvL3DstClassId.Builder buildL3DstClassId() throws UnsupportedOperationException;
    OFBsnTlvL3DstClassId l3DstClassId(long value);
    OFBsnTlvL3InterfaceClassId.Builder buildL3InterfaceClassId() throws UnsupportedOperationException;
    OFBsnTlvL3InterfaceClassId l3InterfaceClassId(long value);
    OFBsnTlvL3SrcClassId.Builder buildL3SrcClassId() throws UnsupportedOperationException;
    OFBsnTlvL3SrcClassId l3SrcClassId(long value);
    OFBsnTlvLagOptions.Builder buildLagOptions() throws UnsupportedOperationException;
    OFBsnTlvLagOptions lagOptions(Set<OFBsnLagFlag> flags);
    OFBsnTlvLoopbackMode.Builder buildLoopbackMode() throws UnsupportedOperationException;
    OFBsnTlvLoopbackMode loopbackMode(OFBsnLoopbackMode value);
    OFBsnTlvLoopbackPort.Builder buildLoopbackPort() throws UnsupportedOperationException;
    OFBsnTlvLoopbackPort loopbackPort(OFPort value);
    OFBsnTlvLrAllEnabled lrAllEnabled();
    OFBsnTlvMac.Builder buildMac() throws UnsupportedOperationException;
    OFBsnTlvMac mac(MacAddress value);
    OFBsnTlvMacMask.Builder buildMacMask() throws UnsupportedOperationException;
    OFBsnTlvMacMask macMask(MacAddress value);
    OFBsnTlvMcgTypeVxlan mcgTypeVxlan();
    OFBsnTlvMissPackets.Builder buildMissPackets() throws UnsupportedOperationException;
    OFBsnTlvMissPackets missPackets(U64 value);
    OFBsnTlvMplsControlWord.Builder buildMplsControlWord() throws UnsupportedOperationException;
    OFBsnTlvMplsControlWord mplsControlWord(short value);
    OFBsnTlvMplsLabel.Builder buildMplsLabel() throws UnsupportedOperationException;
    OFBsnTlvMplsLabel mplsLabel(long value);
    OFBsnTlvMplsSequenced.Builder buildMplsSequenced() throws UnsupportedOperationException;
    OFBsnTlvMplsSequenced mplsSequenced(short value);
    OFBsnTlvMulticastInterfaceId.Builder buildMulticastInterfaceId() throws UnsupportedOperationException;
    OFBsnTlvMulticastInterfaceId multicastInterfaceId(long value);
    OFBsnTlvMulticastPacket.Builder buildMulticastPacket() throws UnsupportedOperationException;
    OFBsnTlvMulticastPacket multicastPacket(OFBsnMulticastPacket value);
    OFBsnTlvMultiplier.Builder buildMultiplier() throws UnsupportedOperationException;
    OFBsnTlvMultiplier multiplier(long value);
    OFBsnTlvName.Builder buildName() throws UnsupportedOperationException;
    OFBsnTlvName name(byte[] value);
    OFBsnTlvNdpOffload ndpOffload();
    OFBsnTlvNdpStatic ndpStatic();
    OFBsnTlvNegate negate();
    OFBsnTlvNextHopIpv4.Builder buildNextHopIpv4() throws UnsupportedOperationException;
    OFBsnTlvNextHopIpv4 nextHopIpv4(IPv4Address value);
    OFBsnTlvNextHopMac.Builder buildNextHopMac() throws UnsupportedOperationException;
    OFBsnTlvNextHopMac nextHopMac(MacAddress value);
    OFBsnTlvNexthopTypeVxlan nexthopTypeVxlan();
    OFBsnTlvNoArpResponse noArpResponse();
    OFBsnTlvNoNsResponse noNsResponse();
    OFBsnTlvOffset.Builder buildOffset() throws UnsupportedOperationException;
    OFBsnTlvOffset offset(int value);
    OFBsnTlvOpticsAlwaysEnabled opticsAlwaysEnabled();
    OFBsnTlvOuterSrcMac.Builder buildOuterSrcMac() throws UnsupportedOperationException;
    OFBsnTlvOuterSrcMac outerSrcMac(MacAddress value);
    OFBsnTlvParentPort.Builder buildParentPort() throws UnsupportedOperationException;
    OFBsnTlvParentPort parentPort(OFPort value);
    OFBsnTlvPartnerKey.Builder buildPartnerKey() throws UnsupportedOperationException;
    OFBsnTlvPartnerKey partnerKey(int value);
    OFBsnTlvPartnerPortNum.Builder buildPartnerPortNum() throws UnsupportedOperationException;
    OFBsnTlvPartnerPortNum partnerPortNum(int value);
    OFBsnTlvPartnerPortPriority.Builder buildPartnerPortPriority() throws UnsupportedOperationException;
    OFBsnTlvPartnerPortPriority partnerPortPriority(int value);
    OFBsnTlvPartnerState.Builder buildPartnerState() throws UnsupportedOperationException;
    OFBsnTlvPartnerState partnerState(Set<OFBsnLacpState> value);
    OFBsnTlvPartnerSystemMac.Builder buildPartnerSystemMac() throws UnsupportedOperationException;
    OFBsnTlvPartnerSystemMac partnerSystemMac(MacAddress value);
    OFBsnTlvPartnerSystemPriority.Builder buildPartnerSystemPriority() throws UnsupportedOperationException;
    OFBsnTlvPartnerSystemPriority partnerSystemPriority(int value);
    OFBsnTlvPassive passive();
    OFBsnTlvPduaRxInstance.Builder buildPduaRxInstance() throws UnsupportedOperationException;
    OFBsnTlvPduaRxInstance pduaRxInstance(byte[] value);
    OFBsnTlvPimDr pimDr();
    OFBsnTlvPimHelloFlood pimHelloFlood();
    OFBsnTlvPort.Builder buildPort() throws UnsupportedOperationException;
    OFBsnTlvPort port(OFPort value);
    OFBsnTlvPortMode.Builder buildPortMode() throws UnsupportedOperationException;
    OFBsnTlvPortMode portMode(OFBsnPortMode value);
    OFBsnTlvPortSpeedGbps.Builder buildPortSpeedGbps() throws UnsupportedOperationException;
    OFBsnTlvPortSpeedGbps portSpeedGbps(long value);
    OFBsnTlvPortUsage.Builder buildPortUsage() throws UnsupportedOperationException;
    OFBsnTlvPortUsage portUsage(OFBsnPortUsage value);
    OFBsnTlvPortVxlanMode.Builder buildPortVxlanMode() throws UnsupportedOperationException;
    OFBsnTlvPortVxlanMode portVxlanMode(OFBsnPortVxlanMode value);
    OFBsnTlvPriority.Builder buildPriority() throws UnsupportedOperationException;
    OFBsnTlvPriority priority(long value);
    OFBsnTlvPushVlanOnEgress pushVlanOnEgress();
    OFBsnTlvPushVlanOnIngress.Builder buildPushVlanOnIngress() throws UnsupportedOperationException;
    OFBsnTlvPushVlanOnIngress pushVlanOnIngress(Set<OFBsnPushVlan> flags);
    OFBsnTlvQosPriority.Builder buildQosPriority() throws UnsupportedOperationException;
    OFBsnTlvQosPriority qosPriority(long value);
    OFBsnTlvQueueId.Builder buildQueueId() throws UnsupportedOperationException;
    OFBsnTlvQueueId queueId(long value);
    OFBsnTlvQueueWeight.Builder buildQueueWeight() throws UnsupportedOperationException;
    OFBsnTlvQueueWeight queueWeight(long value);
    OFBsnTlvRateLimit.Builder buildRateLimit() throws UnsupportedOperationException;
    OFBsnTlvRateLimit rateLimit(long value);
    OFBsnTlvRateUnit.Builder buildRateUnit() throws UnsupportedOperationException;
    OFBsnTlvRateUnit rateUnit(OFBsnRateUnit value);
    OFBsnTlvRecordPackets.Builder buildRecordPackets() throws UnsupportedOperationException;
    OFBsnTlvRecordPackets recordPackets(long value);
    OFBsnTlvReference.Builder buildReference() throws UnsupportedOperationException;
    OFBsnTlvReference reference(int tableId, List<OFBsnTlv> key);
    OFBsnTlvReplyPackets.Builder buildReplyPackets() throws UnsupportedOperationException;
    OFBsnTlvReplyPackets replyPackets(U64 value);
    OFBsnTlvRequestPackets.Builder buildRequestPackets() throws UnsupportedOperationException;
    OFBsnTlvRequestPackets requestPackets(U64 value);
    OFBsnTlvRestServer restServer();
    OFBsnTlvRoutingParam.Builder buildRoutingParam() throws UnsupportedOperationException;
    OFBsnTlvRoutingParam routingParam(OFBsnRoutingParam value);
    OFBsnTlvRxBytes.Builder buildRxBytes() throws UnsupportedOperationException;
    OFBsnTlvRxBytes rxBytes(U64 value);
    OFBsnTlvRxPackets.Builder buildRxPackets() throws UnsupportedOperationException;
    OFBsnTlvRxPackets rxPackets(U64 value);
    OFBsnTlvSamplingRate.Builder buildSamplingRate() throws UnsupportedOperationException;
    OFBsnTlvSamplingRate samplingRate(long value);
    OFBsnTlvSetLoopbackMode setLoopbackMode();
    OFBsnTlvStatus.Builder buildStatus() throws UnsupportedOperationException;
    OFBsnTlvStatus status(OFBsnStatus value);
    OFBsnTlvStripMplsL2OnIngress stripMplsL2OnIngress();
    OFBsnTlvStripMplsL3OnIngress stripMplsL3OnIngress();
    OFBsnTlvStripVlanOnEgress.Builder buildStripVlanOnEgress() throws UnsupportedOperationException;
    OFBsnTlvStripVlanOnEgress stripVlanOnEgress(Set<OFBsnStripVlan> flags);
    OFBsnTlvSubAgentId.Builder buildSubAgentId() throws UnsupportedOperationException;
    OFBsnTlvSubAgentId subAgentId(long value);
    OFBsnTlvTcpDst.Builder buildTcpDst() throws UnsupportedOperationException;
    OFBsnTlvTcpDst tcpDst(int value);
    OFBsnTlvTcpFlags.Builder buildTcpFlags() throws UnsupportedOperationException;
    OFBsnTlvTcpFlags tcpFlags(int value);
    OFBsnTlvTcpSrc.Builder buildTcpSrc() throws UnsupportedOperationException;
    OFBsnTlvTcpSrc tcpSrc(int value);
    OFBsnTlvTimestamp.Builder buildTimestamp() throws UnsupportedOperationException;
    OFBsnTlvTimestamp timestamp(U64 value);
    OFBsnTlvTtl.Builder buildTtl() throws UnsupportedOperationException;
    OFBsnTlvTtl ttl(int value);
    OFBsnTlvTunnelCapability.Builder buildTunnelCapability() throws UnsupportedOperationException;
    OFBsnTlvTunnelCapability tunnelCapability(Set<OFBsnTunnelType> value);
    OFBsnTlvTxBytes.Builder buildTxBytes() throws UnsupportedOperationException;
    OFBsnTlvTxBytes txBytes(U64 value);
    OFBsnTlvTxPackets.Builder buildTxPackets() throws UnsupportedOperationException;
    OFBsnTlvTxPackets txPackets(U64 value);
    OFBsnTlvUdfAnchor.Builder buildUdfAnchor() throws UnsupportedOperationException;
    OFBsnTlvUdfAnchor udfAnchor(OFBsnUdfAnchor value);
    OFBsnTlvUdfCapability.Builder buildUdfCapability() throws UnsupportedOperationException;
    OFBsnTlvUdfCapability udfCapability(Set<OFBsnUdfMode> value);
    OFBsnTlvUdfId.Builder buildUdfId() throws UnsupportedOperationException;
    OFBsnTlvUdfId udfId(int value);
    OFBsnTlvUdfLength.Builder buildUdfLength() throws UnsupportedOperationException;
    OFBsnTlvUdfLength udfLength(int value);
    OFBsnTlvUdfOffset.Builder buildUdfOffset() throws UnsupportedOperationException;
    OFBsnTlvUdfOffset udfOffset(int value);
    OFBsnTlvUdpDst.Builder buildUdpDst() throws UnsupportedOperationException;
    OFBsnTlvUdpDst udpDst(int value);
    OFBsnTlvUdpSrc.Builder buildUdpSrc() throws UnsupportedOperationException;
    OFBsnTlvUdpSrc udpSrc(int value);
    OFBsnTlvUint32.Builder buildUint32() throws UnsupportedOperationException;
    OFBsnTlvUint32 uint32(long value);
    OFBsnTlvUint64List.Builder buildUint64List() throws UnsupportedOperationException;
    OFBsnTlvUint64List uint64List(List<U64> value);
    OFBsnTlvUnicastQueryTimeout.Builder buildUnicastQueryTimeout() throws UnsupportedOperationException;
    OFBsnTlvUnicastQueryTimeout unicastQueryTimeout(long value);
    OFBsnTlvUnicastRate.Builder buildUnicastRate() throws UnsupportedOperationException;
    OFBsnTlvUnicastRate unicastRate(long value);
    OFBsnTlvUnknownMulticastRate.Builder buildUnknownMulticastRate() throws UnsupportedOperationException;
    OFBsnTlvUnknownMulticastRate unknownMulticastRate(long value);
    OFBsnTlvUntagged untagged();
    OFBsnTlvUpgrade.Builder buildUpgrade() throws UnsupportedOperationException;
    OFBsnTlvUpgrade upgrade(OFBsnUpgrade value);
    OFBsnTlvUriScheme.Builder buildUriScheme() throws UnsupportedOperationException;
    OFBsnTlvUriScheme uriScheme(byte[] value);
    OFBsnTlvUsePacketState.Builder buildUsePacketState() throws UnsupportedOperationException;
    OFBsnTlvUsePacketState usePacketState(short value);
    OFBsnTlvUserConfigured userConfigured();
    OFBsnTlvVfi.Builder buildVfi() throws UnsupportedOperationException;
    OFBsnTlvVfi vfi(int value);
    OFBsnTlvVfpClassId.Builder buildVfpClassId() throws UnsupportedOperationException;
    OFBsnTlvVfpClassId vfpClassId(long value);
    OFBsnTlvVirtual virtual();
    OFBsnTlvVlanMacList.Builder buildVlanMacList() throws UnsupportedOperationException;
    OFBsnTlvVlanMacList vlanMacList(List<OFBsnVlanMac> key);
    OFBsnTlvVlanPcp.Builder buildVlanPcp() throws UnsupportedOperationException;
    OFBsnTlvVlanPcp vlanPcp(short value);
    OFBsnTlvVlanVid.Builder buildVlanVid() throws UnsupportedOperationException;
    OFBsnTlvVlanVid vlanVid(VlanVid value);
    OFBsnTlvVlanVidMask.Builder buildVlanVidMask() throws UnsupportedOperationException;
    OFBsnTlvVlanVidMask vlanVidMask(int value);
    OFBsnTlvVni.Builder buildVni() throws UnsupportedOperationException;
    OFBsnTlvVni vni(long value);
    OFBsnTlvVpnKey.Builder buildVpnKey() throws UnsupportedOperationException;
    OFBsnTlvVpnKey vpnKey(long value);
    OFBsnTlvVrf.Builder buildVrf() throws UnsupportedOperationException;
    OFBsnTlvVrf vrf(long value);
    OFBsnTlvVxlanEgressLag vxlanEgressLag();

    OFMessageReader<OFBsnTlv> getReader();
    OFVersion getVersion();
}
