package sarah.my.id.sarahfirebaserealtimeprojet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;




public class SecondHome extends AppCompatActivity {
    private InterstitialAd interstitial;

    private Button btAnalytics;
    private Button btAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        btAnalytics = findViewById(R.id.bt_fbanalytics);
        btAnalytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(SecondHome.this, MainActivity.class));
            }
        });

        btAuth = findViewById(R.id.bt_fbauth);
        btAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(SecondHome.this, MinumMainActivity.class));
            }
        });


    }

}
