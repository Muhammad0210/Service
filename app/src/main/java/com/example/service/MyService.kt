package com.example.service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*

private const val TAG = "MyService"
class MyService(context: Context, workerParameters: WorkerParameters) : Worker(context, workerParameters)  {
    override fun doWork(): Result {


        val date = SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Date())
        Log.d(TAG, "doWork: $date")

        return Result.success()
    }
}