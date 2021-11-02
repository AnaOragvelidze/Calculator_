package com.example.calculator_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var operand : Double = 0.0
    private var operation: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        resultTextView = findViewById(R.id.resultTextView5)

    }

    fun numberClick(clickedview: View ){

        if (clickedview is TextView) {

            var result = resultTextView.text.toString()
            val number = clickedview.text.toString()

            if (result == "0") {
                result = ""
            }

            resultTextView.text = result + number

        }

    }


    fun operationClick () {

        if (clickedView is TextView) {

            var result = resultTextView.text.toString()

            if (result.isNotEmpty()) {
                operand = result.toDouble()

            }

            operation = clickedView.text.toSring()

            resultTextView.text = ""


        }
    }


    fun equalsClick (clickedview: View){

        val secOperandText: String = resultTextView.text.toString()
        var secOperand: Double = 0.0

        if (secOperandText.isNotEmpty()){
            secOperand = secOperandText.toDouble()
        }

        when (operation) {

            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "÷" -> resultTextView.text = (operand / secOperand).toString()


        }

    }    }