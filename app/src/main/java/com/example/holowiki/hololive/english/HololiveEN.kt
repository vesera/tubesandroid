package com.example.holowiki.hololive.english

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

class HololiveEN : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var CalliText : TextView
    private lateinit var CalliPic : ImageView
    private lateinit var KiaraText : TextView
    private lateinit var KiaraPic : ImageView
    private lateinit var InaText : TextView
    private lateinit var InaPic : ImageView
    private lateinit var GuraText : TextView
    private lateinit var GuraPic : ImageView
    private lateinit var AmeliaText : TextView
    private lateinit var AmeliaPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_en)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_en)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        CalliText = findViewById(R.id.Calli_Text)
        CalliPic = findViewById(R.id.MoriCalliope)
        KiaraText = findViewById(R.id.Kiara_Text)
        KiaraPic = findViewById(R.id.TakanashiKiara)
        InaText = findViewById(R.id.Ina_Text)
        InaPic = findViewById(R.id.NinomaeInanis)
        GuraText = findViewById(R.id.Gura_Text)
        GuraPic = findViewById(R.id.GawrGura)
        AmeliaText = findViewById(R.id.Amelia_Text)
        AmeliaPic = findViewById(R.id.AmeliaWatson)

        CalliText.setOnClickListener {
            val intent = Intent(this, Calli_Activity::class.java)
            startActivity(intent)
        }
        CalliPic.setOnClickListener {
            val intent = Intent(this, Calli_Activity::class.java)
            startActivity(intent)
        }
        KiaraText.setOnClickListener {
            val intent = Intent(this, Kiara_Activity::class.java)
            startActivity(intent)
        }
        KiaraPic.setOnClickListener {
            val intent = Intent(this, Kiara_Activity::class.java)
            startActivity(intent)
        }
        InaText.setOnClickListener {
            val intent = Intent(this, Ina_Activity::class.java)
            startActivity(intent)
        }
        InaPic.setOnClickListener {
            val intent = Intent(this, Ina_Activity::class.java)
            startActivity(intent)
        }
        GuraText.setOnClickListener {
            val intent = Intent(this, Gura_Activity::class.java)
            startActivity(intent)
        }
        GuraPic.setOnClickListener {
            val intent = Intent(this, Gura_Activity::class.java)
            startActivity(intent)
        }
        AmeliaText.setOnClickListener {
            val intent = Intent(this, Amelia_Activity::class.java)
            startActivity(intent)
        }
        AmeliaPic.setOnClickListener {
            val intent = Intent(this, Amelia_Activity::class.java)
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