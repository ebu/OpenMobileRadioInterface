package org.omri.tuner;

import java.util.List;

import org.omri.radioservice.RadioService;

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
 * Abstract Tuner class
 * @author Fabian Sattler, IRT GmbH
 */
public interface Tuner {

	/**
	 * Initializes the Tuner. This call is asynchronous. Register a
	 * {@link TunerListener} to receive status updates and error notifications.
	 */
	public void initializeTuner();
	
	/**
	 * Suspends the tuner. Keeping its current status to be resumed later.
	 */
	public void suspendTuner();
	
	/**
	 * Resume the suspended tuner to the last state.
	 */
	public void resumeTuner();
	
	/**
	 * De-Initializes the tuner.
	 */
	public void deInitializeTuner();
	
	/**
	 * Indicates the type of tuner
	 * @return the {@link TunerType} of this {@link Tuner}
	 */
	public TunerType getTunerType();
	
	/**
	 * Indicates the current status of the {@link Tuner} device
	 * @return the current {@link TunerStatus}
	 */
	public TunerStatus getTunerStatus();
	
	/**
	 * Retrieve the currently known {@link RadioService}s of this {@link Tuner}
	 * @return a list of {@link RadioService}s or an empty list
	 */
	public List<RadioService> getRadioServices();
	
	/**
	 * Start a scan for available {@link RadioService}s
	 */
	public void startRadioServiceScan();
	
	/**
	 * Stops a currently running {@link RadioService} scan
	 */
	public void stopRadioServiceScan();
		
	/**
	 * Start a {@link RadioService} on this tuner
	 * @param radioService the {@link RadioService} to start
	 */
	public void startRadioService(RadioService radioService);
	
	/**
	 * Stop the currently running {@link RadioService} on this tuner
	 */
	public void stopRadioService();

	/**
	 * Retrieve the currently running {@link RadioService}
	 * @return the currently running {@link RadioService} or {@code null} if no {@link RadioService} is running
	 */
	public RadioService getCurrentRunningRadioService();
	
	/**
	 * Subscribe a {@link TunerListener} to receive updates of this tuner
	 * @param tunerListener the {@link TunerListener} to subscribe
	 */
	public void subscribe(TunerListener tunerListener);
	
	/**
	 * Unsubscribe a {@link TunerListener}
	 * @param tunerListener the {@link TunerListener} to unsubscribe
	 */
	public void unsubscribe(TunerListener tunerListener);
}
