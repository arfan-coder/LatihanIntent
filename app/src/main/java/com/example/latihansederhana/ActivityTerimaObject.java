package com.example.latihansederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTerimaObject extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_object);

        textView = findViewById(R.id.txtterima);
        Biodata biodataku = getIntent().getParcelableExtra("biodata");
        textView.setText(" nama saya " + biodataku.getName() + " umur saya " + biodataku.getAge());
    }
}
