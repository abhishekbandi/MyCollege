package avssa.compan.mycollege;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class About extends AppCompatActivity {

    private androidx.cardview.widget.CardView aboutbvvs,aboutcollege;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3072128238700922/7642956929");

        // Full screen interstitial add code==================================

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3072128238700922/2282797267");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        aboutbvvs=findViewById(R.id.aboutbvvs);
        aboutbvvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab=new Intent(About.this,About_bvvs.class);
                startActivity(ab);
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
                else {
                    Log.d("TAG","Unable to Loded");
                }
            }
        });
        aboutcollege=findViewById(R.id.aboutcollege);
        aboutcollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc=new Intent(About.this,About_college.class);
                startActivity(abc);
            }
        });
    }
}
