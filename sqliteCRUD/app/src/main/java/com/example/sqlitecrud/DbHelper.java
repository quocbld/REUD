package com.example.sqlitecrud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    public  DbHelper    (Context context){
        super(context, "MOB2041", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "Create table Sinhvien(MaSV integer primary key autoincrement,"+ " TenSV text, Sodt text, Diachi text)";

        db.execSQL(sql);
        sql= "Insert Into Sinhvien Values (null, 'Nguyen Van Phuc', '5673890267','Da Nang')";
        db.execSQL(sql);
        sql= "Insert Into Sinhvien Values (null, 'Nguyen Van Phuc', '5673890267','Da Nang')";
        db.execSQL(sql);
        sql= "Insert Into Sinhvien Values (null, 'Nguyen Van Phuc', '5673890267','Da Nang')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists Sinhvien");
        onCreate(db);

    }
}
