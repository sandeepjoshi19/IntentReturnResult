package com.example.testapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class C : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        var button: Button=findViewById(R.id.send_result)
        button.setOnClickListener {
            var intent = getIntent() // get intent
            intent.putExtra("name", "AndroidDevSunny");
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
