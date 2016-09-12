package org.omri.radioservice.metadata;

import java.net.URI;
import java.util.Calendar;

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
 * Abstract class for a DAB Slideshow {@link Visual} metadata
 * 
 * @author Fabian Sattler, IRT GmbH
 */
public interface VisualDabSlideShow extends Visual {
	
	/**
	 * Indicates if this {@link VisualDabSlideShow} has categorization information
	 * @return indication for categorization
	 */
	public boolean isCategorized();
	
	/**
	 * The content name.
	 * @return the content name
	 */
	public String getContentName();
	
	/**
	 * The ID of this {@link VisualDabSlideShow}
	 * @return the ID
	 */
	public int getSlideId();
	
	/**
	 * The Triggertime
	 * @return a Calendar for the Triggertime or {@code 'null'} if the triggertime is {@code 'now'}
	 */
	public Calendar getTriggerTime();
	
	/**
	 * Returns the category description of this {@link VisualDabSlideShow}. Only applicable for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the category text or an empty {@link String} if it's not a categorized VisualDabSlideShow
	 */
	public String getCategoryText();
	
	/**
	 * Returns the category id of this {@link VisualDabSlideShow}. Only applicable for for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the category id or '-1' if it's not a categorized VisualDabSlideShow
	 */
	public int getCategoryId();
	
	/**
	 * Returns the link associated with this {@link VisualDabSlideShow}. Only applicable for for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the link associated with this {@link VisualDabSlideShow} or an empty {@link String}
	 */
	public URI getLink();
	
	/**
	 * Returns the click through link associated with this {@link VisualDabSlideShow}. Only applicable for for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the click through link associated with this {@link VisualDabSlideShow} or an empty {@link String}
	 */
	public URI getClickThroughUrl();
}
