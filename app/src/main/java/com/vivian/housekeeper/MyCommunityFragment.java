package com.vivian.housekeeper;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.vivian.housekeeper.data.ImageItem;
import com.vivian.housekeeper.util.GridViewAdapter;
import com.vivian.housekeeper.util.LocalImageLoader;
import com.vivian.housekeeper.util.MainImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class MyCommunityFragment extends Fragment {

    private GridView gridView;
    private GridViewAdapter gridAdapter;


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
        //set banner on the page top
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

        //set function on the down page
        gridView = (GridView) v.findViewById(R.id.gridView);
        gridAdapter = new GridViewAdapter(getActivity(), R.layout.function_item, getData());
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);
                //TODO: for every funtion detail page
                /*Create intent
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("title", item.getTitle());
                intent.putExtra("image", item.getImage());
                //Start details activity
                startActivity(intent);*/
            }
        });


        return v;
    }

    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        imageItems.add(new ImageItem(R.mipmap.maintain, "物业报修"));
        imageItems.add(new ImageItem(R.mipmap.notice, "小区公告"));
        imageItems.add(new ImageItem(R.mipmap.secondhand, "二手市场"));

        return imageItems;
    }

}