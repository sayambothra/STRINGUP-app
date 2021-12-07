package com.example.string_up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resource_activity);
    }
    public void openRegister(View view){
        EditText firstName=(EditText)findViewById(R.id.fName);
        EditText lastName=(EditText)findViewById(R.id.lName);
        EditText userName=(EditText)findViewById(R.id.Username);
        EditText uPaswword=(EditText)findViewById(R.id.password);
        EditText rePass=(EditText)findViewById(R.id.Re_Password);
        EditText email=(EditText)findViewById(R.id.Email_id);
        Intent i= new Intent(this,LoginActivity.class);
        startActivity(i);
    }


}
