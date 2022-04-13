fun main(){
var toyota = Car("Toyota","Prado","KCT 138k",92)
var subaru = Car("Subaru","Forester","KDC 223L",30)
    toyota.accelerate(30)
    println(subaru)
    toyota.start()
    toyota.stop(0)
   // toyota.accelerate(20)
var Lucy = Student("lucy",22,"Anitab")
    println(Lucy.age)
}
//A class is a template or blueprint for an object
//An object is an instance of a class
//A class has a name
//Te bocy of a class is denoted by a pair of curly braces.
class Car(var make:String,var model:String,var registration:String, var speed:Int){
    fun start(){
        println(" chogio gio gio")
    }
   fun accelerate(acceleration:Int):Int{
       speed-=acceleration
       println("Current speed is: $speed")
       return speed
   }
    fun stop(stop:Int): Int {
        speed==accelerate(0)
        return speed
    }
}
//data class is a class used to hold data
data class Student (var name:String,var age:Int,var stream:String){

}