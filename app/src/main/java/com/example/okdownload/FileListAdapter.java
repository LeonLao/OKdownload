package com.example.okdownload;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import butterknife.Bind;

/**
 * Created by jack on 2015/11/17.
 */
public class FileListAdapter extends CommonBaseAdapter<FileListAdapter.FileListHolder,FileInfo>{
    public FileListAdapter(MyHttpCycleContext content,List<FileInfo> list){
        super(content,list);
    }

    @Override
    public FileListAdapter.FileListHolder onCreateViewHolder(ViewGroup parent, int position) {
        final FileInfo fileInfo = mList.get(position);
        return null;
    }

    @Override
    public void onBindViewHolder(FileListAdapter.FileListHolder holder, int position) {

    }
    static class FileListHolder extends CommonBaseAdapter.ViewHolder{
        @Bind(R.id.iv_game_icon)
        ImageView mIvFileIcon;
        
        public FileListHolder(View view) {
            super(view);
        }
    }
}
