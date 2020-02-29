package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Principal_letter extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_letter);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("principle_letter.pdf").load();
    }
}
