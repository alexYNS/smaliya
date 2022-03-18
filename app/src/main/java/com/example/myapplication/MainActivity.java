package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Context context;

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    {
        context = getApplicationContext();
    }

    PopupMenu popupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initEvent();

    }

    //事件初始化
    public void initEvent() {
        EventList EventList = new EventList();
        EventList.context = context;
        TextView SET_DATA_SET = findViewById(R.id.setDataSet);
        TextView SET_INPUT_NUM = findViewById(R.id.setInputNum);
        TextView SET_INPUT_STYLE = findViewById(R.id.setInputViewStyle);
        final TextView Labl_i = findViewById(R.id.LABL_I);

        SET_DATA_SET.setOnClickListener(EventList);
        SET_INPUT_NUM.setOnClickListener(EventList);
        SET_INPUT_STYLE.setOnClickListener(EventList);
        Labl_i.setOnClickListener(EventList);
    }
}