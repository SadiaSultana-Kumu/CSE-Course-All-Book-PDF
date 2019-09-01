package com.example.csecourseallbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pps extends AppCompatActivity {

    PDFView btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pps);
        btn3 = findViewById(R.id.pps);
        btn3.fromAsset("CcomR.pdf").load();
    }
}
