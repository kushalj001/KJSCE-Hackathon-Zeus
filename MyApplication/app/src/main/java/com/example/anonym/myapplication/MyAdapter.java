package com.example.anonym.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Listitem> listItems;
    private Context context;

    public MyAdapter(List<Listitem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {
        Listitem listitem = listItems.get(i);
        viewHolder.textViewhead.setText(listitem.getHead());
        viewHolder.textViewdesc.setText(listitem.getDesc());
    }

    @Override
    public int getItemCount() {

        return listItems.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{


        public TextView textViewhead;
        public TextView textViewdesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewhead=(TextView)itemView.findViewById(R.id.tvheading);
            textViewdesc=(TextView)itemView.findViewById(R.id.tvdesc);
        }
    }
}
