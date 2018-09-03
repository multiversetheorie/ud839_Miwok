package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

      ArrayList<Word> words = new ArrayList<>();

      words.add(new Word("one", "lutti"));
      words.add(new Word("two", "otiiko"));
      words.add(new Word("three", "tolookosu"));
      words.add(new Word("four", "oyyisa"));
      words.add(new Word("five", "massokka"));
      words.add(new Word("six", "temmokka"));
      words.add(new Word("seven", "kenekaku"));
      words.add(new Word("eight", "kawinta"));
      words.add(new Word("nine", "wo’e"));
      words.add(new Word("ten", "na’aacha"));

        // Create an {@link WordAdapter}, whose data source is a two lists of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined by us.
        // This list item layout contains a two {@link TextViews}, which the adapter will set to
        // display a two words.
        WordAdapter wordAdapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link WordAdapter} with the variable name wordAdapter.
        listView.setAdapter(wordAdapter);
    }
}
