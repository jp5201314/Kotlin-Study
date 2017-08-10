package tinno.jiang.ping.kotlin.bean

/**
 * Created by android on 17-8-7.
 */

class User(var name:String?, var age:Int, var sex:Boolean) : Person("page"){
    init{
        this.name = name
        this.age = age
        this.sex = sex
    }
    override fun toString(): String {
        return "user info" +
                "name = " + name +
                "age = " + age +
                "sex = " +sex
    }
}


open class Person( var page: String?){

    fun eat(food : String?) : String{
        return "eat "+food
    }

/*    fun eat(food : String?) : String = ""*/
    fun add(x:Int,y:Int) : Int = x+y
}

abstract class Animal(){

}