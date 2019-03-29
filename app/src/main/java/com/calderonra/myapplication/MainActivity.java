package com.calderonra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout botonCont1,botonCont2,botonCont3,botonCont4,botonCont5,botonCont6,botonCont7,botonCont8,botonCont9;
    private EditText mUser,mPass;
    private Button mSend;
    private Integer contadorGlobal=0,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,cont7=0,cont8=0,cont9=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCont1=findViewById(R.id.boton1);
        botonCont2=findViewById(R.id.boton2);
        botonCont3=findViewById(R.id.boton3);
        botonCont4=findViewById(R.id.boton4);
        botonCont5=findViewById(R.id.boton5);
        botonCont6=findViewById(R.id.boton6);
        botonCont7=findViewById(R.id.boton7);
        botonCont8=findViewById(R.id.boton8);
        botonCont9=findViewById(R.id.boton9);

        botonCont1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada1;
                String str_entrada1;

                TextView numero1 = findViewById(R.id.texto1);

                n_entrada1=Integer.parseInt(numero1.getText().toString());
                n_entrada1+=1;
                contadorGlobal+=1;
                cont1=n_entrada1;

                str_entrada1=Integer.toString(n_entrada1);

                numero1.setText(str_entrada1);


            }
        });

        botonCont2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto2);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont2=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);


                numero2.setText(str_entrada2);


            }
        });
        botonCont3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto3);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont3=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);

                numero2.setText(str_entrada2);


            }
        });
        botonCont4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto4);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont4=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);

                numero2.setText(str_entrada2);


            }
        });

        botonCont5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto5);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont5=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);

                numero2.setText(str_entrada2);


            }
        });

        botonCont6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto6);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont6=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);

                numero2.setText(str_entrada2);


            }
        });
        botonCont7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto7);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont7=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);

                numero2.setText(str_entrada2);


            }
        });

        botonCont8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto8);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont8=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);

                numero2.setText(str_entrada2);


            }
        });
        botonCont9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_entrada2;
                String str_entrada2;

                TextView numero2 = findViewById(R.id.texto9);

                n_entrada2=Integer.parseInt(numero2.getText().toString());
                n_entrada2+=1;
                contadorGlobal+=1;
                cont9=n_entrada2;

                str_entrada2=Integer.toString(n_entrada2);

                numero2.setText(str_entrada2);


            }
        });

        mUser=findViewById(R.id.user);
        mPass=findViewById(R.id.pass);
        mSend=findViewById(R.id.send);

        mSend.setOnClickListener(v->{
            String conta1=cont1.toString();
            String conta2=cont2.toString();
            String conta3=cont3.toString();
            String conta4=cont4.toString();
            String conta5=cont5.toString();
            String conta6=cont6.toString();
            String conta7=cont7.toString();
            String conta8=cont8.toString();
            String conta9=cont9.toString();


            String total=contadorGlobal.toString();
            String username = mUser.getText().toString();
            String password = mPass.getText().toString();

            Intent mIntent= new Intent(this, Main2Activity.class);

            mIntent.putExtra(AppConstant.USER_KEY,username);
            mIntent.putExtra(AppConstant.PASS_KEY,password);
            mIntent.putExtra(AppConstant.TOTAL,total);
            mIntent.putExtra(AppConstant.CONTA1,conta1);
            mIntent.putExtra(AppConstant.CONTA2,conta2);
            mIntent.putExtra(AppConstant.CONTA3,conta3);
            mIntent.putExtra(AppConstant.CONTA4,conta4);
            mIntent.putExtra(AppConstant.CONTA5,conta5);
            mIntent.putExtra(AppConstant.CONTA6,conta6);
            mIntent.putExtra(AppConstant.CONTA7,conta7);
            mIntent.putExtra(AppConstant.CONTA8,conta8);
            mIntent.putExtra(AppConstant.CONTA9,conta9);


            startActivity(mIntent);

        });


    }

}
