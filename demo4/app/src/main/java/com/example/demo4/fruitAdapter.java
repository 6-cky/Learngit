package com.example.demo4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.nio.file.attribute.FileTime;
import java.util.List;

public class fruitAdapter extends ArrayAdapter<Fruit> {
    private final int resourceId;
    private FileTime LayoutInflater;

    public fruitAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        {
            Fruit fruit = getItem(position);
            View view = android.view.LayoutInflater.from(getContext()).inflate(resourceId, parent,false);
        }
        }




