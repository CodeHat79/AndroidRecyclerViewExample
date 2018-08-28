package com.example.codehat79.recycleviewsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
     String [] country;
    String [] courrency ;
    Context context;

    public Adapter(Context appcontext,  String [] country,  String [] currency) {
        context = appcontext;
        this.country = country;
        this.courrency = currency;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.currencylayout, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
         holder.C.setText(country[position]);
         holder.Cu.setText(courrency[position]);
    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView C, Cu;// init the item view's


        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            C = (TextView) itemView.findViewById(R.id.textViewCountry);
            Cu = (TextView) itemView.findViewById(R.id.textViewCurrency);
        }
    }
}
