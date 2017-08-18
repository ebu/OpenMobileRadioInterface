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
 * Abstract base class for textual metadata
 * @author Fabian Sattler, IRT GmbH
 */
public interface Textual {

	/**
	 * Returns the type of this textual metadata
	 * @return the type of this textual metadata
	 */
	public TextualType getType();
	
	/**
	 * Returns the {@link String} representation of this textual metadata
	 * @return the {@link String} representation of this textual metadata
	 */
	public String getText();
}
