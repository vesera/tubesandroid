package com.example.holowiki.hololive.gen2

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

class Hololive_Gen2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var AquaText : TextView
    private lateinit var AquaPic : ImageView
    private lateinit var ShionText : TextView
    private lateinit var ShionPic : ImageView
    private lateinit var ChocoText : TextView
    private lateinit var ChocoPic : ImageView
    private lateinit var SubaruText : TextView
    private lateinit var SubaruPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_gen2)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_gen2)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        AquaText = findViewById(R.id.Aqua_Text)
        AquaPic = findViewById(R.id.MinatoAqua)
        ShionText = findViewById(R.id.Shion_Text)
        ShionPic = findViewById(R.id.MurasakiShion)
        ChocoText = findViewById(R.id.Choco_Text)
        ChocoPic = findViewById(R.id.YuzukiChoco)
        SubaruText = findViewById(R.id.Subaru_Text)
        SubaruPic = findViewById(R.id.OozoraSubaru)

        AquaText.setOnClickListener {
            val intent = Intent(this, Aqua_Activity::class.java)
            startActivity(intent)
        }
        AquaPic.setOnClickListener {
            val intent = Intent(this, Aqua_Activity::class.java)
            startActivity(intent)
        }
        ShionText.setOnClickListener {
            val intent = Intent(this, Shion_Activity::class.java)
            startActivity(intent)
        }
        ShionPic.setOnClickListener {
            val intent = Intent(this, Shion_Activity::class.java)
            startActivity(intent)
        }
        ChocoText.setOnClickListener {
            val intent = Intent(this, Choco_Activity::class.java)
            startActivity(intent)
        }
        ChocoPic.setOnClickListener {
            val intent = Intent(this, Choco_Activity::class.java)
            startActivity(intent)
        }
        SubaruText.setOnClickListener {
            val intent = Intent(this, Subaru_Activity::class.java)
            startActivity(intent)
        }
        SubaruPic.setOnClickListener {
            val intent = Intent(this, Subaru_Activity::class.java)
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