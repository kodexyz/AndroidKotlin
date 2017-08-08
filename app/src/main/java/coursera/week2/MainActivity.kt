package coursera.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<View>(R.id.buttonKilotoMiles) as Button
        next.setOnClickListener{
            view -> Snackbar.make(
                view, "Tomaaato", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}

