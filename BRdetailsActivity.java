
package com.abdul.stringup_2o;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BRdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brdetails);

        Intent intent=getIntent();
        String name=intent.getStringExtra("Brand");
        String model=intent.getStringExtra("Model");
        String type=intent.getStringExtra("Type");


        TextView bbrand=findViewById(R.id.racquet_brand);
        bbrand.setText(name);

        TextView bmodel=findViewById(R.id.racquet_model);
        bmodel.setText(model);



    }
}
