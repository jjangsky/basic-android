package com.jjangsky.btsphotosapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 함
        // -> xml에서 id 속성값을 가져온 것을 코틀린에서 변수에 바인딩 처리
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener{

            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌!
            val intent = Intent(this, BtsDetailActivity::class.java)
            startActivity(intent)
        }

    }
}