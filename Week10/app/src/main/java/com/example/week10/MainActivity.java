package com.example.week10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.Button);
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());}




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Button:
                replaceFragment(new RightFragment2());
                break;
            default:
                break;



    }
}

    private void replaceFragment(Fragment Fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout,Fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    }