package com.example.weather
import android.content.Intent
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.animation.AnimationUtils
import pl.droidsonroids.gif.GifImageView


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

      val bggif : GifImageView = findViewById(R.id.gifImageView)
      val sideanimation = AnimationUtils.loadAnimation(this,R.anim.fade_in)
          bggif.startAnimation(sideanimation)
        // used to hide status bar
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Handler().postDelayed({
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }



}