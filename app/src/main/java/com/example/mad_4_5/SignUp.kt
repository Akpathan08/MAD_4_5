package com.example.mad_4_5
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }
    fun login(view: View) {
        intent = Intent(this,Login::class.java)
        startActivity(intent)
    }
    fun registerds(view: View) {
        intent = Intent(this,Login::class.java)
        startActivity(intent)
    }
}