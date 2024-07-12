package com.example.real1;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    private Button b1, b2, b3; // Added semicolon and made buttons private
    private TextView textView; // Added TextView variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.bif);
        b2 = findViewById(R.id.gif);
        b3 = findViewById(R.id.they);
        textView = findViewById(R.id.textView); // Reference the TextView
        textView = findViewById(R.id.textView2);
        textView = findViewById(R.id.textView3);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                textView.setText(getString(R.string.bif)); // Set text from strings.xml
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                textView.setText(getString(R.string.gif)); // Set text from strings.xml
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(getString(R.string.they)); // Set text from strings.xml
            }
        });
    }
}



















//package com.example.real1;
//
//import android.app.ProgressDialog;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity {
//    private ProgressDialog progress;
//    Button b1, b2, b3; // Added semicolon and made buttons private
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        b1 = findViewById(R.id.bif);
//        b2 = findViewById(R.id.gif);
//        b3 = findViewById(R.id.they);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                TextView txtView = findViewById(R.id.bif); // Replace with the correct TextView ID
//                txtView.setTextSize(55);
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                TextView txtView = findViewById(R.id.gif); // Replace with the correct TextView ID
//                txtView.setTextSize(55);
//            }
//        });
//
//        b3.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                TextView txtView = findViewById(R.id.they); // Replace with the correct TextView ID
//                txtView.setTextSize(55);
//            }
//        });
//    }
//}
//
