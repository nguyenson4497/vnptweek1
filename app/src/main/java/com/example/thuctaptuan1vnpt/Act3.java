package com.example.thuctaptuan1vnpt;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Act3 extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cards);

        ImageView imageView = findViewById(R.id.iv_return_to_main_2);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        onBackPressed();
    }
}
