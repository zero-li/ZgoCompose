package com.zgo.demo.scan.data.db

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.navigation.NavType
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize
import org.json.JSONObject
import java.io.Serializable


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/14
 */

@Parcelize
@Entity
data class ScanHistory(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "code")
    val code: String,
    @ColumnInfo(name = "format")
    val format: String,
    @ColumnInfo(name = "type")
    val type: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    ) {
    }

    fun toJson(): String {
        val json = JSONObject()

        json.apply {
            put("id", id)
            put("format", format)
            put("code", code)
            put("type", type)
        }


        return json.toString()
    }


//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeInt(id)
//        parcel.writeString(code)
//        parcel.writeString(format)
//        parcel.writeString(type)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }

    companion object {


        @JvmStatic
        fun fromJson(jsonStr: String): ScanHistory {
            val json = JSONObject(jsonStr)
            val id = json.getInt("id")
            val code = json["code"] as String? ?: ""
            val format = json["format"] as String? ?: ""
            val type = json["type"] as String? ?: ""
            return ScanHistory(id = id, code = code, format = format, type = type)
        }
    }


}


class ScanHistoryType : NavType<ScanHistory>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): ScanHistory? {
        return bundle.getParcelable(key)
    }

    override fun parseValue(value: String): ScanHistory {
        return Gson().fromJson(value, ScanHistory::class.java)
    }

    override fun put(bundle: Bundle, key: String, value: ScanHistory) {
        bundle.putParcelable(key, value)
    }
}

public class ZgoParcelableType<D>(type: Class<D>) : NavType<D>(true) {
    private val type: Class<D>

    public override val name: String
        get() = type.name

    public override fun put(bundle: Bundle, key: String, value: D) {
        type.cast(value)
        if (value == null || value is Parcelable) {
            bundle.putParcelable(key, value as Parcelable?)
        } else if (value is Serializable) {
            bundle.putSerializable(key, value as Serializable?)
        }
    }

    @Suppress("UNCHECKED_CAST")
    public override fun get(bundle: Bundle, key: String): D? {
        return bundle[key] as D?
    }

    /**
     * @throws UnsupportedOperationException since Parcelables do not support default values
     */
    public override fun parseValue(value: String): D {
//        throw UnsupportedOperationException("Parcelables don't support default values.")
        return Gson().fromJson(value, type)
    }

    public override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val that = other as ParcelableType<*>
        return type == type
    }

    public override fun hashCode(): Int {
        return type.hashCode()
    }

    /**
     * Constructs a NavType that supports a given Parcelable type.
     */
    init {
        require(
            Parcelable::class.java.isAssignableFrom(type) ||
                    Serializable::class.java.isAssignableFrom(type)
        ) { "$type does not implement Parcelable or Serializable." }
        this.type = type
    }
}
