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
 * Dynamic Label Plus Content type definitions
 * 
 * @author Fabian Sattler, IRT GmbH
 */
public enum TextualDabDynamicLabelPlusContentType {

	DUMMY(0, "Dummy"),
	ITEM_TITLE(1, "Title"),
	ITEM_ALBUM(2, "Album"),
	ITEM_TRACKNUMBER(3, "Tracknumber"),
	ITEM_ARTIST(4, "Artist"),
	ITEM_COMPOSITION(5, "Composition"),
	ITEM_MOVEMENT(6, "Movement"),
	ITEM_CONDUCTOR(7, "Conductor"),
	ITEM_COMPOSER(8, "Composer"),
	ITEM_BAND(9, "Band"),
	ITEM_COMMENT(10, "Comment"),
	ITEM_GENRE(11, "Genre"),
	INFO_NEWS(12, "News"),
	INFO_NEWS_LOCAL(13, "Local News"),
	INFO_STOCKMARKET(14, "Stockmarket"),
	INFO_SPORT(15, "Sport"),
	INFO_Lottery(16, "Lottery"),
	INFO_HOROSCOPE(17, "Horoscope"),
	INFO_DAILY_DIVERSION(18, "Daily Diversion"),
	INFO_HEALTH(19, "Health"),
	INFO_EVENT(20, "Event"),
	INFO_SCENE(21, "Scene"),
	INFO_CINEMA(22, "Cinema"),
	INFO_TV(23, "TV"),
	INFO_DATE_TIME(24, "Date and Time"),
	INFO_WEATHER(25, "Weather"),
	INFO_TRAFFIC(26, "Traffic"),
	INFO_ALARM(27, "Alarm"),
	INFO_ADVERTISEMENT(28, "Advertisement"),
	INFO_URL(29, "URL"),
	INFO_OTHER(30, "Other"),
	STATIONNAME_SHORT(31, "Short Stationname"),
	STATIONNAME_LONG(32, "Long Stationname"),
	PROGRAMME_NOW(33, "Now"),
	PROGRAMME_NEXT(34, "Next"),
	PROGRAMME_PART(35, "Part"),
	PROGRAMME_HOST(36, "Host"),
	PROGRAMME_EDITORIAL_STAFF(37, "Editorial Staff"),
	PROGRAMME_FREQUENCY(38, "Frequency"),
	PROGRAMME_HOMEPAGE(39, "Homepage"),
	PROGRAMME_SUBCHANNEL(40, "Subchannel"),
	PHONE_HOTLINE(41, "Hotline"),
	PHONE_STUDIO(42, "Studio Telephone"),
	PHONE_OTHER(43, "Other Telephone"),
	SMS_STUDIO(44, "Studio SMS"),
	SMS_OTHER(45, "SMS"),
	EMAIL_HOTLINE(46, "Hotline Email"),
	EMAIL_STUDIO(47, "Studio Email"),
	EMAIL_OTHER(48, "Email"),
	MMS_OTHER(49, "MMS"),
	CHAT(50, "Chat"),
	CHAT_CENTER(51, "Chat Center"),
	VOTE_QUESTION(52, "Vote Question"),
	VOTE_CENTRE(53, "Vote Centre"),
	RFU_1(54, "RFU1"),
	RFU_2(55, "RFU2"),
	PRIVATE_CLASS_1(56, "Private Data 1"),
	PRIVATE_CLASS_2(57, "Private Data 2"),
	PRIVATE_CLASS_3(58, "Private Data 3"),
	DESCRIPTOR_PLACE(59, "Place"),
	DESCRIPTOR_APPOINTMENT(60, "Appointment"),
	DESCRIPTOR_IDENTIFIER(61, "Identifier"),
	DESCRIPTOR_PURCHASE(62, "Purchase"),
	DESCRIPTOR_GET_DATA(63, "Get Data");
	
	private final int contentTypeId;
    private final String contentTypeString;
    
    private TextualDabDynamicLabelPlusContentType(int contentTypeId, String contentTypeString) {
    	this.contentTypeId = contentTypeId;
    	this.contentTypeString = contentTypeString;
    }
    
    public int getContentTypeId() {
    	return this.contentTypeId;
    }
    
    public String getContentTypeString() {
    	return this.contentTypeString;
    }
}
