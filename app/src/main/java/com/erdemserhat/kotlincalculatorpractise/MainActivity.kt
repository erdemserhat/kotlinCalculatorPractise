package com.erdemserhat.kotlincalculatorpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.erdemserhat.kotlincalculatorpractise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.oneIcon.setOnClickListener(View.OnClickListener {
            var temp:String=binding.processText.text.toString()
            binding.processText.setText(temp+"1")
        })




    }


}