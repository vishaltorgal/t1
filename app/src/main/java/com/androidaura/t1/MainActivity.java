package com.androidaura.t1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText uname,pwd;
    String et_uname,et_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uname= findViewById(R.id.uname);
        pwd= findViewById(R.id.pwd);
        submit= findViewById(R.id.submit);


        submit.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                et_uname = uname.getText().toString();
                et_pwd = pwd.getText().toString();

                if(et_uname.equals("abc") && et_pwd.equals("asd123")){
                   // Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(i);


                }else{
                    Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}

