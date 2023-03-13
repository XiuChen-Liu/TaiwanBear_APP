package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class centralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_central);
    }

    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnMiaoli:
                intent.setClass(this, MiaoliActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnNantou:
                intent.setClass(this, NantouActivity.class);
                startActivity(intent);
                break;

            case R.id.BtnTaichung:
                intent.setClass(this, TaichungActivity.class);
                startActivity(intent);
                break;

            case R.id.BtnChanghua:
                intent.setClass(this, ChanghuaActivity.class);
                startActivity(intent);
                break;

            case R.id.BtnYunlin:
                intent.setClass(this, YunlinActivity.class);
                startActivity(intent);
                break;
        }
    }
}