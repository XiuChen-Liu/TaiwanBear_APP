package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class southActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_south);
    }

    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnChiayi:
                intent.setClass(this, ChiayiActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnTainan:
                intent.setClass(this, TainanActivity.class);
                startActivity(intent);
                break;

            case R.id.BtnKaohsiung:
                intent.setClass(this, KaohsiungActivity.class);
                startActivity(intent);
                break;

            case R.id.BtnPingtung:
                intent.setClass(this, PingtungActivity.class);
                startActivity(intent);
                break;
        }
    }
}