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
 * Abstract class containing information about one DL+ tag
 * @author Fabian Sattler, IRT GmbH
 */
public interface TextualDabDynamicLabelPlusItem {

	/**
	 * Returns the {@link TextualDabDynamicLabelPlusContentType}
	 * @return the {@link TextualDabDynamicLabelPlusContentType}
	 */
	public TextualDabDynamicLabelPlusContentType getDynamicLabelPlusContentType();
	
	/**
	 * Returns a textual description of the content type
	 * @return a textual description of the content type
	 */
	public String getDlPlusContentTypeDescription();
	
	/**
	 * Returns the content category of this tag
	 * @return the content category of this tag
	 */
	public String getDlPlusContentCategory();
	
	/**
	 * Returns the text of this DL+ tag
	 * @return the text of this DL+ tag
	 */
	public String getDlPlusContentText();
}
