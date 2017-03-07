package com.example.overtatech_4.fblikeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastUtils.showToast(this,"hi from lib");
    }
}
