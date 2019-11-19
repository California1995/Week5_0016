package com.example.week5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_secound.*

class SecoundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        val title = intent.extras?.getString(MainActivity().KEY_TITLE,"")
        val result = intent.extras?.getString(MainActivity().KEY_RESULT,"")

        tv_history.setText(title)
        tv_result.setText(result)

        btn_back.setOnClickListener {
            finish()
        }
    }

}