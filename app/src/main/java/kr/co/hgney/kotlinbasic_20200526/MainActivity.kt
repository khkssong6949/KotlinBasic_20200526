package kr.co.hgney.kotlinbasic_20200526

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {

            val inputContent = inputEtxt.text.toString()
            resultTxt.text = inputContent
        }

    }
}
