package com.sk.directmall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DirectMallLendingActivity1 extends AppCompatActivity {
    private final int  REQUEST = 1199;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
       // intent.putExtra("CustomerId", "1");
        setResult(Activity.RESULT_CANCELED, intent);
        finish();
    }
}