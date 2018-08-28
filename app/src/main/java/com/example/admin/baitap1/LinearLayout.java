package com.example.admin.baitap1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        String hoten = "Le Hoan";
        Log.d("androi",hoten);
    }
}
