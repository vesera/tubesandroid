package com.example.holowiki.hololive.gen3

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

class Hololive_Gen3 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var RushiaText : TextView
    private lateinit var RushiaPic : ImageView
    private lateinit var PekoraText : TextView
    private lateinit var PekoraPic : ImageView
    private lateinit var NoelText : TextView
    private lateinit var NoelPic : ImageView
    private lateinit var FlareText : TextView
    private lateinit var FlarePic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_gen3)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_gen3)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        RushiaText = findViewById(R.id.Rushia_Text)
        RushiaPic = findViewById(R.id.UruhaRushia)
        PekoraText = findViewById(R.id.Pekora_Text)
        PekoraPic = findViewById(R.id.UsadaPekora)
        NoelText = findViewById(R.id.Noel_Text)
        NoelPic = findViewById(R.id.ShiroganeNoel)
        FlareText = findViewById(R.id.Flare_Text)
        FlarePic = findViewById(R.id.ShiranuiFlare)

        RushiaText.setOnClickListener {
            val intent = Intent(this, Rushia_Activity::class.java)
            startActivity(intent)
        }
        RushiaPic.setOnClickListener {
            val intent = Intent(this, Rushia_Activity::class.java)
            startActivity(intent)
        }
        PekoraText.setOnClickListener {
            val intent = Intent(this, Pekora_Activity::class.java)
            startActivity(intent)
        }
        PekoraPic.setOnClickListener {
            val intent = Intent(this, Pekora_Activity::class.java)
            startActivity(intent)
        }
        NoelText.setOnClickListener {
            val intent = Intent(this, Noel_Activity::class.java)
            startActivity(intent)
        }
        NoelPic.setOnClickListener {
            val intent = Intent(this, Noel_Activity::class.java)
            startActivity(intent)
        }
        FlareText.setOnClickListener {
            val intent = Intent(this, Flare_Activity::class.java)
            startActivity(intent)
        }
        FlarePic.setOnClickListener {
            val intent = Intent(this, Flare_Activity::class.java)
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