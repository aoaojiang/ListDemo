package com.example.expandablelist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseExpandableListAdapter {

    private Context context;
    String[] sanguo, weiguo, shuguo, wuguo;

    public MyAdapter(Context context) {
        this.context = context;
        sanguo = context.getResources().getStringArray(R.array.sanguo);
        weiguo = context.getResources().getStringArray(R.array.weiguo);
        shuguo = context.getResources().getStringArray(R.array.shuguo);
        wuguo = context.getResources().getStringArray(R.array.wuguo);

    }

    @Override
    public int getGroupCount() {
        return sanguo.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        switch (groupPosition) {
            case 0:
                return weiguo.length;
            case 1:
                return shuguo.length;
            case 2:
                return wuguo.length;
        }

        return 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return sanguo[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        switch (groupPosition) {
            case 0:
                return weiguo[childPosition];
            case 1:
                return shuguo[childPosition];
            case 2:
                return wuguo[childPosition];
        }

        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        TextView label = new TextView(context);

        label.setText(sanguo[groupPosition]);
        label.setTextSize(24);
        label.setPadding(50, 5, 0, 5);
        return label;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        TextView label = new TextView(context);

        switch (groupPosition) {
            case 0:
                label.setText(weiguo[childPosition]);
                break;
            case 1:
                label.setText(shuguo[childPosition]);
                break;
            case 2:
                label.setText(wuguo[childPosition]);
                break;
        }

        label.setTextSize(16);
        label.setPadding(100, 3, 0, 3);
        return label;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
