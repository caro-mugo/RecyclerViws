package com.carolinenyambura.mytwitter

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.carolinenyambura.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTwitter()
    }
    fun displayTwitter(){
        var twitter = Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin," +
                " Javascript, HTML/CSS.","","","","")
        var twitter2 = Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, " +
                "Javascript, HTML/CSS.","","","","")
        var twitter3 = Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin," +
                " Javascript, HTML/CSS.","","","","")
        var twitter4= Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, " +
                "Javascript, HTML/CSS.","","","","")
        var twitter5 = Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, Javascript, HTML/CSS.","","","","")
        var twitter6= Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, Javascript, HTML/CSS.","","","","")
        var twitter7 = Twiter("", "Carolin Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, " +
                "Javascript," + "HTML/CSS.","","","","")
        var twitter8 = Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, " +
                "Javascript, HTML/CSS.","","","","")
        var twitter9 = Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, " +
                "Javascript, HTML/CSS.","","","","")
        var twitter10 = Twiter("", "Caroline Kayle","@mugonycaroline",".21h","","Caroline is a software developer student at Akirachix. She currently learns programming languages, Python, Kotlin, " +
                "Javascript, HTML/CSS.","","","","")

        var twitterList= listOf(twitter,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10)
        var twitterAdapter=TwitterRvAdapter(twitterList)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter=twitterAdapter
    }
}