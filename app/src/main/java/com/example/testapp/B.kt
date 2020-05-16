package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class B : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        var intent: Intent= Intent(this,C::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT) //add flag so that reply target of B will be transferred to c
        startActivity(intent) // use startActivity() not startActivityForResult()
        finish() // It is must otherwise A will not receive the result from C.


    }
}
