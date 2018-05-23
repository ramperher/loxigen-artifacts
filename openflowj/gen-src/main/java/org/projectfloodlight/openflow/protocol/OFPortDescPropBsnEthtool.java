// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

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
import io.netty.buffer.ByteBuf;

public interface OFPortDescPropBsnEthtool extends OFObject, OFPortDescPropBsn {
    int getType();
    long getExperimenter();
    long getExpType();
    Set<OFBsnModuleEepromIdentifier> getIdentifier();
    Set<OFBsnModuleEepromExtendedIdentifier> getExtidentifier();
    Set<OFBsnModuleEepromConnector> getConnector();
    String getTransdata();
    Set<OFBsnModuleEepromEncoding> getEncoding();
    OFBsnUnit getBrNominal();
    Set<OFBsnModuleEepromRateIdentifier> getRateidentifier();
    OFBsnUnit getLengthSmfKm();
    OFBsnUnit getLengthSmf();
    OFBsnUnit getLength50Um();
    OFBsnUnit getLength625Um();
    OFBsnUnit getLengthCopper();
    OFBsnUnit getLengthOm3();
    String getVendorName();
    String getVendorOui();
    String getVendorPn();
    String getVendorRev();
    OFPortDescPropCompliance getCmplnce();
    List<OFPortDescProp> getMoreProperties();
    OFVersion getVersion();

    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFPortDescPropBsn.Builder {
        OFPortDescPropBsnEthtool build();
        int getType();
        long getExperimenter();
        long getExpType();
        Builder setExpType(long expType);
        Set<OFBsnModuleEepromIdentifier> getIdentifier();
        Builder setIdentifier(Set<OFBsnModuleEepromIdentifier> identifier);
        Set<OFBsnModuleEepromExtendedIdentifier> getExtidentifier();
        Builder setExtidentifier(Set<OFBsnModuleEepromExtendedIdentifier> extidentifier);
        Set<OFBsnModuleEepromConnector> getConnector();
        Builder setConnector(Set<OFBsnModuleEepromConnector> connector);
        String getTransdata();
        Builder setTransdata(String transdata);
        Set<OFBsnModuleEepromEncoding> getEncoding();
        Builder setEncoding(Set<OFBsnModuleEepromEncoding> encoding);
        OFBsnUnit getBrNominal();
        Builder setBrNominal(OFBsnUnit brNominal);
        Set<OFBsnModuleEepromRateIdentifier> getRateidentifier();
        Builder setRateidentifier(Set<OFBsnModuleEepromRateIdentifier> rateidentifier);
        OFBsnUnit getLengthSmfKm();
        Builder setLengthSmfKm(OFBsnUnit lengthSmfKm);
        OFBsnUnit getLengthSmf();
        Builder setLengthSmf(OFBsnUnit lengthSmf);
        OFBsnUnit getLength50Um();
        Builder setLength50Um(OFBsnUnit length50Um);
        OFBsnUnit getLength625Um();
        Builder setLength625Um(OFBsnUnit length625Um);
        OFBsnUnit getLengthCopper();
        Builder setLengthCopper(OFBsnUnit lengthCopper);
        OFBsnUnit getLengthOm3();
        Builder setLengthOm3(OFBsnUnit lengthOm3);
        String getVendorName();
        Builder setVendorName(String vendorName);
        String getVendorOui();
        Builder setVendorOui(String vendorOui);
        String getVendorPn();
        Builder setVendorPn(String vendorPn);
        String getVendorRev();
        Builder setVendorRev(String vendorRev);
        OFPortDescPropCompliance getCmplnce();
        Builder setCmplnce(OFPortDescPropCompliance cmplnce);
        List<OFPortDescProp> getMoreProperties();
        Builder setMoreProperties(List<OFPortDescProp> moreProperties);
        OFVersion getVersion();
    }
}
