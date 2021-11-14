package com.example.githubuserapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class UserAdapter(private val listUser: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var txtName: TextView = itemView.findViewById(R.id.txt_item_name)
        var txtUsername: TextView = itemView.findViewById(R.id.txt_item_username)
        var txtCompany: TextView = itemView.findViewById(R.id.txt_item_company)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)

        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = listUser[position]
        Glide.with(holder.itemView.context)
            .load(user.avatar)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.txtName.text = user.name
        holder.txtUsername.text = user.username
        holder.txtCompany.text = user.company

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailUser::class.java)
            intent.putExtra("extra_data", user)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = listUser.size
}