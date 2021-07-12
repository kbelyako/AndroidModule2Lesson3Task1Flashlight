package com.example.androidmodule2lesson3task1flashlight
/*
ДЗ. Задание 1. Легкое
Напишите приложение – экранный фонарик. Т.е. чтобы экран горел разными цветами по
желанию пользователя.
1. Главная активити – в ней название приложения и кнопки выбора цвета экрана: белый,
красный, синий, зеленый, циан, светло-серый, магнета. Дизайн по своему усмотрению.
2. Второй экран – пустой с нужным цветом.
3. Возврат – кнопкой назад в телефоне.
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btWhite.setOnClickListener {
            val intent = Intent(this,FlashLightActivity::class.java)
            intent.putExtra("color",Enums.WHITE)
            startActivity(intent)
        }

        btGreen.setOnClickListener {
            val intent = Intent(this,FlashLightActivity::class.java)
            intent.putExtra("color",Enums.GREEN)
            startActivity(intent)
        }

        btBlue.setOnClickListener {
            val intent = Intent(this,FlashLightActivity::class.java)
            intent.putExtra("color",Enums.BLUE)
            startActivity(intent)
        }
        btRed.setOnClickListener {
            val intent = Intent(this,FlashLightActivity::class.java)
            intent.putExtra("color",Enums.RED)
            startActivity(intent)
        }

        btLTGray.setOnClickListener {
            val intent = Intent(this,FlashLightActivity::class.java)
            intent.putExtra("color",Enums.LTGRAY)
            startActivity(intent)
        }

        btCyan.setOnClickListener {
            val intent = Intent(this,FlashLightActivity::class.java)
            intent.putExtra("color",Enums.CYAN)
            startActivity(intent)
        }

        btMagneta.setOnClickListener {
            val intent = Intent(this,FlashLightActivity::class.java)
            intent.putExtra("color",Enums.MAGENTA)
            startActivity(intent)
        }

    }
}