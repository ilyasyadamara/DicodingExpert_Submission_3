package dicoding.ilyasya.project.moviecatalogueuiux;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String judul;
    private String tanggal;
    private String rating;
    private String status;
    private String bahasa;
    private String durasi;
    private String deskripsi;
    private String poster;


    private Movie(Parcel in) {
        judul = in.readString();
        tanggal = in.readString();
        rating = in.readString();
        status = in.readString();
        bahasa = in.readString();
        durasi = in.readString();
        deskripsi = in.readString();
        poster = in.readString();
    }

    public Movie() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(judul);
        dest.writeString(tanggal);
        dest.writeString(rating);
        dest.writeString(status);
        dest.writeString(bahasa);
        dest.writeString(durasi);
        dest.writeString(deskripsi);
        dest.writeString(poster);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDeskripsi() { return deskripsi; }

    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public String getPoster() { return poster; }

    public void setPoster(String poster) { this.poster = poster; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getBahasa() { return bahasa; }

    public void setBahasa(String bahasa) { this.bahasa = bahasa; }

    public String getDurasi() { return durasi; }

    public void setDurasi(String durasi) { this.durasi = durasi; }


}
