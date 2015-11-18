package com.example.okdownload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;



public class MainActivity extends AppCompatActivity {

    @Bind(R.id.lv_game)
    ListView mLvGame;

    private List<FileInfo> mFileList = new ArrayList<>();
    private FileListAdapter mFileListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
