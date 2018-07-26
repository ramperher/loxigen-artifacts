package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.exceptions.OFParseError;
import org.projectfloodlight.openflow.protocol.OFMatchBmap;
import org.projectfloodlight.openflow.protocol.OFMessageReaderContext;
import org.projectfloodlight.openflow.protocol.match.Match;
import org.projectfloodlight.openflow.protocol.stat.Stat;

import io.netty.buffer.ByteBuf;

/**
 * Collection of helper functions for reading and writing into Unpooled
 *
 * @author capveg
 */

public class ChannelUtilsVer13 {
    public static Match readOFMatch(final OFMessageReaderContext context, final ByteBuf bb) throws OFParseError {
        return OFMatchV3Ver13.READER.readFrom(context, bb);
    }

    public static OFMatchBmap readOFMatchBmap(ByteBuf bb) {
        throw new UnsupportedOperationException("not implemented");
    }

    public static void writeOFMatchBmap(ByteBuf bb, OFMatchBmap match) {
        throw new UnsupportedOperationException("not implemented");
    }

    public static Stat readOFStat(final ByteBuf bb) throws OFParseError {
        throw new UnsupportedOperationException("not supported");
    }
}
