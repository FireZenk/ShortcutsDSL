package org.firezenk.shortcutsdsl

import android.content.Context
import android.content.Intent
import android.content.pm.ShortcutInfo
import android.graphics.drawable.Icon

fun shortcut(builder: Shortcut.() -> Unit): Shortcut = with(Shortcut()) {
    builder()
    this
}

class Shortcut {

    lateinit var id: String
    var shortLabel: Int = 0
    var longLabel: Int = 0
    var icon: Int = 0
    lateinit var intent: Intent

    fun build(context: Context): ShortcutInfo = ShortcutInfo.Builder(context, id)
        .setShortLabel(context.getString(shortLabel))
        .setLongLabel(context.getString(longLabel))
        .setIcon(Icon.createWithResource(context, icon))
        .setIntent(intent)
        .build()
}