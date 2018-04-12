package com.smktelkom.www.ta.Adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Farhan on 12/04/2018.
 */

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public String tvbarang, tvkelas, tvtanggal;
        public Drawable ivfoto;

        public ViewHolder(View itemView) {
            super(itemView);
            ivfoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvbarang = (TextView) itemView.findViewById(R.id.textViewBarang);
            tvkelas = (TextView) itemView.findViewById(R.id.textViewKelas);
            tvtanggal = (TextView) itemView.findViewById(R.id.textViewTanggal);
        }
    }
}