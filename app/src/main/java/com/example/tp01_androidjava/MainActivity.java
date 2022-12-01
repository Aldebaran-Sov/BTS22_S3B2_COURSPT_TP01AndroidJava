package com.example.tp01_androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOnClick(View v) {
        TextView Tb1 = (TextView)findViewById(R.id.tb1);
        TextView Tb2 = (TextView)findViewById(R.id.tb2);
        Tb1.setText("bonjour");
        Tb2.setText(Tb1.getText());
    }
}