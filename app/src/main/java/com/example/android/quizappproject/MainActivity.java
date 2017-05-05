package com.example.android.quizappproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.name;
import static com.example.android.quizappproject.R.id.nameField;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  }

    /**
     * this method is called when the grade my quiz button is clicked
     * @param view
     */
    public void gradeMyQuiz(View view){
        EditText nameField = (EditText)findViewById(R.id.nameField);
        String value = nameField.getText().toString();
        display(100);
            }
    /**
     * * this method displays the given quantity value on the screen
     */

    private void display (int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.Grade_My_Quiz_button);
        quantityTextView.setText("" + number);

        //apple is a correct answer & should be checked
        CheckBox appleCheckbox = (CheckBox) findViewById(R.id.apple_checkbox);
        boolean isApple = appleCheckbox.isChecked();

        //tidal is a correct answer & should be checked
        CheckBox tidalCheckbox = (CheckBox) findViewById(R.id.tidal_checkbox);
        boolean isTidal = tidalCheckbox.isChecked();

       //spotify is a correct answer & should be checked
        CheckBox spotifyCheckbox = (CheckBox) findViewById(R.id.spotify_checkbox);
        boolean isSpotify = spotifyCheckbox.isChecked();
    }
    int score = calculateScore(isapple, isTidal, isSpotify);
    String scoreMessage = createQuizScore( name, score,);

/**
 * Calculates the quiz score
 *
 * @param isApple is whether or not the user chose apple
 * @param isTidal is whether or not the user chose tidal
 * @param isSpotify is whether or not the user chose spotify
 * @return total score

private int calculateScore(boolean isApple, boolean isTidal, boolean isSpotify) {
// Apple is Checked
int baseScore= 5;

private int calculateScore(boolean isApple, boolean isTidal, boolean isSpotify) {
// Tidal is Checked
int baseScore= 5;

private int calculateScore(boolean isApple, boolean isTidal, boolean isSpotify) {
// Spotify is Checked
int baseScore= 5;
}

// Calculate the total score by adding quantity

return quantity + baseScore;


}

}
