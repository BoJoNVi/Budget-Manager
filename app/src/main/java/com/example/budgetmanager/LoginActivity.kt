package com.example.budgetmanager

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        statusBarColor()


        findViewById<MaterialButton>(R.id.login_signUpButton).setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
            overridePendingTransition(R.anim.slide_up_in, R.anim.slide_up_out)
        }

    }

    private fun statusBarColor() {
        // Set Status Bar Color first, in this case it will be dark_desaturated_blue ALWAYS
        window.statusBarColor = ContextCompat.getColor(this, R.color.dark_desaturated_blue)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // If the device is running Marshmallow
            window.statusBarColor = resources.getColor(R.color.dark_desaturated_blue, this.theme)
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Else if device is running  Lollipop
            ContextCompat.getColor(this, R.color.dark_desaturated_blue)
        }
    }
}