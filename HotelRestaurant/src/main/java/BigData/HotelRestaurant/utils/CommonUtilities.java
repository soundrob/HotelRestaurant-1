package BigData.HotelRestaurant.utils;

import android.content.Context;
import android.content.Intent;

public class CommonUtilities {
	
	//put your server url here
	public static final String SERVER_URL ="SendPushNotification.php";
	// Google project id
	public static final String SENDER_ID = "restaurant-200915";
	/*public static final String SENDER_ID = "819239196528";*/
	/**
	 * Tag used on log messages.
	 */
	public static final String TAG = "GCM";

	public static final String DISPLAY_MESSAGE_ACTION = "BigData.HotelRestaurant.DISPLAY_MESSAGE";

	public static final String EXTRA_MESSAGE = "message";

      
	static void displayMessage(Context context, String message) {
		Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
		intent.putExtra(EXTRA_MESSAGE, message);
		context.sendBroadcast(intent);
	}
}
