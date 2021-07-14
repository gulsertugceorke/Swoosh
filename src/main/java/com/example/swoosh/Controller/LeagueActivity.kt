package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.R

class LeagueActivity : BaseActivity() {

   lateinit var mensbtn : ToggleButton
   lateinit var womensbtn : ToggleButton
   lateinit var coedbtn : ToggleButton
   lateinit var nextbtn : Button


    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

         mensbtn  = findViewById(R.id.mensLeaguebtn)
         womensbtn  =findViewById(R.id.womensleaguebtn)
         coedbtn = findViewById(R.id.coedleaguebtn)
        nextbtn = findViewById(R.id.nextbtn)

    }

    fun onmensclicked(view: View){
        womensbtn.isChecked = false
        coedbtn.isChecked = false

        selectedLeague = "mens"

    }

    fun onwomensclicked(view: View){
        mensbtn.isChecked =false
        coedbtn.isChecked = false
        selectedLeague = "womens"

    }

    fun oncoedclicked(view: View){
        mensbtn.isChecked = false
        womensbtn.isChecked = false
        selectedLeague = "co-ed"

    }


    fun onnextclicked(view: View){
       if(selectedLeague !=""){
           val skillActivity = Intent(this, SkillActivity::class.java)
           skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
           startActivity(skillActivity)

       }else
           Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()


    }
}