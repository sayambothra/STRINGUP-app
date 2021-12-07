package com.example.string_up;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void openRegister(View view){
        Intent i= new Intent(this,RegisterActivity.class);
        startActivity(i);
    }
    public void openHome(View view) {
        EditText uname=(EditText)findViewById(R.id.Username);
        EditText upass=(EditText)findViewById(R.id.password);
        if (uname.getText().toString().equals("Sayam") && upass.getText().toString().equals("Stringup") ) {
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);
       }
        else {
            Toast toast = new Toast(getApplicationContext());
            toast.makeText(LoginActivity.this, "Invalid UserName or Password", toast.LENGTH_SHORT).show();

        }
    }







}