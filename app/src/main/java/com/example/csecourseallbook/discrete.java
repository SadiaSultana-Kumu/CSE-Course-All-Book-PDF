package com.example.csecourseallbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class discrete extends AppCompatActivity {

    PDFView btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discrete);

        btn5 = findViewById(R.id.discrete);
        btn5.fromAsset("Discrete_Mathematics.pdf").load();
    }
}
