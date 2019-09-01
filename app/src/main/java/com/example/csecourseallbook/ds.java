package com.example.csecourseallbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ds extends AppCompatActivity {

    PDFView btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);
        btn7 = findViewById(R.id.ds);
        btn7.fromAsset("DS Complete.pdf").load();
    }
}
