package com.vnvj0033.allinoneforcats.util.data

import android.content.Context

class SharedPreferencesData(context: Context) {
    var shared = SharedPreferencesUtil(context)

    var fcmToken: String
        get() = shared.getString("FCM_TOKEN", "")
        set(value) = shared.setString("FCM_TOKEN", value)

}