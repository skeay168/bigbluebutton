/*
 * BigBlueButton - http://www.bigbluebutton.org
 *
 * Copyright (c) 2008-2009 by respective authors (see below). All rights reserved.
 *
 * BigBlueButton is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 *
 * BigBlueButton is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with BigBlueButton; if not, If not, see <http://www.gnu.org/licenses/>.
 *
 * Author: Richard Alam <ritzalam@gmail.com>
 *         Leif Jackson <ljackson@jjcons.com> based on asterisk version from Richard Alam
 *
 * $Id: $
 */
package org.bigbluebutton.webconference.voice.freeswitch.actions;

public abstract class FreeswitchCommand {
    public static final String SPACE = " ";

    protected final String room;
    protected final Integer requesterId;

    public FreeswitchCommand(String room, Integer requesterId) {
            this.room = room;
            this.requesterId = requesterId;
    }

    public String getCommand() {
        return "conference"; //conference is default, override if needed.
    }

    public abstract String getCommandArgs();

    public String getRoom() {
            return room;
    }

    public Integer getRequesterId() {
            return requesterId;
    }
}
