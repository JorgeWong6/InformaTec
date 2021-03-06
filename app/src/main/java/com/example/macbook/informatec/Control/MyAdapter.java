package com.example.macbook.informatec.Control;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macbook.informatec.Models.Events;
import com.example.macbook.informatec.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

Context context;
ArrayList<Events> events;


public MyAdapter (Context c,ArrayList<Events> e){

    context=c;
    events=e;
}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.content,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(events.get(position).getName());
        holder.ubication.setText(events.get(position).getUbication());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

    TextView name,ubication;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

         name = itemView.findViewById(R.id.text_name);
         ubication = itemView.findViewById(R.id.ubication);
    }

}

}
