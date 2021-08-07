package com.huantansheng.easyphotos.models.ad;

import android.view.View;
import android.widget.FrameLayout;

import com.huantansheng.easyphotos.R;

import androidx.recyclerview.widget.RecyclerView;

/**
 * 广告viewolder
 * Created by huan on 2017/10/28.
 */

public class AdViewHolder extends RecyclerView.ViewHolder {
    public FrameLayout adFrame;
    public AdViewHolder(View itemView) {
        super(itemView);
        adFrame = itemView.findViewById(R.id.ad_frame_easy_photos);
    }
}
