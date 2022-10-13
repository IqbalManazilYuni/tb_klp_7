package id.ac.unand.tb_klp_7

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class  DashboardKp : AppCompatActivity(), View.OnClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var mahasiswaList : ArrayList<mahasiswa>
    private lateinit var mahasiswaAdapter: MahasiswaAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_kp)

        val texPindah : TextView = findViewById(R.id.tekprofile)
        texPindah.setOnClickListener(this)
        val gambarPindah : ImageView = findViewById(R.id.profileDosen)
        gambarPindah.setOnClickListener(this)


        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        mahasiswaList = ArrayList()

        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Iqbal Manazil Yuni", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Deyola Fadwa Shifana", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Muhammad Erlangga", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Muhammad Yudishtira", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Kemal Muhammad Heiro", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Ilham", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Dzul Fauzi", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Muhammad Reza Riski Rahmadi", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))
        mahasiswaList.add(mahasiswa(R.drawable.ic_profile_dash, nama_mahasiswa = "Boby Dermawan", nim_mahasiswa = "201152xxxx", lokasi_kp = "PT.Semen Padang"))


        mahasiswaAdapter = MahasiswaAdapter(mahasiswaList)
        recyclerView.adapter = mahasiswaAdapter

        mahasiswaAdapter.onItemClick = {
            val intent = Intent(this, MenuPilihan::class.java)
            startActivity(intent)
        }

    }
    override fun onClick(p0: View?) {
        if (p0!=null){
            when(p0.id){
                R.id.tekprofile ->{
                    val pindahintent = Intent(this, ProfileDosen::class.java)
                    startActivity(pindahintent)
                }
                R.id.profileDosen ->{
                    val pindahintent = Intent(this, ProfileDosen::class.java)
                    startActivity(pindahintent)
                }
            }
        }
    }
}