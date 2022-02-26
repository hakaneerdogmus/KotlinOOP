package com.hakanerdogmus.kotlinoop_project

open class Musician(name: String, instrument: String, age: Int) {

    //encapsulation

    var name : String? = name
        private set     //private yapıp set ettik
        get             // bilgiyi aldık


    private var instrument : String? = instrument


    var age : Int? = age
        get
        private set

}