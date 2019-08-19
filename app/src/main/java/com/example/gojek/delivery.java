package com.example.gojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gojek.R;

import org.w3c.dom.Text;


public class delivery extends AppCompatActivity implements View.OnClickListener{

    Button back;
    TextView tv_dataNama;
    TextView tv_dataAlamat;
    TextView tv_dataPesanan;
    String nama,alamat,pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        back = findViewById(R.id.cancel);
        tv_dataNama = (TextView) findViewById(R.id.text_nama);
        tv_dataAlamat = (TextView)findViewById(R.id.dummy_alamat);
        tv_dataPesanan = (TextView)findViewById(R.id.dummy_pesanan);
        back.setOnClickListener(this);
        getData();

    }
    public void getData() {
        nama = getIntent().getStringExtra("Nama");
        alamat = getIntent().getStringExtra("Alamat");
        pesanan = getIntent().getStringExtra("Pesanan");

        tv_dataNama.setText(nama);
        tv_dataAlamat.setText(alamat);
        tv_dataPesanan.setText(pesanan);
    }

    @Override
    public void onClick(View view) {
        Intent back = new Intent(delivery.this, menu.class);
        startActivity(back);

    }
}

