package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChiayiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chiayi);
    }

    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.moreInfor:
                intent.setClass(this, ChiayiWebMainActivity.class);
                startActivity(intent);
                break;
        }
    }
}