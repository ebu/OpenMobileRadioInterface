package org.omri.radioservice;

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
 * Abstract class containing informations for a service component (SC) for a {@link RadioServiceDab}
 * @author Fabian Sattler, IRT GmbH
 */
public interface RadioServiceDabComponent {

	/**
	 * Returns the bitrate in kbit/s for this {@link RadioServiceDabComponent}
	 * @return the bitrate in kbit/s for this {@link RadioServiceDabComponent}
	 */
	public int getScBitrate();
	
	/**
	 * Indicates if the CA (Conditional Access) flag is set
	 * @return indication for conditional access
	 */
	public boolean isScCaFlagSet();
	
	/**
	 * Returns the {@link RadioServiceDabComponent}'s channel ID
	 * @return the {@link RadioServiceDabComponent}'s channel ID
	 */
	public int getScChannelId();
	
	/**
	 * Indicates if the DG flag is set
	 * @return indication for DG
	 */
	public boolean isScDgFlagSet();
	
	/**
	 * Returns the {@link RadioServiceDabComponent} ID
	 * @return the {@link RadioServiceDabComponent} ID
	 */
	public int getScId();
	
	/**
	 * Returns the label for this {@link RadioServiceDabComponent}
	 * @return the label for this {@link RadioServiceDabComponent}
	 */
	public String getScLabel();
	
	/**
	 * Returns the packet address
	 * @return the packet address
	 */
	public int getScPacketAddress();
	
	/**
	 * Indicates if this {@link RadioServiceDabComponent} is the primary component of this {@link RadioServiceDab}
	 * @return if this {@link RadioServiceDabComponent} is the primary component of this {@link RadioServiceDab}
	 */
	public boolean isScPrimary();
	
	/**
	 * Returns the service component ID
	 * @return the service component ID
	 */
	public int getScServiceComponentId();
	
	/**
	 * Returns the Transport Mode (TM) ID
	 * @return the Transport Mode (TM) ID
	 */
	public int getTmId();
	
	/**
	 * Returns the service component type
	 * @return the service component type
	 */
	public int getScType();
	
	/**
	 * Returns a list with {@link RadioServiceDabUserApplication}s for this SC
	 * @return a list with {@link RadioServiceDabUserApplication}s for this SC
	 */
	public List<RadioServiceDabUserApplication> getScUserApplications();
	
	/**
	 * Subscribe a {@link RadioServiceDabComponentListener} to receive updates from this {@link RadioServiceDabComponent}
	 * @param dabComponentListener the {@link RadioServiceDabComponentListener} to subscribe
	 */
	public void subscribe(RadioServiceDabComponentListener dabComponentListener);
	
	/**
	 * Unsubscribe a {@link RadioServiceDabComponentListener}
	 * @param dabComponentListener the {@link RadioServiceDabComponentListener} to unsubscribe
	 */
	public void unsubscribe(RadioServiceDabComponentListener dabComponentListener);
}
