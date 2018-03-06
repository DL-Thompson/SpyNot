package com.example.spynotfinal;

public enum Permission {
	ACCESS_CHECKIN_PROPERTIES,ACCESS_COARSE_LOCATION,ACCESS_FINE_LOCATION,ACCESS_LOCATION_EXTRA_COMMANDS,
	ACCESS_MOCK_LOCATION,ACCESS_NETWORK_STATE,ACCESS_SURFACE_FLINGER,ACCESS_WIFI_STATE,ACCOUNT_MANAGER,
	ADD_VOICEMAIL,AUTHENTICATE_ACCOUNTS,BATTERY_STATS,BIND_ACCESSIBILITY_SERVICE,BIND_APPWIDGET,BIND_DEVICE_ADMIN,
	BIND_INPUT_METHOD,BIND_NOTIFICATION_LISTENER_SERVICE,BIND_REMOTEVIEWS,BIND_TEXT_SERVICE,BIND_VPN_SERVICE,
	BIND_WALLPAPER,BLUETOOTH,BLUETOOTH_ADMIN,BRICK,BROADCAST_PACKAGE_REMOVED,BROADCAST_SMS,BROADCAST_STICKY,
	BROADCAST_WAP_PUSH,CALL_PHONE,CALL_PRIVILEGED,CAMERA,CHANGE_COMPONENT_ENABLED_STATE,CHANGE_CONFIGURATION,
	CHANGE_NETWORK_STATE,CHANGE_WIFI_MULTICAST_STATE,CHANGE_WIFI_STATE,CLEAR_APP_CACHE,CLEAR_APP_USER_DATA,
	CONTROL_LOCATION_UPDATES,DELETE_CACHE_FILES,DELETE_PACKAGES,DEVICE_POWER,DIAGNOSTIC,DISABLE_KEYGUARD,DUMP,
	EXPAND_STATUS_BAR,FACTORY_TEST,FLASHLIGHT,FORCE_BACK,GET_ACCOUNTS,GET_PACKAGE_SIZE,GET_TASKS,GET_TOP_ACTIVITY_INFO,
	GLOBAL_SEARCH,HARDWARE_TEST,INJECT_EVENTS,INSTALL_LOCATION_PROVIDER,INSTALL_PACKAGES,INTERNAL_SYSTEM_WINDOW,INTERNET,
	KILL_BACKGROUND_PROCESSES,LOCATION_HARDWARE,MANAGE_ACCOUNTS,MANAGE_APP_TOKENS,MASTER_CLEAR,MODIFY_AUDIO_SETTINGS,
	MODIFY_PHONE_STATE,MOUNT_FORMAT_FILESYSTEMS,MOUNT_UNMOUNT_FILESYSTEMS,NFC,PERSISTENT_ACTIVITY,PROCESS_OUTGOING_CALLS,
	READ_CALENDAR,READ_CALL_LOG,READ_CONTACTS,READ_EXTERNAL_STORAGE,READ_FRAME_BUFFER,READ_HISTORY_BOOKMARKS,READ_INPUT_STATE,
	READ_LOGS,READ_PHONE_STATE,READ_PROFILE,READ_SMS,READ_SOCIAL_STREAM,READ_SYNC_SETTINGS,READ_SYNC_STATS,READ_USER_DICTIONARY,
	REBOOT,RECEIVE_BOOT_COMPLETED,RECEIVE_MMS,RECEIVE_SMS,RECEIVE_WAP_PUSH,RECORD_AUDIO,REORDER_TASKS,RESTART_PACKAGES,
	SEND_RESPOND_VIA_MESSAGE,SEND_SMS,SET_ACTIVITY_WATCHER,SET_ALARM,SET_ALWAYS_FINISH,SET_ANIMATION_SCALE,SET_DEBUG_APP,
	SET_ORIENTATION,SET_POINTER_SPEED,SET_PREFERRED_APPLICATIONS,SET_PROCESS_LIMIT,SET_TIME,SET_TIME_ZONE,SET_WALLPAPER,
	SET_WALLPAPER_HINTS,SIGNAL_PERSISTENT_PROCESSES,STATUS_BAR,SUBSCRIBED_FEEDS_READ,SUBSCRIBED_FEEDS_WRITE	,SYSTEM_ALERT_WINDOW,
	UPDATE_DEVICE_STATS,USE_CREDENTIALS,USE_SIP,VIBRATE,WAKE_LOCK,WRITE_APN_SETTINGS,WRITE_CALENDAR,WRITE_CALL_LOG,WRITE_CONTACTS,
	WRITE_EXTERNAL_STORAGE,WRITE_GSERVICES,WRITE_HISTORY_BOOKMARKS,WRITE_PROFILE,WRITE_SECURE_SETTINGS,WRITE_SETTINGS,WRITE_SMS,
	WRITE_SOCIAL_STREAM,WRITE_SYNC_SETTINGS,WRITE_USER_DICTIONARY;

