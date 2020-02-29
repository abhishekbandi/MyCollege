package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_computer_science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_computer_science);

        PDFView pdfView = (PDFView) findViewById(R.id.bscca);
        pdfView.fromAsset("bscca.pdf").load();
    }
}
