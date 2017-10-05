package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.view.View.Y;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] magic_ball_array={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        Button ask_button;
        ask_button = (Button) findViewById(R.id.ask_Button);
        final ImageView imageview1;
        imageview1 = (ImageView) findViewById(R.id.ball_image);
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd_number = new Random();
                int ball_number = rnd_number.nextInt(5);
                Log.d("magiceightball", "button pressed"+ball_number);
                imageview1.setImageResource(magic_ball_array[ball_number]);

            }
        });
    }


}
