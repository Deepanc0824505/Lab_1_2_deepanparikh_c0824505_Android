package com.example.lab_1_2_deepanparikh_c0824505_android.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {Product.class}, version = 1)
public abstract class ProductDatabase extends RoomDatabase {
    public abstract ProductDao productDao();

}
