package net.iessochoa.joelsemperedura.practica2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgendaConstraintActivity : AppCompatActivity() {
    lateinit var btnOk: Button
    lateinit var btnCancel: Button
    lateinit  var etNombrePersona: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda_constraint)

        //***Inicia las views***//
        iniciaViews()

        //******BOTONES******//

        //***Termina la activity***//
        btnCancel.setOnClickListener { finish() }

        //***Mensaje tipo Toast***//
        btnOk.setOnClickListener {
            val toast = Toast.makeText( applicationContext,
                etNombrePersona.text.toString(), Toast.LENGTH_SHORT
            )
            toast.show()
        }
    }
    //***Inicia las views***//
    private fun iniciaViews() {
        btnOk = findViewById(R.id.btnOk)
        btnCancel = findViewById(R.id.btnCancel)
        etNombrePersona = findViewById(R.id.etNombrePersona)
    }

}