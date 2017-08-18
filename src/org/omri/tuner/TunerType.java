package org.omri.tuner;

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
 * {@link Tuner} type definition enum
 * @author Fabian Sattler
 */
public enum TunerType {

	/** DAB Tuner **/
	TUNER_TYPE_DAB,
	/** IP Tuner **/
	TUNER_TYPE_IP,
	/** FM Tuner **/
	TUNER_TYPE_FM,
	/** Sirius XM Tuner **/
	TUNER_TYPE_SIRIUS,
	/** iBiquity HD Radio Tuner **/
	TUNER_TYPE_HDRADIO;
}
