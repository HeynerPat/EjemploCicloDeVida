import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.ejemplociclodevida.R

class MainActivity : AppCompatActivity() {

    var nombre = "Heyner"
    val NOMBRE = "nombre"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)

        //Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()

        boton.setOnClickListener{
            nombre = "Hessiel"
            Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        nombre = savedInstanceState?.getString(NOMBRE)!!
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putString(NOMBRE, nombre)
    }
} 