package com.example.shelf

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.shelf.adapter.MovieCategoryAdapter
import com.example.shelf.databinding.ActivityMainBinding
import com.example.shelf.factory.Data

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val data = Data.getParentList()
        binding.shelfRecyclerView.adapter = MovieCategoryAdapter(data)

    }
}
