package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gojek.delivery;

public class order extends AppCompatActivity implements View.OnClickListener{
    Button orderan;
    EditText edt_nama;
    EditText edt_alamat;
    EditText edt_pesanan;

    public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static int RESULT_CODE = 110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        orderan = findViewById(R.id.btn_pesan_makanan);
        orderan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent orderan = new Intent(order.this, delivery.class);
        edt_nama = findViewById(R.id.edit_txt_nama);
        orderan.putExtra("Nama",edt_nama.getText().toString());

        edt_alamat = findViewById(R.id.edit_text_alamat);
        orderan.putExtra("Alamat", edt_alamat.getText().toString());

        edt_pesanan = findViewById(R.id.edit_txt_pesanan);
        orderan.putExtra("Pesanan",edt_pesanan.getText().toString());

        startActivity(orderan);
    }
}
