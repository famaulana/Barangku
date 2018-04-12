package com.smktelkom.www.ta.Model;

import android.graphics.drawable.Drawable;

/**
 * Created by Farhan on 12/04/2018.
 */

public class BarangModel {
    public String barang, kelas, tanggal;
    public Drawable foto;

    public BarangModel(String barang, String tanggal, Drawable foto) {
        this.barang = barang;
        this.tanggal = tanggal;
        this.foto = foto;
    }
}
