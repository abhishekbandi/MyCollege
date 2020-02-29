package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bca_sem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem3);
        PDFView pdfView = (PDFView) findViewById(R.id.bcasem3);
        pdfView.fromAsset("bcasem3.pdf").load();
    }
}
