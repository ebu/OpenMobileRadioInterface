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
*/
public enum RadioServiceMimeType {

	/** MIME type not known **/
	UNKNOWN("mime/unknown"),
	/** MIME type for MPEG 1 Layer 1, 2, 3 **/
	AUDIO_MPEG("audio/mpeg"),
	/** MIME type for OGG Vorbis audio **/
	AUDIO_OGG_VORBIS("audio/ogg"),
	/** MIME type for Free Losless Audio Codec **/
	AUDIO_FLAC("audio/flac"),
	/** MIME type ADTS AAC **/
	AUDIO_AAC("audio/aacp");
	
    private final String contentTypeString;
    
    private RadioServiceMimeType(String contentTypeString) {
    	this.contentTypeString = contentTypeString;
    }
    
    public String getMimeTypeString() {
    	return this.contentTypeString;
    }
}
