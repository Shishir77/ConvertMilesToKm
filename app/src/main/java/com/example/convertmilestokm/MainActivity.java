
//Shishir Bishwokarma
package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttontoKm = (Button) findViewById(R.id.buttontoKm) ;
        buttontoKm.setOnClickListener(new View.OnClickListener() {     //registering onClick event listener
            @Override   //overriding the function    //implementing onClick callBack method
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);  //finding the reference to buttons in UI ( R= resources
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString()); //getting value from the user input and changing it to string and then double
                double vKm = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));  //displays the output





            }
        });
        Button buttontoMiles = (Button) findViewById(R.id.buttontoMiles) ; //finding the reference to buttons in UI
        buttontoMiles.setOnClickListener(new View.OnClickListener() {  //registering onClick event listener
            @Override   //overriding the function    //implementing onClick callBack method
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vKm = Double.valueOf(textBoxKm.getText().toString()); //getting value from the user input and changing it to string and then double
                double vMiles = vKm*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##"); //formatting
                textBoxMiles.setText(formatVal.format(vMiles));





            }
        });


    }
}