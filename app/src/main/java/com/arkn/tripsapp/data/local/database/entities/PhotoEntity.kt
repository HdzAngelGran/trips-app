package com.arkn.tripsapp.data.local.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "photos")
data class PhotoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,

    val name: String,
    val caption: String? = null,

    @ColumnInfo("created_at", defaultValue = "CURRENT_TIMESTAMP")
    val createdAt: Date? = null,

    @ColumnInfo("modified_at")
    val modifiedAt: Date? = null,
)
