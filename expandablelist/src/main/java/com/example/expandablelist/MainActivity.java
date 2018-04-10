package com.example.expandablelist;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class MainActivity extends ExpandableListActivity {

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        adapter = new MyAdapter(this);
        setListAdapter(adapter);

    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

        Toast.makeText(this,
                "当前选择：" + adapter.getChild(groupPosition, childPosition),
                Toast.LENGTH_SHORT).show();

        return super.onChildClick(parent, v, groupPosition, childPosition, id);
    }
}
