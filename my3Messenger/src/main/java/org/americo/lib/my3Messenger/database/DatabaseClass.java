package org.americo.lib.my3Messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.americo.lib.my3Messenger.model.Message;
import org.americo.lib.my3Messenger.model.Profile;

//STUB FOR DATABASE (no concurrency protection yet...)
public class DatabaseClass {
	
	//ATTRIBUTES (STATIC: STUB (HIBERNATE or JDBC))
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	//GETTERS AND SETTERS
	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
