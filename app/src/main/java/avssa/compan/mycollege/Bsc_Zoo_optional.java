package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_Zoo_optional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc__zoo_optional);

        PDFView pdfView = (PDFView) findViewById(R.id.bsczoology);
        pdfView.fromAsset("bsczoology.pdf").load();
    }
}
