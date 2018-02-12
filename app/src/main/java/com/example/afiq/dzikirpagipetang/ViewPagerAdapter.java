package com.example.afiq.dzikirpagipetang;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by afiq on 2/7/18.
 */

public class ViewPagerAdapter extends PagerAdapter {
    String arab[];

    String arti[];
    Context context;
    LayoutInflater inflater;

    public ViewPagerAdapter(Dzikir_pagiActivity dzikir_pagiActivity, String[] arab, Integer[] gambar, String[] arti) {
        this.context = dzikir_pagiActivity;
        this.arab = arab;
        this.arti = arti;







    }

    @Override
    public int getCount() {
        return arab.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view ==((ConstraintLayout)object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_dzikir, container, false);

        TextView arb = (TextView) v.findViewById(R.id.arab);

        TextView art = (TextView) v.findViewById(R.id.arti);

        arb.setText(arab[position]);
        art.setText(arti[position]);
        ((ViewPager) container).addView(v);
        return v;
}
    //setiap kali kita scroll ke kanan atau ke kiri , layout sebelumnya harus di destroy supaya tidak menumpuk
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ConstraintLayout) object);
    } }

