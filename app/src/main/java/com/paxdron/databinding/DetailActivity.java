package com.paxdron.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.paxdron.databinding.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Product product= new Product("1","Producto","Es un producto de calidad",4.20);
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_detail);
        binding.setProduct(product);

    }
}
