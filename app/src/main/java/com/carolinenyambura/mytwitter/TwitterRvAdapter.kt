package com.carolinenyambura.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var tweetList:List<Twiter>):
    RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        var currentContact=tweetList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvHandle.text=currentContact.handle
        holder.tvHour.text=currentContact.text1
        holder.tvText.text=currentContact.text2




    }

    override fun getItemCount(): Int {
        return tweetList.size
    }


}
class ContactViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var ivTweet=itemView.findViewById<ImageView>(R.id.ivTweet)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvHour=itemView.findViewById<TextView>(R.id.tvHour)
    var ivIcon=itemView.findViewById<ImageView>(R.id.ivIcon)
    var tvText=itemView.findViewById<TextView>(R.id.tvText)
    var ivMessage=itemView.findViewById<ImageView>(R.id.ivMessage)
    var ivRetweet=itemView.findViewById<ImageView>(R.id.ivRetweet)
    var ivLike=itemView.findViewById<ImageView>(R.id.ivLike)
    var ivShare=itemView.findViewById<ImageView>(R.id.ivShare)







}