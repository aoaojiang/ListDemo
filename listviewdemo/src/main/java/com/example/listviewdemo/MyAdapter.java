package com.example.listviewdemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.annotation.*;

public class MyAdapter extends BaseAdapter {

    Context context;
    String[] fruits;
    int[] icons = {
            android.R.drawable.btn_plus,
            android.R.drawable.btn_plus + 1,
            android.R.drawable.btn_plus + 2,
            android.R.drawable.btn_plus + 3,
            android.R.drawable.btn_plus + 4
    };

    public MyAdapter(Context context) {
        this.context = context;

        fruits = context.getResources().getStringArray(R.array.fruits);

    }

    @Override
    public int getCount() {
        return fruits.length;
    }

    @Override
    public Object getItem(int position) {
        return fruits[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView label = new TextView(context);
        label.setText(fruits[position]);
        Drawable icon = context.getResources().getDrawable(icons[position], null);
        icon.setBounds(0, 0, 32, 32);
        label.setCompoundDrawables(icon, null, null, null);

//        Button button = new Button(context);
//        button.setText(fruits[position]);
//        Drawable icon = context.getResources().getDrawable(icons[position], null);
//        icon.setBounds(0, 0, 32, 32);
//        button.setCompoundDrawables(icon, null, null, null);
//
//        return button;

        return label;
    }
}
