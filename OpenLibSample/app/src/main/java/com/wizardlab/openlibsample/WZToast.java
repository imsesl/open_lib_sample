package com.wizardlab.openlibsample;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018-04-18.
 */

public class WZToast {

    public void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
