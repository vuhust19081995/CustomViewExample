package com.workspace.customviewexample.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.workspace.customviewexample.R;

/**
 * Created by workspace on 07/09/2017.
 */

public class PieChart extends View {
    private boolean mShowText;
    private int mTextPos;
    public PieChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.PieChart,0,0);
        try {
            mShowText = typedArray.getBoolean(R.styleable.PieChart_showText,false);
            mTextPos = typedArray.getInteger(R.styleable.PieChart_labelPosition,0);
        }finally {
            typedArray.recycle();
        }
    }
    public boolean isShowText() {
        return mShowText;
    }

    public void setShowText(boolean showText) {
        mShowText = showText;
        invalidate();
        requestLayout();
    }
}
