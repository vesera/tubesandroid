package com.example.holowiki.holostars.gen3

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
import com.example.holowiki.hololive.gen1.Fubuki_Activity
import com.example.holowiki.holostars.Holostars_Activity
import com.google.android.material.navigation.NavigationView

class Holostar_Gen3 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var OgaText : TextView
    private lateinit var OgaPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holostar_gen3)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_star_gen3)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        OgaText = findViewById(R.id.Fubuki_Text)
        OgaPic = findViewById(R.id.ShirakamiFubuki)
        OgaText.setOnClickListener {
            val intent = Intent(this, Fubuki_Activity::class.java)
            startActivity(intent)
        }
        OgaPic.setOnClickListener {
            val intent = Intent(this, Fubuki_Activity::class.java)
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