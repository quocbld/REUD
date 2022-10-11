package com.example.sqlitecrud;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class SinhvienDao {
    public  static ArrayList<Sinhvien> getAll (Context context){
        ArrayList<Sinhvien> ds =  new ArrayList<>();
        DbHelper helper = new DbHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cs = db.rawQuery("Select * from Sinhvien", null);
        cs.moveToFirst();
        while (!cs.isAfterLast()){
            int ma = cs.getInt(0);
            String ten = cs.getString(1);
            String sdt = cs.getString(2);
            String dc = cs.getString(3);
            Sinhvien sv = new Sinhvien(ma, ten, sdt,dc);
            ds.add(sv);
            cs.moveToNext();

        }
        cs.close();
        db.close();
        return ds;
    }
    public static void insert (Context context, String ten, String sodt, String diachi){

    }
}
