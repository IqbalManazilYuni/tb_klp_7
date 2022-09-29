package id.ac.unand.tb_klp_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin: Button = findViewById(R.id.button2)
        btnLogin.setOnClickListener(this)
    }
    override fun onClick(p0: View?){
        if (p0!=null){
            when(p0.id){
                R.id.button2 ->{
                    val pindahintent = Intent(this, DashboardKp::class.java)
                    startActivity(pindahintent)
                    finish()
                }
            }
        }
    }

}