package id.ac.unand.tb_klp_7

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ResetPassword : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val btnback3 = findViewById<ImageView>(R.id.backResetPass)

        btnback3.setOnClickListener{
            Intent(this, ProfileDosen::class.java).also{
                startActivity(it)
            }
        }

        val btnReset = findViewById<Button>(R.id.resetPassword)

        btnReset.setOnClickListener{
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
        val btnBtlReset = findViewById<Button>(R.id.resetcancel)

        btnBtlReset.setOnClickListener{
            Intent(this,ProfileDosen::class.java).also {
                startActivity(it)
            }
        }
    }
}