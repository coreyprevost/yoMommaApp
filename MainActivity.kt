package com.example.yomommaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

var arrayYoMommaJokes = arrayOf("Yo momma so fat, her belt size is equator!", "Yo momma is so fat when she got on the scale it said, \"I need your weight not your phone number!\"","Yo momma is so fat, I took a picture of her last Christmas and it's still printing!", "Yo momma is so fat that when she went to the beach a whale swam up and sang, \"We are family, even though you're fatter than me!\"", "Yo mamma is so ugly when she tried to join an ugly contest they said, \"Sorry, no professionals!\"", "Yo momma's so fat and old when God said, \"Let there be light,\" he asked your mother to move out of the way!", "Yo momma's so fat, that when she fell, no one was laughing but the ground was cracking up!", "Yo momma is so fat when she sat on WalMart, she lowered the prices!", "Yo momma is so fat that Dora can't even explore her!", "Yo momma is so fat her bellybutton gets home 15 minutes before she does!", "Yo momma's so stupid, she put two quarters in her ears and thought she was listening to 50 Cent!" )

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var newJokeButtonAction = findViewById<Button>(R.id.button_new__joke)
        var mommaJokeView = findViewById<TextView>(R.id.textView_jokes)
        newJokeButtonAction.setOnClickListener {
           mommaJokeView.text= arrayYoMommaJokes.random()

        }




        }


    }


