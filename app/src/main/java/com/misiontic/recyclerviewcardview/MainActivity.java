package com.misiontic.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement(  "Pedro", "Mexico", "Activo"));
        elements.add(new ListElement(  "Julio", "Tabasco", "Activo"));
        elements.add(new ListElement(  "Alejandra", "Chihuahua", "Activo"));
        elements.add(new ListElement(  "Jessica", "Durango", "Inactivo"));
        elements.add(new ListElement(  "Armando", "Yucatan", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements,this);
        RecyclerView recyclerview = findViewById(R.id.listRecyclerView);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(listAdapter);


    }
}