package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_sem6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_sem6);

        PDFView pdfView = (PDFView) findViewById(R.id.bscsem6);
        pdfView.fromAsset("bscsem6.pdf").load();
    }
}
