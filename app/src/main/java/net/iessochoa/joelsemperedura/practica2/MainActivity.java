package net.iessochoa.joelsemperedura.practica2;
/*
Joel Sempere Durá
Practica 2
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAgenda;
    Button btnAgendaConstraint;
    Button btnReceta;
    Button btnPelicula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Iniciamos las views
        iniciaViews();

        //Creamos el evento del clic que nos lleva a las nuevas views
        btnAgenda.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,AgendaActivity.class));

        });
        btnAgendaConstraint.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,AgendaConstraintActivity.class));
        });
        btnReceta.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,RecetaActivity.class));
        });

        btnPelicula.setOnClickListener(view -> {
            startActivity(new Intent (MainActivity.this,PeliculaActivity.class));
        });

    }

    //Metodo que inicia las views, vincula los objetos botones creados en nuestra clase con el id que identifica al boton de la view
    private void iniciaViews() {
        btnAgenda=findViewById(R.id.btnAgenda);
        btnAgendaConstraint=findViewById(R.id.btnAgendaConstraint);
        btnReceta=findViewById(R.id.btnReceta);
        btnPelicula=findViewById(R.id.btnPelicula);
    }

}