package org.omri.radioservice;

import java.util.List;

import org.omri.radioservice.metadata.Group;
import org.omri.radioservice.metadata.Location;
import org.omri.radioservice.metadata.TermId;
import org.omri.radioservice.metadata.Visual;

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
public interface RadioService {

	/**
	 * Indicates the type of this RadioService
	 * @return the {@link RadioServiceType} of this RadioService
	 */
	public RadioServiceType getRadioServiceType();

	/**
	 * Returns the label of this {@link RadioService}
	 * @return the label of this {@link RadioService}
	 */
	public String getServiceLabel();

	/**
	 * Returns the short description of this {@link RadioService} as {@link String}
	 * @return The short description of this {@link RadioService} as {@link String}
	 */
	public String getShortDescription();

	/**
	 * Returns the long description of this {@link RadioService} as {@link String}
	 * @return The long description of this {@link RadioService} as {@link String}
	 */
	public String getLongDescription();

	/**
	 * Returns the available {@link Visual}s for this {@link RadioService} or an empty list
	 * @return the available {@link Visual}s for this {@link RadioService} or an empty list
	 */
	public List<Visual> getLogos();

	/**
	 * Returns the available {@link TermId}s for this {@link RadioService} or an empty list
	 * @return the available {@link TermId}s for this {@link RadioService} or an empty list
	 */
	public List<TermId> getGenres();

	/**
	 * Returns the available Links for this {@link RadioService} or an empty list
	 * @return the available Links for this {@link RadioService} or an empty list
	 */
	public List<String> getLinks();

	/**
	 * Returns the available {@link Location}s for this {@link RadioService} or an empty list
	 * @return the available {@link Location}s for this {@link RadioService} or an empty list
	 */
	public List<Location> getLocations();

	/**
	 * Returns the available keywords for this {@link RadioService} or an empty list
	 * @return the available keywords for this {@link RadioService} or an empty list
	 */
	public List<String> getKeywords();

	/**
	 * Returns the available {@link Group}s for this {@link RadioService} or an empty list
	 * @return the available {@link Group}s for this {@link RadioService} or an empty list
	 */
	public List<Group> getMemberships();

	/**
	 * Subscribe a {@link RadioServiceListener} to receive updates from this {@link RadioService}
	 * @param radioServiceListener the {@link RadioServiceListener} to subscribe
	 */
	public void subscribe(RadioServiceListener radioServiceListener);

	/**
	 * Unsubscribe a {@link RadioServiceListener} from this {@link RadioService}
	 * @param radioServiceListener the {@link RadioServiceListener} to unsubscribe
	 */
	public void unsubscribe(RadioServiceListener radioServiceListener);
}