	@Override
	public String toString() {
		String value;
		switch (this) {
		case ACCESS_CHECKIN_PROPERTIES:
		    value = "ACCESS_CHECKIN_PROPERTIES";
		    break;
		case ACCESS_COARSE_LOCATION:
		    value = "ACCESS_COARSE_LOCATION";
		    break;
		case ACCESS_FINE_LOCATION:
		    value = "ACCESS_FINE_LOCATION";
		    break;
		case ACCESS_LOCATION_EXTRA_COMMANDS:
		    value = "ACCESS_LOCATION_EXTRA_COMMANDS";
		    break;
		case ACCESS_MOCK_LOCATION:
		    value = "ACCESS_MOCK_LOCATION";
		    break;
		case ACCESS_NETWORK_STATE:
		    value = "ACCESS_NETWORK_STATE";
		    break;
		case ACCESS_SURFACE_FLINGER:
		    value = "ACCESS_SURFACE_FLINGER";
		    break;
		case ACCESS_WIFI_STATE:
		    value = "ACCESS_WIFI_STATE";
		    break;
		case ACCOUNT_MANAGER:
		    value = "ACCOUNT_MANAGER";
		    break;
		case ADD_VOICEMAIL:
		    value = "ADD_VOICEMAIL";
		    break;
		case AUTHENTICATE_ACCOUNTS:
		    value = "AUTHENTICATE_ACCOUNTS";
		    break;
		case BATTERY_STATS:
		    value = "BATTERY_STATS";
		    break;
		case BIND_ACCESSIBILITY_SERVICE:
		    value = "BIND_ACCESSIBILITY_SERVICE";
		    break;
		case BIND_APPWIDGET:
		    value = "BIND_APPWIDGET";
		    break;
		case BIND_DEVICE_ADMIN:
		    value = "BIND_DEVICE_ADMIN";
		    break;
		case BIND_INPUT_METHOD:
		    value = "BIND_INPUT_METHOD";
		    break;
		case BIND_NOTIFICATION_LISTENER_SERVICE:
		    value = "BIND_NOTIFICATION_LISTENER_SERVICE";
		    break;
		case BIND_REMOTEVIEWS:
		    value = "BIND_REMOTEVIEWS";
		    break;
		case BIND_TEXT_SERVICE:
		    value = "BIND_TEXT_SERVICE";
		    break;
		case BIND_VPN_SERVICE:
		    value = "BIND_VPN_SERVICE";
		    break;
		case BIND_WALLPAPER:
		    value = "BIND_WALLPAPER";
		    break;
		case BLUETOOTH:
		    value = "BLUETOOTH";
		    break;
		case BLUETOOTH_ADMIN:
		    value = "BLUETOOTH_ADMIN";
		    break;
		case BRICK:
		    value = "BRICK";
		    break;
		case BROADCAST_PACKAGE_REMOVED:
		    value = "BROADCAST_PACKAGE_REMOVED";
		    break;
		case BROADCAST_SMS:
		    value = "BROADCAST_SMS";
		    break;
		case BROADCAST_STICKY:
		    value = "BROADCAST_STICKY";
		    break;
		case BROADCAST_WAP_PUSH:
		    value = "BROADCAST_WAP_PUSH";
		    break;
		case CALL_PHONE:
		    value = "CALL_PHONE";
		    break;
		case CALL_PRIVILEGED:
		    value = "CALL_PRIVILEGED";
		    break;
		case CAMERA:
		    value = "CAMERA";
		    break;
		case CHANGE_COMPONENT_ENABLED_STATE:
		    value = "CHANGE_COMPONENT_ENABLED_STATE";
		    break;
		case CHANGE_CONFIGURATION:
		    value = "CHANGE_CONFIGURATION";
		    break;
		case CHANGE_NETWORK_STATE:
		    value = "CHANGE_NETWORK_STATE";
		    break;
		case CHANGE_WIFI_MULTICAST_STATE:
		    value = "CHANGE_WIFI_MULTICAST_STATE";
		    break;
		case CHANGE_WIFI_STATE:
		    value = "CHANGE_WIFI_STATE";
		    break;
		case CLEAR_APP_CACHE:
		    value = "CLEAR_APP_CACHE";
		    break;
		case CLEAR_APP_USER_DATA:
		    value = "CLEAR_APP_USER_DATA";
		    break;
		case CONTROL_LOCATION_UPDATES:
		    value = "CONTROL_LOCATION_UPDATES";
		    break;
		case DELETE_CACHE_FILES:
		    value = "DELETE_CACHE_FILES";
		    break;
		case DELETE_PACKAGES:
		    value = "DELETE_PACKAGES";
		    break;
		case DEVICE_POWER:
		    value = "DEVICE_POWER";
		    break;
		case DIAGNOSTIC:
		    value = "DIAGNOSTIC";
		    break;
		case DISABLE_KEYGUARD:
		    value = "DISABLE_KEYGUARD";
		    break;
		case DUMP:
		    value = "DUMP";
		    break;
		case EXPAND_STATUS_BAR:
		    value = "EXPAND_STATUS_BAR";
		    break;
		case FACTORY_TEST:
		    value = "FACTORY_TEST";
		    break;
		case FLASHLIGHT:
		    value = "FLASHLIGHT";
		    break;
		case FORCE_BACK:
		    value = "FORCE_BACK";
		    break;
		case GET_ACCOUNTS:
		    value = "GET_ACCOUNTS";
		    break;
		case GET_PACKAGE_SIZE:
		    value = "GET_PACKAGE_SIZE";
		    break;
		case GET_TASKS:
		    value = "GET_TASKS";
		    break;
		case GET_TOP_ACTIVITY_INFO:
		    value = "GET_TOP_ACTIVITY_INFO";
		    break;
		case GLOBAL_SEARCH:
		    value = "GLOBAL_SEARCH";
		    break;
		case HARDWARE_TEST:
		    value = "HARDWARE_TEST";
		    break;
		case INJECT_EVENTS:
		    value = "INJECT_EVENTS";
		    break;
		case INSTALL_LOCATION_PROVIDER:
		    value = "INSTALL_LOCATION_PROVIDER";
		    break;
		case INSTALL_PACKAGES:
		    value = "INSTALL_PACKAGES";
		    break;
		case INTERNAL_SYSTEM_WINDOW:
		    value = "INTERNAL_SYSTEM_WINDOW";
		    break;
		case INTERNET:
		    value = "INTERNET";
		    break;
		case KILL_BACKGROUND_PROCESSES:
		    value = "KILL_BACKGROUND_PROCESSES";
		    break;
		case LOCATION_HARDWARE:
		    value = "LOCATION_HARDWARE";
		    break;
		case MANAGE_ACCOUNTS:
		    value = "MANAGE_ACCOUNTS";
		    break;
		case MANAGE_APP_TOKENS:
		    value = "MANAGE_APP_TOKENS";
		    break;
		case MASTER_CLEAR:
		    value = "MASTER_CLEAR";
		    break;
		case MODIFY_AUDIO_SETTINGS:
		    value = "MODIFY_AUDIO_SETTINGS";
		    break;
		case MODIFY_PHONE_STATE:
		    value = "MODIFY_PHONE_STATE";
		    break;
		case MOUNT_FORMAT_FILESYSTEMS:
		    value = "MOUNT_FORMAT_FILESYSTEMS";
		    break;
		case MOUNT_UNMOUNT_FILESYSTEMS:
		    value = "MOUNT_UNMOUNT_FILESYSTEMS";
		    break;
		case NFC:
		    value = "NFC";
		    break;
		case PERSISTENT_ACTIVITY:
		    value = "PERSISTENT_ACTIVITY";
		    break;
		case PROCESS_OUTGOING_CALLS:
		    value = "PROCESS_OUTGOING_CALLS";
		    break;
		case READ_CALENDAR:
		    value = "READ_CALENDAR";
		    break;
		case READ_CALL_LOG:
		    value = "READ_CALL_LOG";
		    break;
		case READ_CONTACTS:
		    value = "READ_CONTACTS";
		    break;
		case READ_EXTERNAL_STORAGE:
		    value = "READ_EXTERNAL_STORAGE";
		    break;
		case READ_FRAME_BUFFER:
		    value = "READ_FRAME_BUFFER";
		    break;
		case READ_HISTORY_BOOKMARKS:
		    value = "READ_HISTORY_BOOKMARKS";
		    break;
		case READ_INPUT_STATE:
		    value = "READ_INPUT_STATE";
		    break;
		case READ_LOGS:
		    value = "READ_LOGS";
		    break;
		case READ_PHONE_STATE:
		    value = "READ_PHONE_STATE";
		    break;
		case READ_PROFILE:
		    value = "READ_PROFILE";
		    break;
		case READ_SMS:
		    value = "READ_SMS";
		    break;
		case READ_SOCIAL_STREAM:
		    value = "READ_SOCIAL_STREAM";
		    break;
		case READ_SYNC_SETTINGS:
		    value = "READ_SYNC_SETTINGS";
		    break;
		case READ_SYNC_STATS:
		    value = "READ_SYNC_STATS";
		    break;
		case READ_USER_DICTIONARY:
		    value = "READ_USER_DICTIONARY";
		    break;
		case REBOOT:
		    value = "REBOOT";
		    break;
		case RECEIVE_BOOT_COMPLETED:
		    value = "RECEIVE_BOOT_COMPLETED";
		    break;
		case RECEIVE_MMS:
		    value = "RECEIVE_MMS";
		    break;
		case RECEIVE_SMS:
		    value = "RECEIVE_SMS";
		    break;
		case RECEIVE_WAP_PUSH:
		    value = "RECEIVE_WAP_PUSH";
		    break;
		case RECORD_AUDIO:
		    value = "RECORD_AUDIO";
		    break;
		case REORDER_TASKS:
		    value = "REORDER_TASKS";
		    break;
		case RESTART_PACKAGES:
		    value = "RESTART_PACKAGES";
		    break;
		case SEND_RESPOND_VIA_MESSAGE:
		    value = "SEND_RESPOND_VIA_MESSAGE";
		    break;
		case SEND_SMS:
		    value = "SEND_SMS";
		    break;
		case SET_ACTIVITY_WATCHER:
		    value = "SET_ACTIVITY_WATCHER";
		    break;
		case SET_ALARM:
		    value = "SET_ALARM";
		    break;
		case SET_ALWAYS_FINISH:
		    value = "SET_ALWAYS_FINISH";
		    break;
		case SET_ANIMATION_SCALE:
		    value = "SET_ANIMATION_SCALE";
		    break;
		case SET_DEBUG_APP:
		    value = "SET_DEBUG_APP";
		    break;
		case SET_ORIENTATION:
		    value = "SET_ORIENTATION";
		    break;
		case SET_POINTER_SPEED:
		    value = "SET_POINTER_SPEED";
		    break;
		case SET_PREFERRED_APPLICATIONS:
		    value = "SET_PREFERRED_APPLICATIONS";
		    break;
		case SET_PROCESS_LIMIT:
		    value = "SET_PROCESS_LIMIT";
		    break;
		case SET_TIME:
		    value = "SET_TIME";
		    break;
		case SET_TIME_ZONE:
		    value = "SET_TIME_ZONE";
		    break;
		case SET_WALLPAPER:
		    value = "SET_WALLPAPER";
		    break;
		case SET_WALLPAPER_HINTS:
		    value = "SET_WALLPAPER_HINTS";
		    break;
		case SIGNAL_PERSISTENT_PROCESSES:
		    value = "SIGNAL_PERSISTENT_PROCESSES";
		    break;
		case STATUS_BAR:
		    value = "STATUS_BAR";
		    break;
		case SUBSCRIBED_FEEDS_READ:
		    value = "SUBSCRIBED_FEEDS_READ";
		    break;
		case SUBSCRIBED_FEEDS_WRITE:
		    value = "SUBSCRIBED_FEEDS_WRITE";
		    break;
		case SYSTEM_ALERT_WINDOW:
		    value = "SYSTEM_ALERT_WINDOW";
		    break;
		case UPDATE_DEVICE_STATS:
		    value = "UPDATE_DEVICE_STATS";
		    break;
		case USE_CREDENTIALS:
		    value = "USE_CREDENTIALS";
		    break;
		case USE_SIP:
		    value = "USE_SIP";
		    break;
		case VIBRATE:
		    value = "VIBRATE";
		    break;
		case WAKE_LOCK:
		    value = "WAKE_LOCK";
		    break;
		case WRITE_APN_SETTINGS:
		    value = "WRITE_APN_SETTINGS";
		    break;
		case WRITE_CALENDAR:
		    value = "WRITE_CALENDAR";
		    break;
		case WRITE_CALL_LOG:
		    value = "WRITE_CALL_LOG";
		    break;
		case WRITE_CONTACTS:
		    value = "WRITE_CONTACTS";
		    break;
		case WRITE_EXTERNAL_STORAGE:
		    value = "WRITE_EXTERNAL_STORAGE";
		    break;
		case WRITE_GSERVICES:
		    value = "WRITE_GSERVICES";
		    break;
		case WRITE_HISTORY_BOOKMARKS:
		    value = "WRITE_HISTORY_BOOKMARKS";
		    break;
		case WRITE_PROFILE:
		    value = "WRITE_PROFILE";
		    break;
		case WRITE_SECURE_SETTINGS:
		    value = "WRITE_SECURE_SETTINGS";
		    break;
		case WRITE_SETTINGS:
		    value = "WRITE_SETTINGS";
		    break;
		case WRITE_SMS:
		    value = "WRITE_SMS";
		    break;
		case WRITE_SOCIAL_STREAM:
		    value = "WRITE_SOCIAL_STREAM";
		    break;
		case WRITE_SYNC_SETTINGS:
		    value = "WRITE_SYNC_SETTINGS";
		    break;
		case WRITE_USER_DICTIONARY:
		    value = "WRITE_USER_DICTIONARY";
		    break;
		default:
			value = "Unknown";
			break;
		}
		return value;
	}
	
