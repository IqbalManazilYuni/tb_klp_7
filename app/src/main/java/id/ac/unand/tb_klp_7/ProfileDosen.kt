package id.ac.unand.tb_klp_7

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.View
import android.widget.Button
import android.widget.ImageView

class ProfileDosen : AppCompatActivity(){
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_dosen)

        val btnback = findViewById<ImageView>(R.id.backBtn)

        btnback.setOnClickListener{
            Intent(this, DashboardKp::class.java).also{
                startActivity(it)
            }
        }

        val btnupdate = findViewById<Button>(R.id.btnUpdateDosen)

        btnupdate.setOnClickListener{
            Intent(this, UpdateProfile::class.java).also{
                startActivity(it)
            }
        }

        val btnResetPassword = findViewById<Button>(R.id.btnresetpass)

        btnResetPassword.setOnClickListener{
            Intent(this, ResetPassword::class.java).also {
                startActivity(it)
            }
        }
    }
}