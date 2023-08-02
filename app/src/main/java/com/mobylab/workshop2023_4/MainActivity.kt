package com.mobylab.workshop2023_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mobylab.workshop2023_4.adapter.ItemAdapter
import com.mobylab.workshop2023_4.data.Datasource
import com.mobylab.workshop2023_4.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset : List<Affirmation> = Datasource().loadAffirmations()
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, dataset)
        recyclerView.setHasFixedSize(true)
    }
}