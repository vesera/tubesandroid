package com.example.holowiki.hololive.indonesia.gen1

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.holowiki.MainActivity
import com.example.holowiki.R
import com.example.holowiki.hololive.Hololive_Activity
import com.example.holowiki.holostars.Holostars_Activity
import com.google.android.material.navigation.NavigationView
import com.google.firebase.firestore.FirebaseFirestore

class Iofi_Activity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var talent_name: TextView
    private lateinit var ageView: TextView
    private lateinit var birthday: TextView
    private lateinit var debut: TextView
    private lateinit var height: TextView
    private lateinit var profDesc: TextView
    private lateinit var gender: TextView
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        val db_prof = FirebaseFirestore.getInstance().document("Hololive/Talents/Hololive/ID Gen1/Airani Iofifteen/Profile")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iofi)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_layout_iofi)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        talent_name = findViewById(R.id.AiraniIofifteen_Name)
        ageView = findViewById(R.id.AiraniIofifteen_Age)
        birthday = findViewById(R.id.AiraniIofifteen_Birth)
        debut = findViewById(R.id.AiraniIofifteen_Debut)
        height = findViewById(R.id.AiraniIofifteen_Height)
        gender = findViewById(R.id.AiraniIofifteen_Gender)
        profDesc = findViewById(R.id.AiraniIofifteen_ProfDesc)


        db_prof.get().addOnSuccessListener { document ->
            talent_name.text = document.get("name").toString()
            ageView.text = document.get("age").toString()
            birthday.text = document.get("birthday").toString()
            debut.text = document.get("debut").toString()
            height.text = document.get("height").toString()
            gender.text = document.get("gender").toString()
            profDesc.text = document.get("profile_desc").toString()
        }
        drawer.addDrawerListener(toggle)
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