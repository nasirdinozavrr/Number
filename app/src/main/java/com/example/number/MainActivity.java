package com.example.number;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        NumberAdapter adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);
        numbers = new ArrayList<>();
        loadDate();
        }

    private  void loadDate(){
        numbers=new ArrayList<>();
        numbers.add("0707382988");
        numbers.add("0707886534");
        numbers.add("0706968484");
        numbers.add("0703555687");
        numbers.add("0550987442");
        numbers.add("0700444256");
        numbers.add("0707545007");
        numbers.add("0555006655");
        numbers.add("0700220843");
        numbers.add("0505566789");
        numbers.add("0778489918");
        numbers.add("0771458899");
        numbers.add("0550051202");
        numbers.add("0700123856");
        numbers.add("0500127869");
        numbers.add("0707182031");
        numbers.add("0550100341");
    }
}