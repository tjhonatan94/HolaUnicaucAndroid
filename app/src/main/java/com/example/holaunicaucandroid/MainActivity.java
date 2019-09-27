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

        btn = new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);
    }

    private void updateTime() {
        btn.setText(new Date().toString());
    }

    @Override
    public void onClick(View v) {
        updateTime();
    }
}
