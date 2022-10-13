package id.ac.unand.tb_klp_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailLogbookFragment : Fragment() {

    private lateinit var adapter: LogBookAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var logbookArrayList: ArrayList<datalogbook>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_logbook, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.recycler_view_2)
        recyclerView.layoutManager = LinearLayoutManager(context)

        logbookArrayList = ArrayList()

        logbookArrayList.add(datalogbook(hari = "Senin", tanggal = "6 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Selasa", tanggal = "7 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Rabu", tanggal = "8 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Kamis", tanggal = "9 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Jumat", tanggal = "10 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Senin", tanggal = "11 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Selasa", tanggal = "12 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Rabu", tanggal = "13 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Kamis", tanggal = "14 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Jumat", tanggal = "15 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Senin", tanggal = "16 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Selasa", tanggal = "17 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Rabu", tanggal = "18 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Kamis", tanggal = "19 Oktober 2022"))
        logbookArrayList.add(datalogbook(hari = "Jumat", tanggal = "20 Oktober 2022"))

        adapter = LogBookAdapter(logbookArrayList)
        recyclerView.adapter = adapter
    }


}