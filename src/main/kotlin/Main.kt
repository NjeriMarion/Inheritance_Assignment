fun main(){
    val carOne = Car("Subaru", "Legacy", "White", 6)
    carOne.carry(5)
    carOne.carry(7)
    carOne.identity()
    println(carOne.calculateParkingFees(6))
    val minibus = Bus("Toyota","Nissan", "white", 60)
    println(minibus.maxTripFare(30.00))
    println(minibus.calculateParkingFees(12))

}
open class Car(var make:String, var model:String, var color:String , var capacity: Int){
  //checks capacity
    fun carry(people:Int){
       if (people <= capacity){
           println("Carrying $people passengers")
       }
        else{
            val x = people - capacity
            println("Over capacity by $x people")
       }
    }
 //prints out the identity of a car
    fun identity(){
        println("I am a $color $make $model")
    }
 //calculates parking fees
    open fun calculateParkingFees(hours:Int):Int{
        return hours * 20
    }
}
//bus inherits from car class
class Bus(make:String, model:String, color:String , capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return fare * capacity
    }
// has a special method different from parent class
    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
}
