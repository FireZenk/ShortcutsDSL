package org.firezenk.shortcutsdsl

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SampleActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addDynamicShortcuts(
            shortcut {
                id = "twitter"
                shortLabel = R.string.shortcuts_twitter
                longLabel = R.string.shortcuts_twitter_long
                icon = R.mipmap.ic_launcher
                intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/FireZenk")
                )
            },
            shortcut {
                id = "github"
                shortLabel = R.string.shortcuts_github
                longLabel = R.string.shortcuts_github_long
                icon = R.mipmap.ic_launcher
                intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/FireZenk")
                )
            }
        )
    }
}