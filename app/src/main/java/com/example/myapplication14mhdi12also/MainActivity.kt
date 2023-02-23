package com.example.myapplication14mhdi12also

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private val tags: String = "kalyni"
    lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        // kriyanshkalyni()
        lifecycleScope.launch {
            delay(1000)
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}
//private fun kriyanshkalyni(){
//    Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
//}

//        GlobalScope.launch {
//            executeKalyani()
//        }
//    }
//    private fun executeKalyani(){
//        Log.d(TagKalyani,"before")
////        GlobalScope.launch {
////            delay(1500)
////            Log.d(TagsKalyaani,"outside")
////        }
//        withContext(Dispatchers.IO){
//            delay(1500)
//            Log.d(TagKalyani,"inside")
//        }
//        Log.d(Tagkalyani,"outsude")
//    }
//}