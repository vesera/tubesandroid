package com.example.holowiki.holostars.gen1

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

class Holostar_Gen1 : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var MiyabiText : TextView
    private lateinit var MiyabiPic : ImageView
    private lateinit var KiraText : TextView
    private lateinit var KiraPic : ImageView
    private lateinit var AruranText : TextView
    private lateinit var AruranPic : ImageView
    private lateinit var IzuruText : TextView
    private lateinit var IzuruPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holostar_gen1)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_star_gen1)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        MiyabiText = findViewById(R.id.Hanasaki_Text)
        MiyabiPic = findViewById(R.id.HanasakiMiyabi)
        KiraText = findViewById(R.id.Kira_Text)
        KiraPic = findViewById(R.id.KagamiKira)
        AruranText = findViewById(R.id.Arurandeisu_Text)
        AruranPic = findViewById(R.id.Arurandeisu)
        IzuruText = findViewById(R.id.Izuru_Text)
        IzuruPic = findViewById(R.id.KanadeIzuru)

        MiyabiText.setOnClickListener {
            val intent = Intent(this, Miyabi_Activity::class.java)
            startActivity(intent)
        }
        MiyabiPic.setOnClickListener {
            val intent = Intent(this, Miyabi_Activity::class.java)
            startActivity(intent)
        }
        KiraText.setOnClickListener {
            val intent = Intent(this, Kira_Activity::class.java)
            startActivity(intent)
        }
        KiraPic.setOnClickListener {
            val intent = Intent(this, Kira_Activity::class.java)
            startActivity(intent)
        }
        AruranText.setOnClickListener {
            val intent = Intent(this, Arurandeisu_Activity::class.java)
            startActivity(intent)
        }
        AruranPic.setOnClickListener {
            val intent = Intent(this, Arurandeisu_Activity::class.java)
            startActivity(intent)
        }
        IzuruText.setOnClickListener {
            val intent = Intent(this, Izuru_Activity::class.java)
            startActivity(intent)
        }
        IzuruPic.setOnClickListener {
            val intent = Intent(this, Izuru_Activity::class.java)
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