package com.example.gridviewdemo;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private Context context;
    String[] fruits;
    int[] icons = {
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
            R.drawable.p7,
            R.drawable.p8,
            R.drawable.p9
    };


    public GridAdapter(Context context) {
        this.context = context;
        fruits = context.getResources().getStringArray(R.array.fruits);
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View itemView = inflater.inflate(R.layout.item, null);
//
//        ImageView icon = (ImageView) itemView.findViewById(R.id.itemicon);
//        TextView label = (TextView) itemView.findViewById(R.id.itemlabel);
//
//        icon.setImageResource(icons[position]);
//        label.setText(fruits[position]);
//
//        return itemView;

        ImageView icon = new ImageView(context);
        icon.setImageResource(icons[position]);

        return icon;
    }
}
