package com.example.holowiki.hololive.gen4

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

class Hololive_Gen4 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var WatameText : TextView
    private lateinit var WatamePic : ImageView
    private lateinit var CocoText : TextView
    private lateinit var CocoPic : ImageView
    private lateinit var KanataText : TextView
    private lateinit var KanataPic : ImageView
    private lateinit var LunaText : TextView
    private lateinit var LunaPic : ImageView
    private lateinit var TowaText : TextView
    private lateinit var TowaPic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hololive_gen4)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_gen4)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        WatameText = findViewById(R.id.Watame_Text)
        WatamePic = findViewById(R.id.TsunomakiWatame)
        CocoText = findViewById(R.id.Coco_Text)
        CocoPic = findViewById(R.id.KiryuuCoco)
        KanataText = findViewById(R.id.Kanata_Text)
        KanataPic = findViewById(R.id.AmaneKanata)
        LunaText = findViewById(R.id.Luna_Text)
        LunaPic = findViewById(R.id.HimemoriLuna)
        TowaText = findViewById(R.id.Towa_Text)
        TowaPic = findViewById(R.id.TokoyamiTowa)

        WatameText.setOnClickListener {
            val intent = Intent(this, Watame_Activity::class.java)
            startActivity(intent)
        }
        WatamePic.setOnClickListener {
            val intent = Intent(this, Watame_Activity::class.java)
            startActivity(intent)
        }
        CocoText.setOnClickListener {
            val intent = Intent(this, Coco_Activity::class.java)
            startActivity(intent)
        }
        CocoPic.setOnClickListener {
            val intent = Intent(this, Coco_Activity::class.java)
            startActivity(intent)
        }
        KanataText.setOnClickListener {
            val intent = Intent(this, Kanata_Activity::class.java)
            startActivity(intent)
        }
        KanataPic.setOnClickListener {
            val intent = Intent(this, Kanata_Activity::class.java)
            startActivity(intent)
        }
        LunaText.setOnClickListener {
            val intent = Intent(this, Luna_Activity::class.java)
            startActivity(intent)
        }
        LunaPic.setOnClickListener {
            val intent = Intent(this, Luna_Activity::class.java)
            startActivity(intent)
        }
        TowaText.setOnClickListener {
            val intent = Intent(this, Towa_Activity::class.java)
            startActivity(intent)
        }
        TowaPic.setOnClickListener {
            val intent = Intent(this, Towa_Activity::class.java)
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