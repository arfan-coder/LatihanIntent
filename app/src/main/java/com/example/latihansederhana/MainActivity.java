package com.example.latihansederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnmoveactivitydata= findViewById(R.id.btn_move_activity_data);
        btnmoveactivitydata.setOnClickListener(this);

        Button btn_DialANumber = findViewById(R.id.btn_DialANumber);
        btn_DialANumber.setOnClickListener(this);

        Button MWO = findViewById(R.id.MWO);
        MWO.setOnClickListener(this);
    }
    @Override
    public void  onClick(View v){
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

                case R.id.btn_move_activity_data:
                Intent MoveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                startActivity(MoveWithDataIntent);
                break;

            case R.id.btn_DialANumber:
                String phoneNumber ="081320538388";
                Intent DialANumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+phoneNumber"));
                startActivity(DialANumber);
                break;

            case R.id.MWO:
                Intent keBioGua = new Intent(MainActivity.this, ActivityTerimaObject.class);
                Biodata bioGW = new Biodata("Arfan,", 15);
                keBioGua.putExtra("biodata", bioGW);
                startActivity(keBioGua);
                break;
        }
    }
}