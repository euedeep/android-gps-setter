package io.github.jqssun.gpssetter.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import io.github.jqssun.gpssetter.ui.BaseMapActivity
import io.github.jqssun.gpssetter.utils.NotificationsChannel.ACTION_STOP

class NotificationActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == ACTION_STOP) {
            // Perform the necessary action for "Stop"
            // Example: Send a broadcast or start a service to handle the stop action
            val stopIntent = Intent("io.github.jqssun.gpssetter.STOP_ACTION")
            context?.sendBroadcast(stopIntent)
        }
    }
}