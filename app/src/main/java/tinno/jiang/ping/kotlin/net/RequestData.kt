package tinno.jiang.ping.kotlin.net

import android.util.Log
import java.net.URL

/**
 * Created by android on 17-8-10.
 */
class RequestData(val url : String?) {

    fun run() : String {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
        return forecastJsonStr
    }
}