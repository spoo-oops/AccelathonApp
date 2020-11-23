package com.gamdestroyerr.accelathonapp.model

import com.google.firebase.firestore.Exclude

data class NgoPost(
    val id: String = "",
    val authorUid: String = "",
    @get:Exclude var authorUsername: String = "",
    @get:Exclude var authorProfilePicture: String = "",
    val ngo: String = "",
    val text: String = "",
    val imageUrl: String = "",
    val date: Long = 0L,
    var apartmentName: String = "",
    var wingNo: String = "",
)