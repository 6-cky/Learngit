package com.example.textrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

public class RecyclerviewActivity02<getRandomLengthName> extends AppCompatActivity {
    private List<Fruit>fruitList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview01);
        
        intiFruitsS();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);

        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterR adapter=new FruitAdapterR(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void intiFruitsS() {
        for (int i = 0; i < 3; i++) {
            Fruit apple = new Fruit(getRandomLengthName("Apple"), R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("Banana"), R.drawable.banana);
            fruitList.add(banana);
            Fruit grape = new Fruit(getRandomLengthName("Grape"), R.drawable.grape);
            fruitList.add(grape);
            Fruit lemon = new Fruit(getRandomLengthName("Lemon"), R.drawable.lemon);
            fruitList.add(lemon);
            Fruit mango = new Fruit(getRandomLengthName("Mango"), R.drawable.mango);
            fruitList.add(mango);
            Fruit orange = new Fruit(getRandomLengthName("Orange"), R.drawable.orange);
            fruitList.add(orange);
            Fruit peach = new Fruit(getRandomLengthName("Peach"), R.drawable.peach);
            fruitList.add(peach);
            Fruit pear = new Fruit(getRandomLengthName("Pear"), R.drawable.pear);
            fruitList.add(pear);
            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry);
            fruitList.add(strawberry);

        }
        }


      private  String getRandomLengthName(String name) {
          Random random = new Random();
          int length = random.nextInt(10) + 1;
          StringBuilder builder = new StringBuilder();
          for (int j = 0; j < length; j++) {
              builder.append(name);
          }
          return builder.toString();
      }


     }


