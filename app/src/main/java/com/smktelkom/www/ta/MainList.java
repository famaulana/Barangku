package com.smktelkom.www.ta;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.smktelkom.www.ta.Adapter.BarangAdapter;
import com.smktelkom.www.ta.Model.BarangModel;

import java.util.ArrayList;

public class MainList extends AppCompatActivity {
    ArrayList<BarangModel> mList = new ArrayList<>();
    BarangAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new BarangAdapter(mList);
        fillData();
        recyclerView.setAdapter(mAdapter);
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arBarang = resources.getStringArray(R.array.places);
        String[] arTanggal = resources.getStringArray(R.array.place_desc);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        Drawable[] arFoto = new Drawable[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            arFoto[i] = a.getDrawable(i);

        }
        for (int i = 0; i < arBarang.length; i++) {
            mList.add(new BarangModel(arBarang[i], arTanggal[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }
}

