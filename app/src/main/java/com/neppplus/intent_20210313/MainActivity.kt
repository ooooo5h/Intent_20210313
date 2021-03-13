package com.neppplus.intent_20210313

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickListener {

//            출발지/목적지 정보 : 비행기 티켓 발권.

            val myIntent = Intent(this, MyFirstActivity::class.java)

//            티켓 들고 비행기 탑승
            startActivity(myIntent)

        }


        moveToSecondBtn.setOnClickListener {
//            화면 이동인건 동일하니 intent 사용볍 그대로 적용

//            비행기 티켓
            val myIntent : Intent(this, MySecondActivity::class.java)
//            실제 탑승
            startActivity(myIntent)

        }


    }
}