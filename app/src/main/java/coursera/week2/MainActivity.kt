package coursera.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MilesButton = findViewById<View>(R.id.buttonMilestoKilos) as Button
        MilesButton.setOnClickListener {
            view ->
            //Miles to kilos
            val textMiles = findViewById<View>(R.id.MilesInput) as EditText
            val result = (textMiles.text.toString().toDouble() * 1.609344)
            KilosInput.setText(result.toString())
        }
        val KilosButton= findViewById<View>(R.id.buttonKilotoMiles)
        KilosButton.setOnClickListener {
            view ->
            // Kilos to Miles
            val textKilos = findViewById<View>(R.id.KilosInput) as EditText
            val result = (textKilos.text.toString().toDouble() / 1.609344)
            MilesInput.setText(result.toString())
        }
    }
}


