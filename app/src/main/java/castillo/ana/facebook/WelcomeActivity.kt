package castillo.ana.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var bundle = intent.extras
        var fullName = findViewById(R.id.fullname_txt) as TextView

        if(bundle !=null){
            var nameUser = bundle.getString("name")
            var lastNameUser = bundle.getString("lastName")
            fullName.setText("$nameUser $lastNameUser")
        }
    }
}