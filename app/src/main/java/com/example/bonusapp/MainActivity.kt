package com.example.bonusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val images = listOf<image>(
                image("benjamin", R.drawable.benjamin),
                image("brigadasmn", R.drawable.brigada),
                image("gashala kudi", R.drawable.farshevangi),
                image("natliiii", R.drawable.godfather),
                image("heil dzia", R.drawable.hitler),
                image("son of anarchy", R.drawable.jax),
                image("krasavica", R.drawable.liv),
                image("besikichi", R.drawable.stalin)
        )
        val recyclerView = findViewById<RecyclerView>(R.id.ImagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)




    }
}