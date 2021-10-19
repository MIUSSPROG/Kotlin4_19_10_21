enum class Day(val value: Int){
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    fun getDuration(day: Day): Int{
        return value - day.value
    }
}

interface Price{
    fun getPrice(): Int
    fun getPrice(currency: Int){

    }
}

enum class pizza(val diameter: Int): Price{
    SMALL(10){
        override fun getPrice(): Int {
            return 250
        }
    },
    MEDIUM(12){
        override fun getPrice(): Int {
            return 450
        }
              },
    LARGE(14){
        override fun getPrice(): Int {
            return 600
        }
    }
}

open class Person(val name: String){
    open fun sayHello(){
        println("Hi, my name is $name")
    }
}

fun hello(person: Person){
    person.sayHello()
}

fun createPerson(_name: String, _company: String) = object {
    val name = _name
    val company = _company
    fun sayHello() = println("Hi, my name is $name. I work in $company")
}


class Employee {
    var salary: Int = 0
    fun printSalary() {
        println("Salary is: ${this.salary}")
    }

    init {
        printCount()
    }

    companion object CheckCount{
        var count: Int = 1
        fun printCount(){
            println("current count: $count")
            count++
        }
    }
}

class MyClass{
    companion object {
        private var myClass: MyClass? = null

        val instance: MyClass
            get() {
                if (myClass == null) {
                    myClass = MyClass()
                }
                return myClass!!
            }
    }
}


fun main(){

    while (true) {
        var inst = MyClass.instance
    }


    print(inst == inst2)

//    var emp1 = Employee()
//    emp1.salary = 600
//    var emp2 = Employee()
//    emp2.salary += 500
//    print(emp2.salary)

//    val day1: Day = Day.FRIDAY
//    val day2: Day = Day.SUNDAY
//    print(day1.getDuration(day2))
//    val pizzaSize = pizza.LARGE
//    println("Size of pizza ordered is ${pizzaSize}")
//    println("Diameter of LARGE pizza is ${pizzaSize.diameter}")
//    println("Price of LARGE pizza is ${pizzaSize.getPrice()}")

//    val tom = object : Person("Tom") {
//        val company = "JetBrains"
//        override fun sayHello() {
//            println("Hi, my name is $name. I work in $company")
//        }
//    }
//        val name = "Tom"
//        var age = 37
//        fun sayHello(){
//            println("Hi, my name is $name")
//        }


//    println("Name: ${tom.name}  Age: ${tom.age}")
//    tom.sayHello()

//    hello(object : Person("Sam"){
//        val company = "JetBrains"
//        override fun sayHello() {
//            println("Hi, my name is $name. I work in $company")
//        }
//    })



}