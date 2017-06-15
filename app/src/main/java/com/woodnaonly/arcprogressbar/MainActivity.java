package com.woodnaonly.arcprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.woodnaonly.arcprogress.ArcProgress;

public class MainActivity extends AppCompatActivity
{
    ArcProgress mArcProgress1;
    ArcProgress mArcProgress2;
    ArcProgress mArcProgress3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mArcProgress1 = (ArcProgress) findViewById(R.id.ArcProgress1);
        mArcProgress2 = (ArcProgress) findViewById(R.id.ArcProgress2);
        mArcProgress3 = (ArcProgress) findViewById(R.id.ArcProgress3);

    }

    public void startAnim(View view)
    {
        mArcProgress1.startAnim(30000);
        mArcProgress2.startAnim(2000);
        mArcProgress3.startAnim();
    }
}
