package id.ac.unand.tb_klp_7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(private val mahasiswaList:ArrayList<mahasiswa>)
    : RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>(){

    class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageview : ImageView = itemView.findViewById(R.id.gambar_1)
        val namaMahasiswa : TextView = itemView.findViewById(R.id.nama)
        val nimMahasiswa : TextView = itemView.findViewById(R.id.nim)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mahasiswa, parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val mahasiswa = mahasiswaList[position]
        holder.imageview.setImageResource(mahasiswa.imgview)
        holder.namaMahasiswa.text = mahasiswa.nama_mahasiswa
        holder.nimMahasiswa.text = mahasiswa.nim_mahasiswa
    }

    override fun getItemCount(): Int {
        return mahasiswaList.size
    }
}