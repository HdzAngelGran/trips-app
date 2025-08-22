package com.arkn.tripsapp.data.local.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "trips",
    foreignKeys = [
        ForeignKey(
            PhotoEntity::class,
            ["id"],
            ["coverPhotoId"],
            ForeignKey.SET_NULL
        )
    ])
data class TripEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,

    val name: String,
    val destination: String,

    @ColumnInfo("start_date")
    val startDate: Date,

    @ColumnInfo("end_date")
    val endDate: Date,

    val latitude: Double? = null,
    val longitude: Double? = null,
    val notes: String? = null,

    @ColumnInfo("cover_photo_id", index = true)
    val coverPhotoId: Long? = null,

    @ColumnInfo("created_at", defaultValue = "CURRENT_TIMESTAMP")
    val createdAt: Date? = null,

    @ColumnInfo("modified_at")
    val modifiedAt: Date? = null,
)
