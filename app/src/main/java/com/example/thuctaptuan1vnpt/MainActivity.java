package com.example.thuctaptuan1vnpt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.img_david);
        imageView.setOnClickListener(this);
        TextView textView = findViewById(R.id.tv_details_credit_card);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_david:
                Intent intent = new Intent(this, Act2.class);
                startActivity(intent);
                break;
            case R.id.tv_details_credit_card:
                Intent intent1 = new Intent(this, Act3.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}