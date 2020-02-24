package dicoding.ilyasya.project.moviecatalogueuiux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

// set Textview
        TextView tvJudul = findViewById(R.id.txt_judul);
        TextView tvRilis = findViewById(R.id.txt_rilis);
        TextView tvRating = findViewById(R.id.txt_rating);
        //TextView tvStatus = findViewById(R.id.status);
        //TextView tvBahasa = findViewById(R.id.bahasa);
        //TextView tvDurasi = findViewById(R.id.durasi);
        TextView tvDeskripsi = findViewById(R.id.txt_deskripsi);
        ImageView imgPoster = findViewById(R.id.img_photo);

        //get data Intent dari Activity
        Intent intent = getIntent();
        Movie movie = intent.getParcelableExtra(EXTRA_MOVIE);
        if (movie != null) {
        String judul = movie.getJudul();
        String rilis = movie.getTanggal();
        String rating = movie.getRating();
        //String status = movie.getStatus();
        //String bahasa = movie.getBahasa();
        //String durasi = movie.getDurasi();
        String deskripsi = movie.getDeskripsi();

        // set Data
        tvJudul.setText(judul);
        tvRilis.setText(rilis);
        tvRating.setText(rating);
        //tvStatus.setText(status);
        //tvBahasa.setText(bahasa);
        //tvDurasi.setText(durasi);
        tvDeskripsi.setText(deskripsi);

        Glide.with(this).load(movie.getPoster()).into(imgPoster);

        }
    }


}
