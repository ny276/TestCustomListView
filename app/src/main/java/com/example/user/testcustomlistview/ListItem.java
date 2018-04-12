package com.example.user.testcustomlistview;

import android.graphics.drawable.Drawable;

/**
 * Created by user on 2018-04-10.
 */

public class ListItem {
    private Drawable icon;
    private String title;
    private String explain;

    public Drawable getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getExplain() {
        return explain;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
