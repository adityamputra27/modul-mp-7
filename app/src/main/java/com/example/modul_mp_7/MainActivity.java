package com.example.modul_mp_7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angka1, angka2;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1=findViewById(R.id.angka1);
        angka2=findViewById(R.id.angka2);

        hitung=findViewById(R.id.hitung);
        hasil=findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view)  {
                String nilai_angka1=angka1.getText().toString();
                String nilai_angka2=angka2.getText().toString();

                int integer_angka1=Integer.valueOf(nilai_angka1);
                int integer_angka2=Integer.valueOf(nilai_angka2);
                int hasil_jumlah=(integer_angka1+integer_angka2);

                hasil.setText("Hasil : "+String.valueOf(hasil_jumlah));
            }
        });
    }
}