package com.example.githubuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvUserList: RecyclerView
    private var list: ArrayList<User> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Home")

        rvUserList = findViewById(R.id.rv_UserList)
        rvUserList.setHasFixedSize(true)
        list.addAll(UserData.listData)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        rvUserList.layoutManager = LinearLayoutManager(this)
        val adapter = UserAdapter(list)
        rvUserList.adapter = adapter
    }
}