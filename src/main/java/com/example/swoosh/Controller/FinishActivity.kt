package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.R


class FinishActivity : AppCompatActivity() {
    lateinit var searchtext :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        searchtext = findViewById(R.id.searchLeaguesText)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchtext.text= "Looking for $league $skill league near you"
    }
}