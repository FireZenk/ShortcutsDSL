package org.firezenk.shortcutsdsl

import android.app.Activity
import android.content.Context
import android.content.pm.ShortcutManager
import androidx.fragment.app.Fragment

fun Activity.addDynamicShortcuts(vararg shortcuts: Shortcut) {
    val shortcutManager = getSystemService<ShortcutManager>(ShortcutManager::class.java)
    shortcutManager!!.dynamicShortcuts = shortcuts.asList().map { it.build(this) }
}

fun Fragment.addDynamicShortcuts(vararg shortcuts: Shortcut) {
    val shortcutManager = context!!.getSystemService<ShortcutManager>(ShortcutManager::class.java)
    shortcutManager!!.dynamicShortcuts = shortcuts.asList().map { it.build(context!!) }
}

fun addDynamicShortcuts(context: Context, vararg shortcuts: Shortcut) {
    val shortcutManager = context.getSystemService<ShortcutManager>(ShortcutManager::class.java)
    shortcutManager!!.dynamicShortcuts = shortcuts.asList().map { it.build(context) }
}