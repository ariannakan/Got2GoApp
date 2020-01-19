package dramaticAccident.got2go;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //DatabaseHelper TOILETS;
    //DatabaseHelper2 RATINGS;
    DatabaseHelper TOILETS;

    public static final String EXTRA_MESSAGE = "dramaticAccident.got2go.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TOILETS = new DatabaseHelper(this);
        //RATINGS = new DatabaseHelper2(this);
        TOILETS = new DatabaseHelper(this);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user taps the Map button */
    public void goToMap(View map) {
        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    /** Called when the user taps on User Agreement */
    public void pop(View view) {
        Intent i = new Intent(getApplicationContext(), PopActivity.class);
        startActivity(i);
    }

    /** Called when the user taps the Map button */
    public void goToRating(View map) {
        Intent mapIntent = new Intent(this, RatingActivity.class);
        startActivity(mapIntent);
    }

}
