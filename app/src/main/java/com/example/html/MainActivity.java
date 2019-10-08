package com.example.html;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient() {

            //este método se llama cada vez que cambiamos de página
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Log.d("MIAPP", "Vistando ... " + url);
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl("file:///android_asset/texto_ayuda.html");
    }
}
