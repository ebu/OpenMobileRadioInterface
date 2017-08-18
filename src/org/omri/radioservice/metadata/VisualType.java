package org.omri.radioservice.metadata;

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
 * Visual type definition
 * @author Fabian Sattler, IRT GmbH
 */
public enum VisualType {

	/** Visual metadata received via DAB Slideshow service **/
	METADATA_VISUAL_TYPE_DAB_SLS,
	/** Visual metadata received via RadioDNS RadioVIS service **/
	METADATA_VISUAL_TYPE_RADIODNS_RADIOVIS,
	/** Visual metadata received via ID3 tag **/
	METADATA_VISUAL_TYPE_ID3_COVERART;
}
