package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KeelungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_keelung);
    }
    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnWeb:
                intent.setClass(this,KeelungWebActivity.class);
                startActivity(intent);
                break;
        }
    }
}