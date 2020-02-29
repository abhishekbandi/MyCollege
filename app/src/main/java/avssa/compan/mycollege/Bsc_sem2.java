package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_sem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_sem2);

        PDFView pdfView = (PDFView) findViewById(R.id.bscsem2);
        pdfView.fromAsset("bscsem2.pdf").load();
    }
}
