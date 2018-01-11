package com.xwray.groupie.example.item;

import android.databinding.ViewDataBinding;
import android.view.ViewGroup;

import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.ViewHolder;

/**
 * Created by kjones on 12/22/16.
 */

public class CarouselAdapter extends GroupAdapter {
    @Override
    public ViewHolder<? extends ViewDataBinding> onCreateViewHolder(final ViewGroup parent, final int layoutResId) {
        final ViewHolder<? extends ViewDataBinding> viewHolder = super.onCreateViewHolder(parent, layoutResId);
        final ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        layoutParams.width = (parent.getMeasuredWidth() - parent.getPaddingLeft() - parent.getPaddingRight() - 80);
        viewHolder.itemView.setLayoutParams(layoutParams);

        return viewHolder;
    }
}
