package com.willroth.mypackagelibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.doAfterTextChanged
import com.willroth.mypackagelibrary.databinding.MyComponentLayoutBinding

class MyComponent : ConstraintLayout {

    private var binding: MyComponentLayoutBinding

    constructor(context: Context) : super(context) {
        binding = MyComponentLayoutBinding.inflate(LayoutInflater.from(context), this)
        configBehaviour()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        binding = MyComponentLayoutBinding.inflate(LayoutInflater.from(context), this)
        configBehaviour()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        binding = MyComponentLayoutBinding.inflate(LayoutInflater.from(context), this)
        configBehaviour()
    }

    private fun configBehaviour() {
        binding.et.doAfterTextChanged {
            binding.tv.text = it?.toString()
        }
    }

}