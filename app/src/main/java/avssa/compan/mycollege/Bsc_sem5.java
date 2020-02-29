package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_sem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_sem5);

        PDFView pdfView = (PDFView) findViewById(R.id.bscsem5);
        pdfView.fromAsset("bscsem5.pdf").load();
    }
}
