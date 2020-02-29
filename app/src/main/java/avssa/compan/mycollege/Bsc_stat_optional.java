package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_stat_optional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_stat_optional);

        PDFView pdfView = (PDFView) findViewById(R.id.bscstat2);
        pdfView.fromAsset("bscstat1.pdf").load();
    }
}
