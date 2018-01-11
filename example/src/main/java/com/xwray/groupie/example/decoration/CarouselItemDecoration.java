package com.xwray.groupie.example.decoration;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.ColorInt;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CarouselItemDecoration extends RecyclerView.ItemDecoration {

    private final Paint grayBackgroundPaint;
    private final int padding;

    public CarouselItemDecoration(@ColorInt int backgroundColor, int paddingPixelSize) {
        grayBackgroundPaint = new Paint();
        grayBackgroundPaint.setColor(backgroundColor);
        padding = paddingPixelSize / 2;
    }

    @Override public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = padding;
        outRect.right = padding;
    }
}
