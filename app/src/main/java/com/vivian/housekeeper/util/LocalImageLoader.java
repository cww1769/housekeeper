package com.vivian.housekeeper.util;

import android.content.Context;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.vivian.housekeeper.R;
import com.youth.banner.loader.ImageLoader;

public class LocalImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object id, ImageView imageView) {
        imageView.setImageResource((int)id);
    }

}
