package com.rq.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare View Variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign Views from layout file to corresponding variables
        // R 代表 Resource
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked, so update the fact TextView with new fact
                // Update screen with new fact
                String fact = factBook.getFact();
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

//        Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate() method");

    }
}
