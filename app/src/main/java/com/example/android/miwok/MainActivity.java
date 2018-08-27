/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the "numbers' TextView by id
        View numbers = findViewById(R.id.numbers);
        //Attaching a listener to the "numbers" TextView while creating a new object instance of an OnClickListener
        numbers.setOnClickListener(new View.OnClickListener(){

            //Setting what the freshly created event listener
            @Override
            public void onClick(View view) {
                //Creating a new intent to open the NumbersActivity
                Intent openNumbersActivity = new Intent(MainActivity.this, NumbersActivity.class);
                //Starting the new activity
                startActivity(openNumbersActivity);
            }
        });


        //Find the "colors' TextView by id
        View colors = findViewById(R.id.colors);
        //Attaching a listener to the "numbers" TextView while creating a new object instance of an OnClickListener
        colors.setOnClickListener(new View.OnClickListener(){

            //Setting what the freshly created event listener
            @Override
            public void onClick(View view) {
                //Creating a new intent to open the NumbersActivity
                Intent openColorsActivity = new Intent(MainActivity.this, ColorsActivity.class);
                //Starting the new activity
                startActivity(openColorsActivity);
            }
        });


        //Find the "family' TextView by id
        View family = findViewById(R.id.family);
        //Attaching a listener to the "numbers" TextView while creating a new object instance of an OnClickListener
        family.setOnClickListener(new View.OnClickListener(){

            //Setting what the freshly created event listener
            @Override
            public void onClick(View view) {
                //Creating a new intent to open the NumbersActivity
                Intent openFamilyActivity = new Intent(MainActivity.this, FamilyActivity.class);
                //Starting the new activity
                startActivity(openFamilyActivity);
            }
        });

        //Find the "phrases' TextView by id
        View phrases = findViewById(R.id.phrases);
        //Attaching a listener to the "numbers" TextView while creating a new object instance of an OnClickListener
        phrases.setOnClickListener(new View.OnClickListener(){

            //Setting what the freshly created event listener
            @Override
            public void onClick(View view) {
                //Creating a new intent to open the NumbersActivity
                Intent openPhrasesActivity = new Intent(MainActivity.this, PhrasesActivity.class);
                //Starting the new activity
                startActivity(openPhrasesActivity);
            }
        });
    }

}
