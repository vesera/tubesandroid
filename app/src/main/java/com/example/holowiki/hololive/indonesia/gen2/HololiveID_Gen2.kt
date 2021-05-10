package com.example.holowiki.hololive.indonesia.gen2

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

class HololiveID_Gen2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var OllieText : TextView
    private lateinit var OlliePic : ImageView
    private lateinit var ReineText : TextView
    private lateinit var ReinePic : ImageView
    private lateinit var AnyaText : TextView
    private lateinit var AnyaPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololiveid_gen2)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_id_gen2)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        OllieText = findViewById(R.id.Ollie_Text)
        OlliePic = findViewById(R.id.KureijiOllie)
        ReineText = findViewById(R.id.Reine_Text)
        ReinePic = findViewById(R.id.PavoliaReine)
        AnyaText = findViewById(R.id.Anya_Text)
        AnyaPic = findViewById(R.id.AnyaMelfissa)

        OllieText.setOnClickListener {
            val intent = Intent(this, Ollie_Activity::class.java)
            startActivity(intent)
        }
        OlliePic.setOnClickListener {
            val intent = Intent(this, Ollie_Activity::class.java)
            startActivity(intent)
        }
        ReineText.setOnClickListener {
            val intent = Intent(this, Reine_Activity::class.java)
            startActivity(intent)
        }
        ReinePic.setOnClickListener {
            val intent = Intent(this, Reine_Activity::class.java)
            startActivity(intent)
        }
        AnyaText.setOnClickListener {
            val intent = Intent(this, Anya_Activity::class.java)
            startActivity(intent)
        }
        AnyaPic.setOnClickListener {
            val intent = Intent(this, Anya_Activity::class.java)
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