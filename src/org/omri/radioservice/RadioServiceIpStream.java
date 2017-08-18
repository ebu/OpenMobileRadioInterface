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
 * Abstract interface which defines the necessary data for a single 'stream' of a {@link RadioService}
 * @author Fabian Sattler, IRT GmbH
 */
public interface RadioServiceIpStream {

	/**
	 * Returns the URL of this stream (e.g. 'http://somewebstream:1337/genre')
	 * @return the URL of this stream
	 */
	public String getUrl();
	
	/**
	 * Returns the bitrate in kbit/s for this stream
	 * @return the bitrate in kbit/s
	 */
	public int getBitrate();
	
	/**
	 * Return the MIME type of this stream
	 * @return the MIME type of this stream
	 */
	public RadioServiceMimeType getMimeType();
	
	/**
	 * Indicates the cost for this stream. Higher means more 'expensive'
	 * @return the cost for this stream
	 */
	public int getCost();
	
	/**
	 * Indicates the offset in seconds from the fastest corresponding broadcast bearer (e.g. FM).
	 * @return the offset in seconds.
	 */
	public int getOffset();
}
