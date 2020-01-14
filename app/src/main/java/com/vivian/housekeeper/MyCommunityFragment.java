package com.vivian.housekeeper;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.vivian.housekeeper.util.LocalImageLoader;
import com.vivian.housekeeper.util.MainImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class MyCommunityFragment extends Fragment {



    public static MyCommunityFragment getInstance() {
        MyCommunityFragment cf = new MyCommunityFragment();
        return cf;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.community, null);

        Banner banner = (Banner) v.findViewById(R.id.banner);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.setImageLoader(new LocalImageLoader());
        List<Integer> images = new ArrayList<Integer>();
        images.add(R.mipmap.a);
        images.add(R.mipmap.b);
        images.add(R.mipmap.c);
        banner.setImages(images);
        banner.setBannerAnimation(Transformer.DepthPage);
        //banner.setBannerTitles(titles);
        banner.isAutoPlay(true);
        banner.setDelayTime(1500);
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.start();

        return v;
    }
}