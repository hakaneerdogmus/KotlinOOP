package com.hakanerdogmus.kotlinoop_project

class User : People {

    //property
    var name : String? = null
    var age : Int? = null

    //constructor vs init      //inşa etmek //bir sınıftan bir obje oluşturulduğunda çağırılan ilk fonksiyon

    constructor(nameInput : String , ageInput : Int){
      this.name = nameInput
        this.age = ageInput
        println("User created")
    }

    init {
        println("init")
    }



}