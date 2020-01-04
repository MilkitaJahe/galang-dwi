package com.ani.latihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btntambah, btnminus, btnbagi, btnkali;
    TextView result;
    EditText edit_1, edit_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btntambah = findViewById(R.id.btn_tambah);
        btnminus = findViewById(R.id.btn_minus);
        btnbagi = findViewById(R.id.btn_bagi);
        btnkali = findViewById(R.id.btn_kali);

        result = findViewById(R.id.hasil);

        edit_1 = findViewById(R.id.edit_1);
        edit_2 = findViewById(R.id.edit_2);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int nilai1, nilai2, hasil;
                    nilai1 = Integer.parseInt(edit_1.getText().toString());
                    nilai2 = Integer.parseInt(edit_2.getText().toString());

                    hasil = nilai1 + nilai2;
                    result.setText("hasil : "+ hasil);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "notif nilai yang di masukkan salah", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
