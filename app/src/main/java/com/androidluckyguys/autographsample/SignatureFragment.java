package com.androidluckyguys.autographsample;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import com.github.gcacace.signaturepad.views.SignaturePad;

import static com.androidluckyguys.autographsample.MainActivity.signatureBitmap;

/**
 * Created by Rana lucky on 12/23/2016.
 */

public class SignatureFragment extends Fragment implements  View.OnClickListener{
    private static final String TAG = "SignatureActivity";
    Button mBackBtn;
    Button mSaveBtn;
    SignaturePad mSignaturePad;
    boolean mIsLtePrepaid;
    public SignatureFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_signature, container, false);
    }




    /**
     * @desc this is the fragment life cycle method , mainly used to initialize layout variables
     * @param   view - help in attaching the view to xml ids
     * @param  savedInstanceState :: is used to extract the value of objects from saved state if have any
     * @return null
     */
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initLayout(view);

        setValue();

    }

    private void setValue() {

    }

    private void initLayout(View view) {

        /*Intent intent = getIntent();
        if(intent != null) {
            mIsLtePrepaid =intent.getBooleanExtra(MposConstants.MPOS_LTE_PREPAID, false);
        }
*/
        mBackBtn = (Button)view.findViewById(R.id.btProviBack);
        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent intent=new Intent();
                intent.putExtra("MESSAGE","Fail");
                setResult(0,intent);
                finish(); */
          getActivity().onBackPressed();
            }
        });

        mSaveBtn = (Button)view.findViewById(R.id.btProvisoningNext);
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveBitmapAndReturnToLastFragment();


            }


        });
        mSignaturePad = (SignaturePad) view.findViewById(R.id.signature_pad);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {




        }

    }
    private void saveBitmapAndReturnToLastFragment() {
        Bitmap signTrans = mSignaturePad.getTransparentSignatureBitmap();
        signatureBitmap  = signTrans;
        if(signatureBitmap!=null) {

            android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            SignatureImageViewFragment fragment = new SignatureImageViewFragment();
            fragmentTransaction.add(R.id.fullscreen_content_controls, fragment);
            fragmentTransaction.commit();



        }
    }




}

