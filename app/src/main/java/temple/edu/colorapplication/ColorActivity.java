package temple.edu.colorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import temple.edu.colorapplication.adapters.colorAdapter;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.colorSpinner);
        String colors[] = getResources().getStringArray(R.array.colors);

        spinner.setAdapter(new colorAdapter(this, colors));
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                findViewById(R.id.colorMain).setBackgroundColor(Color.parseColor((String) spinner.getItemAtPosition(position)));
                view.setBackgroundColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




//        Spinner colorSpinner = findViewById(R.id.colorSpinner);
//        colorSpinner.setAdapter(new colorAdapter(this, colors));
    }
}
