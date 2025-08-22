package com.arkn.tripsapp.data.local.database.converters

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {

    @TypeConverter
    fun fromLong(long: Long?): Date? = long?.let { Date(it)}

    @TypeConverter
    fun dateToLong(date: Date?): Long? = date?.time

}