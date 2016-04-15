package com.mastercard.ua;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;

import com.urbanairship.push.BaseIntentReceiver;
import com.urbanairship.push.PushMessage;

/**
 * Created by user on 11/04/2016.
 */
public class IntentReceiver extends BaseIntentReceiver {

    private static final String TAG = "IntentReceiver";

    public IntentReceiver() {
        super();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    @Override
    protected void onNotificationDismissed(@NonNull Context context, @NonNull PushMessage message, int notificationId) {
        Log.i(TAG, "Notification dismissed. Alert: " + message.getAlert() + ". Notification ID: " + notificationId);
    }

    @Override
    protected void onChannelRegistrationSucceeded(@NonNull Context context, @NonNull String channelId) {
        Log.i(TAG, "Channel registration updated. Channel Id:" + channelId + ".");
    }

    @Override
    protected void onChannelRegistrationFailed(@NonNull Context context) {
        Log.i(TAG, "Channel registration failed.");
    }

    @Override
    protected void onPushReceived(@NonNull Context context, @NonNull PushMessage message, int notificationId) {
        Log.i(TAG, "Received push notification. Alert: " + message.getAlert() + ". Notification ID: " + notificationId);
    }

    @Override
    protected void onBackgroundPushReceived(@NonNull Context context, @NonNull PushMessage message) {
        Log.i(TAG, "Received background push message: " + message);
    }

    @Override
    protected boolean onNotificationOpened(@NonNull Context context, @NonNull PushMessage message, int i) {
        Log.i(TAG, "User clicked notification. Alert: " + message.getAlert());

        // Return false to let UA handle launching the launch activity
        return false;
    }

    @Override
    protected boolean onNotificationActionOpened(@NonNull Context context, @NonNull PushMessage message, int i, @NonNull String buttonId, boolean b) {
        Log.i(TAG, "User clicked notification button. Button ID: " + buttonId + " Alert: " + message.getAlert());

        // Return false to let UA handle launching the launch activity
        return false;
    }
}
