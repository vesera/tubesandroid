package com.example.holowiki.holostars

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
import com.example.holowiki.holostars.gen1.Holostar_Gen1
import com.example.holowiki.holostars.gen2.Holostar_Gen2
import com.example.holowiki.holostars.gen3.Holostar_Gen3
import com.google.android.material.navigation.NavigationView

class Holostars_Activity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var Holo_Gen_1_Text : TextView
    private lateinit var Holo_Gen_1_Pic : ImageView
    private lateinit var Holo_Gen_2_Text : TextView
    private lateinit var Holo_Gen_2_Pic : ImageView
    private lateinit var Holo_Gen_3_Text : TextView
    private lateinit var Holo_Gen_3_Pic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_list)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_layout_hololive)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        Holo_Gen_1_Text = findViewById(R.id.Holostar_Gen1_Text)
        Holo_Gen_1_Pic = findViewById(R.id.Holostar_Gen1)
        Holo_Gen_2_Text = findViewById(R.id.Holostar_Gen2_Text)
        Holo_Gen_2_Pic = findViewById(R.id.Holostar_Gen2)
        Holo_Gen_3_Text = findViewById(R.id.Holostar_Gen3_Text)
        Holo_Gen_3_Pic = findViewById(R.id.Holostar_Gen3)

        Holo_Gen_1_Text.setOnClickListener {
            val intent = Intent(this, Holostar_Gen1::class.java)
            startActivity(intent)
        }
        Holo_Gen_1_Pic.setOnClickListener {
            val intent = Intent(this, Holostar_Gen1::class.java)
            startActivity(intent)
        }
        Holo_Gen_2_Text.setOnClickListener {
            val intent = Intent(this, Holostar_Gen2::class.java)
            startActivity(intent)
        }
        Holo_Gen_2_Pic.setOnClickListener {
            val intent = Intent(this, Holostar_Gen2::class.java)
            startActivity(intent)
        }
        Holo_Gen_3_Text.setOnClickListener {
            val intent = Intent(this, Holostar_Gen3::class.java)
            startActivity(intent)
        }
        Holo_Gen_3_Pic.setOnClickListener {
            val intent = Intent(this, Holostar_Gen3::class.java)
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