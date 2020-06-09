package com.didichuxing.doraemonkit.kit.colorpick

import android.content.Context
import android.content.Intent
import com.didichuxing.doraemonkit.R
import com.didichuxing.doraemonkit.constant.BundleKey
import com.didichuxing.doraemonkit.constant.FragmentIndex
import com.didichuxing.doraemonkit.kit.AbstractKit
import com.didichuxing.doraemonkit.kit.core.TranslucentActivity

/**
 * Created by wanglikun on 2018/9/13.
 */
class ColorPickerKit : AbstractKit() {
    override val name: Int
        get() = R.string.dk_kit_color_picker

    override val icon: Int
        get() = R.mipmap.dk_color_picker

    override fun onClick(context: Context?) {
        val intent = Intent(context, TranslucentActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra(BundleKey.FRAGMENT_INDEX, FragmentIndex.FRAGMENT_COLOR_PICKER_SETTING)
        context!!.startActivity(intent)
    }

    override fun onAppInit(context: Context?) {
    }

    override val isInnerKit: Boolean
        get() = true

    override fun innerKitId(): String {
        return "dokit_sdk_ui_ck_color_pick"
    }

    companion object {
        private const val TAG = "ColorPicker"
    }
}