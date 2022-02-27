package net.iessochoa.joelsemperedura.practica2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btnAgenda: Button
    lateinit var btnReceta: Button
    lateinit var btnAgendaConstraint: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()

        //******BOTONES******//

        //***Iniciar Agenda Linear Layout***//
        btnAgenda.setOnClickListener {
            startActivity(Intent(
                    this,AgendaActivity::class.java
                )
            )
        }
        //***Iniciar Agenda Constraint***//
        btnAgendaConstraint.setOnClickListener {
            startActivity(Intent(
                    this,AgendaConstraintActivity::class.java
                )
            )
        }
        //***Iniciar Activity Receta***//
        btnReceta.setOnClickListener { startActivity(Intent(
                    this,RecetaActivity::class.java
                )
            )
        }
    }

    //***Iniciamos las views***//
    private fun iniciaViews() {
        btnAgenda = findViewById(R.id.btnAgenda)
        btnAgendaConstraint = findViewById(R.id.btnAgendaConstraint)
        btnReceta = findViewById(R.id.btnReceta)
    }
}