package com.example.and_todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<String>()
        items.add("item1")
        items.add("item2")
        items.add("item3")

        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, items)
        val list = findViewById<ListView>(R.id.list)
        list.adapter = adapter
    }
}
