package com.example.codechallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {


        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        val randomInt1 = Random().nextInt(6) + 1
        resultText1.text = randomInt1.toString()

        val randomInt2 = Random().nextInt(6) + 1
        resultText2.text = randomInt2.toString()

        val randomInt3 = Random().nextInt(6) + 1
        resultText3.text = randomInt3.toString()
    }


    private fun countUp() {

        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        if ((resultText1.text == "Hello World!")&&(resultText2.text == "Hello World!")&&(resultText3.text == "Hello World!")) {
            resultText1.text = "1"
            resultText2.text = "1"
            resultText3.text = "1"
        } else {
            var resultInt1 = resultText1.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()
            var resultInt3 = resultText3.text.toString().toInt()


            if ((resultInt1 < 6)&&(resultInt2 < 6)&&(resultInt3 < 6)) {
                resultInt1++
                resultText1.text = resultInt1.toString()

                resultInt2++
                resultText2.text = resultInt2.toString()

                resultInt3++
                resultText3.text = resultInt3.toString()
            }
        }
    }
}
