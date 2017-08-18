package org.omri.radioservice;

/**
 * Copyright (C) 2016 Open Mobile Radio Interface (OMRI) Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Interface to receive the decoded PCM audio stream
 *   
 * @author Fabian Sattler, IRT GmbH
 */
public interface RadioServiceAudiodataListener extends RadioServiceListener {

	/**
	 * PCM audio data interface
	 * @param pcmData the pcm data, encoded as interleaved signed 16 bit little endian PCM 
	 * @param numChannels the number of audio channels
	 * @param samplingRate the sampling rate
	 */
	public void pcmAudioData(byte[] pcmData, int numChannels, int samplingRate);
}
