package coursera.week2;

/**
 * Created by jesus on 8/8/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button view = (Button) findViewById(R.id.buttonMilestoKilos);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText Miles = (EditText) findViewById(R.id.buttonMilestoKilos)
            }
        })
    }
}
