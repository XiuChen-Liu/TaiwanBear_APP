package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class eastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_east);
    }
    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnHualien:
                intent.setClass(this, HualienActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnTaitung:
                intent.setClass(this, TaitungActivity.class);
                startActivity(intent);
                break;
        }
    }
}