package com.cubecnelson.iconprogessbar;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by cubecnelson on 4/6/16.
 */
public class IconProgressBar extends LinearLayout {

    private int max;
    private int progress;
    private ImageView start_icon;
    private ImageView finish_icon;

    public IconProgressBar(Context context) {
        super(context);
        init();
    }

    public IconProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IconProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        View v = inflate(getContext(), R.layout.view_icon_progress_bar, this);
        start_icon = (ImageView) v.findViewById(R.id.start_icon);
        finish_icon = (ImageView) v.findViewById(R.id.finish_icon);
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setStartIconResource(int resId) {
        start_icon.setImageResource(resId);
    }

    public void setFinishIconResource(int resId) {
        finish_icon.setImageResource(resId);
    }

}
