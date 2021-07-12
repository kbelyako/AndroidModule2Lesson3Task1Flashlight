package com.example.androidmodule2lesson3task1flashlight

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_flash_light.*

class FlashLightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_light)

        val color=intent.getStringExtra("color")

        when(color) {
            Enums.WHITE -> clRootScreenFlashLight.setBackgroundColor(Color.WHITE)
            Enums.RED -> clRootScreenFlashLight.setBackgroundColor(Color.RED)
            Enums.BLUE -> clRootScreenFlashLight.setBackgroundColor(Color.BLUE)
            Enums.GREEN -> clRootScreenFlashLight.setBackgroundColor(Color.GREEN)
            Enums.CYAN -> clRootScreenFlashLight.setBackgroundColor(Color.CYAN)
            Enums.LTGRAY -> clRootScreenFlashLight.setBackgroundColor(Color.LTGRAY)
            Enums.MAGENTA -> clRootScreenFlashLight.setBackgroundColor(Color.MAGENTA)
        }
    }
}