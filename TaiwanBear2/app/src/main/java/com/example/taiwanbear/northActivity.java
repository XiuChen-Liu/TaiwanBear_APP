package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class northActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_north);
    }

    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnTaipei:
                intent.setClass(this,TaipeiActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnYilan:
                intent.setClass(this,YilanActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnNewtaipei:
                intent.setClass(this,NewtaipeiActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnKeelung:
                intent.setClass(this,KeelungActivity.class);
                startActivity(intent);
                break;

            case R.id.BtnTaoyuan:
                intent.setClass(this,TaoyuanActivity.class);
                startActivity(intent);
                break;

            case R.id.Btn11:
                intent.setClass(this,HsinchuActivity.class);
                startActivity(intent);
                break;

        }
    }
}