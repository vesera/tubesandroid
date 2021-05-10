package com.example.holowiki

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.holowiki.hololive.Hololive_Activity
import com.example.holowiki.holostars.Holostars_Activity
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var HololiveText : TextView
    private lateinit var HololivePic : ImageView
    private lateinit var HolostarsText : TextView
    private lateinit var HolostarsPic : ImageView
    private lateinit var navView: NavigationView
    private lateinit var recyclerView: RecyclerView

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.nav_hololive){
            val intent = Intent(this, Hololive_Activity::class.java)
            startActivity(intent)
            return true
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
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_layout)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        HololiveText = findViewById(R.id.Hololive_Text)
        HololivePic = findViewById(R.id.Hololive)
        HolostarsText = findViewById(R.id.Holostars_Text)
        HolostarsPic = findViewById(R.id.Holostars)
        navView = findViewById(R.id.nav_view)

        HololiveText.setOnClickListener {
            val intent = Intent(this, Hololive_Activity::class.java)
            startActivity(intent)
        }
        HololivePic.setOnClickListener {
            val intent1 = Intent(this, Hololive_Activity::class.java)
            startActivity(intent1)
        }
        HolostarsText.setOnClickListener {
            val intent = Intent(this, Holostars_Activity::class.java)
            startActivity(intent)
        }
        HolostarsPic.setOnClickListener {
            val intent = Intent(this, Holostars_Activity::class.java)
            startActivity(intent)
        }

        drawer.addDrawerListener(toggle)
        navView.setNavigationItemSelectedListener(this)
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

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.nav_hololive){
            val intent = Intent(this, Hololive_Activity::class.java)
            startActivity(intent)
        }
        return true
    }
}