package org.omri.radio;

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
 * Status codes for {@link Radio}
 * @author Fabian Sattler, IRT GmbH
 */
public enum RadioStatus {

	STATUS_RADIO_UNINITIALIZED(0, "Radio is running"),
	STATUS_RADIO_RUNNING(1, "Radio is running"),
	STATUS_RADIO_SUSPENDED(2, "Radio is suspended");
	
	private final int statusCode;
	private final String statusDescription;
	
	private RadioStatus(int statusCode, String statusDescription) {
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
	}
	
	public int getStatusCode() {
		return this.statusCode;
	}
	
	public String getStatusDescription() {
		return this.statusDescription;
	}
}
