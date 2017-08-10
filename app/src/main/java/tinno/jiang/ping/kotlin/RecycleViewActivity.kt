package tinno.jiang.ping.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import tinno.jiang.ping.kotlin.adapter.ForecastListAdapter

class RecycleViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //这是Anko扩展函数用法
        //val forecastList: RecyclerView = find(R.id.rv)

        val forecast_list = findViewById(R.id.rv) as RecyclerView

        forecast_list.layoutManager = LinearLayoutManager(this)

        forecast_list.adapter = ForecastListAdapter()

    }

}
