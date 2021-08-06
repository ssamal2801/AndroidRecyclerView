package com.swagatsamal.androidrecycerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterConversion extends RecyclerView.Adapter<AdapterConversion.ViewHolder> {

    Context context;
    List<recordPOJO> items;

    public AdapterConversion(Context context, List<recordPOJO> items)
    {
        this.context = context;
        this.items = items;
    }

    //finally inflate the view
    //display all the records
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent, false);
        return new ViewHolder(view);
    }

    //bind the record to the view
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(items.get(position).toString());
        holder.imageView.setImageResource(items.get(position).getProductImage());
    }

    //This method will return the number of records in the result set
    //makes sure the number of rows in recycler view is equal to the number of record in result set
    @Override
    public int getItemCount() {
        return items.size();
    }

    //initiate the text view which acts as container for each record
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView = itemView.findViewById(R.id.textView);
        ImageView imageView = itemView.findViewById(R.id.imageView);
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
