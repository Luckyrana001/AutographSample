package com.androidluckyguys.autographsample;

import android.app.FragmentManager;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static Bitmap signatureBitmap  = null;
    public View mControlsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mControlsView = findViewById(R.id.fullscreen_content_controls);
        // replaceView(R.id.fullscreen_content_controls, new IdVerificationParentFragment(),true,true);


        /* SignatureFragment fr = new SignatureFragment();
        //  fr.setArguments(args);
        FragmentManager fm = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fullscreen_content_controls, fr);
        fragmentTransaction.commit();*/

        android.support.v4.app.FragmentManager fragmentManager = MainActivity.this.getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SignatureFragment fragment = new SignatureFragment();
        fragmentTransaction.add(R.id.fullscreen_content_controls, fragment);
        fragmentTransaction.commit();


    }

}
