package com.example.mad_tute

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.mad_tute.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtNumber1: EditText
    lateinit var edtNumber2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edtNumber1)
        edtNumber2 = findViewById(R.id.edtNumber2)
    }

    fun buttonClick(v: View) {
        var ans = 0.0
        val cal = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble()
        )

        when (v.id) {
            R.id.btnPlus -> ans = cal.add()
            R.id.btnMinus -> ans = cal.subtract()
            R.id.btnMultiply -> ans = cal.multi()
            R.id.btnDivide -> ans = cal.divide()
        }

        println(ans)

        var intentVal = Intent(this,activity_display::class.java)
        intentVal.putExtra("answer", ans)
        startActivity(intentVal)
        finish()

    }
}