fun main() {
    var human = Nurse("Jane Kim",20)
    human.injects()
    human.eat()
    human.sleep()


    var human2 = Teacher("Joy Kim",21)
human2.teach()
    human2.talk("i love teaching Cate")
    human2.sleep()

    var human3 = Doctor("James Kim",22)
    human3.treats()
    human3.eat()

//name()
}
open class Human(var name: String,var age: Int) {
    fun talk(words: String) {
        println(words)

    }

     open fun eat() {
        println("yum yum")
    }

    fun sleep() {
        println("zzzzzzzzz")
    }
}
class Nurse(name:String, age:Int):Human(name, age){
fun injects(){
    println("i inject people")
}

    override fun eat() {
        super.eat()
        println("yaaaaaaaaam")
    }
    }



class Teacher( name:String, age:Int):Human(name, age){
    fun teach(){
        println("i teach students")
    }

    }
    class Doctor( name:String, age:Int):Human(name, age){
        fun treats(){
            println("i treat people")
        }

        override fun eat() {
            super.eat()
            println("grraaaaammmm")
        }
        }


//fun name(){
//    var x= "my name is"
//    var num="jane"
//    println(x+" " +num)
//    println(num[0])
//    println(num[1])
//    println(num[3])
//    println(num[2])
//    println(num.toUpperCase())
//    println(num.toLowerCase())
//    println(num.capitalize())
//    println(num.decapitalize())
//}


