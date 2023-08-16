package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity {

    Button btn,btn2;
    TextView textsonuc;
    EditText edittext;
    Chip chip1,chip2,chip3,chip4,chip5,chip6;

    private boolean herhangiChip1GrubuGorunurMu() {
        return chip1.getVisibility() == View.VISIBLE ||
                chip2.getVisibility() == View.VISIBLE ||
                chip3.getVisibility() == View.VISIBLE;
    }

    private boolean herhangiChip2GrubuGorunurMu() {
        return chip4.getVisibility() == View.VISIBLE ||
                chip5.getVisibility() == View.VISIBLE ||
                chip6.getVisibility() == View.VISIBLE;
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);

        textsonuc = findViewById(R.id.textsonuc);

        edittext = findViewById(R.id.edittext);

        chip1 = findViewById(R.id.chip1);
        chip2 = findViewById(R.id.chip2);
        chip3 = findViewById(R.id.chip3);
        chip4 = findViewById(R.id.chip4);
        chip5 = findViewById(R.id.chip5);
        chip6 = findViewById(R.id.chip6);


        chip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleChipsVisibility();
            }

            private void toggleChipsVisibility() {
                int visibility = chip2.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
                chip2.setVisibility(visibility);
                chip3.setVisibility(visibility);
            }
        });

        chip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleChipsVisibility2();
            }

        private void toggleChipsVisibility2() {
            int visibility2 = chip1.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
            chip1.setVisibility(visibility2);
            chip3.setVisibility(visibility2);
        }
    });

        chip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleChipsVisibility3();
            }

            private void toggleChipsVisibility3() {
                int visibility2 = chip1.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
                chip1.setVisibility(visibility2);
                chip2.setVisibility(visibility2);
            }
        });

        chip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleChipsVisibility4();
            }

            private void toggleChipsVisibility4() {
                int visibility2 = chip5.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
                chip5.setVisibility(visibility2);
                chip6.setVisibility(visibility2);
            }
        });

        chip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleChipsVisibility5();
            }

            private void toggleChipsVisibility5() {
                int visibility2 = chip4.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
                chip4.setVisibility(visibility2);
                chip6.setVisibility(visibility2);
            }
        });

        chip6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleChipsVisibility6();
            }

            private void toggleChipsVisibility6() {
                int visibility2 = chip4.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
                chip4.setVisibility(visibility2);
                chip5.setVisibility(visibility2);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"DefaultLocale", "SetTextI18n"})
            @Override
            public void onClick(View view) {


                if (chip1.getVisibility()==View.VISIBLE)
                {
                    if(chip4.getVisibility()==View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger1= Double.parseDouble(degerx1);
                        textsonuc.setText( String.valueOf(  String.format("%10.2f", deger1))+" °K");
                    }

                    if(chip5.getVisibility()==View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger2= Double.parseDouble(degerx1);
                        deger2 = deger2-273.15;
                        textsonuc.setText( String.valueOf(  String.format("%10.2f", deger2))+" °C");
                    }

                    if (chip6.getVisibility()==View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger3= Double.parseDouble(degerx1);
                        deger3 = (deger3 - 273.15)* 1.8000+ 32.00;
                        textsonuc.setText( String.valueOf(  String.format("%10.2f", deger3))+" °F");
                    }

                }

                if (chip2.getVisibility()==View.VISIBLE)
                {
                    if (chip4.getVisibility() == View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger4 = Double.parseDouble(degerx1);
                        deger4 = deger4 + 273.15;
                        textsonuc.setText(String.valueOf(String.format("%10.2f", deger4)) + " °K");
                    }

                    if (chip5.getVisibility() == View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger5 = Double.parseDouble(degerx1);
                        textsonuc.setText(String.valueOf(String.format("%10.2f", deger5)) + " °C");
                    }

                    if (chip6.getVisibility() == View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger6 = Double.parseDouble(degerx1);
                        deger6 = (deger6 * 9 / 5) + 32;
                        textsonuc.setText(String.valueOf(String.format("%10.2f", deger6)) + " °F");
                    }
                }

                if (chip3.getVisibility()==View.VISIBLE)
                {
                    if(chip4.getVisibility()==View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger7= Double.parseDouble(degerx1);
                        deger7 = (deger7 - 32) * 5/9;
                        deger7 = deger7 + 273.15;
                        textsonuc.setText( String.valueOf(  String.format("%10.2f", deger7))+" °K");
                    }

                    if(chip5.getVisibility()==View.VISIBLE)
                    {
                         String degerx1 = edittext.getText().toString();
                         double deger8= Double.parseDouble(degerx1);
                         deger8 =(deger8 - 32) * 5/9;
                         textsonuc.setText( String.valueOf(  String.format("%10.2f", deger8))+" °C");
                    }

                    if (chip6.getVisibility()==View.VISIBLE)
                    {
                        String degerx1 = edittext.getText().toString();
                        double deger9= Double.parseDouble(degerx1);
                        textsonuc.setText( String.valueOf(  String.format("%10.2f", deger9))+" °F");
                    }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"DefaultLocale", "SetTextI18n"})
            @Override
            public void onClick(View view) {
                textsonuc.setText(" ");
                edittext.setText(" ");
                chip1.setVisibility(View.VISIBLE);
                chip2.setVisibility(View.VISIBLE);
                chip3.setVisibility(View.VISIBLE);
                chip4.setVisibility(View.VISIBLE);
                chip5.setVisibility(View.VISIBLE);
                chip6.setVisibility(View.VISIBLE);
            }
        });

    }
}