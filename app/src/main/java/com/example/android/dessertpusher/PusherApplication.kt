package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber


/**
 * This is an Application Class
 * An application class is a class through which the android system interacts with your app.
 * If you don't create a custom one, a default application class will be automatically created.
 * to use a custom application class, you need to add "name" property under application tag in androidManifest.xml
 */

/**
 * Timber: it is an open source logging API, used to make logs easier to write with a bunch of other features.
 * timber adds the "tag" in the log statement as the name of the activity the log message it is in.
 */
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        // since timber will be used application wide, it need to be added in the application class.
    }
}