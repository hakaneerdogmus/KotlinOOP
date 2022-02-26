package com.hakanerdogmus.kotlinoop_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hakanerdogmus.kotlinoop_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    public lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //constructor
        var myUser = User("Hakan" , 24)

        myUser.age = 30         //ilk belirledğimiz değeri değiştirebiliriz
        myUser.name = "Hakan"

        println(myUser.age)
        println(myUser.name)
        println(myUser.information()) //User sınıfını kullanarak people sınıfından kalıtım aldık ve User sınıfını kullanarak information fonksiyonunu çağırdık.


        //encapsulation

        var james = Musician("James", "Guitar", 25)

     //   james.age = 60        // musician sınıfında bilgiyi private yaptık ama okunabilir yaptık
        println(james.age)      // yani değeri değiştirilemez ama okunabilir oldu.



        //inheritance
        // kalıtım almak

        var lars = SuperMusician("Lars","Piano",45)
        println(lars.name)
        println(lars.age)


        //polymorphism
        //aynı ismi kullanrak farklı işlemler yapabilme özelliği

        //Static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))



        //Dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val dog = Dog()
        dog.test()
        dog.sing()

        //abstract & interface
        //abstract obje oluşturamayacağımız bir sınıftır
        //interface bir sınıfa kalıtım alırken birden fazla kalıtım yapmammuzı sağlar.

        // var myPeople = People() //People sınıfı abstract olduğu için obje oluşturamayız.

        var myPiano = Piano()
        myPiano.brand = "Yamaha"    // Piano sınıfından aldık
        myPiano.digital = false
        println(myPiano.roomName)   // HouseDecor interface ten aldık
        myPiano.info()              //Instrument interface ten aldık



        //lambda expression
        //internetten işlem yaparken kullanacağımız kısım.
        //bir fonksiyonu tek bir satırda yazmak için geliştirlmiş gösterim

        fun printString(myString: String){
            println(myString)
        }

        printString("My Test String")

        val testString = {myString : String -> println(myString)} // testString değişkenini içerisinde myString olucak ve bu bir String döndürecek ve o Stringi yazdıracak.
        testString("My Lambda String")

        val multiplyLambda = {a: Int, b:Int -> a * b } //a ve b değişkeni ınt döndürüp bunların çarpımını aldığımız fonksiyon
        println(multiplyLambda(5,4))

        val multiplyLambda2 :(Int, Int ) -> Int = {a, b -> a*b}
        println(multiplyLambda2(5,5))


        //asynchrnous
        //ileri seviye lambda gösterimleri

        //callback function, listener function, completion function

        fun downloadMusicians(url: String,completion: () -> Unit){
            //url -> download
            //data
            completion()
        }

        downloadMusicians("metalica.com",{
            println("Completed && ready")
        })




    }

}