package com.hakanerdogmus.kotlinoop_project

open class Animal {     //bu sınıfı open yaptığımızda diğer sınıflarda kalıtım verebiliyor oluyor.
   open fun sing() {                //open fun yapınca kalıtım verdiği sınıftan bu fonksiyonu kullanabilir
        println("animal class")
    }
}