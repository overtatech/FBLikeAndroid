package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by overtatech-4 on 7/3/17.
 */

public class ToastUtils {

    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
