/**
 * jin 2019.08.14
 */

package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public class MainActivity extends AppCompatActivity{

    private FragmentManager fragmentManager;
    private AFragment fragmentA;
    private BFragment fragmentB;
    private FragmentTransaction transaction;
    private Button bt1;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragmentA = new AFragment();
        fragmentB = new BFragment();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();

        //use button click dynamically======================
//        bt1 = (Button)findViewById(R.id.btn_fragmentA);
//        bt2 = (Button)findViewById(R.id.btn_fragmentB);
//        bt1.setOnClickListener(this);
//        bt2.setOnClickListener(this);
        //===================================================
    }

    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.btn_fragmentA:
                transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentB:
                transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                break;
        }
    }
//=============================================================
//    @Override
//    public void onClick(View view) {
//        transaction = fragmentManager.beginTransaction();
//        switch(view.getId())
//        {
//            case R.id.btn_fragmentA:
//                transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
//                break;
//            case R.id.btn_fragmentB:
//                transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
//                break;
//        }
//    }
//===============================================================
}
