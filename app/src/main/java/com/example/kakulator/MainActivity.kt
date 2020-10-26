package com.example.kakulator

import android.content.Context
import android.content.Intent
import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.ac
import kotlinx.android.synthetic.main.activity_main.akar
import kotlinx.android.synthetic.main.activity_main.bagi
import kotlinx.android.synthetic.main.activity_main.c
import kotlinx.android.synthetic.main.activity_main.delapan
import kotlinx.android.synthetic.main.activity_main.dua
import kotlinx.android.synthetic.main.activity_main.empat
import kotlinx.android.synthetic.main.activity_main.enam
import kotlinx.android.synthetic.main.activity_main.floor
import kotlinx.android.synthetic.main.activity_main.hasil
import kotlinx.android.synthetic.main.activity_main.kali
import kotlinx.android.synthetic.main.activity_main.kurang
import kotlinx.android.synthetic.main.activity_main.lima
import kotlinx.android.synthetic.main.activity_main.nol
import kotlinx.android.synthetic.main.activity_main.pangkat
import kotlinx.android.synthetic.main.activity_main.round
import kotlinx.android.synthetic.main.activity_main.satu
import kotlinx.android.synthetic.main.activity_main.sembilan
import kotlinx.android.synthetic.main.activity_main.tambah
import kotlinx.android.synthetic.main.activity_main.tiga
import kotlinx.android.synthetic.main.activity_main.tujuh
import kotlinx.android.synthetic.main.activity_main.up


open class MainActivity : AppCompatActivity() {
    lateinit var simpan:String
    var jumlah=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        satu.setOnClickListener { penulisan("1",0) }
        dua.setOnClickListener { penulisan("2",0) }
        tiga.setOnClickListener { penulisan("3",0) }
        empat.setOnClickListener { penulisan("4",0) }
        lima.setOnClickListener { penulisan("5",0) }
        enam.setOnClickListener { penulisan("6",0) }
        tujuh.setOnClickListener { penulisan("7",0) }
        delapan.setOnClickListener { penulisan("8",0) }
        sembilan.setOnClickListener { penulisan("9",0) }
        nol.setOnClickListener { penulisan("0",0) }
        tambah.setOnClickListener { penulisan("+",1) }
        kurang.setOnClickListener { penulisan("-",1) }
        bagi.setOnClickListener { penulisan("/",1) }
        kali.setOnClickListener { penulisan("x",1) }
        akar.setOnClickListener { penulisan("akar",1) }
        pangkat.setOnClickListener { penulisan("pangkat",1) }
        round.setOnClickListener { penulisan("round",1) }
        up.setOnClickListener { penulisan("up",1) }
        floor.setOnClickListener { penulisan("floor",1) }
        ac.setOnClickListener { penulisan("ac",1) }
        c.setOnClickListener { penulisan("c",1) }





    }

    fun penulisan(nilai:String,operator: Int){
        if(operator==0){
            hasil.append(nilai).toString()
        }
        else{
            simpan=hasil.text.toString()
            Toast.makeText(this,simpan.toString(),Toast.LENGTH_LONG).show()
            operasimat(nilai,simpan)

        }

    }
    }
