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

        var user_name = findViewById(R.id.user_name) as EditText
        var password = findViewById(R.id.user_password) as EditText
        var email_Address = findViewById(R.id.email_Address) as EditText
        var password_Confirm = findViewById(R.id.password_Confirm) as EditText
        var btn_submit = findViewById(R.id.btn_submit) as Button

     //   val email = findViewById<EditText>(R.id.email)
     //   val passwordConfirm = findViewById<EditText>(R.id.passwordConfirm) as EditText
     //   val myButton = findViewById<Button>(R.id.button)



        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = user_name.text;
            val password = password.text;
            val email_Address = email_Address.text;
            val password_Confirm = password_Confirm.text;

            if (user_name.isEmpty()){
                Toast.makeText(this, "Please enter a name.", Toast.LENGTH_LONG).show()
            }else if( password.isEmpty()) {
                Toast.makeText(this, "Please enter a password.", Toast.LENGTH_LONG).show()
            }else if( email_Address.isEmpty()) {
                Toast.makeText(this, "Please enter a email Address.", Toast.LENGTH_LONG).show()
            }else if( password_Confirm.isEmpty()) {
                Toast.makeText(this, "Please confirm your password.", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Finished", Toast.LENGTH_LONG).show()
            }


            // your code to validate the user_name and password combination
            // and verify the same

        }


    }


}