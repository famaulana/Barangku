package com.smktelkom.www.ta.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smktelkom.www.ta.Model.BarangModel;
import com.smktelkom.www.ta.R;

import java.util.ArrayList;


/**
 * Created by Farhan on 12/04/2018.
 */

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.ViewHolder> {
    ArrayList<BarangModel> barangModelList;

    public BarangAdapter(ArrayList<BarangModel> hotelList) {
        this.barangModelList = hotelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.basic_main_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BarangModel barangModel = barangModelList.get(position);
        holder.tvBarang.setText(barangModel.barang);
        holder.tvTanggal.setText(barangModel.tanggal);
        holder.ivFoto.setImageDrawable(barangModel.foto);
    }

    @Override
    public int getItemCount() {
        if (barangModelList != null)
            return barangModelList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvBarang, tvTanggal;
        public ImageView ivFoto;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.imageView);
            tvBarang = itemView.findViewById(R.id.textViewBarang);
            tvTanggal = itemView.findViewById(R.id.textViewTanggal);
        }
    }
}