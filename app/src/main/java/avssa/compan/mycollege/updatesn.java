package avssa.compan.mycollege;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class updatesn extends Fragment {

    private WebView web1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.f_updates, container, false);
        web1 = (WebView) v.findViewById(R.id.web1);
        web1.loadUrl("https://abhishekbandi.github.io/project.github.io/");

        // Enable Javascript
        WebSettings webSettings = web1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        web1.setWebViewClient(new WebViewClient());


        return v;



    }
}