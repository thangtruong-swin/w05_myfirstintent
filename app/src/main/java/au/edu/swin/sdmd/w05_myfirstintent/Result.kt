package au.edu.swin.sdmd.w05_myfirstintent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Result(val opResult: Int): Parcelable {
}