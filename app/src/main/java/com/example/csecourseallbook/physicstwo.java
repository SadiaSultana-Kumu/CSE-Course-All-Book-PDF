package com.example.csecourseallbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class physicstwo extends AppCompatActivity {

    PDFView btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicstwo);
        btn4 = findViewById(R.id.physicstwo);
        btn4.fromAsset("Electricity.pdf").load();
    }
}
