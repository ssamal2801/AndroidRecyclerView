package com.swagatsamal.androidrecycerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //recycler view declared
    RecyclerView recyclerView;

    //method invoked when the app loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycler view initiated
        recyclerView = findViewById(R.id.recyclerView);
        //set a vertical line below each row for better visibility
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL));

        //Array of records
        int[] ids = {1,2,3,4,5,6,7,8,9,10};
        String[] productName = {"Assasin Cred V1","Assasin Cred V2","Assasin Cred V3","Assasin Cred V4","Assasin Cred V5","Assasin Cred V6","Assasin Cred V7","Assasin Cred V8","Assasin Cred V9","Assasin Cred V10",};
        double[] price = {10,10,10,10,10,10,10,10,10,10};
        int[] productImage = {R.raw.one, R.raw.two,R.raw.three,R.raw.four,R.raw.five,R.raw.six,R.raw.seven,R.raw.eight,R.raw.nine,R.raw.ten};

        //List to hold records
        List<recordPOJO> records = new ArrayList<>();


        //loop through the arrays and store 10 records in list
        for (int index = 0; index < ids.length; index++) {
            //recordPOJO object created inside for loop so old data is deleted from the object
            recordPOJO recordPOJO = new recordPOJO();
            recordPOJO.setProductID(ids[index]);
            recordPOJO.setProductName(productName[index]);
            recordPOJO.setPrice(price[index]);
            recordPOJO.setProductImage(productImage[index]);
            records.add(recordPOJO);
            Log.i("Record",records.get(index).productName);
        }

        //Custom adapter class object created and initiated
        AdapterConversion adapterConversion = new AdapterConversion(MainActivity.this,records);
        recyclerView.setAdapter(adapterConversion);//adapter set
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));//layout manager set
    }
}