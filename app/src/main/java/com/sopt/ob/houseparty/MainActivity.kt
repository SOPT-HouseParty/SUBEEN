package com.sopt.ob.houseparty

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.sopt.ob.houseparty.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickEvent()
    }

    private fun addNickname(view: View) {
        binding.tvName.text = binding.etName.text
        binding.etName.visibility = View.GONE
        view.visibility = View.GONE
        binding.tvName.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun clickEvent() {
        binding.btnDone.setOnClickListener {
            addNickname(it)
        }
    }
}