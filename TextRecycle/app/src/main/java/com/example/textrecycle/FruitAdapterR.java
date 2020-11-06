package com.example.textrecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapterR extends RecyclerView.Adapter<FruitAdapterR.ViewHolderR> {
    private List<Fruit> mFruitList;
    public FruitAdapterR(List<Fruit> fruitList) {
        mFruitList = fruitList;
    }

    @NonNull
    @Override
    public ViewHolderR onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
        final ViewHolderR holderR = new ViewHolderR(view);

        holderR.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=holderR.getAdapterPosition();
                Fruit fruit=mFruitList.get(position);
                Toast.makeText(view.getContext(),"You Click view"+fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        holderR.fruitImage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int position = holderR.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(view.getContext(),"You Click view"+fruit.getName(),Toast.LENGTH_SHORT).show();

            }
        });
        return holderR;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderR holder, int position) {
        Fruit fruit=mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    static class ViewHolderR extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolderR(@NonNull View itemView) {
            super(itemView);
            fruitView=itemView;
            fruitImage = itemView.findViewById(R.id.fruit_item);
            fruitName = itemView.findViewById(R.id.fruit_name);
        }
    }

}
