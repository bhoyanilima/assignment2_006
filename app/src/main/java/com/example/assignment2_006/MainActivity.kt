package com.example.assignment2_006

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button1)
        val button1:Button = findViewById(R.id.button2)
        val button2:Button = findViewById(R.id.button3)
        val button3:Button = findViewById(R.id.button4)
        val button4:Button = findViewById(R.id.button5)
        val button5:Button = findViewById(R.id.button6)
        val button6:Button = findViewById(R.id.button7)
        val button7:Button = findViewById(R.id.button8)
        val button8:Button = findViewById(R.id.button9)
        val button9:Button = findViewById(R.id.button10)
        val button10:Button = findViewById(R.id.button11)
        val button11:Button = findViewById(R.id.button12)
        val button12:Button = findViewById(R.id.add)
        val button13:Button = findViewById(R.id.sub)
        val button14:Button = findViewById(R.id.mul)
        val button15:Button = findViewById(R.id.div)
        val button16:Button = findViewById(R.id.ans)
        val ans:EditText = findViewById(R.id.edit)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("1")
            }
        })
         button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("2")
            }
        })
         button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("3")
            }
        })
         button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("4")
            }
        })
         button4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("5")
            }
        })
         button5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("6")
            }
        })
         button6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("7")
            }
        })
         button7.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("8")
            }
        })
         button8.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("9")
            }
        })
         button9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("00")
            }
        })
         button10.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("0")
            }
        })
         button11.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText(".")
            }
        })
         button12.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("+")
            }
        })
         button13.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("-")
            }
        })
         button14.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("x")
            }
        })
         button15.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                ans.setText("/")
            }
        })
        button16.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

            }
        })

    }
}