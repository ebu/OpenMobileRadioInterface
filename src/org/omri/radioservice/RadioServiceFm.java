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
public interface RadioServiceFm extends RadioService {

	/**
	 * Returns the frequency in kHz for this {@link RadioService} (e.g. 99300000 for a frequency of 99.3 MHz)
	 * @return the frequency in kHz
	 */
	public int getFrequency();
	
	/**
	 * Returns the RDS PI (Programme Identification) code for this Service if available (e.g. 'D412'), or an empty String
	 * @return the RDS PI code as a hexadecimal String representation 
	 */
	public String getRdsPiCode();
	
	/**
	 * Returns a {@link RadioServiceFmPty} for this {@link RadioService} if available, or {@code null}
	 * @return a {@link RadioServiceFmPty} for this {@link RadioService}
	 */
	public RadioServiceFmPty getRdsPty();
}
