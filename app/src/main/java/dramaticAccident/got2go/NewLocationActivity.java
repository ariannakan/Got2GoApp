package dramaticAccident.got2go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_location);

        // Get the Intent that started this activity and extract the string location
        Intent intent = getIntent();
        String message = intent.getStringExtra(MapsActivity.LOCATION);

        // Capture the layout's TextView and set the string as its text
        TextView location = findViewById(R.id.location);
        location.setText(message);
    }

    /** Called when the user taps the Map button */
    public void createBathroom(View map) {
        Intent mapIntent = new Intent(this, CreateActivity.class);
        startActivity(mapIntent);
    }
}
