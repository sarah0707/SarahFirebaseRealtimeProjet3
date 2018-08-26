package sarah.my.id.sarahfirebaserealtimeprojet.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;


@IgnoreExtraProperties
public class Barang implements Serializable{

    private String nama;
    private String makan;
    private String harga;
    private String porsi;
    private String totharga;
    private String key;

    public Barang(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return makan;
    }

    public void setMerk(String merk) {
        this.makan = merk;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }


    public String getPorsi() {
        return porsi;
    }

    public void setPorsi(String porsi) {
        this.porsi = porsi;
    }

    public String getTotharga() {
        return totharga;
    }

    public void setTotharga(String totharga) {
        this.totharga = totharga;
    }


    @Override
    public String toString() {
        return " "+nama+"\n" +
                " "+makan +"\n" +
                " "+porsi+"\n" +
                " "+totharga +"\n" +
                " "+harga;
    }

    public Barang(String nm, String mrk, String hrg, String prs, String tot){
        nama = nm;
        makan = mrk;
        harga = hrg;
        porsi = prs;
        totharga = tot;
    }
}
