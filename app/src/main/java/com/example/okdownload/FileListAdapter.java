package com.example.okdownload;

import android.app.DownloadManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import butterknife.ButterKnife;
import butterknife.Bind;



/**
 * Created by jack on 2015/11/17.
 */
public class FileListAdapter extends CommonBaseAdapter<FileListAdapter.FileListHolder,FileInfo>{


    public FileListAdapter(MyHttpCycleContext content,List<FileInfo> list){
        super(content,list);
    }

    @Override
    public FileListHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view = mInflater.inflate(R.layout.adapter_file_list_item,null);
        return new FileListHolder(view);
    }

    @Override
    public void onBindViewHolder(FileListAdapter.FileListHolder holder, int position) {
        final FileInfo fileInfo = mList.get(position);
        holder.mTvGameName.setText(fileInfo.getFileName());
        if (){

        }

    }
    static class FileListHolder extends CommonBaseAdapter.ViewHolder{
        @Bind(R.id.iv_game_icon)
        ImageView mIvGameIcon;
        @Bind(R.id.tv_game_name)
        TextView mTvGameName;
        @Bind(R.id.btn_download)
        Button mBtnDownload;
        
        public FileListHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);
        }
    }
}












