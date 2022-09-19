package com.sopt.ob.houseparty

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.getSystemService
import androidx.databinding.DataBindingUtil
import com.sopt.ob.houseparty.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("KIM SU BEEN")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

        clickEvent()
    }

    private fun addNickname(view: View) {
        binding.apply {

            myName?.nickname = etName.text.toString()

            etName.visibility = View.GONE
            view.visibility = View.GONE
            tvName.visibility = View.VISIBLE
        }
        val imm = getSystemService<InputMethodManager>()
        imm?.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun clickEvent() {
        binding.btnDone.setOnClickListener {
            addNickname(it)
        }
    }
}