package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var result:TextView
    private var operationClick:String =""
    private var firstNumber:Double = 0.0
    var lastDot:Boolean=false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.result=findViewById(R.id.result)
    }
    fun clickOnNumber(view: View){
        if (view is Button) {
            var textResult = result.text.toString().toInt()
            var number = view.text.toString().toInt()
            result.text = (10*textResult+number).toString()
        }
    }
    fun operationOnClick(view: View){
        if (view is Button){
            operationClick = view.text.toString()
            firstNumber=result.text.toString().toDouble()
            result.text="0"
        }
    }
    fun equalTo(view: View){
        val perc = firstNumber*100
        if (view is Button){
            when (operationClick) {
                "+" -> {
                    result.text=(firstNumber+result.text.toString().toDouble()).toString()
                }
                "-" -> {
                    result.text=(firstNumber-result.text.toString().toDouble()).toString()
                }
                "*" -> {
                    result.text=(firstNumber*result.text.toString().toDouble()).toString()
                }
                "/" -> {
                    result.text=(firstNumber/result.text.toString().toDouble()).toString()
                }
                "√" -> {
                    result.text= (sqrt(firstNumber).toString().toDouble()).toString()
                }
                "+/-" -> {
                    result.text=((firstNumber*(-1)).toString().toDouble()).toString()
                }
                "%"->{
                    //result.text= (perc/result.text).toString().toDouble().toString()
                }
            }
        }
    }
    fun onClear(view: View){
        this.result.text ="0"
    }
}
