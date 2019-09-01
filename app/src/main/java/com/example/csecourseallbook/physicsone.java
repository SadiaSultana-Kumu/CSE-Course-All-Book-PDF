package com.example.csecourseallbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class physicsone extends AppCompatActivity {

    PDFView btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicsone);
        btn2 = findViewById(R.id.physicsone);
        btn2.fromAsset("Physics-1.pdf").load();
    }
}
