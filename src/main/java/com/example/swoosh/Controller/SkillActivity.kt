package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.R

class SkillActivity : BaseActivity() {

    lateinit var beginnerbtn:ToggleButton
    lateinit var ballerbtn : ToggleButton
    lateinit var finishbtn : Button

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        beginnerbtn = findViewById(R.id.beginnerbtn)
        ballerbtn = findViewById(R.id.ballerbtn)
        finishbtn = findViewById(R.id.finish)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }

    fun onfinishclicked(view : View){
        if(skill !=""){
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)

        }else{
            Toast.makeText(this,"please select a skill level ", Toast.LENGTH_LONG).show()
        }


    }
    fun onbeginnerclicked(view: View){
        ballerbtn.isChecked = false
        skill = "beginner"

    }

    fun onballerclicked(view: View){
        beginnerbtn.isChecked = false
        skill = "baller"
    }


}