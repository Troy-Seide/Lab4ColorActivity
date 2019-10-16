package edu.temple.lab_4_coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Locale;

public class ColorAdapter extends BaseAdapter {
    Context Context;
    String[] engcolorarray;
    String[] spancolorarray;

    public ColorAdapter(Context Context, String[] engcolorarray, String[] spancolorarray) {
        this.Context = Context;
        this.engcolorarray = engcolorarray;
        this.spancolorarray=spancolorarray;
    }

    @Override
    public int getCount() {

        return engcolorarray.length;
    }

    @Override
    public Object getItem(int pos) {

        return engcolorarray[pos];
    }

    @Override
    public long getItemId(int pos) {

        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup Parent) {
        /*
        TextView textView = new TextView(Context);
        textView.setText(Colors[pos]);
        textView.setBackgroundColor(Color.parseColor(Colors[pos]));
        return textView;
        */

        TextView text;
        Locale localegetter=Locale.getDefault();
        String backgroundColor;
        String col2;
        String backgroundColor2;
        if(view instanceof TextView){
            text = new TextView(Context);
        }
        else{
            text= new TextView(Context);
        }
        backgroundColor=engcolorarray[pos];
        col2=spancolorarray[pos];
        backgroundColor2 = engcolorarray[pos];

        if(localegetter.getLanguage()=="en"){
            text.setText(backgroundColor);
        }
        else{
            text.setText(col2);
        }
        text.setBackgroundColor(Color.parseColor(backgroundColor2));
        //textView.setText(Colors2[pos]);
        //textView.setBackgroundColor(Color.parseColor(Colors[pos]));
        return text;

    }
}
