package net.iessochoa.joelsemperedura.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgendaConstraintActivity extends AppCompatActivity {
    Button btnOk;
    Button btnCancel;
    EditText etNombrePersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_constraint);

        //  Iniciamos las views
        iniciaViews();

        //Acciones de los botones
        btnCancel.setOnClickListener(view -> {
            finish();
        });

        //Lanza un mensaje flotante que hace referencia al edit text del nombre introducido para el contacto
        btnOk.setOnClickListener(view -> {
            Toast tostada= Toast.makeText(getApplicationContext(),etNombrePersona.getText().toString(), Toast.LENGTH_SHORT);
            tostada.show();
        });

    }


    private void iniciaViews(){
        btnOk=findViewById(R.id.btnOk);
        btnCancel=findViewById(R.id.btnCancel);
        etNombrePersona=findViewById(R.id.etNombrePersona);
    }
}