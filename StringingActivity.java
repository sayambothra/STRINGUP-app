package com.example.string_up;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StringingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stringing);
    }
    public void openBadminton(View view){
        Intent i= new Intent(this,BadmintonActivity.class);
        startActivity(i);
    }
    public void openTennis(View view){
        Intent i= new Intent(this,TennisActivity.class);
        startActivity(i);
    }public void openSquash(View view){
        Intent i= new Intent(this,SquashActivity.class);
        startActivity(i);
    }

}
