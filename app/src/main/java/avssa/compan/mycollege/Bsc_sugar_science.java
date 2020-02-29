package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_sugar_science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_sugar_science);

        PDFView pdfView = (PDFView) findViewById(R.id.bscsugar);
        pdfView.fromAsset("bscsugar.pdf").load();
    }
}
