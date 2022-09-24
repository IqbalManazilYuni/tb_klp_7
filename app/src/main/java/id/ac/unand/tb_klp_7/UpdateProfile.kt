package id.ac.unand.tb_klp_7

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class UpdateProfile : AppCompatActivity(){
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_profile)

        val btnback2 = findViewById<ImageView>(R.id.backResetPass)

        btnback2.setOnClickListener{
            Intent(this, ProfileDosen::class.java).also{
                startActivity(it)
            }
        }
        val btnUpdate = findViewById<Button>(R.id.updateBtn)

        btnUpdate.setOnClickListener{
            Intent(this, DashboardKp::class.java).also{
                startActivity(it)
            }
        }
        val btncancel = findViewById<Button>(R.id.cancelBtn)

        btncancel.setOnClickListener{
            Intent(this, ProfileDosen::class.java).also{
                startActivity(it)
            }
        }
    }
}