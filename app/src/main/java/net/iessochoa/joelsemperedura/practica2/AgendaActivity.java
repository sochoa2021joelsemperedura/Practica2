package net.iessochoa.joelsemperedura.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {
    EditText etNombre, etApellidos, etEmail, etTelefono, etNotas;
    TextView tvNuevoContacto;
    Button btnAceptar, btnReiniciar, btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        iniciaViews();
        /*
        Envia el texto escrito en los edit text nombre y apellidos al textview contacto a traves del evento lanzado por el boton aceptar
         */
        btnAceptar.setOnClickListener(view -> {
            tvNuevoContacto.setText(etNombre.getText().toString()+" "+etApellidos.getText().toString());
        });
        /*
        Guarda en un array todos los editText creados y lo recorre con un foreach en el cual se
        establece un valor -> "" (es decir nada) para limpiarlos.
         */
        btnReiniciar.setOnClickListener(view -> {
            EditText[] et = {
                    etNombre, etApellidos,etEmail,etTelefono,etNotas
            };
            for (EditText e:et) {
                e.setText("");
            }
        });
        /*
        Boton que lanza metodo que cierra la view
         */
        btnSalir.setOnClickListener(view -> {
            finish();
        });

    }
    //Inicia todos los objetos de la pantalla relacionandolos con los objetos de la clase
    private void iniciaViews(){
        tvNuevoContacto=findViewById(R.id.tvNuevoContacto);

        btnAceptar=findViewById(R.id.btnAceptar);
        btnReiniciar=findViewById(R.id.btnReiniciar);
        btnSalir=findViewById(R.id.btnSalir);

        etNombre=findViewById(R.id.etNombre);
        etApellidos=findViewById(R.id.etApellidos);
        etEmail=findViewById(R.id.etEmail);
        etTelefono=findViewById(R.id.etTelefono);
        etNotas=findViewById(R.id.etmNotas);
    }
}