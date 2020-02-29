package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Updates extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates);

        web=findViewById(R.id.abhishekq);
        web.loadUrl("https://abhishekbandi.github.io/project.github.io/");
        web.setWebViewClient(new WebViewClient());

    }
}
