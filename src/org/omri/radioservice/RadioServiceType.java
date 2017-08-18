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
 * {@link RadioService} type definitions
 * @author Fabian Sattler, IRT GmbH
 */
public enum RadioServiceType {

	/** RadioService type DAB **/
	RADIOSERVICE_TYPE_DAB,
	/** RadioService type IP **/
	RADIOSERVICE_TYPE_IP,
	/** RadioService type FM **/
	RADIOSERVICE_TYPE_FM,
	/** RadioService type Sirius XM **/
	RADIOSERVICE_TYPE_SIRIUS,
	/** RadioService type iBiquity HD Radio **/
	RADIOSERVICE_TYPE_HDRADIO;
}
