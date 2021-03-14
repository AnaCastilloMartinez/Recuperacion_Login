package castillo.ana.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val register_btn : Button = findViewById(R.id.register_btn) as Button
        var campoName_et : TextView = findViewById(R.id.name_et) as TextView
        var campoLastName_et : TextView = findViewById(R.id.lastName_et) as TextView

        register_btn.setOnClickListener {
            var nameUser: String = campoName_et.text.toString()
            var lastNameUser: String = campoLastName_et.text.toString()
            //Mostrar unos segundos en pantalla los valores indicados
            //Toast.makeText(this, "$name $lastName", Toast.LENGTH_SHORT).show()

            //Enviar los valores indicados a otra pantalla
            val intent : Intent = Intent(this,WelcomeActivity::class.java)
            intent.putExtra("name", nameUser)
            intent.putExtra("lastName", lastNameUser)
            startActivity(intent)
        }

    }
}