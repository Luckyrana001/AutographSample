package com.androidluckyguys.autographsample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static com.androidluckyguys.autographsample.MainActivity.signatureBitmap;

/**
 * Created by lucky on 05/02/2017.
 */

public class SignatureImageViewFragment extends Fragment {
ImageView signatureIv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.signature_display_fragment, container, false);
    }




    /**
     * @desc this is the fragment life cycle method , mainly used to initialize layout variables
     * @param   view - help in attaching the view to xml ids
     * @param  savedInstanceState :: is used to extract the value of objects from saved state if have any
     * @return null
     */
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        signatureIv = (ImageView) view.findViewById(R.id.signatureIv);
        signatureIv.setImageBitmap(signatureBitmap);


    }
    }
