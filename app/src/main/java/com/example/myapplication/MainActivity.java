package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*   Snackbar sb=Snackbar.make(findViewById(R.id.tv1),"done",Snackbar.LENGTH_LONG);
               sb.show(); */

            Snackbar sb= Snackbar.make(findViewById(R.id.tv1),"Action Snackbar",Snackbar.LENGTH_INDEFINITE).setAction("restry", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Snackbar Text",Toast.LENGTH_LONG).show();
                }
            });

            sb.show();
            }
        });
    }


}
