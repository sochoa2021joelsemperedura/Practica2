package net.iessochoa.joelsemperedura.practica2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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
        //Añadiendo Scroll al apartado contenido por si ocupa más espacio del disponible
        tvContenido.setMovementMethod(new ScrollingMovementMethod());
        //Estableciendo el texto que se le pasa a esta nueva view al clicar en 'x' text view de recetaActivity
        tvContenido.setText(getIntent().getStringExtra(EXTRA_CONTENIDO));
        tvTitulo.setText(getIntent().getStringExtra(EXTRA_TITULO));
    }
    private void iniciaViews(){
        tvTitulo=findViewById(R.id.tvTitulo);
        tvContenido=findViewById(R.id.tvContenido);
    }
}