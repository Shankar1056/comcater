package com.comcatertechnologies

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splas)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        initWidgit()


    }

    private fun initWidgit() {
        //   checkSession();
        val timer = object : Thread() {
            override fun run() {
                try {
                    //Display for 3 seconds
                    Thread.sleep(3000)
                } catch (e: InterruptedException) {
                    // TODO: handle exception
                    e.printStackTrace()
                } finally {
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                }
            }
        }
        timer.start()
    }


}
