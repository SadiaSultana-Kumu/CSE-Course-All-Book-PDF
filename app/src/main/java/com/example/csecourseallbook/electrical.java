package com.example.csecourseallbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class electrical extends AppCompatActivity {

    PDFView btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical);
        btn6 = findViewById(R.id.electrical);
        btn6.fromAsset("electrical circuits.pdf").load();
    }
}
