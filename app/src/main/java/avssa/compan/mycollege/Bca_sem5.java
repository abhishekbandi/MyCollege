package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bca_sem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem5);
        PDFView pdfView = (PDFView) findViewById(R.id.bcasem5);
        pdfView.fromAsset("bcasem5.pdf").load();
    }
}
