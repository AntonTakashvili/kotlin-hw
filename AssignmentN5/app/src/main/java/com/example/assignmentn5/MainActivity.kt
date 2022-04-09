package com.example.assignmentn5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.room.Room
import com.example.assignmentn5.DataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    lateinit var runDistance: EditText
    lateinit var swimDistance: EditText
    lateinit var calories: EditText
    lateinit var info1: TextView
    private lateinit var info2: TextView
    private lateinit var info3: TextView
    private lateinit var save: Button
    lateinit var dataBase: DataBase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runDistance = findViewById(R.id.run)
        swimDistance = findViewById(R.id.swim)
        calories = findViewById(R.id.calories)
        info1 = findViewById(R.id.results)
        info2 = findViewById(R.id.results2)
        info3 = findViewById(R.id.results3)
        save = findViewById(R.id.save)

        save.setOnClickListener {
            if (checkInputs()) {
                Toast.makeText(this, "fill fields", Toast.LENGTH_SHORT).show()
            } else {
                val runDist=App.instance.db.userDao().avgOfRunDis().toString()
                val totalRun=App.instance.db.userDao().totalOfRunDis().toString()
                info1.text = ("$runDist $totalRun").toDouble().toString()

                val swimDist = App.instance.db.userDao().avgOfSwimDis().toString()
                info2.text=swimDist.toDouble().toString()
                val cal = App.instance.db.userDao().avgOfcals().toString()
                info3.text= cal.toDouble().toString()

                clear()
                }
            }
        }


    private fun checkInputs(): Boolean {
        return runDistance.text.toString().isEmpty() ||
                swimDistance.text.toString().isEmpty() ||
                calories.text.toString().isEmpty()
    }
    private fun clear() {
        runDistance.setText("")
        swimDistance.setText("")
        calories.setText("")
    }
}