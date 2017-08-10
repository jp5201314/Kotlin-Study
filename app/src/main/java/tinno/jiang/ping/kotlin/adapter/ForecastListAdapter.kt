package tinno.jiang.ping.kotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by android on 17-8-8.
 */
class ForecastListAdapter:RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

        val item = listOf(
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7"
        )

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.textView!!.text = item[position]
    }

    override fun getItemCount(): Int {

        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        return ViewHolder(TextView(parent!!.context))
    }

        class ViewHolder(val textView : TextView) : RecyclerView.ViewHolder(textView)
}