package com.example.kakulator

import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class operasimat(var variabel:String,var nilai:String) {
    var utama=MainActivity()

    fun pengecekan(){
        if(variabel=="+"){
            utama.jumlah += nilai.toInt()
            utama.hasil2.text=utama.jumlah.toString()

        }
        if(variabel=="-"){

        }
        if(variabel=="/"){

        }
        if(variabel=="x"){

        }
    }

    fun penjumlahan(){



    }
    fun pengurangan(){

    }
    fun perkalian(){

    }fun pembagian(){

    }




}