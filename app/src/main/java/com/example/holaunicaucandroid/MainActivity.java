package com.example.holaunicaucandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button  btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Set up the interface according to activity_hello_x XML layout
        setContentView(R.layout.activity_main);
//Get an instance of the button via inflation
        btn = (Button) findViewById(R.id.);
//Set up a listener for listening button events (click)
        btn.setOnClickListener(this);
//Call this method to update the button text with current date and time
//updateTime();
        btn.setText("Bienvenido a tu primera App");
    }

    private void updateTime() {
        btn.setText(new Date().toString());
    }

    @Override
    public void onClick(View v) {

        //updateTime();
    }
}
