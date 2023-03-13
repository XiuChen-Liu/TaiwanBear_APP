package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class testActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);
    }

    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.btnReady:
                intent.setClass(this, startTestActivity.class);
                startActivity(intent);
                break;
            case R.id.btnNotReady:
                intent.setClass(this, joinActivity.class);
                startActivity(intent);
                break;
        }
    }
}