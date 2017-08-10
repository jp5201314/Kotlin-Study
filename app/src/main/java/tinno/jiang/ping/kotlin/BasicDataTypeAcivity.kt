package tinno.jiang.ping.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class BasicDataTypeAcivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_data_type)

        val tv_title = findViewById(R.id.tv_title) as TextView

        //Kotlin中不会自动转型，例如从int类型自动转型到double类型
        val i: Int = 7
        val j: Double = i.toDouble()

        tv_title.text = j.toString()
        //字符（Char）不能直接作为一个数字来处理。在需要时我们需要把他们转换为一个数字
        val c : Char = 'A'
        c.toInt()

        //tv_title.text = c.toString()


    }
}
