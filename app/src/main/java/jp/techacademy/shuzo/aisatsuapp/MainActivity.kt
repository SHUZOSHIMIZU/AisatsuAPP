package jp.techacademy.shuzo.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
            showTimePickerDialog()
      }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                val T1:Double=hour.toDouble()+(minute.toDouble()/100)
                Log.d("Test",T1.toString())
              if(T1 >=2.00 && T1<=9.59){
                    textView.text="おはよう"
                }else if(T1 >=10.00 && T1<=17.59){
                    textView.text="こんにちは"
                } else{
                    textView.text="こんばんは"
                }

            },
            13, 0, true)
        timePickerDialog.show()

    }




}
