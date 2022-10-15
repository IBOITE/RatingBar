package com.ibo.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text);
        button=findViewById(R.id.button);
        ratingBar=findViewById(R.id.ratingBar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rat=ratingBar.getRating()+"";
                textView.setText(rat);
                Toast.makeText(getApplicationContext(),"your result is : "+rat,Toast.LENGTH_SHORT).show();
            }
        });
    }
}