	public String getDescription() {
		String value;
		switch (this) {
		case ACCESS_CHECKIN_PROPERTIES:
		    value = "Allows read/write access to the \"properties\" table in the checkin database, to change values that get uploaded..";
		    break;
		case ACCESS_COARSE_LOCATION:
		    value = "Allows an app to access approximate location derived from network location sources such as cell towers and Wi-Fi..";
		    break;
		case ACCESS_FINE_LOCATION:
		    value = "Allows an app to access precise location from location sources such as GPS, cell towers, and Wi-Fi..";
		    break;
		case ACCESS_LOCATION_EXTRA_COMMANDS:
		    value = "Allows an application to access extra location provider commands.";
		    break;
		case ACCESS_MOCK_LOCATION:
		    value = "Allows an application to create mock location providers for testing.";
		    break;
		case ACCESS_NETWORK_STATE:
		    value = "Allows applications to access information about networks.";
		    break;
		case ACCESS_SURFACE_FLINGER:
		    value = "Allows an application to use SurfaceFlinger's low level features..";
		    break;
		case ACCESS_WIFI_STATE:
		    value = "Allows applications to access information about Wi-Fi networks.";
		    break;
		case ACCOUNT_MANAGER:
		    value = "Allows applications to call into AccountAuthenticators..";
		    break;
		case ADD_VOICEMAIL:
		    value = "Allows an application to add voicemails into the system..";
		    break;
		case AUTHENTICATE_ACCOUNTS:
		    value = "Allows an application to act as an AccountAuthenticator for the AccountManager.";
		    break;
		case BATTERY_STATS:
		    value = "Allows an application to collect battery statistics.";
		    break;
		case BIND_ACCESSIBILITY_SERVICE:
		    value = "Must be required by an AccessibilityService, to ensure that only the system can bind to it..";
		    break;
		case BIND_APPWIDGET:
		    value = "Allows an application to tell the AppWidget service which application can access AppWidget's data..";
		    break;
		case BIND_DEVICE_ADMIN:
		    value = "Must be required by device administration receiver, to ensure that only the system can interact with it..";
		    break;
		case BIND_INPUT_METHOD:
		    value = "Must be required by an InputMethodService, to ensure that only the system can bind to it..";
		    break;
		case BIND_NOTIFICATION_LISTENER_SERVICE:
		    value = "Must be required by an NotificationListenerService, to ensure that only the system can bind to it..";
		    break;
		case BIND_REMOTEVIEWS:
		    value = "Must be required by a RemoteViewsService, to ensure that only the system can bind to it..";
		    break;
		case BIND_TEXT_SERVICE:
		    value = "Must be required by a TextService (e.g..";
		    break;
		case BIND_VPN_SERVICE:
		    value = "Must be required by an VpnService, to ensure that only the system can bind to it..";
		    break;
		case BIND_WALLPAPER:
		    value = "Must be required by a WallpaperService, to ensure that only the system can bind to it..";
		    break;
		case BLUETOOTH:
		    value = "Allows applications to connect to paired bluetooth devices.";
		    break;
		case BLUETOOTH_ADMIN:
		    value = "Allows applications to discover and pair bluetooth devices.";
		    break;
		case BRICK:
		    value = "Required to be able to disable the device (very dangerous!)..";
		    break;
		case BROADCAST_PACKAGE_REMOVED:
		    value = "Allows an application to broadcast a notification that an application package has been removed..";
		    break;
		case BROADCAST_SMS:
		    value = "Allows an application to broadcast an SMS receipt notification..";
		    break;
		case BROADCAST_STICKY:
		    value = "Allows an application to broadcast sticky intents..";
		    break;
		case BROADCAST_WAP_PUSH:
		    value = "Allows an application to broadcast a WAP PUSH receipt notification..";
		    break;
		case CALL_PHONE:
		    value = "Allows an application to initiate a phone call without going through the Dialer user interface for the user to confirm the call being placed..";
		    break;
		case CALL_PRIVILEGED:
		    value = "Allows an application to call any phone number, including emergency numbers, without going through the Dialer user interface for the user to confirm the call being placed..";
		    break;
		case CAMERA:
		    value = "Required to be able to access the camera device..";
		    break;
		case CHANGE_COMPONENT_ENABLED_STATE:
		    value = "Allows an application to change whether an application component (other than its own) is enabled or not..";
		    break;
		case CHANGE_CONFIGURATION:
		    value = "Allows an application to modify the current configuration, such as locale..";
		    break;
		case CHANGE_NETWORK_STATE:
		    value = "Allows applications to change network connectivity state.";
		    break;
		case CHANGE_WIFI_MULTICAST_STATE:
		    value = "Allows applications to enter Wi-Fi Multicast mode.";
		    break;
		case CHANGE_WIFI_STATE:
		    value = "Allows applications to change Wi-Fi connectivity state.";
		    break;
		case CLEAR_APP_CACHE:
		    value = "Allows an application to clear the caches of all installed applications on the device..";
		    break;
		case CLEAR_APP_USER_DATA:
		    value = "Allows an application to clear user data..";
		    break;
		case CONTROL_LOCATION_UPDATES:
		    value = "Allows enabling/disabling location update notifications from the radio..";
		    break;
		case DELETE_CACHE_FILES:
		    value = "Allows an application to delete cache files..";
		    break;
		case DELETE_PACKAGES:
		    value = "Allows an application to delete packages..";
		    break;
		case DEVICE_POWER:
		    value = "Allows low-level access to power management..";
		    break;
		case DIAGNOSTIC:
		    value = "Allows applications to RW to diagnostic resources..";
		    break;
		case DISABLE_KEYGUARD:
		    value = "Allows applications to disable the keyguard.";
		    break;
		case DUMP:
		    value = "Allows an application to retrieve state dump information from system services..";
		    break;
		case EXPAND_STATUS_BAR:
		    value = "Allows an application to expand or collapse the status bar..";
		    break;
		case FACTORY_TEST:
		    value = "Run as a manufacturer test application, running as the root user..";
		    break;
		case FLASHLIGHT:
		    value = "Allows access to the flashlight.";
		    break;
		case FORCE_BACK:
		    value = "Allows an application to force a BACK operation on whatever is the top activity..";
		    break;
		case GET_ACCOUNTS:
		    value = "Allows access to the list of accounts in the Accounts Service.";
		    break;
		case GET_PACKAGE_SIZE:
		    value = "Allows an application to find out the space used by any package..";
		    break;
		case GET_TASKS:
		    value = "Allows an application to get information about the currently or recently running tasks..";
		    break;
		case GET_TOP_ACTIVITY_INFO:
		    value = "Allows an application to retrieve private information about the current top activity, such as any assist context it can provide..";
		    break;
		case GLOBAL_SEARCH:
		    value = "This permission can be used on content providers to allow the global search system to access their data..";
		    break;
		case HARDWARE_TEST:
		    value = "Allows access to hardware peripherals..";
		    break;
		case INJECT_EVENTS:
		    value = "Allows an application to inject user events (keys, touch, trackball) into the event stream and deliver them to ANY window..";
		    break;
		case INSTALL_LOCATION_PROVIDER:
		    value = "Allows an application to install a location provider into the Location Manager..";
		    break;
		case INSTALL_PACKAGES:
		    value = "Allows an application to install packages..";
		    break;
		case INTERNAL_SYSTEM_WINDOW:
		    value = "Allows an application to open windows that are for use by parts of the system user interface..";
		    break;
		case INTERNET:
		    value = "Allows applications to open network sockets..";
		    break;
		case KILL_BACKGROUND_PROCESSES:
		    value = "Allows an application to call killBackgroundProcesses(String)..";
		    break;
		case LOCATION_HARDWARE:
		    value = "Allows an application to use location features in hardware, such as the geofencing api..";
		    break;
		case MANAGE_ACCOUNTS:
		    value = "Allows an application to manage the list of accounts in the AccountManager.";
		    break;
		case MANAGE_APP_TOKENS:
		    value = "Allows an application to manage (create, destroy, Z-order) application tokens in the window manager..";
		    break;
		case MASTER_CLEAR:
		    value = "Not for use by third-party applications..";
		    break;
		case MODIFY_AUDIO_SETTINGS:
		    value = "Allows an application to modify global audio settings.";
		    break;
		case MODIFY_PHONE_STATE:
		    value = "Allows modification of the telephony state - power on, mmi, etc..";
		    break;
		case MOUNT_FORMAT_FILESYSTEMS:
		    value = "Allows formatting file systems for removable storage..";
		    break;
		case MOUNT_UNMOUNT_FILESYSTEMS:
		    value = "Allows mounting and unmounting file systems for removable storage..";
		    break;
		case NFC:
		    value = "Allows applications to perform I/O operations over NFC.";
		    break;
		case PERSISTENT_ACTIVITY:
		    value = "This constant was deprecated in API level 9. This functionality will be removed in the future; please do not use. Allow an application to make its activities persistent..";
		    break;
		case PROCESS_OUTGOING_CALLS:
		    value = "Allows an application to monitor, modify, or abort outgoing calls..";
		    break;
		case READ_CALENDAR:
		    value = "Allows an application to read the user's calendar data..";
		    break;
		case READ_CALL_LOG:
		    value = "Allows an application to read the user's call log..";
		    break;
		case READ_CONTACTS:
		    value = "Allows an application to read the user's contacts data..";
		    break;
		case READ_EXTERNAL_STORAGE:
		    value = "Allows an application to read from external storage..";
		    break;
		case READ_FRAME_BUFFER:
		    value = "Allows an application to take screen shots and more generally get access to the frame buffer data..";
		    break;
		case READ_HISTORY_BOOKMARKS:
		    value = "Allows an application to read (but not write) the user's browsing history and bookmarks..";
		    break;
		case READ_INPUT_STATE:
		    value = "This constant was deprecated in API level 16. The API that used this permission has been removed..";
		    break;
		case READ_LOGS:
		    value = "Allows an application to read the low-level system log files..";
		    break;
		case READ_PHONE_STATE:
		    value = "Allows read only access to phone state..";
		    break;
		case READ_PROFILE:
		    value = "Allows an application to read the user's personal profile data..";
		    break;
		case READ_SMS:
		    value = "Allows an application to read SMS messages..";
		    break;
		case READ_SOCIAL_STREAM:
		    value = "Allows an application to read from the user's social stream..";
		    break;
		case READ_SYNC_SETTINGS:
		    value = "Allows applications to read the sync settings.";
		    break;
		case READ_SYNC_STATS:
		    value = "Allows applications to read the sync stats.";
		    break;
		case READ_USER_DICTIONARY:
		    value = "Allows an application to read the user dictionary..";
		    break;
		case REBOOT:
		    value = "Required to be able to reboot the device..";
		    break;
		case RECEIVE_BOOT_COMPLETED:
		    value = "Allows an application to receive the ACTION_BOOT_COMPLETED that is broadcast after the system finishes booting..";
		    break;
		case RECEIVE_MMS:
		    value = "Allows an application to monitor incoming MMS messages, to record or perform processing on them..";
		    break;
		case RECEIVE_SMS:
		    value = "Allows an application to monitor incoming SMS messages, to record or perform processing on them..";
		    break;
		case RECEIVE_WAP_PUSH:
		    value = "Allows an application to monitor incoming WAP push messages..";
		    break;
		case RECORD_AUDIO:
		    value = "Allows an application to record audio.";
		    break;
		case REORDER_TASKS:
		    value = "Allows an application to change the Z-order of tasks.";
		    break;
		case RESTART_PACKAGES:
		    value = "This constant was deprecated in API level 8. The restartPackage(String) API is no longer supported..";
		    break;
		case SEND_RESPOND_VIA_MESSAGE:
		    value = "Allows an application (Phone) to send a request to other applications to handle the respond-via-message action during incoming calls..";
		    break;
		case SEND_SMS:
		    value = "Allows an application to send SMS messages..";
		    break;
		case SET_ACTIVITY_WATCHER:
		    value = "Allows an application to watch and control how activities are started globally in the system..";
		    break;
		case SET_ALARM:
		    value = "Allows an application to broadcast an Intent to set an alarm for the user..";
		    break;
		case SET_ALWAYS_FINISH:
		    value = "Allows an application to control whether activities are immediately finished when put in the background..";
		    break;
		case SET_ANIMATION_SCALE:
		    value = "Modify the global animation scaling factor..";
		    break;
		case SET_DEBUG_APP:
		    value = "Configure an application for debugging..";
		    break;
		case SET_ORIENTATION:
		    value = "Allows low-level access to setting the orientation (actually rotation) of the screen..";
		    break;
		case SET_POINTER_SPEED:
		    value = "Allows low-level access to setting the pointer speed..";
		    break;
		case SET_PREFERRED_APPLICATIONS:
		    value = "This constant was deprecated in API level 7. No longer useful, see addPackageToPreferred(String) for details..";
		    break;
		case SET_PROCESS_LIMIT:
		    value = "Allows an application to set the maximum number of (not needed) application processes that can be running..";
		    break;
		case SET_TIME:
		    value = "Allows applications to set the system time..";
		    break;
		case SET_TIME_ZONE:
		    value = "Allows applications to set the system time zone.";
		    break;
		case SET_WALLPAPER:
		    value = "Allows applications to set the wallpaper.";
		    break;
		case SET_WALLPAPER_HINTS:
		    value = "Allows applications to set the wallpaper hints.";
		    break;
		case SIGNAL_PERSISTENT_PROCESSES:
		    value = "Allow an application to request that a signal be sent to all persistent processes..";
		    break;
		case STATUS_BAR:
		    value = "Allows an application to open, close, or disable the status bar and its icons..";
		    break;
		case SUBSCRIBED_FEEDS_READ:
		    value = "Allows an application to allow access the subscribed feeds ContentProvider..";
		    break;
		case SUBSCRIBED_FEEDS_WRITE:
		    value = ".";
		    break;
		case SYSTEM_ALERT_WINDOW:
		    value = "Allows an application to open windows using the type TYPE_SYSTEM_ALERT, shown on top of all other applications..";
		    break;
		case UPDATE_DEVICE_STATS:
		    value = "Allows an application to update device statistics..";
		    break;
		case USE_CREDENTIALS:
		    value = "Allows an application to request authtokens from the AccountManager.";
		    break;
		case USE_SIP:
		    value = "Allows an application to use SIP service.";
		    break;
		case VIBRATE:
		    value = "Allows access to the vibrator.";
		    break;
		case WAKE_LOCK:
		    value = "Allows using PowerManager WakeLocks to keep processor from sleeping or screen from dimming.";
		    break;
		case WRITE_APN_SETTINGS:
		    value = "Allows applications to write the apn settings..";
		    break;
		case WRITE_CALENDAR:
		    value = "Allows an application to write (but not read) the user's calendar data..";
		    break;
		case WRITE_CALL_LOG:
		    value = "Allows an application to write (but not read) the user's contacts data..";
		    break;
		case WRITE_CONTACTS:
		    value = "Allows an application to write (but not read) the user's contacts data..";
		    break;
		case WRITE_EXTERNAL_STORAGE:
		    value = "Allows an application to write to external storage..";
		    break;
		case WRITE_GSERVICES:
		    value = "Allows an application to modify the Google service map..";
		    break;
		case WRITE_HISTORY_BOOKMARKS:
		    value = "Allows an application to write (but not read) the user's browsing history and bookmarks..";
		    break;
		case WRITE_PROFILE:
		    value = "Allows an application to write (but not read) the user's personal profile data..";
		    break;
		case WRITE_SECURE_SETTINGS:
		    value = "Allows an application to read or write the secure system settings..";
		    break;
		case WRITE_SETTINGS:
		    value = "Allows an application to read or write the system settings..";
		    break;
		case WRITE_SMS:
		    value = "Allows an application to write SMS messages..";
		    break;
		case WRITE_SOCIAL_STREAM:
		    value = "Allows an application to write (but not read) the user's social stream data..";
		    break;
		case WRITE_SYNC_SETTINGS:
		    value = "Allows applications to write the sync settings.";
		    break;
		case WRITE_USER_DICTIONARY:
		    value = "Allows an application to write to the user dictionary..";
		    break;
		default:
			value = "Unkown.";
			break;
		}
		return value;
	}
	
