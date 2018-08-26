package sarah.my.id.sarahfirebaserealtimeprojet;

public class ImageUploadInfo {

    public String imageName;
    public String hargaName;

    public String imageURL;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name, String harga, String url) {

        this.imageName = name;
        this.hargaName = harga;
        this.imageURL= url;
    }

    public String getImageName() {
        return imageName;
    }

    public String getHargaName() {
        return hargaName;
    }

    public String getImageURL() {
        return imageURL;
    }

}