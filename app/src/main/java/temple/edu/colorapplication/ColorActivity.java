package temple.edu.colorapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import temple.edu.colorapplication.adapters.colorAdapter;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.colorSpinner);
        String colors[] = getResources().getStringArray(R.array.colors);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors, R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(new colorAdapter(this, colors));



//        Spinner colorSpinner = findViewById(R.id.colorSpinner);
//        colorSpinner.setAdapter(new colorAdapter(this, colors));
    }
}
