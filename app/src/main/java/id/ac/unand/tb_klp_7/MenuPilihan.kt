package id.ac.unand.tb_klp_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuPilihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pilihan)

        val btnubacktolist = findViewById<ImageView>(R.id.backBtnDetail)

        btnubacktolist.setOnClickListener{
            Intent(this, DashboardKp::class.java).also{
                startActivity(it)
            }
        }
    }
}