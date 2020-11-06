package com.example.demo5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import static com.example.demo5.R.layout.layout_test;

public class layout extends AppCompatActivity  implements OnClickListener {
     Button btn_register;
     Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout_test);

        btn_register=findViewById(R.id.btn_register);
        btn_login=findViewById(R.id.btn_login);

        btn_register.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register:
                Toast.makeText(layout.this,"新用户注册",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_login:
                AlertDialog.Builder alerBuider=new AlertDialog.Builder(layout.this);
                alerBuider.setIcon(R.mipmap.ic_launcher);
                alerBuider.setTitle("用户登录确认");
             alerBuider.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int i) {
                     Toast.makeText(layout.this,"登录成功！",Toast.LENGTH_LONG).show();

                 }
             });
             alerBuider.setPositiveButton("取消", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int i) {
                     Toast.makeText(layout.this,"登录失败！",Toast.LENGTH_LONG).show();
                 }
             });
             AlertDialog myAlert=alerBuider.create();
             myAlert.show();
               break;
            default:
                break;



             }
        }

    }
