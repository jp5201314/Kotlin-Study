package tinno.jiang.ping.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val tv_title = findViewById(R.id.tv_title) as TextView?
        tv_title?.text = "Welcom to Tinno"

        //tv_title?.setOnClickListener { toast("Hello world") }
        tv_title?.setOnClickListener { niceToast("Hello world") }
    }

    fun toast(message : String,time : Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,message,time).show()
    }

    fun niceToast(message: String,
                  tag: String = javaClass.getSimpleName(),
                  length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "$message"+"  "+"$tag", length).show()
    }

}
