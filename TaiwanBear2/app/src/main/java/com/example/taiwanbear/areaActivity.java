package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class areaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_area);
    }

    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnNorth:
                intent.setClass(this, northActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnCentral:
                intent.setClass(this, centralActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnSouth:
                intent.setClass(this, southActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnEast:
                intent.setClass(this, eastActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnIsland:
                intent.setClass(this, islandActivity.class);
                startActivity(intent);
                break;
        }
    }
}