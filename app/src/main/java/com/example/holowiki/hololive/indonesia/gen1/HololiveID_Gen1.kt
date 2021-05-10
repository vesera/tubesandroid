package com.example.holowiki.hololive.indonesia.gen1

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

class HololiveID_Gen1 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var IofiText : TextView
    private lateinit var IofiPic : ImageView
    private lateinit var MoonaText : TextView
    private lateinit var MoonaPic : ImageView
    private lateinit var RisuText : TextView
    private lateinit var RisuPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololiveid_gen1)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_id_gen1)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        IofiText = findViewById(R.id.Iofi_Text)
        IofiPic = findViewById(R.id.AiraniIofifteen)
        MoonaText = findViewById(R.id.Moona_Text)
        MoonaPic = findViewById(R.id.MoonaHoshinova)
        RisuText = findViewById(R.id.Risu_Text)
        RisuPic = findViewById(R.id.AyundaRisu)

        IofiText.setOnClickListener {
            val intent = Intent(this, Iofi_Activity::class.java)
            startActivity(intent)
        }
        IofiPic.setOnClickListener {
            val intent = Intent(this, Iofi_Activity::class.java)
            startActivity(intent)
        }
        MoonaText.setOnClickListener {
            val intent = Intent(this, Moona_Activity::class.java)
            startActivity(intent)
        }
        MoonaPic.setOnClickListener {
            val intent = Intent(this, Moona_Activity::class.java)
            startActivity(intent)
        }
        RisuText.setOnClickListener {
            val intent = Intent(this, Risu_Activity::class.java)
            startActivity(intent)
        }
        RisuPic.setOnClickListener {
            val intent = Intent(this, Risu_Activity::class.java)
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