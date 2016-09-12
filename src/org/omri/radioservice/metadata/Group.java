package org.omri.radioservice.metadata;

import java.util.List;

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
 * Abstract base class for a radio service
 * @author Fabian Sattler, IRT GmbH
 * @author Erk, IRT GmbH
 */

public interface Group {

	/**
	 * Returns the CRID of this {@link Group}
	 * @return the CRID of this {@link Group}
	 */
	public String getCRID();
		
	/**
	 * Returns the short name of this {@link Group} as {@link String} 
	 * @return The short name  of this {@link Group} as {@link String}
	 */
	public String getShortName();
		
	/**
	 * Returns the medium name of this {@link Group} as {@link String} 
	 * @return The medium name  of this {@link Group} as {@link String}
	 */
	public String getMediumName();
		
	/**
	 * Returns the long name of this {@link Group} as {@link String} 
	 * @return The long name of this {@link Group} as {@link String}
	 */
	public String getLongName();

	/**
	 * Returns the short description of this {@link Group} as {@link String} 
	 * @return The short description of this {@link Group} as {@link String}
	 */
	public String getShortDescription();

	/**
	 * Returns the medium description of this {@link Group} as {@link String} 
	 * @return The medium description of this {@link Group} as {@link String}
	 */
	public String getMediumDescription();

    /**
     * Returns the available {@link Visual}s for this {@link Group} or an empty list
     * @return the available {@link Visual}s for this {@link Group} or an empty list
     */
	public List<Visual> getLogos();
	
    /**
     * Returns the available {@link TermId}s for this {@link Group} or an empty list
     * @return the available {@link TermId}s for this {@link Group} or an empty list
     */
	public List<TermId> getGenres();
    
	/**
     * Returns the available Links for this {@link Group} or an empty list
     * @return the available Links for this {@link Group} or an empty list
     */
	public List<String> getLinks();
	
	   /**
     * Returns the available keywords for this {@link Group} or an empty list
     * @return the available keywords for this {@link Group} or an empty list
     */
	public List<String> getKeywords();
}
