package jp.techacademy.kosuke.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->

                    if(hour >= 2 && hour < 10){
                        textView.text = "おはよう"
                    }else if(hour >= 10 && hour < 18){
                        textView.text = "こんにちは"
                    }else{
                        textView.text = "こんばんは"
                    }
                    Log.d("UI-PARTS", "$hour:$minute")
                },
                13, 0, true)
            timePickerDialog.show()
        }
    }
}
