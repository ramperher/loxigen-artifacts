// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;
import java.util.Set;
import java.util.List;

abstract class OFBsnTlvVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 4;


    public final static OFBsnTlvVer14.Reader READER = new Reader();

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
                   // discriminator value 0xc0=0xc0 for class OFBsnTlvActiveVer14
                   return OFBsnTlvActiveVer14.READER.readFrom(bb);
               case (short) 0x2c:
                   // discriminator value 0x2c=0x2c for class OFBsnTlvActorKeyVer14
                   return OFBsnTlvActorKeyVer14.READER.readFrom(bb);
               case (short) 0x2b:
                   // discriminator value 0x2b=0x2b for class OFBsnTlvActorPortNumVer14
                   return OFBsnTlvActorPortNumVer14.READER.readFrom(bb);
               case (short) 0x2a:
                   // discriminator value 0x2a=0x2a for class OFBsnTlvActorPortPriorityVer14
                   return OFBsnTlvActorPortPriorityVer14.READER.readFrom(bb);
               case (short) 0x35:
                   // discriminator value 0x35=0x35 for class OFBsnTlvActorStateVer14
                   return OFBsnTlvActorStateVer14.READER.readFrom(bb);
               case (short) 0x29:
                   // discriminator value 0x29=0x29 for class OFBsnTlvActorSystemMacVer14
                   return OFBsnTlvActorSystemMacVer14.READER.readFrom(bb);
               case (short) 0x28:
                   // discriminator value 0x28=0x28 for class OFBsnTlvActorSystemPriorityVer14
                   return OFBsnTlvActorSystemPriorityVer14.READER.readFrom(bb);
               case (short) 0x51:
                   // discriminator value 0x51=0x51 for class OFBsnTlvAnchorVer14
                   return OFBsnTlvAnchorVer14.READER.readFrom(bb);
               case (short) 0x82:
                   // discriminator value 0x82=0x82 for class OFBsnTlvApplyBytesVer14
                   return OFBsnTlvApplyBytesVer14.READER.readFrom(bb);
               case (short) 0x81:
                   // discriminator value 0x81=0x81 for class OFBsnTlvApplyPacketsVer14
                   return OFBsnTlvApplyPacketsVer14.READER.readFrom(bb);
               case (short) 0x90:
                   // discriminator value 0x90=0x90 for class OFBsnTlvAutoNegotiationVer14
                   return OFBsnTlvAutoNegotiationVer14.READER.readFrom(bb);
               case (short) 0xb0:
                   // discriminator value 0xb0=0xb0 for class OFBsnTlvBfdEndpointVer14
                   return OFBsnTlvBfdEndpointVer14.READER.readFrom(bb);
               case (short) 0xb1:
                   // discriminator value 0xb1=0xb1 for class OFBsnTlvBfdStateVer14
                   return OFBsnTlvBfdStateVer14.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value 0xa=0xa for class OFBsnTlvBroadcastQueryTimeoutVer14
                   return OFBsnTlvBroadcastQueryTimeoutVer14.READER.readFrom(bb);
               case (short) 0x5a:
                   // discriminator value 0x5a=0x5a for class OFBsnTlvBroadcastRateVer14
                   return OFBsnTlvBroadcastRateVer14.READER.readFrom(bb);
               case (short) 0x40:
                   // discriminator value 0x40=0x40 for class OFBsnTlvBucketVer14
                   return OFBsnTlvBucketVer14.READER.readFrom(bb);
               case (short) 0xe:
                   // discriminator value 0xe=0xe for class OFBsnTlvCircuitIdVer14
                   return OFBsnTlvCircuitIdVer14.READER.readFrom(bb);
               case (short) 0x2d:
                   // discriminator value 0x2d=0x2d for class OFBsnTlvConvergenceStatusVer14
                   return OFBsnTlvConvergenceStatusVer14.READER.readFrom(bb);
               case (short) 0x76:
                   // discriminator value 0x76=0x76 for class OFBsnTlvCpuLagVer14
                   return OFBsnTlvCpuLagVer14.READER.readFrom(bb);
               case (short) 0x16:
                   // discriminator value 0x16=0x16 for class OFBsnTlvCrcEnabledVer14
                   return OFBsnTlvCrcEnabledVer14.READER.readFrom(bb);
               case (short) 0x37:
                   // discriminator value 0x37=0x37 for class OFBsnTlvDataVer14
                   return OFBsnTlvDataVer14.READER.readFrom(bb);
               case (short) 0x8c:
                   // discriminator value 0x8c=0x8c for class OFBsnTlvDataMaskVer14
                   return OFBsnTlvDataMaskVer14.READER.readFrom(bb);
               case (short) 0x55:
                   // discriminator value 0x55=0x55 for class OFBsnTlvDecapVer14
                   return OFBsnTlvDecapVer14.READER.readFrom(bb);
               case (short) 0x78:
                   // discriminator value 0x78=0x78 for class OFBsnTlvDisableSrcMacCheckVer14
                   return OFBsnTlvDisableSrcMacCheckVer14.READER.readFrom(bb);
               case (short) 0xb9:
                   // discriminator value 0xb9=0xb9 for class OFBsnTlvDisableXmitVer14
                   return OFBsnTlvDisableXmitVer14.READER.readFrom(bb);
               case (short) 0xbe:
                   // discriminator value 0xbe=0xbe for class OFBsnTlvDnsAnalyticsVer14
                   return OFBsnTlvDnsAnalyticsVer14.READER.readFrom(bb);
               case (short) 0x79:
                   // discriminator value 0x79=0x79 for class OFBsnTlvDropVer14
                   return OFBsnTlvDropVer14.READER.readFrom(bb);
               case (short) 0xbb:
                   // discriminator value 0xbb=0xbb for class OFBsnTlvDropControlVer14
                   return OFBsnTlvDropControlVer14.READER.readFrom(bb);
               case (short) 0x70:
                   // discriminator value 0x70=0x70 for class OFBsnTlvDscpVer14
                   return OFBsnTlvDscpVer14.READER.readFrom(bb);
               case (short) 0x84:
                   // discriminator value 0x84=0x84 for class OFBsnTlvEcnVer14
                   return OFBsnTlvEcnVer14.READER.readFrom(bb);
               case (short) 0x89:
                   // discriminator value 0x89=0x89 for class OFBsnTlvEgressOnlyVer14
                   return OFBsnTlvEgressOnlyVer14.READER.readFrom(bb);
               case (short) 0x8b:
                   // discriminator value 0x8b=0x8b for class OFBsnTlvEgressPortGroupIdVer14
                   return OFBsnTlvEgressPortGroupIdVer14.READER.readFrom(bb);
               case (short) 0xaf:
                   // discriminator value 0xaf=0xaf for class OFBsnTlvEncapVer14
                   return OFBsnTlvEncapVer14.READER.readFrom(bb);
               case (short) 0x8f:
                   // discriminator value 0x8f=0x8f for class OFBsnTlvEnhancedHashCapabilityVer14
                   return OFBsnTlvEnhancedHashCapabilityVer14.READER.readFrom(bb);
               case (short) 0x21:
                   // discriminator value 0x21=0x21 for class OFBsnTlvEthDstVer14
                   return OFBsnTlvEthDstVer14.READER.readFrom(bb);
               case (short) 0x20:
                   // discriminator value 0x20=0x20 for class OFBsnTlvEthSrcVer14
                   return OFBsnTlvEthSrcVer14.READER.readFrom(bb);
               case (short) 0x83:
                   // discriminator value 0x83=0x83 for class OFBsnTlvEthTypeVer14
                   return OFBsnTlvEthTypeVer14.READER.readFrom(bb);
               case (short) 0x1a:
                   // discriminator value 0x1a=0x1a for class OFBsnTlvExternalGatewayIpVer14
                   return OFBsnTlvExternalGatewayIpVer14.READER.readFrom(bb);
               case (short) 0x1d:
                   // discriminator value 0x1d=0x1d for class OFBsnTlvExternalGatewayMacVer14
                   return OFBsnTlvExternalGatewayMacVer14.READER.readFrom(bb);
               case (short) 0x17:
                   // discriminator value 0x17=0x17 for class OFBsnTlvExternalIpVer14
                   return OFBsnTlvExternalIpVer14.READER.readFrom(bb);
               case (short) 0x18:
                   // discriminator value 0x18=0x18 for class OFBsnTlvExternalMacVer14
                   return OFBsnTlvExternalMacVer14.READER.readFrom(bb);
               case (short) 0x19:
                   // discriminator value 0x19=0x19 for class OFBsnTlvExternalNetmaskVer14
                   return OFBsnTlvExternalNetmaskVer14.READER.readFrom(bb);
               case (short) 0xa5:
                   // discriminator value 0xa5=0xa5 for class OFBsnTlvFabricPortRoleVer14
                   return OFBsnTlvFabricPortRoleVer14.READER.readFrom(bb);
               case (short) 0xc2:
                   // discriminator value 0xc2=0xc2 for class OFBsnTlvFailCountVer14
                   return OFBsnTlvFailCountVer14.READER.readFrom(bb);
               case (short) 0xa3:
                   // discriminator value 0xa3=0xa3 for class OFBsnTlvFloodVer14
                   return OFBsnTlvFloodVer14.READER.readFrom(bb);
               case (short) 0xb8:
                   // discriminator value 0xb8=0xb8 for class OFBsnTlvFlowClassifierVer14
                   return OFBsnTlvFlowClassifierVer14.READER.readFrom(bb);
               case (short) 0xb6:
                   // discriminator value 0xb6=0xb6 for class OFBsnTlvFlowClassifyVer14
                   return OFBsnTlvFlowClassifyVer14.READER.readFrom(bb);
               case (short) 0xb7:
                   // discriminator value 0xb7=0xb7 for class OFBsnTlvFlowIdentifierVer14
                   return OFBsnTlvFlowIdentifierVer14.READER.readFrom(bb);
               case (short) 0x97:
                   // discriminator value 0x97=0x97 for class OFBsnTlvForceLinkUpVer14
                   return OFBsnTlvForceLinkUpVer14.READER.readFrom(bb);
               case (short) 0x95:
                   // discriminator value 0x95=0x95 for class OFBsnTlvForwardErrorCorrectionVer14
                   return OFBsnTlvForwardErrorCorrectionVer14.READER.readFrom(bb);
               case (short) 0x50:
                   // discriminator value 0x50=0x50 for class OFBsnTlvGenerationIdVer14
                   return OFBsnTlvGenerationIdVer14.READER.readFrom(bb);
               case (short) 0x91:
                   // discriminator value 0x91=0x91 for class OFBsnTlvHashAlgorithmVer14
                   return OFBsnTlvHashAlgorithmVer14.READER.readFrom(bb);
               case (short) 0x68:
                   // discriminator value 0x68=0x68 for class OFBsnTlvHashGtpHeaderMatchVer14
                   return OFBsnTlvHashGtpHeaderMatchVer14.READER.readFrom(bb);
               case (short) 0x69:
                   // discriminator value 0x69=0x69 for class OFBsnTlvHashGtpPortMatchVer14
                   return OFBsnTlvHashGtpPortMatchVer14.READER.readFrom(bb);
               case (short) 0x67:
                   // discriminator value 0x67=0x67 for class OFBsnTlvHashPacketFieldVer14
                   return OFBsnTlvHashPacketFieldVer14.READER.readFrom(bb);
               case (short) 0x66:
                   // discriminator value 0x66=0x66 for class OFBsnTlvHashPacketTypeVer14
                   return OFBsnTlvHashPacketTypeVer14.READER.readFrom(bb);
               case (short) 0x64:
                   // discriminator value 0x64=0x64 for class OFBsnTlvHashSeedVer14
                   return OFBsnTlvHashSeedVer14.READER.readFrom(bb);
               case (short) 0x65:
                   // discriminator value 0x65=0x65 for class OFBsnTlvHashTypeVer14
                   return OFBsnTlvHashTypeVer14.READER.readFrom(bb);
               case (short) 0x1f:
                   // discriminator value 0x1f=0x1f for class OFBsnTlvHeaderSizeVer14
                   return OFBsnTlvHeaderSizeVer14.READER.readFrom(bb);
               case (short) 0x45:
                   // discriminator value 0x45=0x45 for class OFBsnTlvIcmpCodeVer14
                   return OFBsnTlvIcmpCodeVer14.READER.readFrom(bb);
               case (short) 0x46:
                   // discriminator value 0x46=0x46 for class OFBsnTlvIcmpIdVer14
                   return OFBsnTlvIcmpIdVer14.READER.readFrom(bb);
               case (short) 0x44:
                   // discriminator value 0x44=0x44 for class OFBsnTlvIcmpTypeVer14
                   return OFBsnTlvIcmpTypeVer14.READER.readFrom(bb);
               case (short) 0x7d:
                   // discriminator value 0x7d=0x7d for class OFBsnTlvIcmpv6ChksumVer14
                   return OFBsnTlvIcmpv6ChksumVer14.READER.readFrom(bb);
               case (short) 0xad:
                   // discriminator value 0xad=0xad for class OFBsnTlvIdentifierVer14
                   return OFBsnTlvIdentifierVer14.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value 0x7=0x7 for class OFBsnTlvIdleNotificationVer14
                   return OFBsnTlvIdleNotificationVer14.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value 0x5=0x5 for class OFBsnTlvIdleTimeVer14
                   return OFBsnTlvIdleTimeVer14.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value 0x8=0x8 for class OFBsnTlvIdleTimeoutVer14
                   return OFBsnTlvIdleTimeoutVer14.READER.readFrom(bb);
               case (short) 0x4e:
                   // discriminator value 0x4e=0x4e for class OFBsnTlvIgmpSnoopingVer14
                   return OFBsnTlvIgmpSnoopingVer14.READER.readFrom(bb);
               case (short) 0x8a:
                   // discriminator value 0x8a=0x8a for class OFBsnTlvIngressPortGroupIdVer14
                   return OFBsnTlvIngressPortGroupIdVer14.READER.readFrom(bb);
               case (short) 0x1c:
                   // discriminator value 0x1c=0x1c for class OFBsnTlvInternalGatewayMacVer14
                   return OFBsnTlvInternalGatewayMacVer14.READER.readFrom(bb);
               case (short) 0x1b:
                   // discriminator value 0x1b=0x1b for class OFBsnTlvInternalMacVer14
                   return OFBsnTlvInternalMacVer14.READER.readFrom(bb);
               case (short) 0x3a:
                   // discriminator value 0x3a=0x3a for class OFBsnTlvIntervalVer14
                   return OFBsnTlvIntervalVer14.READER.readFrom(bb);
               case (short) 0x43:
                   // discriminator value 0x43=0x43 for class OFBsnTlvIpProtoVer14
                   return OFBsnTlvIpProtoVer14.READER.readFrom(bb);
               case (short) 0xa9:
                   // discriminator value 0xa9=0xa9 for class OFBsnTlvIpTunnelTypeVer14
                   return OFBsnTlvIpTunnelTypeVer14.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value 0x4=0x4 for class OFBsnTlvIpv4Ver14
                   return OFBsnTlvIpv4Ver14.READER.readFrom(bb);
               case (short) 0x23:
                   // discriminator value 0x23=0x23 for class OFBsnTlvIpv4DstVer14
                   return OFBsnTlvIpv4DstVer14.READER.readFrom(bb);
               case (short) 0x3c:
                   // discriminator value 0x3c=0x3c for class OFBsnTlvIpv4NetmaskVer14
                   return OFBsnTlvIpv4NetmaskVer14.READER.readFrom(bb);
               case (short) 0x22:
                   // discriminator value 0x22=0x22 for class OFBsnTlvIpv4SrcVer14
                   return OFBsnTlvIpv4SrcVer14.READER.readFrom(bb);
               case (short) 0x54:
                   // discriminator value 0x54=0x54 for class OFBsnTlvIpv6Ver14
                   return OFBsnTlvIpv6Ver14.READER.readFrom(bb);
               case (short) 0x7f:
                   // discriminator value 0x7f=0x7f for class OFBsnTlvIpv6DstVer14
                   return OFBsnTlvIpv6DstVer14.READER.readFrom(bb);
               case (short) 0x7a:
                   // discriminator value 0x7a=0x7a for class OFBsnTlvIpv6PrefixVer14
                   return OFBsnTlvIpv6PrefixVer14.READER.readFrom(bb);
               case (short) 0x7e:
                   // discriminator value 0x7e=0x7e for class OFBsnTlvIpv6SrcVer14
                   return OFBsnTlvIpv6SrcVer14.READER.readFrom(bb);
               case (short) 0x5b:
                   // discriminator value 0x5b=0x5b for class OFBsnTlvKnownMulticastRateVer14
                   return OFBsnTlvKnownMulticastRateVer14.READER.readFrom(bb);
               case (short) 0x4f:
                   // discriminator value 0x4f=0x4f for class OFBsnTlvL2MulticastLookupVer14
                   return OFBsnTlvL2MulticastLookupVer14.READER.readFrom(bb);
               case (short) 0xa8:
                   // discriminator value 0xa8=0xa8 for class OFBsnTlvL3Ver14
                   return OFBsnTlvL3Ver14.READER.readFrom(bb);
               case (short) 0x88:
                   // discriminator value 0x88=0x88 for class OFBsnTlvL3DstClassIdVer14
                   return OFBsnTlvL3DstClassIdVer14.READER.readFrom(bb);
               case (short) 0x86:
                   // discriminator value 0x86=0x86 for class OFBsnTlvL3InterfaceClassIdVer14
                   return OFBsnTlvL3InterfaceClassIdVer14.READER.readFrom(bb);
               case (short) 0x87:
                   // discriminator value 0x87=0x87 for class OFBsnTlvL3SrcClassIdVer14
                   return OFBsnTlvL3SrcClassIdVer14.READER.readFrom(bb);
               case (short) 0xa0:
                   // discriminator value 0xa0=0xa0 for class OFBsnTlvLagOptionsVer14
                   return OFBsnTlvLagOptionsVer14.READER.readFrom(bb);
               case (short) 0xc1:
                   // discriminator value 0xc1=0xc1 for class OFBsnTlvLinkUpVer14
                   return OFBsnTlvLinkUpVer14.READER.readFrom(bb);
               case (short) 0x92:
                   // discriminator value 0x92=0x92 for class OFBsnTlvLoopbackModeVer14
                   return OFBsnTlvLoopbackModeVer14.READER.readFrom(bb);
               case (short) 0x6e:
                   // discriminator value 0x6e=0x6e for class OFBsnTlvLoopbackPortVer14
                   return OFBsnTlvLoopbackPortVer14.READER.readFrom(bb);
               case (short) 0xbc:
                   // discriminator value 0xbc=0xbc for class OFBsnTlvLosslessVer14
                   return OFBsnTlvLosslessVer14.READER.readFrom(bb);
               case (short) 0xb2:
                   // discriminator value 0xb2=0xb2 for class OFBsnTlvLrAllEnabledVer14
                   return OFBsnTlvLrAllEnabledVer14.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value 0x1=0x1 for class OFBsnTlvMacVer14
                   return OFBsnTlvMacVer14.READER.readFrom(bb);
               case (short) 0x38:
                   // discriminator value 0x38=0x38 for class OFBsnTlvMacMaskVer14
                   return OFBsnTlvMacMaskVer14.READER.readFrom(bb);
               case (short) 0x57:
                   // discriminator value 0x57=0x57 for class OFBsnTlvMcgTypeVxlanVer14
                   return OFBsnTlvMcgTypeVxlanVer14.READER.readFrom(bb);
               case (short) 0xd:
                   // discriminator value 0xd=0xd for class OFBsnTlvMissPacketsVer14
                   return OFBsnTlvMissPacketsVer14.READER.readFrom(bb);
               case (short) 0x3e:
                   // discriminator value 0x3e=0x3e for class OFBsnTlvMplsControlWordVer14
                   return OFBsnTlvMplsControlWordVer14.READER.readFrom(bb);
               case (short) 0x3d:
                   // discriminator value 0x3d=0x3d for class OFBsnTlvMplsLabelVer14
                   return OFBsnTlvMplsLabelVer14.READER.readFrom(bb);
               case (short) 0x3f:
                   // discriminator value 0x3f=0x3f for class OFBsnTlvMplsSequencedVer14
                   return OFBsnTlvMplsSequencedVer14.READER.readFrom(bb);
               case (short) 0x5f:
                   // discriminator value 0x5f=0x5f for class OFBsnTlvMulticastInterfaceIdVer14
                   return OFBsnTlvMulticastInterfaceIdVer14.READER.readFrom(bb);
               case (short) 0xaa:
                   // discriminator value 0xaa=0xaa for class OFBsnTlvMulticastPacketVer14
                   return OFBsnTlvMulticastPacketVer14.READER.readFrom(bb);
               case (short) 0xae:
                   // discriminator value 0xae=0xae for class OFBsnTlvMultiplierVer14
                   return OFBsnTlvMultiplierVer14.READER.readFrom(bb);
               case (short) 0x34:
                   // discriminator value 0x34=0x34 for class OFBsnTlvNameVer14
                   return OFBsnTlvNameVer14.READER.readFrom(bb);
               case (short) 0x7b:
                   // discriminator value 0x7b=0x7b for class OFBsnTlvNdpOffloadVer14
                   return OFBsnTlvNdpOffloadVer14.READER.readFrom(bb);
               case (short) 0x7c:
                   // discriminator value 0x7c=0x7c for class OFBsnTlvNdpStaticVer14
                   return OFBsnTlvNdpStaticVer14.READER.readFrom(bb);
               case (short) 0x53:
                   // discriminator value 0x53=0x53 for class OFBsnTlvNegateVer14
                   return OFBsnTlvNegateVer14.READER.readFrom(bb);
               case (short) 0x73:
                   // discriminator value 0x73=0x73 for class OFBsnTlvNextHopIpv4Ver14
                   return OFBsnTlvNextHopIpv4Ver14.READER.readFrom(bb);
               case (short) 0x72:
                   // discriminator value 0x72=0x72 for class OFBsnTlvNextHopMacVer14
                   return OFBsnTlvNextHopMacVer14.READER.readFrom(bb);
               case (short) 0x5e:
                   // discriminator value 0x5e=0x5e for class OFBsnTlvNexthopTypeVxlanVer14
                   return OFBsnTlvNexthopTypeVxlanVer14.READER.readFrom(bb);
               case (short) 0x93:
                   // discriminator value 0x93=0x93 for class OFBsnTlvNoArpResponseVer14
                   return OFBsnTlvNoArpResponseVer14.READER.readFrom(bb);
               case (short) 0x94:
                   // discriminator value 0x94=0x94 for class OFBsnTlvNoNsResponseVer14
                   return OFBsnTlvNoNsResponseVer14.READER.readFrom(bb);
               case (short) 0x52:
                   // discriminator value 0x52=0x52 for class OFBsnTlvOffsetVer14
                   return OFBsnTlvOffsetVer14.READER.readFrom(bb);
               case (short) 0x96:
                   // discriminator value 0x96=0x96 for class OFBsnTlvOpticsAlwaysEnabledVer14
                   return OFBsnTlvOpticsAlwaysEnabledVer14.READER.readFrom(bb);
               case (short) 0x9d:
                   // discriminator value 0x9d=0x9d for class OFBsnTlvOuterSrcMacVer14
                   return OFBsnTlvOuterSrcMacVer14.READER.readFrom(bb);
               case (short) 0x6d:
                   // discriminator value 0x6d=0x6d for class OFBsnTlvParentPortVer14
                   return OFBsnTlvParentPortVer14.READER.readFrom(bb);
               case (short) 0x33:
                   // discriminator value 0x33=0x33 for class OFBsnTlvPartnerKeyVer14
                   return OFBsnTlvPartnerKeyVer14.READER.readFrom(bb);
               case (short) 0x32:
                   // discriminator value 0x32=0x32 for class OFBsnTlvPartnerPortNumVer14
                   return OFBsnTlvPartnerPortNumVer14.READER.readFrom(bb);
               case (short) 0x31:
                   // discriminator value 0x31=0x31 for class OFBsnTlvPartnerPortPriorityVer14
                   return OFBsnTlvPartnerPortPriorityVer14.READER.readFrom(bb);
               case (short) 0x36:
                   // discriminator value 0x36=0x36 for class OFBsnTlvPartnerStateVer14
                   return OFBsnTlvPartnerStateVer14.READER.readFrom(bb);
               case (short) 0x30:
                   // discriminator value 0x30=0x30 for class OFBsnTlvPartnerSystemMacVer14
                   return OFBsnTlvPartnerSystemMacVer14.READER.readFrom(bb);
               case (short) 0x2f:
                   // discriminator value 0x2f=0x2f for class OFBsnTlvPartnerSystemPriorityVer14
                   return OFBsnTlvPartnerSystemPriorityVer14.READER.readFrom(bb);
               case (short) 0xac:
                   // discriminator value 0xac=0xac for class OFBsnTlvPassiveVer14
                   return OFBsnTlvPassiveVer14.READER.readFrom(bb);
               case (short) 0x9f:
                   // discriminator value 0x9f=0x9f for class OFBsnTlvPduaRxInstanceVer14
                   return OFBsnTlvPduaRxInstanceVer14.READER.readFrom(bb);
               case (short) 0xab:
                   // discriminator value 0xab=0xab for class OFBsnTlvPimDrVer14
                   return OFBsnTlvPimDrVer14.READER.readFrom(bb);
               case (short) 0xb5:
                   // discriminator value 0xb5=0xb5 for class OFBsnTlvPimHelloFloodVer14
                   return OFBsnTlvPimHelloFloodVer14.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value 0x0=0x0 for class OFBsnTlvPortVer14
                   return OFBsnTlvPortVer14.READER.readFrom(bb);
               case (short) 0xb3:
                   // discriminator value 0xb3=0xb3 for class OFBsnTlvPortModeVer14
                   return OFBsnTlvPortModeVer14.READER.readFrom(bb);
               case (short) 0x9c:
                   // discriminator value 0x9c=0x9c for class OFBsnTlvPortSpeedGbpsVer14
                   return OFBsnTlvPortSpeedGbpsVer14.READER.readFrom(bb);
               case (short) 0x8d:
                   // discriminator value 0x8d=0x8d for class OFBsnTlvPortUsageVer14
                   return OFBsnTlvPortUsageVer14.READER.readFrom(bb);
               case (short) 0x58:
                   // discriminator value 0x58=0x58 for class OFBsnTlvPortVxlanModeVer14
                   return OFBsnTlvPortVxlanModeVer14.READER.readFrom(bb);
               case (short) 0xba:
                   // discriminator value 0xba=0xba for class OFBsnTlvPreserveVlanVer14
                   return OFBsnTlvPreserveVlanVer14.READER.readFrom(bb);
               case (short) 0x39:
                   // discriminator value 0x39=0x39 for class OFBsnTlvPriorityVer14
                   return OFBsnTlvPriorityVer14.READER.readFrom(bb);
               case (short) 0xa2:
                   // discriminator value 0xa2=0xa2 for class OFBsnTlvPushVlanOnEgressVer14
                   return OFBsnTlvPushVlanOnEgressVer14.READER.readFrom(bb);
               case (short) 0x80:
                   // discriminator value 0x80=0x80 for class OFBsnTlvPushVlanOnIngressVer14
                   return OFBsnTlvPushVlanOnIngressVer14.READER.readFrom(bb);
               case (short) 0x6c:
                   // discriminator value 0x6c=0x6c for class OFBsnTlvQosPriorityVer14
                   return OFBsnTlvQosPriorityVer14.READER.readFrom(bb);
               case (short) 0x14:
                   // discriminator value 0x14=0x14 for class OFBsnTlvQueueIdVer14
                   return OFBsnTlvQueueIdVer14.READER.readFrom(bb);
               case (short) 0x15:
                   // discriminator value 0x15=0x15 for class OFBsnTlvQueueWeightVer14
                   return OFBsnTlvQueueWeightVer14.READER.readFrom(bb);
               case (short) 0x74:
                   // discriminator value 0x74=0x74 for class OFBsnTlvRateLimitVer14
                   return OFBsnTlvRateLimitVer14.READER.readFrom(bb);
               case (short) 0x59:
                   // discriminator value 0x59=0x59 for class OFBsnTlvRateUnitVer14
                   return OFBsnTlvRateUnitVer14.READER.readFrom(bb);
               case (short) 0x9b:
                   // discriminator value 0x9b=0x9b for class OFBsnTlvRecordPacketsVer14
                   return OFBsnTlvRecordPacketsVer14.READER.readFrom(bb);
               case (short) 0xbd:
                   // discriminator value 0xbd=0xbd for class OFBsnTlvRedundantMgmtVer14
                   return OFBsnTlvRedundantMgmtVer14.READER.readFrom(bb);
               case (short) 0x3b:
                   // discriminator value 0x3b=0x3b for class OFBsnTlvReferenceVer14
                   return OFBsnTlvReferenceVer14.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value 0xc=0xc for class OFBsnTlvReplyPacketsVer14
                   return OFBsnTlvReplyPacketsVer14.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value 0xb=0xb for class OFBsnTlvRequestPacketsVer14
                   return OFBsnTlvRequestPacketsVer14.READER.readFrom(bb);
               case (short) 0x98:
                   // discriminator value 0x98=0x98 for class OFBsnTlvRestServerVer14
                   return OFBsnTlvRestServerVer14.READER.readFrom(bb);
               case (short) 0xa1:
                   // discriminator value 0xa1=0xa1 for class OFBsnTlvRoutingParamVer14
                   return OFBsnTlvRoutingParamVer14.READER.readFrom(bb);
               case (short) 0x47:
                   // discriminator value 0x47=0x47 for class OFBsnTlvRxBytesVer14
                   return OFBsnTlvRxBytesVer14.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value 0x2=0x2 for class OFBsnTlvRxPacketsVer14
                   return OFBsnTlvRxPacketsVer14.READER.readFrom(bb);
               case (short) 0x1e:
                   // discriminator value 0x1e=0x1e for class OFBsnTlvSamplingRateVer14
                   return OFBsnTlvSamplingRateVer14.READER.readFrom(bb);
               case (short) 0x4a:
                   // discriminator value 0x4a=0x4a for class OFBsnTlvSetLoopbackModeVer14
                   return OFBsnTlvSetLoopbackModeVer14.READER.readFrom(bb);
               case (short) 0xbf:
                   // discriminator value 0xbf=0xbf for class OFBsnTlvSrcMacCmlVer14
                   return OFBsnTlvSrcMacCmlVer14.READER.readFrom(bb);
               case (short) 0x61:
                   // discriminator value 0x61=0x61 for class OFBsnTlvStatusVer14
                   return OFBsnTlvStatusVer14.READER.readFrom(bb);
               case (short) 0x4b:
                   // discriminator value 0x4b=0x4b for class OFBsnTlvStripMplsL2OnIngressVer14
                   return OFBsnTlvStripMplsL2OnIngressVer14.READER.readFrom(bb);
               case (short) 0x4c:
                   // discriminator value 0x4c=0x4c for class OFBsnTlvStripMplsL3OnIngressVer14
                   return OFBsnTlvStripMplsL3OnIngressVer14.READER.readFrom(bb);
               case (short) 0x49:
                   // discriminator value 0x49=0x49 for class OFBsnTlvStripVlanOnEgressVer14
                   return OFBsnTlvStripVlanOnEgressVer14.READER.readFrom(bb);
               case (short) 0x26:
                   // discriminator value 0x26=0x26 for class OFBsnTlvSubAgentIdVer14
                   return OFBsnTlvSubAgentIdVer14.READER.readFrom(bb);
               case (short) 0x42:
                   // discriminator value 0x42=0x42 for class OFBsnTlvTcpDstVer14
                   return OFBsnTlvTcpDstVer14.READER.readFrom(bb);
               case (short) 0x85:
                   // discriminator value 0x85=0x85 for class OFBsnTlvTcpFlagsVer14
                   return OFBsnTlvTcpFlagsVer14.READER.readFrom(bb);
               case (short) 0x41:
                   // discriminator value 0x41=0x41 for class OFBsnTlvTcpSrcVer14
                   return OFBsnTlvTcpSrcVer14.READER.readFrom(bb);
               case (short) 0x9a:
                   // discriminator value 0x9a=0x9a for class OFBsnTlvTimestampVer14
                   return OFBsnTlvTimestampVer14.READER.readFrom(bb);
               case (short) 0x71:
                   // discriminator value 0x71=0x71 for class OFBsnTlvTtlVer14
                   return OFBsnTlvTtlVer14.READER.readFrom(bb);
               case (short) 0x8e:
                   // discriminator value 0x8e=0x8e for class OFBsnTlvTunnelCapabilityVer14
                   return OFBsnTlvTunnelCapabilityVer14.READER.readFrom(bb);
               case (short) 0x27:
                   // discriminator value 0x27=0x27 for class OFBsnTlvTxBytesVer14
                   return OFBsnTlvTxBytesVer14.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value 0x3=0x3 for class OFBsnTlvTxPacketsVer14
                   return OFBsnTlvTxPacketsVer14.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value 0x10=0x10 for class OFBsnTlvUdfAnchorVer14
                   return OFBsnTlvUdfAnchorVer14.READER.readFrom(bb);
               case (short) 0xb4:
                   // discriminator value 0xb4=0xb4 for class OFBsnTlvUdfCapabilityVer14
                   return OFBsnTlvUdfCapabilityVer14.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value 0xf=0xf for class OFBsnTlvUdfIdVer14
                   return OFBsnTlvUdfIdVer14.READER.readFrom(bb);
               case (short) 0x12:
                   // discriminator value 0x12=0x12 for class OFBsnTlvUdfLengthVer14
                   return OFBsnTlvUdfLengthVer14.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value 0x11=0x11 for class OFBsnTlvUdfOffsetVer14
                   return OFBsnTlvUdfOffsetVer14.READER.readFrom(bb);
               case (short) 0x25:
                   // discriminator value 0x25=0x25 for class OFBsnTlvUdpDstVer14
                   return OFBsnTlvUdpDstVer14.READER.readFrom(bb);
               case (short) 0x24:
                   // discriminator value 0x24=0x24 for class OFBsnTlvUdpSrcVer14
                   return OFBsnTlvUdpSrcVer14.READER.readFrom(bb);
               case (short) 0xa7:
                   // discriminator value 0xa7=0xa7 for class OFBsnTlvUint32Ver14
                   return OFBsnTlvUint32Ver14.READER.readFrom(bb);
               case (short) 0x77:
                   // discriminator value 0x77=0x77 for class OFBsnTlvUint64ListVer14
                   return OFBsnTlvUint64ListVer14.READER.readFrom(bb);
               case (short) 0x9:
                   // discriminator value 0x9=0x9 for class OFBsnTlvUnicastQueryTimeoutVer14
                   return OFBsnTlvUnicastQueryTimeoutVer14.READER.readFrom(bb);
               case (short) 0x5d:
                   // discriminator value 0x5d=0x5d for class OFBsnTlvUnicastRateVer14
                   return OFBsnTlvUnicastRateVer14.READER.readFrom(bb);
               case (short) 0x5c:
                   // discriminator value 0x5c=0x5c for class OFBsnTlvUnknownMulticastRateVer14
                   return OFBsnTlvUnknownMulticastRateVer14.READER.readFrom(bb);
               case (short) 0x6a:
                   // discriminator value 0x6a=0x6a for class OFBsnTlvUntaggedVer14
                   return OFBsnTlvUntaggedVer14.READER.readFrom(bb);
               case (short) 0xa4:
                   // discriminator value 0xa4=0xa4 for class OFBsnTlvUpgradeVer14
                   return OFBsnTlvUpgradeVer14.READER.readFrom(bb);
               case (short) 0x99:
                   // discriminator value 0x99=0x99 for class OFBsnTlvUriSchemeVer14
                   return OFBsnTlvUriSchemeVer14.READER.readFrom(bb);
               case (short) 0x60:
                   // discriminator value 0x60=0x60 for class OFBsnTlvUsePacketStateVer14
                   return OFBsnTlvUsePacketStateVer14.READER.readFrom(bb);
               case (short) 0xa6:
                   // discriminator value 0xa6=0xa6 for class OFBsnTlvUserConfiguredVer14
                   return OFBsnTlvUserConfiguredVer14.READER.readFrom(bb);
               case (short) 0x63:
                   // discriminator value 0x63=0x63 for class OFBsnTlvVfiVer14
                   return OFBsnTlvVfiVer14.READER.readFrom(bb);
               case (short) 0x6b:
                   // discriminator value 0x6b=0x6b for class OFBsnTlvVfpClassIdVer14
                   return OFBsnTlvVfpClassIdVer14.READER.readFrom(bb);
               case (short) 0x9e:
                   // discriminator value 0x9e=0x9e for class OFBsnTlvVirtualVer14
                   return OFBsnTlvVirtualVer14.READER.readFrom(bb);
               case (short) 0x62:
                   // discriminator value 0x62=0x62 for class OFBsnTlvVlanMacListVer14
                   return OFBsnTlvVlanMacListVer14.READER.readFrom(bb);
               case (short) 0x48:
                   // discriminator value 0x48=0x48 for class OFBsnTlvVlanPcpVer14
                   return OFBsnTlvVlanPcpVer14.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value 0x6=0x6 for class OFBsnTlvVlanVidVer14
                   return OFBsnTlvVlanVidVer14.READER.readFrom(bb);
               case (short) 0x4d:
                   // discriminator value 0x4d=0x4d for class OFBsnTlvVlanVidMaskVer14
                   return OFBsnTlvVlanVidMaskVer14.READER.readFrom(bb);
               case (short) 0x56:
                   // discriminator value 0x56=0x56 for class OFBsnTlvVniVer14
                   return OFBsnTlvVniVer14.READER.readFrom(bb);
               case (short) 0x6f:
                   // discriminator value 0x6f=0x6f for class OFBsnTlvVpnKeyVer14
                   return OFBsnTlvVpnKeyVer14.READER.readFrom(bb);
               case (short) 0x13:
                   // discriminator value 0x13=0x13 for class OFBsnTlvVrfVer14
                   return OFBsnTlvVrfVer14.READER.readFrom(bb);
               case (short) 0x75:
                   // discriminator value 0x75=0x75 for class OFBsnTlvVxlanEgressLagVer14
                   return OFBsnTlvVxlanEgressLagVer14.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFBsnTlvVer14: " + type);
            }
        }
    }
}
