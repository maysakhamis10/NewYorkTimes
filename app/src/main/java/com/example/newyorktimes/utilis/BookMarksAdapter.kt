package com.example.newyorktimes.utilis

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.newyorktimes.R
import com.example.newyorktimes.data.datamodels.ResultStories

class BookMarksAdapter(private var context: Context, stories: List<ResultStories>): BaseAdapter() {

    var bookMarkStories = stories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var myView = convertView
        val holder: ViewHolder
        if (myView == null) {
            val mInflater = (context as Activity).layoutInflater
            myView = mInflater.inflate(R.layout.bookmark_item, parent, false)
            holder = ViewHolder()
            holder.storyImage = myView!!.findViewById(R.id.storyImage) as ImageView
            holder.storyTitle = myView.findViewById(R.id.storyTitle) as TextView
            holder.storyPublishedDate = myView.findViewById(R.id.published_date) as TextView
            myView.tag = holder
        } else {
            holder = myView.tag as ViewHolder

        }
//        holder.storyImage?.let {
//            Glide.with(context)
//                .load(bookMarkStories[position].multimedia[0].url)
//                .into(it)
//        }
        holder.storyTitle!!.setText(bookMarkStories.get(position).title)
        holder.storyPublishedDate!!.setText(bookMarkStories.get(position).published_date)

        return myView

    }

    //Auto Generated Method
    override fun getItem(p0: Int): Any {
        return bookMarkStories[p0]
    }

    //Auto Generated Method
    override fun getItemId(p0: Int): Long {
        return 0
    }

    //Auto Generated Method
    override fun getCount(): Int {

        return bookMarkStories.size
    }

    fun addNewItem(itemsNew: ResultStories){
        print("sizeeeeeeeee ${bookMarkStories.size}")
        bookMarkStories.plusElement(itemsNew)
        notifyDataSetChanged()
    }


    class ViewHolder {

        var storyImage: ImageView? = null
        var storyTitle: TextView? = null
        var storyPublishedDate: TextView? = null

    }

}
