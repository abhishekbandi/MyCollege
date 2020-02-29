package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bca_sem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem2);

        PDFView pdfView = (PDFView) findViewById(R.id.bcasem2);
        pdfView.fromAsset("bcasem2.pdf").load();
    }
}
