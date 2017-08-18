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
 * Interface to receive raw data from a {@link RadioServiceDabComponent} (e.g. Journaline data)
 *   
 * @author Fabian Sattler, IRT GmbH
 */
public interface RadioServiceDabComponentListener {

	/**
	 * Called when new data from a specific DAB Service Component was received
	 * @param serviceComponentChannelId th Service component id
	 * @param scData raw data from the service component
	 */
	public void newServiceComponentData(int serviceComponentChannelId, byte[] scData);
}
