package com.example.githubuserapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailUser : AppCompatActivity() {


    companion object {
        const val EXTRA_DATA = "extra_data"
    }


    private lateinit var imgAvatar: ImageView
    private lateinit var txtName: TextView
    private lateinit var txtUsername: TextView
    private lateinit var txtCompany: TextView
    private lateinit var txtRepository: TextView
    private lateinit var txtFollowers: TextView
    private lateinit var txtFollowing: TextView
    private lateinit var txtLocation: TextView



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Detail User"

        imgAvatar = findViewById(R.id.img_profile)
        txtName = findViewById(R.id.txt_name)
        txtUsername = findViewById(R.id.txt_username)
        txtCompany = findViewById(R.id.txt_company)
        txtFollowers = findViewById(R.id.txt_followers)
        txtFollowing = findViewById(R.id.txt_following)
        txtRepository = findViewById(R.id.txt_repository)
        txtLocation = findViewById(R.id.txt_location)

        val dataUser = intent.getParcelableExtra<User>(EXTRA_DATA) as User

        Glide.with(this@DetailUser)
            .load(dataUser.avatar)
            .into(imgAvatar)

        txtName.text = dataUser.name
        txtUsername.text = "Username: ${dataUser.username}"
        txtRepository.text = "Repository: ${dataUser.repository}"
        txtFollowers.text = "Followers: ${dataUser.follower}"
        txtFollowing.text = "Following: ${dataUser.following}"
        txtCompany.text = "Company: ${dataUser.company}"
        txtLocation.text = "Location: ${dataUser.location}"


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}