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
 * Textual metadata type definitions
 *
 * @author Fabian Sattler, IRT GmbH
 */
public enum TextualType {

	/** Textual metadata received via DAB Dynamic Label service **/
	METADATA_TEXTUAL_TYPE_DAB_DLS,
	/** Textual metadata received via RadioDNS RadioVIS Text service **/
	METADATA_TEXTUAL_TYPE_RADIODNS_RADIOVIS,
	/** Textual metadata received via FM Radiotext **/
	METADATA_TEXTUAL_TYPE_FM_RDS_RADIOTEXT,
	/** Textual metadata received via ID3 parsing **/
	METADATA_TEXTUAL_TYPE_ID3_TEXT,
	/** Textual metadata received via Shoutcast ICY parsing **/
	METADATA_TEXTUAL_TYPE_ICY_TEXT;
}
