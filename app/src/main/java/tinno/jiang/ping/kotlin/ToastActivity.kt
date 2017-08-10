package tinno.jiang.ping.kotlin

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import org.jetbrains.anko.longToast
import tinno.jiang.ping.kotlin.bean.User

class ToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val user : User = User("jiangping", 20, false)

        //这是Anko自带的两个吐司
        //toast("Hello world!")

       // toast(user.age.toString())
        //toast(user.sex.toString())
       // toast("hello world")
        //修改名字为李自成
        user.name = "lizicheng"
        longToast(user.name.toString())
        
    }


    //定义这里的函数可以被Context对象及其子类调用，如Activity和Service
    fun Context.toast(message:CharSequence, duration: Int = Toast.LENGTH_SHORT){

        Toast.makeText(this,message,duration).show()
    }
}
