package net.iessochoa.joelsemperedura.practica2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AgendaActivity : AppCompatActivity() {
    lateinit var etNombre : EditText
    lateinit var etApellidos : EditText
    lateinit var etEmail : EditText
    lateinit var etTelefono : EditText
    lateinit var etNotas : EditText
    lateinit var tvNuevoContacto : TextView
    lateinit var btnAceptar : Button
    lateinit var btnReiniciar : Button
    lateinit var btnSalir : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)
        iniciaViews() //carga views
        //***Boton envia el texto escrito al contacto***//
       btnAceptar.setOnClickListener {
            tvNuevoContacto.text = etNombre.text.toString() + " " + etApellidos.text.toString()
        }
        //***Limpia los editText***//
        btnReiniciar.setOnClickListener{
            etNombre.setText("");
            etApellidos.setText("");
            etEmail.setText("");
            etTelefono.setText("");
            etNotas.setText("");
        }
        //***Cerrar view***//
        btnSalir.setOnClickListener{
            finish()
        }

    }

    //Inicia las views
    private fun iniciaViews() {
        etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)
        etEmail = findViewById(R.id.etEmail)
        etTelefono = findViewById(R.id.etTelefono)
        etNotas = findViewById(R.id.etmNotas)
        tvNuevoContacto = findViewById(R.id.tvNuevoContacto)
        btnAceptar = findViewById(R.id.btnAceptar)
        btnReiniciar = findViewById(R.id.btnReiniciar)
        btnSalir = findViewById(R.id.btnSalir)
    }
}