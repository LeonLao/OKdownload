package com.example.okdownload;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by jack on 2015/11/18.
 */
public abstract class CommonBaseAdapter <VH extends CommonBaseAdapter.ViewHolder,T>extends BaseAdapter{
    protected Context mContext;
    protected MyHttpCycleContext mHttpCycleContext;
    protected List<T> mList;
    public LayoutInflater mInflater;

    protected ProgressDialog mProgressDialog;

    public  CommonBaseAdapter(MyHttpCycleContext context,List<T> list){
        this.mHttpCycleContext =context;
        this.mContext = context.getContext();
        this.mList = list;
        this.mInflater = LayoutInflater.from(mContext);
    }

//    public CommonBaseAdapter() {
//        super();
//    }

    @Override
    public int getCount() {
        return this.mList.size();
    }

    @Override
    public T getItem(int position) {
        return this.mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        VH holder = null;
        if (convertView ==null){
            holder = onCreateViewHolder(parent,position);
            holder.view.setTag(holder);
        }else {
            holder =(VH) convertView.getTag();
        }
        onBindViewHolder(holder,position);
        return holder.view;
    }
    public View inflate(int resLayout,ViewGroup parent){
        return mInflater.inflate(resLayout,parent,false);
    }

    public  abstract  VH onCreateViewHolder(ViewGroup parent,int position);
    public  abstract void onBindViewHolder(VH holder,int position);

    public static class ViewHolder {
        View view;
        public  ViewHolder(View view){
            this.view = view;
            ButterKnife.bind(this,view);

        }
    }
}



























