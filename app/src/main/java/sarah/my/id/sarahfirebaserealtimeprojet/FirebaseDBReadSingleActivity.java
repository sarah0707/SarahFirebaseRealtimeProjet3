package sarah.my.id.sarahfirebaserealtimeprojet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import sarah.my.id.sarahfirebaserealtimeprojet.model.Barang;

public class FirebaseDBReadSingleActivity extends AppCompatActivity {
    private Button btSubmit;
    private EditText etNama;
    private EditText etMerk;
    private EditText etHarga;
    private EditText etporsi;
    private EditText ettotharga;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        etNama = (EditText) findViewById(R.id.et_nobarang);
        etMerk = (EditText) findViewById(R.id.et_namabarang);
        etHarga = (EditText) findViewById(R.id.et_hargabarang);
        etporsi = (EditText ) findViewById(R.id.et_totalbarang);
        ettotharga =(EditText) findViewById(R.id.et_totalharga);
        btSubmit = (Button) findViewById(R.id.bt_submit);

        etNama.setEnabled(false);
        etMerk.setEnabled(false);
        etHarga.setEnabled(false);
        etporsi.setEnabled(false);
        ettotharga.setEnabled(false);
        btSubmit.setVisibility(View.GONE);

        Barang barang = (Barang) getIntent().getSerializableExtra("data");
        if(barang!=null){
            etNama.setText(barang.getNama());
            etMerk.setText(barang.getMerk());
            etHarga.setText(barang.getHarga());
            etporsi.setText(barang.getPorsi());
            ettotharga.setText(barang.getTotharga());
        }
    }

    public static Intent getActIntent(Activity activity){
        return new Intent(activity, FirebaseDBReadSingleActivity.class);
    }
}