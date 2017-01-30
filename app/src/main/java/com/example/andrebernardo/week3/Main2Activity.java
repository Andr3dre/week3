package com.example.andrebernardo.week3;

import android.content.Intent;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

   Botton btn=(Botton)findViewById(R.id.btn_activity2);
        btn.setOnClickListener(new OnClickListener);
    }
    public void mOnClick(View view) {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
