package com.arkn.tripsapp.data.local.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "trip_photos",
    [Index(value = ["trip_id", "photo_id"], unique = true)],
     foreignKeys = [
        ForeignKey(
            TripEntity::class,
            ["id"],
            ["trip_id"],
            ForeignKey.CASCADE
        ),
        ForeignKey(
            PhotoEntity::class,
            ["id"],
            ["photo_id"],
            ForeignKey.CASCADE
        )
    ],
)
data class TripPhotoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,

    @ColumnInfo("trip_id")
    val tripId: Long,

    @ColumnInfo("photo_id")
    val photoId: Long,

    @ColumnInfo("created_at", defaultValue = "CURRENT_TIMESTAMP")
    val createdAt: Date? = null,

    @ColumnInfo("modified_at")
    val modifiedAt: Date? = null,
)
