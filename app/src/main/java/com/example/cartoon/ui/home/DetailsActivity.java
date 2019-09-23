package com.example.cartoon.ui.home;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cartoon.R;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name, birth, job, about;
    String namee, birthh, jobb, aboutt;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView = findViewById(R.id.image);
        name = findViewById(R.id.name);
        birth = findViewById(R.id.birth);
        job = findViewById(R.id.job);
        about = findViewById(R.id.about);
        namee = getIntent().getStringExtra("name");
        birthh=getIntent().getStringExtra("birth");
        jobb=getIntent().getStringExtra("job");
        aboutt=getIntent().getStringExtra("about");
        image=getIntent().getIntExtra("image",0);
        name.setText(namee);
        birth.setText(birthh);
        job.setText(jobb);
        about.setText(aboutt);
        imageView.setImageResource(image);


    }
}
