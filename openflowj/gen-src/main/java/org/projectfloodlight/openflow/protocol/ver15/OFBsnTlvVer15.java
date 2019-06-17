// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;
import java.util.Set;
import java.util.List;

abstract class OFBsnTlvVer15 {
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 4;


    public final static OFBsnTlvVer15.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFBsnTlv> {
        @Override
        public OFBsnTlv readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0xc0:
                   // discriminator value 0xc0=0xc0 for class OFBsnTlvActiveVer15
                   return OFBsnTlvActiveVer15.READER.readFrom(bb);
               case (short) 0x2c:
                   // discriminator value 0x2c=0x2c for class OFBsnTlvActorKeyVer15
                   return OFBsnTlvActorKeyVer15.READER.readFrom(bb);
               case (short) 0x2b:
                   // discriminator value 0x2b=0x2b for class OFBsnTlvActorPortNumVer15
                   return OFBsnTlvActorPortNumVer15.READER.readFrom(bb);
               case (short) 0x2a:
                   // discriminator value 0x2a=0x2a for class OFBsnTlvActorPortPriorityVer15
                   return OFBsnTlvActorPortPriorityVer15.READER.readFrom(bb);
               case (short) 0x35:
                   // discriminator value 0x35=0x35 for class OFBsnTlvActorStateVer15
                   return OFBsnTlvActorStateVer15.READER.readFrom(bb);
               case (short) 0x29:
                   // discriminator value 0x29=0x29 for class OFBsnTlvActorSystemMacVer15
                   return OFBsnTlvActorSystemMacVer15.READER.readFrom(bb);
               case (short) 0x28:
                   // discriminator value 0x28=0x28 for class OFBsnTlvActorSystemPriorityVer15
                   return OFBsnTlvActorSystemPriorityVer15.READER.readFrom(bb);
               case (short) 0x51:
                   // discriminator value 0x51=0x51 for class OFBsnTlvAnchorVer15
                   return OFBsnTlvAnchorVer15.READER.readFrom(bb);
               case (short) 0x82:
                   // discriminator value 0x82=0x82 for class OFBsnTlvApplyBytesVer15
                   return OFBsnTlvApplyBytesVer15.READER.readFrom(bb);
               case (short) 0x81:
                   // discriminator value 0x81=0x81 for class OFBsnTlvApplyPacketsVer15
                   return OFBsnTlvApplyPacketsVer15.READER.readFrom(bb);
               case (short) 0x90:
                   // discriminator value 0x90=0x90 for class OFBsnTlvAutoNegotiationVer15
                   return OFBsnTlvAutoNegotiationVer15.READER.readFrom(bb);
               case (short) 0xb0:
                   // discriminator value 0xb0=0xb0 for class OFBsnTlvBfdEndpointVer15
                   return OFBsnTlvBfdEndpointVer15.READER.readFrom(bb);
               case (short) 0xb1:
                   // discriminator value 0xb1=0xb1 for class OFBsnTlvBfdStateVer15
                   return OFBsnTlvBfdStateVer15.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value 0xa=0xa for class OFBsnTlvBroadcastQueryTimeoutVer15
                   return OFBsnTlvBroadcastQueryTimeoutVer15.READER.readFrom(bb);
               case (short) 0x5a:
                   // discriminator value 0x5a=0x5a for class OFBsnTlvBroadcastRateVer15
                   return OFBsnTlvBroadcastRateVer15.READER.readFrom(bb);
               case (short) 0x40:
                   // discriminator value 0x40=0x40 for class OFBsnTlvBucketVer15
                   return OFBsnTlvBucketVer15.READER.readFrom(bb);
               case (short) 0xe:
                   // discriminator value 0xe=0xe for class OFBsnTlvCircuitIdVer15
                   return OFBsnTlvCircuitIdVer15.READER.readFrom(bb);
               case (short) 0x2d:
                   // discriminator value 0x2d=0x2d for class OFBsnTlvConvergenceStatusVer15
                   return OFBsnTlvConvergenceStatusVer15.READER.readFrom(bb);
               case (short) 0x76:
                   // discriminator value 0x76=0x76 for class OFBsnTlvCpuLagVer15
                   return OFBsnTlvCpuLagVer15.READER.readFrom(bb);
               case (short) 0x16:
                   // discriminator value 0x16=0x16 for class OFBsnTlvCrcEnabledVer15
                   return OFBsnTlvCrcEnabledVer15.READER.readFrom(bb);
               case (short) 0x37:
                   // discriminator value 0x37=0x37 for class OFBsnTlvDataVer15
                   return OFBsnTlvDataVer15.READER.readFrom(bb);
               case (short) 0x8c:
                   // discriminator value 0x8c=0x8c for class OFBsnTlvDataMaskVer15
                   return OFBsnTlvDataMaskVer15.READER.readFrom(bb);
               case (short) 0x55:
                   // discriminator value 0x55=0x55 for class OFBsnTlvDecapVer15
                   return OFBsnTlvDecapVer15.READER.readFrom(bb);
               case (short) 0x78:
                   // discriminator value 0x78=0x78 for class OFBsnTlvDisableSrcMacCheckVer15
                   return OFBsnTlvDisableSrcMacCheckVer15.READER.readFrom(bb);
               case (short) 0xb9:
                   // discriminator value 0xb9=0xb9 for class OFBsnTlvDisableXmitVer15
                   return OFBsnTlvDisableXmitVer15.READER.readFrom(bb);
               case (short) 0xbe:
                   // discriminator value 0xbe=0xbe for class OFBsnTlvDnsAnalyticsVer15
                   return OFBsnTlvDnsAnalyticsVer15.READER.readFrom(bb);
               case (short) 0x79:
                   // discriminator value 0x79=0x79 for class OFBsnTlvDropVer15
                   return OFBsnTlvDropVer15.READER.readFrom(bb);
               case (short) 0xbb:
                   // discriminator value 0xbb=0xbb for class OFBsnTlvDropControlVer15
                   return OFBsnTlvDropControlVer15.READER.readFrom(bb);
               case (short) 0x70:
                   // discriminator value 0x70=0x70 for class OFBsnTlvDscpVer15
                   return OFBsnTlvDscpVer15.READER.readFrom(bb);
               case (short) 0x84:
                   // discriminator value 0x84=0x84 for class OFBsnTlvEcnVer15
                   return OFBsnTlvEcnVer15.READER.readFrom(bb);
               case (short) 0x89:
                   // discriminator value 0x89=0x89 for class OFBsnTlvEgressOnlyVer15
                   return OFBsnTlvEgressOnlyVer15.READER.readFrom(bb);
               case (short) 0x8b:
                   // discriminator value 0x8b=0x8b for class OFBsnTlvEgressPortGroupIdVer15
                   return OFBsnTlvEgressPortGroupIdVer15.READER.readFrom(bb);
               case (short) 0xaf:
                   // discriminator value 0xaf=0xaf for class OFBsnTlvEncapVer15
                   return OFBsnTlvEncapVer15.READER.readFrom(bb);
               case (short) 0x8f:
                   // discriminator value 0x8f=0x8f for class OFBsnTlvEnhancedHashCapabilityVer15
                   return OFBsnTlvEnhancedHashCapabilityVer15.READER.readFrom(bb);
               case (short) 0x21:
                   // discriminator value 0x21=0x21 for class OFBsnTlvEthDstVer15
                   return OFBsnTlvEthDstVer15.READER.readFrom(bb);
               case (short) 0x20:
                   // discriminator value 0x20=0x20 for class OFBsnTlvEthSrcVer15
                   return OFBsnTlvEthSrcVer15.READER.readFrom(bb);
               case (short) 0x83:
                   // discriminator value 0x83=0x83 for class OFBsnTlvEthTypeVer15
                   return OFBsnTlvEthTypeVer15.READER.readFrom(bb);
               case (short) 0x1a:
                   // discriminator value 0x1a=0x1a for class OFBsnTlvExternalGatewayIpVer15
                   return OFBsnTlvExternalGatewayIpVer15.READER.readFrom(bb);
               case (short) 0x1d:
                   // discriminator value 0x1d=0x1d for class OFBsnTlvExternalGatewayMacVer15
                   return OFBsnTlvExternalGatewayMacVer15.READER.readFrom(bb);
               case (short) 0x17:
                   // discriminator value 0x17=0x17 for class OFBsnTlvExternalIpVer15
                   return OFBsnTlvExternalIpVer15.READER.readFrom(bb);
               case (short) 0x18:
                   // discriminator value 0x18=0x18 for class OFBsnTlvExternalMacVer15
                   return OFBsnTlvExternalMacVer15.READER.readFrom(bb);
               case (short) 0x19:
                   // discriminator value 0x19=0x19 for class OFBsnTlvExternalNetmaskVer15
                   return OFBsnTlvExternalNetmaskVer15.READER.readFrom(bb);
               case (short) 0xa5:
                   // discriminator value 0xa5=0xa5 for class OFBsnTlvFabricPortRoleVer15
                   return OFBsnTlvFabricPortRoleVer15.READER.readFrom(bb);
               case (short) 0xc2:
                   // discriminator value 0xc2=0xc2 for class OFBsnTlvFailCountVer15
                   return OFBsnTlvFailCountVer15.READER.readFrom(bb);
               case (short) 0xa3:
                   // discriminator value 0xa3=0xa3 for class OFBsnTlvFloodVer15
                   return OFBsnTlvFloodVer15.READER.readFrom(bb);
               case (short) 0xb8:
                   // discriminator value 0xb8=0xb8 for class OFBsnTlvFlowClassifierVer15
                   return OFBsnTlvFlowClassifierVer15.READER.readFrom(bb);
               case (short) 0xb6:
                   // discriminator value 0xb6=0xb6 for class OFBsnTlvFlowClassifyVer15
                   return OFBsnTlvFlowClassifyVer15.READER.readFrom(bb);
               case (short) 0xb7:
                   // discriminator value 0xb7=0xb7 for class OFBsnTlvFlowIdentifierVer15
                   return OFBsnTlvFlowIdentifierVer15.READER.readFrom(bb);
               case (short) 0x97:
                   // discriminator value 0x97=0x97 for class OFBsnTlvForceLinkUpVer15
                   return OFBsnTlvForceLinkUpVer15.READER.readFrom(bb);
               case (short) 0x95:
                   // discriminator value 0x95=0x95 for class OFBsnTlvForwardErrorCorrectionVer15
                   return OFBsnTlvForwardErrorCorrectionVer15.READER.readFrom(bb);
               case (short) 0x50:
                   // discriminator value 0x50=0x50 for class OFBsnTlvGenerationIdVer15
                   return OFBsnTlvGenerationIdVer15.READER.readFrom(bb);
               case (short) 0x91:
                   // discriminator value 0x91=0x91 for class OFBsnTlvHashAlgorithmVer15
                   return OFBsnTlvHashAlgorithmVer15.READER.readFrom(bb);
               case (short) 0x68:
                   // discriminator value 0x68=0x68 for class OFBsnTlvHashGtpHeaderMatchVer15
                   return OFBsnTlvHashGtpHeaderMatchVer15.READER.readFrom(bb);
               case (short) 0x69:
                   // discriminator value 0x69=0x69 for class OFBsnTlvHashGtpPortMatchVer15
                   return OFBsnTlvHashGtpPortMatchVer15.READER.readFrom(bb);
               case (short) 0x67:
                   // discriminator value 0x67=0x67 for class OFBsnTlvHashPacketFieldVer15
                   return OFBsnTlvHashPacketFieldVer15.READER.readFrom(bb);
               case (short) 0x66:
                   // discriminator value 0x66=0x66 for class OFBsnTlvHashPacketTypeVer15
                   return OFBsnTlvHashPacketTypeVer15.READER.readFrom(bb);
               case (short) 0x64:
                   // discriminator value 0x64=0x64 for class OFBsnTlvHashSeedVer15
                   return OFBsnTlvHashSeedVer15.READER.readFrom(bb);
               case (short) 0x65:
                   // discriminator value 0x65=0x65 for class OFBsnTlvHashTypeVer15
                   return OFBsnTlvHashTypeVer15.READER.readFrom(bb);
               case (short) 0x1f:
                   // discriminator value 0x1f=0x1f for class OFBsnTlvHeaderSizeVer15
                   return OFBsnTlvHeaderSizeVer15.READER.readFrom(bb);
               case (short) 0x45:
                   // discriminator value 0x45=0x45 for class OFBsnTlvIcmpCodeVer15
                   return OFBsnTlvIcmpCodeVer15.READER.readFrom(bb);
               case (short) 0x46:
                   // discriminator value 0x46=0x46 for class OFBsnTlvIcmpIdVer15
                   return OFBsnTlvIcmpIdVer15.READER.readFrom(bb);
               case (short) 0x44:
                   // discriminator value 0x44=0x44 for class OFBsnTlvIcmpTypeVer15
                   return OFBsnTlvIcmpTypeVer15.READER.readFrom(bb);
               case (short) 0x7d:
                   // discriminator value 0x7d=0x7d for class OFBsnTlvIcmpv6ChksumVer15
                   return OFBsnTlvIcmpv6ChksumVer15.READER.readFrom(bb);
               case (short) 0xad:
                   // discriminator value 0xad=0xad for class OFBsnTlvIdentifierVer15
                   return OFBsnTlvIdentifierVer15.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value 0x7=0x7 for class OFBsnTlvIdleNotificationVer15
                   return OFBsnTlvIdleNotificationVer15.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value 0x5=0x5 for class OFBsnTlvIdleTimeVer15
                   return OFBsnTlvIdleTimeVer15.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value 0x8=0x8 for class OFBsnTlvIdleTimeoutVer15
                   return OFBsnTlvIdleTimeoutVer15.READER.readFrom(bb);
               case (short) 0x4e:
                   // discriminator value 0x4e=0x4e for class OFBsnTlvIgmpSnoopingVer15
                   return OFBsnTlvIgmpSnoopingVer15.READER.readFrom(bb);
               case (short) 0x8a:
                   // discriminator value 0x8a=0x8a for class OFBsnTlvIngressPortGroupIdVer15
                   return OFBsnTlvIngressPortGroupIdVer15.READER.readFrom(bb);
               case (short) 0x1c:
                   // discriminator value 0x1c=0x1c for class OFBsnTlvInternalGatewayMacVer15
                   return OFBsnTlvInternalGatewayMacVer15.READER.readFrom(bb);
               case (short) 0x1b:
                   // discriminator value 0x1b=0x1b for class OFBsnTlvInternalMacVer15
                   return OFBsnTlvInternalMacVer15.READER.readFrom(bb);
               case (short) 0x3a:
                   // discriminator value 0x3a=0x3a for class OFBsnTlvIntervalVer15
                   return OFBsnTlvIntervalVer15.READER.readFrom(bb);
               case (short) 0x43:
                   // discriminator value 0x43=0x43 for class OFBsnTlvIpProtoVer15
                   return OFBsnTlvIpProtoVer15.READER.readFrom(bb);
               case (short) 0xa9:
                   // discriminator value 0xa9=0xa9 for class OFBsnTlvIpTunnelTypeVer15
                   return OFBsnTlvIpTunnelTypeVer15.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value 0x4=0x4 for class OFBsnTlvIpv4Ver15
                   return OFBsnTlvIpv4Ver15.READER.readFrom(bb);
               case (short) 0x23:
                   // discriminator value 0x23=0x23 for class OFBsnTlvIpv4DstVer15
                   return OFBsnTlvIpv4DstVer15.READER.readFrom(bb);
               case (short) 0x3c:
                   // discriminator value 0x3c=0x3c for class OFBsnTlvIpv4NetmaskVer15
                   return OFBsnTlvIpv4NetmaskVer15.READER.readFrom(bb);
               case (short) 0x22:
                   // discriminator value 0x22=0x22 for class OFBsnTlvIpv4SrcVer15
                   return OFBsnTlvIpv4SrcVer15.READER.readFrom(bb);
               case (short) 0x54:
                   // discriminator value 0x54=0x54 for class OFBsnTlvIpv6Ver15
                   return OFBsnTlvIpv6Ver15.READER.readFrom(bb);
               case (short) 0x7f:
                   // discriminator value 0x7f=0x7f for class OFBsnTlvIpv6DstVer15
                   return OFBsnTlvIpv6DstVer15.READER.readFrom(bb);
               case (short) 0x7a:
                   // discriminator value 0x7a=0x7a for class OFBsnTlvIpv6PrefixVer15
                   return OFBsnTlvIpv6PrefixVer15.READER.readFrom(bb);
               case (short) 0x7e:
                   // discriminator value 0x7e=0x7e for class OFBsnTlvIpv6SrcVer15
                   return OFBsnTlvIpv6SrcVer15.READER.readFrom(bb);
               case (short) 0x5b:
                   // discriminator value 0x5b=0x5b for class OFBsnTlvKnownMulticastRateVer15
                   return OFBsnTlvKnownMulticastRateVer15.READER.readFrom(bb);
               case (short) 0x4f:
                   // discriminator value 0x4f=0x4f for class OFBsnTlvL2MulticastLookupVer15
                   return OFBsnTlvL2MulticastLookupVer15.READER.readFrom(bb);
               case (short) 0xa8:
                   // discriminator value 0xa8=0xa8 for class OFBsnTlvL3Ver15
                   return OFBsnTlvL3Ver15.READER.readFrom(bb);
               case (short) 0x88:
                   // discriminator value 0x88=0x88 for class OFBsnTlvL3DstClassIdVer15
                   return OFBsnTlvL3DstClassIdVer15.READER.readFrom(bb);
               case (short) 0x86:
                   // discriminator value 0x86=0x86 for class OFBsnTlvL3InterfaceClassIdVer15
                   return OFBsnTlvL3InterfaceClassIdVer15.READER.readFrom(bb);
               case (short) 0x87:
                   // discriminator value 0x87=0x87 for class OFBsnTlvL3SrcClassIdVer15
                   return OFBsnTlvL3SrcClassIdVer15.READER.readFrom(bb);
               case (short) 0xa0:
                   // discriminator value 0xa0=0xa0 for class OFBsnTlvLagOptionsVer15
                   return OFBsnTlvLagOptionsVer15.READER.readFrom(bb);
               case (short) 0xc1:
                   // discriminator value 0xc1=0xc1 for class OFBsnTlvLinkUpVer15
                   return OFBsnTlvLinkUpVer15.READER.readFrom(bb);
               case (short) 0x92:
                   // discriminator value 0x92=0x92 for class OFBsnTlvLoopbackModeVer15
                   return OFBsnTlvLoopbackModeVer15.READER.readFrom(bb);
               case (short) 0x6e:
                   // discriminator value 0x6e=0x6e for class OFBsnTlvLoopbackPortVer15
                   return OFBsnTlvLoopbackPortVer15.READER.readFrom(bb);
               case (short) 0xbc:
                   // discriminator value 0xbc=0xbc for class OFBsnTlvLosslessVer15
                   return OFBsnTlvLosslessVer15.READER.readFrom(bb);
               case (short) 0xb2:
                   // discriminator value 0xb2=0xb2 for class OFBsnTlvLrAllEnabledVer15
                   return OFBsnTlvLrAllEnabledVer15.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value 0x1=0x1 for class OFBsnTlvMacVer15
                   return OFBsnTlvMacVer15.READER.readFrom(bb);
               case (short) 0x38:
                   // discriminator value 0x38=0x38 for class OFBsnTlvMacMaskVer15
                   return OFBsnTlvMacMaskVer15.READER.readFrom(bb);
               case (short) 0x57:
                   // discriminator value 0x57=0x57 for class OFBsnTlvMcgTypeVxlanVer15
                   return OFBsnTlvMcgTypeVxlanVer15.READER.readFrom(bb);
               case (short) 0xd:
                   // discriminator value 0xd=0xd for class OFBsnTlvMissPacketsVer15
                   return OFBsnTlvMissPacketsVer15.READER.readFrom(bb);
               case (short) 0x3e:
                   // discriminator value 0x3e=0x3e for class OFBsnTlvMplsControlWordVer15
                   return OFBsnTlvMplsControlWordVer15.READER.readFrom(bb);
               case (short) 0x3d:
                   // discriminator value 0x3d=0x3d for class OFBsnTlvMplsLabelVer15
                   return OFBsnTlvMplsLabelVer15.READER.readFrom(bb);
               case (short) 0x3f:
                   // discriminator value 0x3f=0x3f for class OFBsnTlvMplsSequencedVer15
                   return OFBsnTlvMplsSequencedVer15.READER.readFrom(bb);
               case (short) 0x5f:
                   // discriminator value 0x5f=0x5f for class OFBsnTlvMulticastInterfaceIdVer15
                   return OFBsnTlvMulticastInterfaceIdVer15.READER.readFrom(bb);
               case (short) 0xaa:
                   // discriminator value 0xaa=0xaa for class OFBsnTlvMulticastPacketVer15
                   return OFBsnTlvMulticastPacketVer15.READER.readFrom(bb);
               case (short) 0xae:
                   // discriminator value 0xae=0xae for class OFBsnTlvMultiplierVer15
                   return OFBsnTlvMultiplierVer15.READER.readFrom(bb);
               case (short) 0x34:
                   // discriminator value 0x34=0x34 for class OFBsnTlvNameVer15
                   return OFBsnTlvNameVer15.READER.readFrom(bb);
               case (short) 0x7b:
                   // discriminator value 0x7b=0x7b for class OFBsnTlvNdpOffloadVer15
                   return OFBsnTlvNdpOffloadVer15.READER.readFrom(bb);
               case (short) 0x7c:
                   // discriminator value 0x7c=0x7c for class OFBsnTlvNdpStaticVer15
                   return OFBsnTlvNdpStaticVer15.READER.readFrom(bb);
               case (short) 0x53:
                   // discriminator value 0x53=0x53 for class OFBsnTlvNegateVer15
                   return OFBsnTlvNegateVer15.READER.readFrom(bb);
               case (short) 0x73:
                   // discriminator value 0x73=0x73 for class OFBsnTlvNextHopIpv4Ver15
                   return OFBsnTlvNextHopIpv4Ver15.READER.readFrom(bb);
               case (short) 0x72:
                   // discriminator value 0x72=0x72 for class OFBsnTlvNextHopMacVer15
                   return OFBsnTlvNextHopMacVer15.READER.readFrom(bb);
               case (short) 0x5e:
                   // discriminator value 0x5e=0x5e for class OFBsnTlvNexthopTypeVxlanVer15
                   return OFBsnTlvNexthopTypeVxlanVer15.READER.readFrom(bb);
               case (short) 0x93:
                   // discriminator value 0x93=0x93 for class OFBsnTlvNoArpResponseVer15
                   return OFBsnTlvNoArpResponseVer15.READER.readFrom(bb);
               case (short) 0x94:
                   // discriminator value 0x94=0x94 for class OFBsnTlvNoNsResponseVer15
                   return OFBsnTlvNoNsResponseVer15.READER.readFrom(bb);
               case (short) 0x52:
                   // discriminator value 0x52=0x52 for class OFBsnTlvOffsetVer15
                   return OFBsnTlvOffsetVer15.READER.readFrom(bb);
               case (short) 0x96:
                   // discriminator value 0x96=0x96 for class OFBsnTlvOpticsAlwaysEnabledVer15
                   return OFBsnTlvOpticsAlwaysEnabledVer15.READER.readFrom(bb);
               case (short) 0x9d:
                   // discriminator value 0x9d=0x9d for class OFBsnTlvOuterSrcMacVer15
                   return OFBsnTlvOuterSrcMacVer15.READER.readFrom(bb);
               case (short) 0x6d:
                   // discriminator value 0x6d=0x6d for class OFBsnTlvParentPortVer15
                   return OFBsnTlvParentPortVer15.READER.readFrom(bb);
               case (short) 0x33:
                   // discriminator value 0x33=0x33 for class OFBsnTlvPartnerKeyVer15
                   return OFBsnTlvPartnerKeyVer15.READER.readFrom(bb);
               case (short) 0x32:
                   // discriminator value 0x32=0x32 for class OFBsnTlvPartnerPortNumVer15
                   return OFBsnTlvPartnerPortNumVer15.READER.readFrom(bb);
               case (short) 0x31:
                   // discriminator value 0x31=0x31 for class OFBsnTlvPartnerPortPriorityVer15
                   return OFBsnTlvPartnerPortPriorityVer15.READER.readFrom(bb);
               case (short) 0x36:
                   // discriminator value 0x36=0x36 for class OFBsnTlvPartnerStateVer15
                   return OFBsnTlvPartnerStateVer15.READER.readFrom(bb);
               case (short) 0x30:
                   // discriminator value 0x30=0x30 for class OFBsnTlvPartnerSystemMacVer15
                   return OFBsnTlvPartnerSystemMacVer15.READER.readFrom(bb);
               case (short) 0x2f:
                   // discriminator value 0x2f=0x2f for class OFBsnTlvPartnerSystemPriorityVer15
                   return OFBsnTlvPartnerSystemPriorityVer15.READER.readFrom(bb);
               case (short) 0xac:
                   // discriminator value 0xac=0xac for class OFBsnTlvPassiveVer15
                   return OFBsnTlvPassiveVer15.READER.readFrom(bb);
               case (short) 0x9f:
                   // discriminator value 0x9f=0x9f for class OFBsnTlvPduaRxInstanceVer15
                   return OFBsnTlvPduaRxInstanceVer15.READER.readFrom(bb);
               case (short) 0xab:
                   // discriminator value 0xab=0xab for class OFBsnTlvPimDrVer15
                   return OFBsnTlvPimDrVer15.READER.readFrom(bb);
               case (short) 0xb5:
                   // discriminator value 0xb5=0xb5 for class OFBsnTlvPimHelloFloodVer15
                   return OFBsnTlvPimHelloFloodVer15.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value 0x0=0x0 for class OFBsnTlvPortVer15
                   return OFBsnTlvPortVer15.READER.readFrom(bb);
               case (short) 0xb3:
                   // discriminator value 0xb3=0xb3 for class OFBsnTlvPortModeVer15
                   return OFBsnTlvPortModeVer15.READER.readFrom(bb);
               case (short) 0x9c:
                   // discriminator value 0x9c=0x9c for class OFBsnTlvPortSpeedGbpsVer15
                   return OFBsnTlvPortSpeedGbpsVer15.READER.readFrom(bb);
               case (short) 0x8d:
                   // discriminator value 0x8d=0x8d for class OFBsnTlvPortUsageVer15
                   return OFBsnTlvPortUsageVer15.READER.readFrom(bb);
               case (short) 0x58:
                   // discriminator value 0x58=0x58 for class OFBsnTlvPortVxlanModeVer15
                   return OFBsnTlvPortVxlanModeVer15.READER.readFrom(bb);
               case (short) 0xba:
                   // discriminator value 0xba=0xba for class OFBsnTlvPreserveVlanVer15
                   return OFBsnTlvPreserveVlanVer15.READER.readFrom(bb);
               case (short) 0x39:
                   // discriminator value 0x39=0x39 for class OFBsnTlvPriorityVer15
                   return OFBsnTlvPriorityVer15.READER.readFrom(bb);
               case (short) 0xa2:
                   // discriminator value 0xa2=0xa2 for class OFBsnTlvPushVlanOnEgressVer15
                   return OFBsnTlvPushVlanOnEgressVer15.READER.readFrom(bb);
               case (short) 0x80:
                   // discriminator value 0x80=0x80 for class OFBsnTlvPushVlanOnIngressVer15
                   return OFBsnTlvPushVlanOnIngressVer15.READER.readFrom(bb);
               case (short) 0x6c:
                   // discriminator value 0x6c=0x6c for class OFBsnTlvQosPriorityVer15
                   return OFBsnTlvQosPriorityVer15.READER.readFrom(bb);
               case (short) 0x14:
                   // discriminator value 0x14=0x14 for class OFBsnTlvQueueIdVer15
                   return OFBsnTlvQueueIdVer15.READER.readFrom(bb);
               case (short) 0x15:
                   // discriminator value 0x15=0x15 for class OFBsnTlvQueueWeightVer15
                   return OFBsnTlvQueueWeightVer15.READER.readFrom(bb);
               case (short) 0x74:
                   // discriminator value 0x74=0x74 for class OFBsnTlvRateLimitVer15
                   return OFBsnTlvRateLimitVer15.READER.readFrom(bb);
               case (short) 0x59:
                   // discriminator value 0x59=0x59 for class OFBsnTlvRateUnitVer15
                   return OFBsnTlvRateUnitVer15.READER.readFrom(bb);
               case (short) 0x9b:
                   // discriminator value 0x9b=0x9b for class OFBsnTlvRecordPacketsVer15
                   return OFBsnTlvRecordPacketsVer15.READER.readFrom(bb);
               case (short) 0xbd:
                   // discriminator value 0xbd=0xbd for class OFBsnTlvRedundantMgmtVer15
                   return OFBsnTlvRedundantMgmtVer15.READER.readFrom(bb);
               case (short) 0x3b:
                   // discriminator value 0x3b=0x3b for class OFBsnTlvReferenceVer15
                   return OFBsnTlvReferenceVer15.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value 0xc=0xc for class OFBsnTlvReplyPacketsVer15
                   return OFBsnTlvReplyPacketsVer15.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value 0xb=0xb for class OFBsnTlvRequestPacketsVer15
                   return OFBsnTlvRequestPacketsVer15.READER.readFrom(bb);
               case (short) 0x98:
                   // discriminator value 0x98=0x98 for class OFBsnTlvRestServerVer15
                   return OFBsnTlvRestServerVer15.READER.readFrom(bb);
               case (short) 0xa1:
                   // discriminator value 0xa1=0xa1 for class OFBsnTlvRoutingParamVer15
                   return OFBsnTlvRoutingParamVer15.READER.readFrom(bb);
               case (short) 0x47:
                   // discriminator value 0x47=0x47 for class OFBsnTlvRxBytesVer15
                   return OFBsnTlvRxBytesVer15.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value 0x2=0x2 for class OFBsnTlvRxPacketsVer15
                   return OFBsnTlvRxPacketsVer15.READER.readFrom(bb);
               case (short) 0x1e:
                   // discriminator value 0x1e=0x1e for class OFBsnTlvSamplingRateVer15
                   return OFBsnTlvSamplingRateVer15.READER.readFrom(bb);
               case (short) 0x4a:
                   // discriminator value 0x4a=0x4a for class OFBsnTlvSetLoopbackModeVer15
                   return OFBsnTlvSetLoopbackModeVer15.READER.readFrom(bb);
               case (short) 0xbf:
                   // discriminator value 0xbf=0xbf for class OFBsnTlvSrcMacCmlVer15
                   return OFBsnTlvSrcMacCmlVer15.READER.readFrom(bb);
               case (short) 0x61:
                   // discriminator value 0x61=0x61 for class OFBsnTlvStatusVer15
                   return OFBsnTlvStatusVer15.READER.readFrom(bb);
               case (short) 0x4b:
                   // discriminator value 0x4b=0x4b for class OFBsnTlvStripMplsL2OnIngressVer15
                   return OFBsnTlvStripMplsL2OnIngressVer15.READER.readFrom(bb);
               case (short) 0x4c:
                   // discriminator value 0x4c=0x4c for class OFBsnTlvStripMplsL3OnIngressVer15
                   return OFBsnTlvStripMplsL3OnIngressVer15.READER.readFrom(bb);
               case (short) 0x49:
                   // discriminator value 0x49=0x49 for class OFBsnTlvStripVlanOnEgressVer15
                   return OFBsnTlvStripVlanOnEgressVer15.READER.readFrom(bb);
               case (short) 0x26:
                   // discriminator value 0x26=0x26 for class OFBsnTlvSubAgentIdVer15
                   return OFBsnTlvSubAgentIdVer15.READER.readFrom(bb);
               case (short) 0x42:
                   // discriminator value 0x42=0x42 for class OFBsnTlvTcpDstVer15
                   return OFBsnTlvTcpDstVer15.READER.readFrom(bb);
               case (short) 0x85:
                   // discriminator value 0x85=0x85 for class OFBsnTlvTcpFlagsVer15
                   return OFBsnTlvTcpFlagsVer15.READER.readFrom(bb);
               case (short) 0x41:
                   // discriminator value 0x41=0x41 for class OFBsnTlvTcpSrcVer15
                   return OFBsnTlvTcpSrcVer15.READER.readFrom(bb);
               case (short) 0x9a:
                   // discriminator value 0x9a=0x9a for class OFBsnTlvTimestampVer15
                   return OFBsnTlvTimestampVer15.READER.readFrom(bb);
               case (short) 0x71:
                   // discriminator value 0x71=0x71 for class OFBsnTlvTtlVer15
                   return OFBsnTlvTtlVer15.READER.readFrom(bb);
               case (short) 0x8e:
                   // discriminator value 0x8e=0x8e for class OFBsnTlvTunnelCapabilityVer15
                   return OFBsnTlvTunnelCapabilityVer15.READER.readFrom(bb);
               case (short) 0x27:
                   // discriminator value 0x27=0x27 for class OFBsnTlvTxBytesVer15
                   return OFBsnTlvTxBytesVer15.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value 0x3=0x3 for class OFBsnTlvTxPacketsVer15
                   return OFBsnTlvTxPacketsVer15.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value 0x10=0x10 for class OFBsnTlvUdfAnchorVer15
                   return OFBsnTlvUdfAnchorVer15.READER.readFrom(bb);
               case (short) 0xb4:
                   // discriminator value 0xb4=0xb4 for class OFBsnTlvUdfCapabilityVer15
                   return OFBsnTlvUdfCapabilityVer15.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value 0xf=0xf for class OFBsnTlvUdfIdVer15
                   return OFBsnTlvUdfIdVer15.READER.readFrom(bb);
               case (short) 0x12:
                   // discriminator value 0x12=0x12 for class OFBsnTlvUdfLengthVer15
                   return OFBsnTlvUdfLengthVer15.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value 0x11=0x11 for class OFBsnTlvUdfOffsetVer15
                   return OFBsnTlvUdfOffsetVer15.READER.readFrom(bb);
               case (short) 0x25:
                   // discriminator value 0x25=0x25 for class OFBsnTlvUdpDstVer15
                   return OFBsnTlvUdpDstVer15.READER.readFrom(bb);
               case (short) 0x24:
                   // discriminator value 0x24=0x24 for class OFBsnTlvUdpSrcVer15
                   return OFBsnTlvUdpSrcVer15.READER.readFrom(bb);
               case (short) 0xa7:
                   // discriminator value 0xa7=0xa7 for class OFBsnTlvUint32Ver15
                   return OFBsnTlvUint32Ver15.READER.readFrom(bb);
               case (short) 0x77:
                   // discriminator value 0x77=0x77 for class OFBsnTlvUint64ListVer15
                   return OFBsnTlvUint64ListVer15.READER.readFrom(bb);
               case (short) 0x9:
                   // discriminator value 0x9=0x9 for class OFBsnTlvUnicastQueryTimeoutVer15
                   return OFBsnTlvUnicastQueryTimeoutVer15.READER.readFrom(bb);
               case (short) 0x5d:
                   // discriminator value 0x5d=0x5d for class OFBsnTlvUnicastRateVer15
                   return OFBsnTlvUnicastRateVer15.READER.readFrom(bb);
               case (short) 0x5c:
                   // discriminator value 0x5c=0x5c for class OFBsnTlvUnknownMulticastRateVer15
                   return OFBsnTlvUnknownMulticastRateVer15.READER.readFrom(bb);
               case (short) 0x6a:
                   // discriminator value 0x6a=0x6a for class OFBsnTlvUntaggedVer15
                   return OFBsnTlvUntaggedVer15.READER.readFrom(bb);
               case (short) 0xa4:
                   // discriminator value 0xa4=0xa4 for class OFBsnTlvUpgradeVer15
                   return OFBsnTlvUpgradeVer15.READER.readFrom(bb);
               case (short) 0x99:
                   // discriminator value 0x99=0x99 for class OFBsnTlvUriSchemeVer15
                   return OFBsnTlvUriSchemeVer15.READER.readFrom(bb);
               case (short) 0x60:
                   // discriminator value 0x60=0x60 for class OFBsnTlvUsePacketStateVer15
                   return OFBsnTlvUsePacketStateVer15.READER.readFrom(bb);
               case (short) 0xa6:
                   // discriminator value 0xa6=0xa6 for class OFBsnTlvUserConfiguredVer15
                   return OFBsnTlvUserConfiguredVer15.READER.readFrom(bb);
               case (short) 0x63:
                   // discriminator value 0x63=0x63 for class OFBsnTlvVfiVer15
                   return OFBsnTlvVfiVer15.READER.readFrom(bb);
               case (short) 0x6b:
                   // discriminator value 0x6b=0x6b for class OFBsnTlvVfpClassIdVer15
                   return OFBsnTlvVfpClassIdVer15.READER.readFrom(bb);
               case (short) 0x9e:
                   // discriminator value 0x9e=0x9e for class OFBsnTlvVirtualVer15
                   return OFBsnTlvVirtualVer15.READER.readFrom(bb);
               case (short) 0x62:
                   // discriminator value 0x62=0x62 for class OFBsnTlvVlanMacListVer15
                   return OFBsnTlvVlanMacListVer15.READER.readFrom(bb);
               case (short) 0x48:
                   // discriminator value 0x48=0x48 for class OFBsnTlvVlanPcpVer15
                   return OFBsnTlvVlanPcpVer15.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value 0x6=0x6 for class OFBsnTlvVlanVidVer15
                   return OFBsnTlvVlanVidVer15.READER.readFrom(bb);
               case (short) 0x4d:
                   // discriminator value 0x4d=0x4d for class OFBsnTlvVlanVidMaskVer15
                   return OFBsnTlvVlanVidMaskVer15.READER.readFrom(bb);
               case (short) 0x56:
                   // discriminator value 0x56=0x56 for class OFBsnTlvVniVer15
                   return OFBsnTlvVniVer15.READER.readFrom(bb);
               case (short) 0x6f:
                   // discriminator value 0x6f=0x6f for class OFBsnTlvVpnKeyVer15
                   return OFBsnTlvVpnKeyVer15.READER.readFrom(bb);
               case (short) 0x13:
                   // discriminator value 0x13=0x13 for class OFBsnTlvVrfVer15
                   return OFBsnTlvVrfVer15.READER.readFrom(bb);
               case (short) 0x75:
                   // discriminator value 0x75=0x75 for class OFBsnTlvVxlanEgressLagVer15
                   return OFBsnTlvVxlanEgressLagVer15.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFBsnTlvVer15: " + type);
            }
        }
    }
}
