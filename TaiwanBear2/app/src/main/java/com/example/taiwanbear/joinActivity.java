package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class joinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_join);
    }
    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnLearn:
                intent.setClass(this, areaActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnTest:
                intent.setClass(this, testActivity.class);
                startActivity(intent);
                break;
        }
    }
}