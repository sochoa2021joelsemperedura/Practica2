package net.iessochoa.joelsemperedura.practica2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextoActivity extends AppCompatActivity {
/*
Joel Sempere Durá
Parte opcional 1 - Activity que abre el texto ampliado de la receta activity ya sea ingredientes
descripcion o receta.

 */
    TextView tvTitulo;
    TextView tvContenido;

    //Etiquetas para los extras
    public static final String EXTRA_TITULO="TextoActivity.TITULO";
    public static final String EXTRA_CONTENIDO="TextoActivity.CONTENIDO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto);
        //Iniciamos views
        iniciaViews();
        tvContenido.setText(getIntent().getStringExtra(EXTRA_CONTENIDO));
        //SEGUIR POR AQUI HAY QUE HACERLOS TODOS

        //AHORA AQUI HAY QUE SUSTITUIR EL CONTENIDO POR EL CLICADO EN RECETA
    }
    private void iniciaViews(){
        tvTitulo=findViewById(R.id.tvTitulo);
        tvContenido=findViewById(R.id.tvContenido);
    }
}