package com.sk.directmall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class DirectMallLendingActivity extends AppCompatActivity {
    private final int  REQUEST = 1199;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct_mall_lending);
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