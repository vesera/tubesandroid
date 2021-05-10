package com.example.holowiki.hololive.gen0

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.holowiki.MainActivity
import com.example.holowiki.R
import com.example.holowiki.hololive.Hololive_Activity
import com.example.holowiki.holostars.Holostars_Activity
import com.google.android.material.navigation.NavigationView

class Hololive_Gen0 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var SoraText : TextView
    private lateinit var SoraPic : ImageView
    private lateinit var MikoText : TextView
    private lateinit var MikoPic : ImageView
    private lateinit var RobocoText : TextView
    private lateinit var RobocoPic : ImageView
    private lateinit var SuiseiText : TextView
    private lateinit var SuiseiPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_gen0)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_gen0)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        SoraText = findViewById(R.id.Sora_Text)
        SoraPic = findViewById(R.id.TokinoSora)
        MikoText = findViewById(R.id.Miko_Text)
        MikoPic = findViewById(R.id.SakuraMiko)
        RobocoText = findViewById(R.id.Roboco_Text)
        RobocoPic = findViewById(R.id.Roboco)
        SuiseiText = findViewById(R.id.Suisei_Text)
        SuiseiPic = findViewById(R.id.HoshimachiSuisei)

        SoraText.setOnClickListener {
            val intent = Intent(this, Sora_Activity::class.java)
            startActivity(intent)
        }
        SoraPic.setOnClickListener {
            val intent = Intent(this, Sora_Activity::class.java)
            startActivity(intent)
        }
        MikoText.setOnClickListener {
            val intent = Intent(this, Miko_Activity::class.java)
            startActivity(intent)
        }
        MikoPic.setOnClickListener {
            val intent = Intent(this, Miko_Activity::class.java)
            startActivity(intent)
        }
        RobocoText.setOnClickListener {
            val intent = Intent(this, Roboco_Activity::class.java)
            startActivity(intent)
        }
        RobocoPic.setOnClickListener {
            val intent = Intent(this, Roboco_Activity::class.java)
            startActivity(intent)
        }
        SuiseiText.setOnClickListener {
            val intent = Intent(this, Suisei_Activity::class.java)
            startActivity(intent)
        }
        SuiseiPic.setOnClickListener {
            val intent = Intent(this, Suisei_Activity::class.java)
            startActivity(intent)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.nav_hololive){
            val intent = Intent(this, Hololive_Activity::class.java)
            startActivity(intent)
        }
        else if(item.itemId == R.id.nav_holostars){
            val intent = Intent(this, Holostars_Activity::class.java)
            startActivity(intent)
            return true
        }
        else if(item.itemId == R.id.nav_Home){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            return true
        }
        return true
    }
}