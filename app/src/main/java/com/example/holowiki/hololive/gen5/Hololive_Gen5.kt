package com.example.holowiki.hololive.gen5

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

class Hololive_Gen5 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var BotanText : TextView
    private lateinit var BotanPic : ImageView
    private lateinit var PolkaText : TextView
    private lateinit var PolkaPic : ImageView
    private lateinit var LamyText : TextView
    private lateinit var LamyPic : ImageView
    private lateinit var NeneText : TextView
    private lateinit var NenePic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_gen5)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_gen5)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        BotanText = findViewById(R.id.Botan_Text)
        BotanPic = findViewById(R.id.ShishiroBotan)
        PolkaText = findViewById(R.id.Polka_Text)
        PolkaPic = findViewById(R.id.OmaruPolka)
        LamyText = findViewById(R.id.Lamy_Text)
        LamyPic = findViewById(R.id.YukihanaLamy)
        NeneText = findViewById(R.id.Nene_Text)
        NenePic = findViewById(R.id.MomosuzuNene)

        BotanText.setOnClickListener {
            val intent = Intent(this, Botan_Activity::class.java)
            startActivity(intent)
        }
        BotanPic.setOnClickListener {
            val intent = Intent(this, Botan_Activity::class.java)
            startActivity(intent)
        }
        PolkaText.setOnClickListener {
            val intent = Intent(this, Polka_Activity::class.java)
            startActivity(intent)
        }
        PolkaPic.setOnClickListener {
            val intent = Intent(this, Polka_Activity::class.java)
            startActivity(intent)
        }
        LamyText.setOnClickListener {
            val intent = Intent(this, Lamy_Activity::class.java)
            startActivity(intent)
        }
        LamyPic.setOnClickListener {
            val intent = Intent(this, Lamy_Activity::class.java)
            startActivity(intent)
        }
        NeneText.setOnClickListener {
            val intent = Intent(this, Nene_Activity::class.java)
            startActivity(intent)
        }
        NenePic.setOnClickListener {
            val intent = Intent(this, Nene_Activity::class.java)
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