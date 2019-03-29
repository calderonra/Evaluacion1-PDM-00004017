package com.calderonra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mUser,mPass,mTotal,mContador1,mContador2,mContador3,mContador4,mContador5,mContador6,mContador7,mContador8,mContador9;
    private Button mSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mUser=findViewById(R.id.usuario2);
        mPass=findViewById(R.id.contra2);
        mTotal=findViewById(R.id.total);
        mContador1=findViewById(R.id.textoF1);
        mContador2=findViewById(R.id.textoF2);
        mContador3=findViewById(R.id.textoF3);
        mContador4=findViewById(R.id.textoF4);
        mContador5=findViewById(R.id.textoF5);
        mContador6=findViewById(R.id.textoF6);
        mContador7=findViewById(R.id.textoF7);
        mContador8=findViewById(R.id.textoF8);
        mContador9=findViewById(R.id.textoF9);



        Intent mIntent= getIntent();

        mUser.setText(mIntent.getStringExtra(AppConstant.USER_KEY));
        mPass.setText(mIntent.getStringExtra(AppConstant.PASS_KEY));
        mTotal.setText(mIntent.getStringExtra(AppConstant.TOTAL));


        mContador1.setText(mIntent.getStringExtra(AppConstant.CONTA1));
        mContador2.setText(mIntent.getStringExtra(AppConstant.CONTA2));
        mContador3.setText(mIntent.getStringExtra(AppConstant.CONTA3));
        mContador4.setText(mIntent.getStringExtra(AppConstant.CONTA4));
        mContador5.setText(mIntent.getStringExtra(AppConstant.CONTA5));
        mContador6.setText(mIntent.getStringExtra(AppConstant.CONTA6));
        mContador7.setText(mIntent.getStringExtra(AppConstant.CONTA7));
        mContador8.setText(mIntent.getStringExtra(AppConstant.CONTA8));
        mContador9.setText(mIntent.getStringExtra(AppConstant.CONTA9));







    }
}
