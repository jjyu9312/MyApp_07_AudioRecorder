package com.kkuber.myapp_07_audiorecorder

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatImageButton

class RecordButtton (
    context: Context,
    attrs: AttributeSet
): AppCompatImageButton(context, attrs) {

    fun updateIconWithState (state: State) {
        when (state) {

            State.BEFORE_RECORDING -> {
                setImageResource(R.drawable.ic_record)
            }
            State.ON_RECORDING -> {
                setImageResource(R.drawable.ic_stop)
            }
            State.AFTER_RECORDING -> {
                setImageResource(R.drawable.ic_play)
            }
            State.ON_PLAYING -> {
                setImageResource(R.drawable.ic_stop)
            }
        }
    }
}