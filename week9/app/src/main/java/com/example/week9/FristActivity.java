package com.example.week9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FristActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        Log.d("cky","FristActivity 的 onCreat()函数被调用");

        Button btn1=findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /* Intent intent1=new Intent(FristActivity.this,SecondActivity.class);
                startActivity(intent1);*/
           /*  Intent intent1=new Intent("com.example.week9.ONE_ACTION");
              intent1.addCategory("android.intent.category.DEFAULT");
              startActivity(intent1);*/

               /* Intent intent1=new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:10086"));
                startActivity(intent1);*/
              /* Intent intent1=new Intent(Intent.ACTION_VIEW);
               intent1.setData(Uri.parse(("https:www.baidu.com")));
               startActivity(intent1);*/

             /* String data="hello word";
              Intent intent=new Intent(FristActivity.this,SecondActivity.class);
              intent.putExtra("hello",data);
              intent.putExtra("id",123);
              startActivityForResult(intent,1);*/
             Bundle bundle=new Bundle();
             bundle.putString("name","ckyhh");
             bundle.putInt("id",123);
             Intent intent=new Intent(FristActivity.this,SecondActivity.class);
             intent.putExtra("message",bundle);
             startActivity(intent);
                }


        });
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (requestCode==1){
                    String returnedData=data.getStringExtra("data_return");
                    Log.d("cky",returnedData);
                }
        }
    }*/
}