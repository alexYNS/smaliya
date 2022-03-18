package com.example.myapplication;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class EventList implements View.OnClickListener {
    PopupMenu popupMenu;

    Context context;

    @Override
    public void onClick(View view) {

        TextView tv = (TextView) view;

        switch (view.getId()) {
            case R.id.LABL_I:
                InitPopuMenu(tv);
                break;
            case R.id.LABL_W:
                break;
            case R.id.LABL_B:
                break;
            default:
                break;
        }
    }

    //事件处理
    public void InitPopuMenu(View view) {
        popupMenu = new PopupMenu(context, view);
        popupMenu.getMenuInflater().inflate(R.menu.main, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
            @Override
            public void onDismiss(PopupMenu menu) {
                //Toast.makeText(getApplicationContext(), "关闭PopupMenu", Toast.LENGTH_SHORT).show();
            }
        });

        popupMenu.show();
    }
}
