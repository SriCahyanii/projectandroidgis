package com.example.temple;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends Activity implements View.OnClickListener {

    TextView datanama, dataodalan, dataketerangan;
    Button btnview;
    ImageView datagambar;

    public static String id, nama,odalan,gambar,keterangan;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.data_nama);
        dataodalan=findViewById(R.id.data_odalan);
        dataketerangan=findViewById(R.id.data_keterangan);
        btnview=findViewById(R.id.btn_view);
        datagambar=findViewById(R.id.data_gambar);

        datanama.setText(nama);
        dataodalan.setText(odalan);
        dataketerangan.setText(keterangan);
        Picasso.get().load(gambar).into(datagambar);

        btnview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent view =new Intent(DetailActivity.this,MapsActivity.class);
        startActivity(view);
    }
}
