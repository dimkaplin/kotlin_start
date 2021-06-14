package com.example.kotlin_start

import android.util.Log
import java.sql.Time

class WeatherSupport {

    init {

    }

    companion object {

    }

    inner class  FirstInnerClass() {
        fun firstInnerFun() {

        }
    }

    private lateinit var createdOwner: String;
    private var createdDate: Time? = null;

    var vers: String = ""
        get() {
            return "className";
        }
        set(value) {
            field = value;
        }

    internal fun firstInternalFun(ss: String?) {

    }

    fun supportMethod(): Boolean {
        createdOwner = "KDS";
        createdDate = Time(23, 22, 0);
        val arr = arrayOf<Int?>(1, 2, 3);
        var arrList = arrayListOf<Int>(0, 0, 0);
        arr.forEach { item ->
            Log.i("FORI", item.toString());
        }

         var weather1 = WeatherData("Moscow", 22);
         var weather2 = WeatherData("Berlin", 33);
        return true;
    }
}