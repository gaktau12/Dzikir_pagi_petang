package com.example.afiq.dzikirpagipetang;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by afiq on 2/8/18.
 */

public class ViewPagerAdapterSore extends PagerAdapter {

    String arabsore[];
    String artisore[];
    Context context;
    LayoutInflater inflater;

    public ViewPagerAdapterSore(Dzikir_soreActivity dzikir_soreActivity, String[] arabsore, Integer[] gambarsore, String[] arti) {
        this.context = dzikir_soreActivity;
        this.arabsore = arabsore;
        this.artisore = arti;
    }

    @Override
    public int getCount() {
        return arabsore.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return  view == ((ConstraintLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_dzikir, container, false);

        TextView arbsr = (TextView) v.findViewById(R.id.arab);

        TextView artsr = (TextView) v.findViewById(R.id.arti);

        arbsr.setText(arabsore[position]);
        artsr.setText(artisore[position]);
        ((ViewPager) container).addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView((ConstraintLayout)object);
    }
}
