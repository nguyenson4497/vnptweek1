package com.example.thuctaptuan1vnpt;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Act2 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pay);

        ImageView imageView1 = findViewById(R.id.iv_return_to_main);
        imageView1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        onBackPressed();
    }
}
