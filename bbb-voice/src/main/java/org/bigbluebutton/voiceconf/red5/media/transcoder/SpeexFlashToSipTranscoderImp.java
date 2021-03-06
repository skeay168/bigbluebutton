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
package org.bigbluebutton.voiceconf.red5.media.transcoder;

import java.util.Random;

import org.bigbluebutton.voiceconf.red5.media.AudioByteData;
import org.red5.app.sip.codecs.Codec;
import org.red5.logging.Red5LoggerFactory;
import org.slf4j.Logger;

public class SpeexFlashToSipTranscoderImp implements FlashToSipTranscoder {
	protected static Logger log = Red5LoggerFactory.getLogger(SpeexFlashToSipTranscoderImp.class, "sip");
	
	private Codec audioCodec;
	private long timestamp = 0;
	private final static int TS_INCREMENT = 320;
	
	public SpeexFlashToSipTranscoderImp(Codec audioCodec) {
		this.audioCodec = audioCodec;
        Random rgen = new Random();
        timestamp = rgen.nextInt(1000);
	}
	
	public void transcode(AudioByteData audioData, int startOffset, int length, TranscodedAudioDataListener listener) {
		byte[] transcodedAudio = new byte[length];
		System.arraycopy(audioData.getData(), startOffset, transcodedAudio, 0, length);
		listener.handleTranscodedAudioData(transcodedAudio, timestamp += TS_INCREMENT);
	}
	
	public int getCodecId() {
		return audioCodec.getCodecId();
	}

	public int getOutgoingEncodedFrameSize() {
		return audioCodec.getOutgoingEncodedFrameSize();
	}

	public int getOutgoingPacketization() {
		return audioCodec.getOutgoingPacketization();
	}
}
