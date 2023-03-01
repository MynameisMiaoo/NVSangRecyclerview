package com.example.buoi05;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private Context context;
    private List<Obj> arraystr;

    public WordListAdapter(Context context, List<Obj> arraystr) {
        this.context = context;
        this.arraystr = arraystr;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        Obj mCurrent = arraystr.get(position);
        holder.wordItemView.setText(mCurrent.getTitle());
        holder.imageView.setImageResource(mCurrent.getSrc());
        holder.sub.setText(mCurrent.getSub());
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NextAc(mCurrent);
            }

            private void NextAc(Obj mCurrent) {
                Intent intent = new Intent(context,MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("objobj",mCurrent);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arraystr.size();
    }

    public  class WordViewHolder extends RecyclerView.ViewHolder{
        private final WordListAdapter mAdapter;
        TextView wordItemView;
        ImageView imageView;
        TextView sub;
        ConstraintLayout constraintLayout;
        public WordViewHolder(@NonNull View itemView,WordListAdapter adapter) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.constraint);
            wordItemView = itemView.findViewById(R.id.word);
            imageView = itemView.findViewById(R.id.image);
            sub = itemView.findViewById(R.id.Sub_Image);
            this.mAdapter = adapter;
        }
    }
}
