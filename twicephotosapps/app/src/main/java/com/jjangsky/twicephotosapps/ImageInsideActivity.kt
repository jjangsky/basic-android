package com.jjangsky.twicephotosapps

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        // 이전 activity 에서 받아온 값을 꺼내옴
        val getData = intent.getStringExtra("data")

        // activity에 있는 사진 객체를 변수에 담아줌, 이후에 변경처리 할꺼임
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

//        Toast.makeText(this, getData, Toast.LENGTH_LONG).show();

        if(getData == "1"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_1)
        }

        if(getData == "2"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_2)
        }

        if(getData == "3"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_3)
        }

        if(getData == "4"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_4)
        }

        if(getData == "5"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_5)
        }

        if(getData == "6"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_6)
        }

        if(getData == "7"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_7)
        }

        if(getData == "8"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_8)
        }

        if(getData == "9"){
            // 사진 객체 이미지 변경
            memberImage.setImageResource(R.drawable.member_9)
        }

    }
}