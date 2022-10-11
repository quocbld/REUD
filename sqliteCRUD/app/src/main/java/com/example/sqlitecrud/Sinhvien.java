package com.example.sqlitecrud;

public class Sinhvien {
    private int maSV;
    private String tenSV;
    private String Sodt;
    private String Diachi;

    public Sinhvien(int maSV, String tenSV, String sodt, String diachi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        Sodt = sodt;
        Diachi = diachi;
    }

    @Override
    public String toString() {
        return tenSV+ "_"+ Sodt;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getSodt() {
        return Sodt;
    }

    public void setSodt(String sodt) {
        Sodt = sodt;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
