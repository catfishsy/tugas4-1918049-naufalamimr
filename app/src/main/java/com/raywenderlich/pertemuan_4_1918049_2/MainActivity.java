package com.raywenderlich.pertemuan_4_1918049_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    String[] Name = {"Red Eyes Black Dragon","Blue Eyes Shinning Dragon","Dark Magician","Lord of The Red","Palladium Oracle Mahad","Silent Magician"};
    String[] type = {"Dragon","Dragon","Spellcaster","Dragon","Spellcaster","Spellcaster"};
    String[] attribute = {"Dark","Light","Dark","Dark","Light","Light"};
    int[] images = {R.drawable.redeyes,R.drawable.blueshinnind,R.drawable.darkmagician,R.drawable.lordofthered,R.drawable.mahad,R.drawable.silentmagician};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        for (int i = 0;i<Name.length;i++) {
            mahasiswaArrayList.add(new Mahasiswa(Name[i],type[i],attribute[i],images[i]));
        }
    }
}