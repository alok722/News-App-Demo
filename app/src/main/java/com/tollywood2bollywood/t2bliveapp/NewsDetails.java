package com.tollywood2bollywood.t2bliveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class NewsDetails extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Toolbar mToolBar;
    ImageView mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        mToolBar=(Toolbar)findViewById(R.id.news_details_appBar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        imageView = (ImageView)findViewById(R.id.d_img);
        textView = (TextView)findViewById(R.id.d_head);
        imageView.setImageResource(getIntent().getIntExtra("img_id",00));
        textView.setText(getIntent().getStringExtra("Heading"));

        mShare = (ImageView)findViewById(R.id.share);
        mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                sharingIntent.setType("text/*");
                startActivity(Intent.createChooser(sharingIntent, "Share News Using"));
            }
        });
    }
}
