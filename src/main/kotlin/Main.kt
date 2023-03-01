fun main() {
    //quiz1
var person=Human("Rose",22,56)
person.speak("I know I can do it")
    person.birthday()
    println(person.age)
    person.eat(2)
    println(person.weight)


    //quiz2
    var bio=User("Alice","Wangu","wangualice2gmail.com","alica","+254723453218")
    println(bio.email)
    println(bio.phoneNumber)

    }
//quiz1
 class Human(var name:String,var age:Int,var weight:Int){

fun eat(foodWeight:Int){
    println("I am eating $foodWeight kgs of food")
    weight+=2
}
fun speak(speech:String){
println(speech)
}
     fun birthday(){
         age+=1
     }
 }
//quiz2
data class User(var firstName:String,var lastName:String,var email:String,var password:String ,var phoneNumber:String)


