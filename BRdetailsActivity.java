package com.abdul.stringup_2o;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BRdetailsActivity extends AppCompatActivity {

    TextView brand,model,type;
    String bbrand,bmodel,btype;
    Button addracket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brdetails);

        brand=findViewById(R.id.racquet_brand);
        model=findViewById(R.id.racquet_model);
        type=findViewById(R.id.string_type);

        bbrand=getIntent().getExtras().getString("Value");
        brand.setText(bbrand);

        bmodel=getIntent().getExtras().getString("Name");
        model.setText(bmodel);

        btype=getIntent().getExtras().getString("Type");
        type.setText(btype);

        



        addracket=findViewById(R.id.btn_addRacket);
        addracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {






            }
        });


//
//        brand=findViewById(R.id.racquet_brand);
//        model=findViewById(R.id.racquet_model);
//
//
//        bbrand=getIntent().getExtras().getString("Value");
//        brand.setText(bbrand);
//
//        bmodel=getIntent().getExtras().getString("Value");
//        model.setText(bmodel);







    }
}
