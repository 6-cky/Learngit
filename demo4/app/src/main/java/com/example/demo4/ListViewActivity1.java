package com.example.demo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewActivity1 extends AppCompatActivity {
    private List<Fruit>  fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        intFruits();
        fruitAdapter myfruitAdapter = new fruitAdapter(ListViewActivity1.this,
                R.layout.fruit_item, fruitList);
                ListView listView=findViewById(R.id.list_view);
                listView.setAdapter(myfruitAdapter);



    }

    private void intFruits(){
        Fruit apple= new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple);
    }
}