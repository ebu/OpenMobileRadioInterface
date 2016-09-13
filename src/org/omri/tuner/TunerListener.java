package org.omri.tuner;

import org.omri.radio.RadioListener;
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
 * The {@link Tuner} listener interface
 * @author Fabian Sattler, IRT GmbH
 */
public interface TunerListener extends RadioListener {

	/**
	 * Tuner changed its operating state
	 * @param newStatus the new {@link TunerStatus}
	 */
	public void tunerStatusChanged(Tuner tuner, TunerStatus newStatus);

	/**
	 * Tuner scan progress indicator
	 * @param percentScanned the percentage finished so far
	 */
	public void tunerScanProgress(Tuner tuner, int percentScanned);

	/**
	 * A {@link RadioService} started
	 * @param startedRadioService the {@link RadioService} which has started
	 */
	public void radioServiceStarted(Tuner tuner, RadioService startedRadioService);

	/**
	 * A {@link RadioService} stopped
	 * @param stoppedRadioService the {@link RadioService} which has stopped
	 */
	public void radioServiceStopped(Tuner tuner, RadioService stoppedRadioService);

	/**
	 * Updates on RF reception statistics
	 * @param rfLock RF tuner frontend gained lock
	 * @param rssi the Received Signal Strength Indicator (in dbµV ???)
	 */
	public void tunerReceptionStatistics(Tuner tuner, boolean rfLock, int rssi);

	/**
	 * Implementation and TunerType dependent raw data (e.g. in case of a DAB Tuner raw Fast Information Blocks)
	 * @param tuner the Tuner from which the raw data was received
	 * @param data the raw data
	 */
	public void tunerRawData(Tuner tuner, byte[] data);
}
