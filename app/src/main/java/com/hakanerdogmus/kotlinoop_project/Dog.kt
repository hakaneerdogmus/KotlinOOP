package com.hakanerdogmus.kotlinoop_project

class Dog : Animal() {      //Animal sınıfından kalıtım aldık
    fun test() {
        super.sing() //sing fonksiyonu animal sınıfından kalıtım aldıktan sonra super komutu ile sing komutunu çalıştırırız.
    }

    override fun sing(){
        println("dog class")
    }

}