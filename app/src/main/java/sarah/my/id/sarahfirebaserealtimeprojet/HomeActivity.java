package sarah.my.id.sarahfirebaserealtimeprojet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;




public class HomeActivity extends AppCompatActivity {
    private InterstitialAd interstitial;

    private Button btAnalytics;
    private Button btAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        btAnalytics = findViewById(R.id.bt_fbanalytics);
        btAnalytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(HomeActivity.this, SecondHome.class));
            }
        });

        btAuth = findViewById(R.id.bt_fbauth);
        btAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(HomeActivity.this, DisplayImagesActivity.class));
            }
        });

        btAuth = findViewById(R.id.bt_minum);
        btAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(HomeActivity.this, MinumDisplayImagesActivity.class));
            }
        });

        btAuth = findViewById(R.id.bt_pesan);
        btAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(HomeActivity.this, DataPesan.class));
            }
        });



    }

}
