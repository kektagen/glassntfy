package io.heckel.ntfy.app

import android.app.Application
import io.heckel.ntfy.db.Repository
import io.heckel.ntfy.util.Log

class Application : Application() {
    val repository by lazy {
        val repository = Repository.getInstance(applicationContext)
        if (repository.getRecordLogs()) {
            Log.setRecord(true)
        }
        repository
    }
}
