package com.example.csecourseallbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cfundamentals extends AppCompatActivity {

    PDFView btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfundamentals);

        btn1 = findViewById(R.id.cfundamentals);
        btn1.fromAsset("cfundamentals.pdf").load();
    }
}
