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
 * $Id: $
 */
package org.bigbluebutton.voiceconf.sip;

public class AudioConferenceProvider {
	private final String host;
	private final int sipPort;
	private final int startAudioPort;
	private final int stopAudioPort;
	private int curAvailablePort;
	
	public AudioConferenceProvider(String host, int sipPort, int startAudioPort, int stopAudioPort) {
		this.host = host;
		this.sipPort = sipPort;
		this.startAudioPort = startAudioPort;
		this.stopAudioPort = stopAudioPort;
		curAvailablePort = startAudioPort;
	}
	
	public int getFreeAudioPort() {
    	synchronized(this) {
        	int availablePort = curAvailablePort;
        	curAvailablePort++;
    		if (curAvailablePort > stopAudioPort) curAvailablePort = startAudioPort;    
    		return availablePort;
    	}
    }
	
	public String getHost() {
		return host;
	}
	
	public int getStartAudioPort() {
		return startAudioPort;
	}
}
