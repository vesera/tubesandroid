package com.example.holowiki.hololive.gen1

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

class Hololive_Gen1 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    private lateinit var FubukiText : TextView
    private lateinit var FubukiPic : ImageView
    private lateinit var HaatoText : TextView
    private lateinit var HaatoPic : ImageView
    private lateinit var MatsuriText : TextView
    private lateinit var MatsuriPic : ImageView
    private lateinit var AkiText : TextView
    private lateinit var AkiPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_gen1)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_gen1)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        FubukiText = findViewById(R.id.Fubuki_Text)
        FubukiPic = findViewById(R.id.ShirakamiFubuki)
        HaatoText = findViewById(R.id.Haato_Text)
        HaatoPic = findViewById(R.id.AkaiHaato)
        MatsuriText = findViewById(R.id.Matsuri_Text)
        MatsuriPic = findViewById(R.id.NatsuiroMatsuri)
        AkiText = findViewById(R.id.Aki_Text)
        AkiPic = findViewById(R.id.AkiRosenthal)

        FubukiText.setOnClickListener {
            val intent = Intent(this, Fubuki_Activity::class.java)
            startActivity(intent)
        }
        FubukiPic.setOnClickListener {
            val intent = Intent(this, Fubuki_Activity::class.java)
            startActivity(intent)
        }
        HaatoText.setOnClickListener {
            val intent = Intent(this, Haato_Activity::class.java)
            startActivity(intent)
        }
        HaatoPic.setOnClickListener {
            val intent = Intent(this, Haato_Activity::class.java)
            startActivity(intent)
        }
        MatsuriText.setOnClickListener {
            val intent = Intent(this, Matsuri_Activity::class.java)
            startActivity(intent)
        }
        MatsuriPic.setOnClickListener {
            val intent = Intent(this, Matsuri_Activity::class.java)
            startActivity(intent)
        }
        AkiText.setOnClickListener {
            val intent = Intent(this, Aki_Activity::class.java)
            startActivity(intent)
        }
        AkiPic.setOnClickListener {
            val intent = Intent(this, Aki_Activity::class.java)
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