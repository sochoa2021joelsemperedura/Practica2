package net.iessochoa.joelsemperedura.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class RecetaActivity extends AppCompatActivity {
    TextView tvDescripcion, tvDescripcionContenido, tvReceta, tvRecetaContenido, tvIngredientes, tvIngredientesContenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);

        //iniciamos las views
        iniciaViews();

        //Botones que envian a la nueva view el texto y el titulo del textview que es clicado
        tvDescripcionContenido.setOnClickListener(view -> {
            iniciaActividad(tvDescripcionContenido,tvDescripcion);

        });

        tvRecetaContenido.setOnClickListener(view -> {
            iniciaActividad(tvRecetaContenido,tvReceta); //hacer scroll
        });

        tvIngredientesContenido.setOnClickListener(view -> {
        iniciaActividad(tvIngredientesContenido,tvIngredientes);
        });
    }
    private void iniciaViews(){
        tvDescripcion=findViewById(R.id.tvDescripcion);
        tvDescripcionContenido=findViewById(R.id.tvDescripcionContenido);

        tvIngredientes=findViewById(R.id.tvIngredientes);
        tvIngredientesContenido=findViewById(R.id.tvIngredientesContenido);

        tvReceta=findViewById(R.id.tvReceta);
        tvRecetaContenido=findViewById(R.id.tvRecetaContenido);

    }
    /*
    Metodo que crea el intent e inicia la actividad recibiendo como parametros los text view a los que hace referencia
     */
    private void iniciaActividad(TextView enviaEsto1, TextView enviaEsto2){
        Intent intent = new Intent(RecetaActivity.this, TextoActivity.class);
        intent.putExtra(TextoActivity.EXTRA_CONTENIDO, enviaEsto1.getText().toString());
        intent.putExtra(TextoActivity.EXTRA_TITULO,enviaEsto2.getText().toString());
        startActivity(intent);
    }
}