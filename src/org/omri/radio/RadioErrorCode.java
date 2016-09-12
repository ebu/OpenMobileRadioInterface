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
 * Error codes for the {@link Radio} 
 * @author Fabian Sattler, IRT GmbH
 */
public enum RadioErrorCode {

	ERROR_INIT_OK(0, "No Error"),
	ERROR_INIT_NOT_OKAY(1, "Init error"),
	ERROR_INIT_FATAL_ERROR(2, "Fatal error"),
	ERROR_SUSPEND_OK(3, "Radio suspended"),
	ERROR_SUSPEND_FAILED(4, "Radio could not be suspended"),
	ERROR_RESUME_OK(5, "Radio resumed"),
	ERROR_RESUME_FAILED(6, "Radio could not be resumed");
	
	private final int errorCode;
	private final String errorDescription;
	
	private RadioErrorCode(int errorCode, String errorDescription) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}
	
	public int getErrorCode() {
		return this.errorCode;
	}
	
	public String getErrorCodeDescription() {
		return this.errorDescription;
	}
}
