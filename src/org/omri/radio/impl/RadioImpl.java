package org.omri.radio.impl;

import java.util.List;

import org.omri.radio.Radio;
import org.omri.radio.RadioErrorCode;
import org.omri.radio.RadioStatus;
import org.omri.radioservice.RadioService;
import org.omri.tuner.Tuner;
import org.omri.tuner.TunerType;

import android.content.Context;

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
 * This is the main entry class for anyone who wants to implement the Universal Radio API. 
 * @author Fabian Sattler, IRT GmbH
 */
public class RadioImpl extends Radio {

	@Override
	public RadioErrorCode initialize() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public RadioErrorCode suspend() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public RadioErrorCode resume() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public RadioStatus getRadioStatus() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public void deInitialize() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

	@Override
	public List<Tuner> getAvailableTuners() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public List<Tuner> getAvailableTuners(TunerType tunerType) {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public List<RadioService> getRadioServices() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}
	


	@Override
	public void deInitializeTuner(Tuner tuner) {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

	@Override
	public RadioErrorCode initialize(Context appContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initializeTuner(Tuner tuner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startRadioService(RadioService radioService) {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

	@Override
	public void startRadioServiceScan() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

	@Override
	public void stopRadioServiceScan() {
		// TODO Auto-generated method stub
		
	}

}
