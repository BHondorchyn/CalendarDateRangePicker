package com.archit.calendardaterangepicker.models;

import android.view.View;
import android.widget.RelativeLayout;

import com.archit.calendardaterangepicker.customviews.CustomTextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Archit Shah on 8/13/2017.
 */

public class DayContainer {

    public RelativeLayout rootView;
    public CustomTextView tvDate;
    public View strip;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());

    public DayContainer(final RelativeLayout rootView) {
        this.rootView = rootView;
        strip = rootView.getChildAt(0);
        tvDate = (CustomTextView) rootView.getChildAt(1);
    }

    public static int GetContainerKey(final Calendar cal) {
        final String str = simpleDateFormat.format(cal.getTime());
        return Integer.parseInt(str);
    }

}
