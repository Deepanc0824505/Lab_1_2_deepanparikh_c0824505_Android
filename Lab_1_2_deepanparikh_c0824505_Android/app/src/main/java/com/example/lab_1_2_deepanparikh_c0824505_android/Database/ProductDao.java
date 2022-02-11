package com.example.lab_1_2_deepanparikh_c0824505_android.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("SELECT * FROM product")
    List<Product> getAll();

    @Query("SELECT * FROM product WHERE uid IN (:id)")
    Product loadAllByProductids(int id);

    @Query("SELECT uid FROM product")
    List<Integer> getallids();

    @Query("SELECT productname FROM product")
    List<String> getallproducts();

    @Query("SELECT productdescription FROM product")
    List<String> getallprodescription();

    @Query("SELECT productprice FROM product")
    List<Double> getallprodprice();

    @Insert
    void insertAll(Product... products);

    @Insert
    void insertProduct(Product product);

    @Insert
    void insertProducts(List<Product> products);

    @Update
    void updateProduct(Product product);

    @Delete
    void delete(Product product);

    @Query("DELETE FROM product WHERE uid IN (:id)")
    void deleteproductbyuid(int id);
}
