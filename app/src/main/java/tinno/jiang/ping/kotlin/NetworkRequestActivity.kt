package tinno.jiang.ping.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.jetbrains.anko.async
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread
import tinno.jiang.ping.kotlin.net.RequestData

class NetworkRequestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network_request)


        val tv_json_data : TextView = find(R.id.tv_json_data)

        async(){   //异步执行发起请求
            val result= RequestData("http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7&APPID=15646a06818f61f7b8d7823ca833e1ce&q=94588").run()
            uiThread {  //请求完毕之后线程切换
                tv_json_data.text = result
            }
        }

    }

}
