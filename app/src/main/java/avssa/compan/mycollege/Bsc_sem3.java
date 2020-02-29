package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_sem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_sem3);
        PDFView pdfView = (PDFView) findViewById(R.id.bscsem3);
        pdfView.fromAsset("bscsem3.pdf").load();
    }
}
