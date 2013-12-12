// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import java.util.Set;


public class OFActionIdsVer11 implements OFActionIds {
    public final static OFActionIdsVer11 INSTANCE = new OFActionIdsVer11();




    public OFActionIdBsnMirror bsnMirror() {
        throw new UnsupportedOperationException("OFActionIdBsnMirror not supported in version 1.1");
    }

    public OFActionIdBsnSetTunnelDst bsnSetTunnelDst() {
        throw new UnsupportedOperationException("OFActionIdBsnSetTunnelDst not supported in version 1.1");
    }

    public OFActionIdCopyTtlIn copyTtlIn() {
        throw new UnsupportedOperationException("OFActionIdCopyTtlIn not supported in version 1.1");
    }

    public OFActionIdCopyTtlOut copyTtlOut() {
        throw new UnsupportedOperationException("OFActionIdCopyTtlOut not supported in version 1.1");
    }

    public OFActionIdDecMplsTtl decMplsTtl() {
        throw new UnsupportedOperationException("OFActionIdDecMplsTtl not supported in version 1.1");
    }

    public OFActionIdDecNwTtl decNwTtl() {
        throw new UnsupportedOperationException("OFActionIdDecNwTtl not supported in version 1.1");
    }

    public OFActionIdGroup group() {
        throw new UnsupportedOperationException("OFActionIdGroup not supported in version 1.1");
    }

    public OFActionIdNiciraDecTtl niciraDecTtl() {
        throw new UnsupportedOperationException("OFActionIdNiciraDecTtl not supported in version 1.1");
    }

    public OFActionIdOutput output() {
        throw new UnsupportedOperationException("OFActionIdOutput not supported in version 1.1");
    }

    public OFActionIdPopMpls popMpls() {
        throw new UnsupportedOperationException("OFActionIdPopMpls not supported in version 1.1");
    }

    public OFActionIdPopPbb popPbb() {
        throw new UnsupportedOperationException("OFActionIdPopPbb not supported in version 1.1");
    }

    public OFActionIdPopVlan popVlan() {
        throw new UnsupportedOperationException("OFActionIdPopVlan not supported in version 1.1");
    }

    public OFActionIdPushMpls pushMpls() {
        throw new UnsupportedOperationException("OFActionIdPushMpls not supported in version 1.1");
    }

    public OFActionIdPushPbb pushPbb() {
        throw new UnsupportedOperationException("OFActionIdPushPbb not supported in version 1.1");
    }

    public OFActionIdPushVlan pushVlan() {
        throw new UnsupportedOperationException("OFActionIdPushVlan not supported in version 1.1");
    }

    public OFActionIdSetField setField() {
        throw new UnsupportedOperationException("OFActionIdSetField not supported in version 1.1");
    }

    public OFActionIdSetMplsTtl setMplsTtl() {
        throw new UnsupportedOperationException("OFActionIdSetMplsTtl not supported in version 1.1");
    }

    public OFActionIdSetNwTtl setNwTtl() {
        throw new UnsupportedOperationException("OFActionIdSetNwTtl not supported in version 1.1");
    }

    public OFActionIdSetQueue setQueue() {
        throw new UnsupportedOperationException("OFActionIdSetQueue not supported in version 1.1");
    }

    public OFMessageReader<OFActionId> getReader() {
        throw new UnsupportedOperationException("Reader<OFActionId> not supported in version 1.1");
    }


    public OFVersion getVersion() {
            return OFVersion.OF_11;
    }
}