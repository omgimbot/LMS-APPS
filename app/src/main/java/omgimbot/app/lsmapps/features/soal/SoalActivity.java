package omgimbot.app.lsmapps.features.soal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import im.delight.android.webview.AdvancedWebView;
import omgimbot.app.lsmapps.features.dashboard.DashboardActivity;
import omgimbot.app.lsmapps.features.ujian.UjianActivity;
import omgimbot.app.sidangapps.R;

public class SoalActivity extends AppCompatActivity {
    String TEST_PAGE_URL = "https://wayangedu.com/siswa/ujian.php?id=4&soal=4";
//    @BindView(R.id.webview)
//    AdvancedWebView mWebView;
//
//    ProgressDialog pDialog;
//    final String descriptionUsingWebView = "<p><iframe allowfullscreen=\"\" frameborder=\"0\" height=\"360\" src=\"https://www.youtube.com/embed/f8l8kbEaVfU\" width=\"640\"></iframe></p>\n" +
//            "\n" +
//            "<p>materi ini balabalaal</p>";
@BindView(R.id.toolbar_default_in)
Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Ujian");
        mToolbar.setTitleTextColor(getResources().getColor(R.color.color_default_blue));
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_back_left));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        pDialog = new ProgressDialog(this, R.style.MyAlertDialogStyle);
////        WebSettings webSettings = mWebView.getSettings();
////        webSettings.setJavaScriptEnabled(true);
////        //pDialog.setCancelable(false);
////        mWebView.loadDataWithBaseURL(null, descriptionUsingWebView, "text/html", "utf-8", null);
//        mWebView = findViewById(R.id.webview);
//        mWebView.setListener(this, this);
//        mWebView.setGeolocationEnabled(false);
//        mWebView.setMixedContentAllowed(true);
//        mWebView.setCookiesEnabled(true);
//        mWebView.setThirdPartyCookiesEnabled(true);
////        mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
////        mWebView.getSettings().setLoadWithOverviewMode(true);
////        mWebView.getSettings().setUseWideViewPort(true);
////        WebView web = new WebView(this);
//        mWebView.setPadding(10, 10, 10, 10);
//        mWebView.setInitialScale(getScale());
////        mWebView.getSettings().setJavaScriptEnabled(true);
//
//        mWebView.setWebViewClient(new WebViewClient(){
//
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//
//                pDialog.setMessage("Please wait...");
//                pDialog.setIndeterminate(false);
//                pDialog.setCancelable(false);
//                pDialog.show();
//                view.loadUrl(url);
//                return true;
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//                if(pDialog!=null){
//                    pDialog.dismiss();
//                }
//            }
//        });
//
//        mWebView.setWebChromeClient(new WebChromeClient() {
//
//            @Override
//            public void onReceivedTitle(WebView view, String title) {
//                super.onReceivedTitle(view, title);
//                //Toast.makeText(WebViews.this, title, Toast.LENGTH_SHORT).show();
//                // hideDialog();
//            }
//
//        });
//
//        mWebView.addHttpHeader("X-Requested-With", "");
////        mWebView.loadUrl(TEST_PAGE_URL);
//        mWebView.loadDataWithBaseURL(null, descriptionUsingWebView, "text/html", "utf-8", null);
    }
//
//    private int getScale(){
//        Point p = new Point();
//        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
//        display.getSize(p);
//        int width = p.x;
//        Double val = new Double(width)/new Double(360);
//        val = val * 100d;
//        Log.d("scalenya", val.toString());
//        return val.intValue();
//    }
//
//    @SuppressLint("NewApi")
//    @Override
//    protected void onResume() {
//        super.onResume();
//        mWebView.onResume();
//        // ...
//    }
//
//    @SuppressLint("NewApi")
//    @Override
//    protected void onPause() {
//        mWebView.onPause();
//        // ...
//        super.onPause();
//    }
//
//    @Override
//    protected void onDestroy() {
//        mWebView.onDestroy();
//        // ...
//        super.onDestroy();
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        super.onActivityResult(requestCode, resultCode, intent);
//        mWebView.onActivityResult(requestCode, resultCode, intent);
//        // ...
//    }
//
//    @Override
//    public void onPageStarted(String url, Bitmap favicon) {
//        pDialog.setMessage("Please wait...");
//        pDialog.show();
//        mWebView.setVisibility(View.VISIBLE);
//    }
//
//    @Override
//    public void onPageFinished(String url) {
//        pDialog.dismiss();
//        mWebView.setVisibility(View.VISIBLE);
//    }
//
//    @Override
//    public void onPageError(int errorCode, String description, String failingUrl) {
//        Toast.makeText(SoalActivity.this, "onPageError(errorCode = "+errorCode+",  description = "+description+",  failingUrl = "+failingUrl+")", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) {
//        //Toast.makeText(WebViews.this, "onDownloadRequested(url = "+url+",  suggestedFilename = "+suggestedFilename+",  mimeType = "+mimeType+",  contentLength = "+contentLength+",  contentDisposition = "+contentDisposition+",  userAgent = "+userAgent+")", Toast.LENGTH_LONG).show();
//
//        if (AdvancedWebView.handleDownload(this, url, suggestedFilename)) {
//            // download successfully handled
//            //AdvancedWebView.handleDownload(this, url, suggestedFilename);
//            Toast.makeText(getApplicationContext(), "Berhasil didownload", Toast.LENGTH_LONG).show();
//        }
//        else {
//            // download couldn't be handled because user has disabled download manager app on the device
//        }
//    }
//
//    @Override
//    public void onExternalPageRequest(String url) {
//        Toast.makeText(SoalActivity.this, "onExternalPageRequest(url = "+url+")", Toast.LENGTH_SHORT).show();
//    }
//
    @Override
    public void onBackPressed() {
//        if (!mWebView.onBackPressed()) { return; }
//        // ...
//        Intent a = new Intent(SoalActivity.this, UjianActivity.class);
//        startActivity(a);
//        finish();
        this.gotoDashboard();
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    void gotoDashboard(){
        Intent a = new Intent(SoalActivity.this, UjianActivity.class);
        startActivity(a);
        finish();
    }

}
