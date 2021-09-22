package edu.temple

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user_name = findViewById<EditText>(R.id.user_name)
        val password = findViewById<EditText>(R.id.user_password)
        val email_Address = findViewById<EditText>(R.id.email_Address)
        val password_Confirm = findViewById<EditText>(R.id.password_Confirm)
        val btn_submit = findViewById<Button>(R.id.btn_submit)

     //   val email = findViewById<EditText>(R.id.email)
     //   val passwordConfirm = findViewById<EditText>(R.id.passwordConfirm) as EditText
     //   val myButton = findViewById<Button>(R.id.button)



        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = user_name.text
            val password = password.text
            val email_Address = email_Address.text
            val password_Confirm = password_Confirm.text



            when {
                user_name.isEmpty() -> {
                    Toast.makeText(this, "Please enter a name.", Toast.LENGTH_LONG).show()
                }
                password.isEmpty() -> {
                    Toast.makeText(this, "Please enter a password.", Toast.LENGTH_LONG).show()
                }
                email_Address.isEmpty() -> {
                    Toast.makeText(this, "Please enter a email Address.", Toast.LENGTH_LONG).show()
                }
                password_Confirm.isEmpty() -> {
                    Toast.makeText(this, "Please confirm your password.", Toast.LENGTH_LONG).show()
                }
                password.toString() == password_Confirm.toString() -> {
                    Toast.makeText(this, "Password confirmed", Toast.LENGTH_LONG).show()
                    Toast.makeText(this, "Welcome: $user_name", Toast.LENGTH_LONG).show()
                }
                else -> {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show()
                    println(password)
                    println(password_Confirm)
                }
            }
            }
        }


}