	public Rating getRating() {
		Rating value;
		switch (this) {
		case ACCESS_CHECKIN_PROPERTIES:
		    value = Rating.MEDIUM;
		    break;
		case ACCESS_COARSE_LOCATION:
		    value = Rating.MEDIUM;
		    break;
		case ACCESS_FINE_LOCATION:
		    value = Rating.MEDIUM;
		    break;
		case ACCESS_LOCATION_EXTRA_COMMANDS:
		    value = Rating.MEDIUM;
		    break;
		case ACCESS_MOCK_LOCATION:
		    value = Rating.LOW;
		    break;
		case ACCESS_NETWORK_STATE:
		    value = Rating.LOW;
		    break;
		case ACCESS_SURFACE_FLINGER:
		    value = Rating.LOW;
		    break;
		case ACCESS_WIFI_STATE:
		    value = Rating.LOW;
		    break;
		case ACCOUNT_MANAGER:
		    value = Rating.HIGH;
		    break;
		case ADD_VOICEMAIL:
		    value = Rating.MEDIUM;
		    break;
		case AUTHENTICATE_ACCOUNTS:
		    value = Rating.HIGH;
		    break;
		case BATTERY_STATS:
		    value = Rating.LOW;
		    break;
		case BIND_ACCESSIBILITY_SERVICE:
		    value = Rating.HIGH;
		    break;
		case BIND_APPWIDGET:
		    value = Rating.LOW;
		    break;
		case BIND_DEVICE_ADMIN:
		    value = Rating.HIGH;
		    break;
		case BIND_INPUT_METHOD:
		    value = Rating.MEDIUM;
		    break;
		case BIND_NOTIFICATION_LISTENER_SERVICE:
		    value = Rating.LOW;
		    break;
		case BIND_REMOTEVIEWS:
		    value = Rating.HIGH;
		    break;
		case BIND_TEXT_SERVICE:
		    value = Rating.LOW;
		    break;
		case BIND_VPN_SERVICE:
		    value = Rating.HIGH;
		    break;
		case BIND_WALLPAPER:
		    value = Rating.LOW;
		    break;
		case BLUETOOTH:
		    value = Rating.MEDIUM;
		    break;
		case BLUETOOTH_ADMIN:
		    value = Rating.MEDIUM;
		    break;
		case BRICK:
		    value = Rating.HIGH;
		    break;
		case BROADCAST_PACKAGE_REMOVED:
		    value = Rating.LOW;
		    break;
		case BROADCAST_SMS:
		    value = Rating.LOW;
		    break;
		case BROADCAST_STICKY:
		    value = Rating.LOW;
		    break;
		case BROADCAST_WAP_PUSH:
		    value = Rating.LOW;
		    break;
		case CALL_PHONE:
		    value = Rating.HIGH;
		    break;
		case CALL_PRIVILEGED:
		    value = Rating.HIGH;
		    break;
		case CAMERA:
		    value = Rating.HIGH;
		    break;
		case CHANGE_COMPONENT_ENABLED_STATE:
		    value = Rating.HIGH;
		    break;
		case CHANGE_CONFIGURATION:
		    value = Rating.HIGH;
		    break;
		case CHANGE_NETWORK_STATE:
		    value = Rating.MEDIUM;
		    break;
		case CHANGE_WIFI_MULTICAST_STATE:
		    value = Rating.LOW;
		    break;
		case CHANGE_WIFI_STATE:
		    value = Rating.MEDIUM;
		    break;
		case CLEAR_APP_CACHE:
		    value = Rating.LOW;
		    break;
		case CLEAR_APP_USER_DATA:
		    value = Rating.HIGH;
		    break;
		case CONTROL_LOCATION_UPDATES:
		    value = Rating.MEDIUM;
		    break;
		case DELETE_CACHE_FILES:
		    value = Rating.MEDIUM;
		    break;
		case DELETE_PACKAGES:
		    value = Rating.HIGH;
		    break;
		case DEVICE_POWER:
		    value = Rating.MEDIUM;
		    break;
		case DIAGNOSTIC:
		    value = Rating.HIGH;
		    break;
		case DISABLE_KEYGUARD:
		    value = Rating.MEDIUM;
		    break;
		case DUMP:
		    value = Rating.HIGH;
		    break;
		case EXPAND_STATUS_BAR:
		    value = Rating.MEDIUM;
		    break;
		case FACTORY_TEST:
		    value = Rating.HIGH;
		    break;
		case FLASHLIGHT:
		    value = Rating.LOW;
		    break;
		case FORCE_BACK:
		    value = Rating.MEDIUM;
		    break;
		case GET_ACCOUNTS:
		    value = Rating.MEDIUM;
		    break;
		case GET_PACKAGE_SIZE:
		    value = Rating.LOW;
		    break;
		case GET_TASKS:
		    value = Rating.MEDIUM;
		    break;
		case GET_TOP_ACTIVITY_INFO:
		    value = Rating.LOW;
		    break;
		case GLOBAL_SEARCH:
		    value = Rating.LOW;
		    break;
		case HARDWARE_TEST:
		    value = Rating.LOW;
		    break;
		case INJECT_EVENTS:
		    value = Rating.HIGH;
		    break;
		case INSTALL_LOCATION_PROVIDER:
		    value = Rating.HIGH;
		    break;
		case INSTALL_PACKAGES:
		    value = Rating.HIGH;
		    break;
		case INTERNAL_SYSTEM_WINDOW:
		    value = Rating.MEDIUM;
		    break;
		case INTERNET:
		    value = Rating.MEDIUM;
		    break;
		case KILL_BACKGROUND_PROCESSES:
		    value = Rating.HIGH;
		    break;
		case LOCATION_HARDWARE:
		    value = Rating.LOW;
		    break;
		case MANAGE_ACCOUNTS:
		    value = Rating.HIGH;
		    break;
		case MANAGE_APP_TOKENS:
		    value = Rating.HIGH;
		    break;
		case MASTER_CLEAR:
		    value = Rating.HIGH;
		    break;
		case MODIFY_AUDIO_SETTINGS:
		    value = Rating.LOW;
		    break;
		case MODIFY_PHONE_STATE:
		    value = Rating.HIGH;
		    break;
		case MOUNT_FORMAT_FILESYSTEMS:
		    value = Rating.HIGH;
		    break;
		case MOUNT_UNMOUNT_FILESYSTEMS:
		    value = Rating.LOW;
		    break;
		case NFC:
		    value = Rating.MEDIUM;
		    break;
		case PERSISTENT_ACTIVITY:
		    value = Rating.LOW;
		    break;
		case PROCESS_OUTGOING_CALLS:
		    value = Rating.HIGH;
		    break;
		case READ_CALENDAR:
		    value = Rating.MEDIUM;
		    break;
		case READ_CALL_LOG:
		    value = Rating.MEDIUM;
		    break;
		case READ_CONTACTS:
		    value = Rating.MEDIUM;
		    break;
		case READ_EXTERNAL_STORAGE:
		    value = Rating.LOW;
		    break;
		case READ_FRAME_BUFFER:
		    value = Rating.MEDIUM;
		    break;
		case READ_HISTORY_BOOKMARKS:
		    value = Rating.HIGH;
		    break;
		case READ_INPUT_STATE:
		    value = Rating.LOW;
		    break;
		case READ_LOGS:
		    value = Rating.HIGH;
		    break;
		case READ_PHONE_STATE:
		    value = Rating.LOW;
		    break;
		case READ_PROFILE:
		    value = Rating.MEDIUM;
		    break;
		case READ_SMS:
		    value = Rating.HIGH;
		    break;
		case READ_SOCIAL_STREAM:
		    value = Rating.HIGH;
		    break;
		case READ_SYNC_SETTINGS:
		    value = Rating.LOW;
		    break;
		case READ_SYNC_STATS:
		    value = Rating.MEDIUM;
		    break;
		case READ_USER_DICTIONARY:
		    value = Rating.LOW;
		    break;
		case REBOOT:
		    value = Rating.HIGH;
		    break;
		case RECEIVE_BOOT_COMPLETED:
		    value = Rating.HIGH;
		    break;
		case RECEIVE_MMS:
		    value = Rating.HIGH;
		    break;
		case RECEIVE_SMS:
		    value = Rating.HIGH;
		    break;
		case RECEIVE_WAP_PUSH:
		    value = Rating.LOW;
		    break;
		case RECORD_AUDIO:
		    value = Rating.HIGH;
		    break;
		case REORDER_TASKS:
		    value = Rating.MEDIUM;
		    break;
		case RESTART_PACKAGES:
		    value = Rating.HIGH;
		    break;
		case SEND_RESPOND_VIA_MESSAGE:
		    value = Rating.HIGH;
		    break;
		case SEND_SMS:
		    value = Rating.HIGH;
		    break;
		case SET_ACTIVITY_WATCHER:
		    value = Rating.MEDIUM;
		    break;
		case SET_ALARM:
		    value = Rating.LOW;
		    break;
		case SET_ALWAYS_FINISH:
		    value = Rating.MEDIUM;
		    break;
		case SET_ANIMATION_SCALE:
		    value = Rating.LOW;
		    break;
		case SET_DEBUG_APP:
		    value = Rating.LOW;
		    break;
		case SET_ORIENTATION:
		    value = Rating.LOW;
		    break;
		case SET_POINTER_SPEED:
		    value = Rating.LOW;
		    break;
		case SET_PREFERRED_APPLICATIONS:
		    value = Rating.LOW;
		    break;
		case SET_PROCESS_LIMIT:
		    value = Rating.MEDIUM;
		    break;
		case SET_TIME:
		    value = Rating.LOW;
		    break;
		case SET_TIME_ZONE:
		    value = Rating.LOW;
		    break;
		case SET_WALLPAPER:
		    value = Rating.LOW;
		    break;
		case SET_WALLPAPER_HINTS:
		    value = Rating.LOW;
		    break;
		case SIGNAL_PERSISTENT_PROCESSES:
		    value = Rating.LOW;
		    break;
		case STATUS_BAR:
		    value = Rating.LOW;
		    break;
		case SUBSCRIBED_FEEDS_READ:
		    value = Rating.MEDIUM;
		    break;
		case SUBSCRIBED_FEEDS_WRITE:
		    value = Rating.MEDIUM;
		    break;
		case SYSTEM_ALERT_WINDOW:
		    value = Rating.HIGH;
		    break;
		case UPDATE_DEVICE_STATS:
		    value = Rating.LOW;
		    break;
		case USE_CREDENTIALS:
		    value = Rating.HIGH;
		    break;
		case USE_SIP:
		    value = Rating.MEDIUM;
		    break;
		case VIBRATE:
		    value = Rating.LOW;
		    break;
		case WAKE_LOCK:
		    value = Rating.LOW;
		    break;
		case WRITE_APN_SETTINGS:
		    value = Rating.HIGH;
		    break;
		case WRITE_CALENDAR:
		    value = Rating.MEDIUM;
		    break;
		case WRITE_CALL_LOG:
		    value = Rating.MEDIUM;
		    break;
		case WRITE_CONTACTS:
		    value = Rating.HIGH;
		    break;
		case WRITE_EXTERNAL_STORAGE:
		    value = Rating.HIGH;
		    break;
		case WRITE_GSERVICES:
		    value = Rating.MEDIUM;
		    break;
		case WRITE_HISTORY_BOOKMARKS:
		    value = Rating.HIGH;
		    break;
		case WRITE_PROFILE:
		    value = Rating.MEDIUM;
		    break;
		case WRITE_SECURE_SETTINGS:
		    value = Rating.HIGH;
		    break;
		case WRITE_SETTINGS:
		    value = Rating.MEDIUM;
		    break;
		case WRITE_SMS:
		    value = Rating.HIGH;
		    break;
		case WRITE_SOCIAL_STREAM:
		    value = Rating.HIGH;
		    break;
		case WRITE_SYNC_SETTINGS:
		    value = Rating.MEDIUM;
		    break;
		case WRITE_USER_DICTIONARY:
		    value = Rating.LOW;
		    break;
		default:
			value = Rating.HIGH;
			break;
		}
		return value;
	}

}
