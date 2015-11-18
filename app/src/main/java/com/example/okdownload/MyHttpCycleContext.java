package com.example.okdownload;

import android.content.Context;

import OkHttpFinal.src.main.java.cn.finalteam.okhttpfinal.HttpCycleContext;

/**
 * Created by jack on 2015/11/18.
 */
public interface MyHttpCycleContext extends HttpCycleContext{
    Context getContext();

}
