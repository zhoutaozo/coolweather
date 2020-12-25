package com.example.Coolweather.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.Coolweather.MainActivity;
import com.example.Coolweather.R;

public class LoginActivity extends AppCompatActivity {
    EditText edt1;
    EditText edt2;
    Toast mtoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init(){
        Button btn_login = findViewById(R.id.btn_login);
        Button btn_quit = findViewById(R.id.btn_quit);

        final EditText edt1 = findViewById(R.id.edt1);
        final EditText edt2 = findViewById(R.id.edt2);

        btn_login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String username= edt1.getText().toString().trim();
                String password = edt2.getText().toString().trim();
                if (TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){
                    Toast.makeText(LoginActivity.this,"账号密码不能为空!!",Toast.LENGTH_LONG).show();

                }else if (TextUtils.equals(username,"41806432")||TextUtils.equals(password,"123")){
                    Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"登陆失败",Toast.LENGTH_LONG).show();
                }

            }

        }
        );

        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}