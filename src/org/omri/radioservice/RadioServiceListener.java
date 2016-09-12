package org.omri.radioservice;

import org.omri.radio.RadioListener;
import org.omri.radioservice.metadata.ProgrammeServiceMetadataListener;
import org.omri.radioservice.metadata.TextualMetadataListener;
import org.omri.radioservice.metadata.VisualMetadataListener;

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
 * Interface to receive updates for {@link RadioService} related informations
 * @author Fabian Sattler, IRT GmbH
 *
 * @see ProgrammeServiceMetadataListener
 * @see TextualMetadataListener
 * @see VisualMetadataListener
 */
public interface RadioServiceListener extends RadioListener {

}
