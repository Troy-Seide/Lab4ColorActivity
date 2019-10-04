package edu.temple.lab_4_coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context Context;
    String[] Colors;

    public ColorAdapter(Context Context, String[] Colors) {
        this.Context = Context;
        this.Colors = Colors;
    }

    @Override
    public int getCount() {
        return Colors.length;
    }

    @Override
    public Object getItem(int pos) {
        return Colors[pos];
    }

    @Override
    public long getItemId(int pos) {
        return 0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup Parent) {
        TextView textView = new TextView(Context);
        textView.setText(Colors[pos]);
        textView.setBackgroundColor(Color.parseColor(Colors[pos]));
        return textView;
    }
}
