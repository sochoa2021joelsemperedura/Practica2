package net.iessochoa.joelsemperedura.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class PeliculaActivity extends AppCompatActivity {
TextView tvSinopsis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula);
        tvSinopsis=findViewById(R.id.tvSinopsis);
        //Por si fuese necesario le coloco el scroll
        tvSinopsis.setMovementMethod(new ScrollingMovementMethod());
    }
}