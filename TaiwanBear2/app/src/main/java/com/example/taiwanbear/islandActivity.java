package com.example.taiwanbear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class islandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_island);

    }
    public void actionPerformed(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.BtnPenghu:
                intent.setClass(this, PenghuActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnJinmen:
                intent.setClass(this, JinmenActivity.class);
                startActivity(intent);
                break;

            case R.id.BtnMazu:
                intent.setClass(this, MazuActivity.class);
                startActivity(intent);
                break;
        }
    }
}