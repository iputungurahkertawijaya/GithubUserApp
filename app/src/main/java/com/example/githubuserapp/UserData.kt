package com.example.githubuserapp

object UserData {
    private val nameUser = arrayOf(
        "Edris Glen",
        "Karie Mesa",
        "Luise Callison",
        "Jerald Grimsley",
        "Blythe Behne",
        "Lisandra Ralphs",
        "Jeffie Piscitelli",
        "Blaine Stelling",
        "Kerri Knoles",
        "Cicely Gresham"
    )

    private val userName = arrayOf(
        "Glen",
        "Mesa",
        "Callison",
        "Grimsley",
        "Behne",
        "Ralphs",
        "Piscitelli",
        "Stelling",
        "Knoles",
        "Cicely"
    )

    private val companyUser = arrayOf(
        "Facebook",
        "Amazon",
        "Netflix",
        "Google",
        "Twitter",
        "Shopee",
        "Tokopedia",
        "Bukalapak",
        "Lazada",
        "Gojek"
    )

    private val locationUser = arrayOf(
        "Indonesia, Jakarta",
        "Australia, Sydney",
        "USA, Washington",
        "Tokyo, Japan",
        "Russia, Moscow",
        "China, Beijing",
        "Taiwan, Taipei",
        "UK, London",
        "France, Paris",
        "Germany, Berlin"
    )

    private val repositoryUser = arrayOf(
        "439",
        "288",
        "292",
        "413",
        "70",
        "598",
        "756",
        "286",
        "363",
        "148"
    )

    private val followingUser = arrayOf(
        "736",
        "922",
        "107",
        "584",
        "921",
        "186",
        "759",
        "773",
        "285",
        "838"
    )

    private val followerUser = arrayOf(
        "469",
        "216",
        "163",
        "624",
        "202",
        "247",
        "908",
        "787",
        "499",
        "386"

    )

    private val avatarUser = intArrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10
    )

    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()
            for (position in nameUser.indices) {
                val user = User()
                user.name = nameUser[position]
                user.username = userName[position]
                user.company = companyUser[position]
                user.location = locationUser[position]
                user.repository = repositoryUser[position]
                user.following = followingUser[position]
                user.follower = followerUser[position]
                user.avatar = avatarUser[position]
                list.add(user)
            }

            return list
        }
}