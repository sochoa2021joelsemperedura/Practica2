package net.iessochoa.joelsemperedura.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        tvDescripcionContenido.setOnClickListener(view -> {
            /*
        startActivity(
                new Intent(RecetaActivity.this,TextoActivity.class).putExtra(
                        TextoActivity.EXTRA_TITULO,tvDescripcion.getText().toString()
                ));
        )
        REVISAR ESTO QUE FUNCIONA PERO FALLA LA SINTAXIS
             */

        });

        tvRecetaContenido.setOnClickListener(view -> {

        });

        tvIngredientesContenido.setOnClickListener(view -> {

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
}