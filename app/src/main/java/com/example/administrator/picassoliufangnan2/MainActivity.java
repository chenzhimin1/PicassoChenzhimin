package com.example.administrator.picassoliufangnan2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Downloader;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.UrlConnectionDownloader;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView mImgeView;
        mImgeView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(this)
                .load("http://img05.tooopen.com/images/20150802/tooopen_sy_136394976445.jpg")
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)//设置不使用内存缓存中查找也不存储内存缓存
               // .networkPolicy(NetworkPolicy.NO_CACHE, NetworkPolicy.NO_STORE)//不在磁盘中缓存，但是会在内存中缓存
                .priority(Picasso.Priority.HIGH)//实现高优先级加载
                .into(mImgeView);
        Picasso.with(this).setIndicatorsEnabled(true);


    }




}

