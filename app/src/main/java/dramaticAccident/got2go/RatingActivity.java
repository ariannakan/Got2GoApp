package dramaticAccident.got2go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RatingActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    }

    /** Called when the user taps the Map button */
    public void submitRating(View map) {
        Intent mapIntent = new Intent(this, SubmissionActivity.class);
        startActivity(mapIntent);
    }
}
