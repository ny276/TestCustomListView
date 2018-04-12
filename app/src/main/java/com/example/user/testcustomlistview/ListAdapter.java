package com.example.user.testcustomlistview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 2018-04-10.
 */

public class ListAdapter extends BaseAdapter {
    ArrayList<ListItem> arrayList = new ArrayList<ListItem>();
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final int pos = i;
        final Context context = viewGroup.getContext();

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listitem, viewGroup, false);
        }

        ImageView icon = view.findViewById(R.id.icon);
        TextView title = view.findViewById(R.id.title);
        TextView explain = view.findViewById(R.id.explain);

        ListItem li = arrayList.get(pos);
        icon.setImageDrawable(li.getIcon());
        title.setText(li.getTitle());
        explain.setText(li.getExplain());


        return view;
    }
    public void addItem(Drawable icon, String title, String explain){
        ListItem li = new ListItem();
        li.setIcon(icon);
        li.setTitle(title);
        li.setExplain(explain);
        arrayList.add(li);
    }

}
