package com.hendraanggrian.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import com.hendraanggrian.reveallayout.RevealableLayout
import com.hendraanggrian.reveallayout.RevealableLayoutImpl

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class RevealLinearLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0) : io.codetail.widget.RevealLinearLayout(context, attrs, defStyle), RevealableLayout {

    private val impl = RevealableLayoutImpl(context, attrs)

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        super.addView(child, index, params)
        impl.addView(child)
    }
}