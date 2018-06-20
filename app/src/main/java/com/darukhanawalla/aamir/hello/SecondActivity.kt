package com.darukhanawalla.aamir.hello

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name: String = intent.getStringExtra("name")
        textView.text  = "Hi " + name

        backButton.setOnClickListener {
            val intentBack = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intentBack)
        }
    }

}
