package com.example.lab_1_2_deepanparikh_c0824505_android.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "product")
public class Product {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "productname")
    public String productname;

    @ColumnInfo(name = "productdescription")
    public String productdescription;

    @ColumnInfo(name = "productprice")
    public double productprice;

    @ColumnInfo(name = "providerlat")
    public double latitude;

    @ColumnInfo(name = "providerlon")
    public double longitude;

    public Product(int uid, String productname, String productdescription, double productprice,
                   Double latitude, Double longitude) {
        this.uid = uid;
        this.productname = productname;
        this.productdescription = productdescription;
        this.productprice = productprice;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getUid() {
        return uid;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public double getProductprice() {
        return productprice;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
