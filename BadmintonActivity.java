package com.abdul.stringup_2o;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class BadmintonActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    String[] Strings = {"Yonex BG-65\nRs.450/-", "Yonex BG-65 Titanium\nRs.450/-", "Yonex AeroBite\nRs.450/-", "Li-Ning No.7\nRs.450/-", "Li-Ning No.1\nRs.450/-"};
    int flags[] = {R.drawable.bg_65, R.drawable.bg_65titanium, R.drawable.aerobyte, R.drawable.lining1, R.drawable.lining7};
    EditText brand,model;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.bString);
        spin.setOnItemSelectedListener(this);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), flags, Strings);
        spin.setAdapter(customAdapter);
        Spinner spinner1 = (Spinner) findViewById(R.id.bCover);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.bCover, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);
        Spinner spinner2 = (Spinner) findViewById(R.id.bTension);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.bTension, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);


        brand=findViewById(R.id.bBrand);
        model=findViewById(R.id.bModel);
        Spinner spinner = (Spinner)findViewById(R.id.bString);


        click=findViewById(R.id.bnext);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BadmintonActivity.this,BRdetailsActivity.class);
                String bbrand=brand.getText().toString();
                String bmodel=model.getText().toString();

                String text = spinner.getSelectedItem().toString();

                intent.putExtra("Value",bbrand);
                intent.putExtra("Name",bmodel);
                intent.putExtra("Type",text);
                startActivity(intent);

            }
        });
        
    }
    
    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);

//  
            }
}









