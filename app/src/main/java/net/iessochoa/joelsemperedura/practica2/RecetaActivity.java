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
            Intent intent = new Intent(RecetaActivity.this, TextoActivity.class);
            intent.putExtra(TextoActivity.EXTRA_TITULO, tvDescripcion.getText().toString());
            startActivity(intent);

        });

        tvRecetaContenido.setOnClickListener(view -> {
            //HACER LOS QUE FALTAN
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