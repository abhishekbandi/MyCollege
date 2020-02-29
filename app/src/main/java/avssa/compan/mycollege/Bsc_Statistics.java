package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc__statistics);
        PDFView pdfView = (PDFView) findViewById(R.id.bscstat1);
        pdfView.fromAsset("bscstat.pdf").load();
    }
}
