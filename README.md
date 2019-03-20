# ShortcutsDSL
A little lib to easily create Android app shortcuts with Kotlin

## GRADLE

```groovy
repositories {
  ...
  maven { url 'https://jitpack.io' }
}
dependencies {
  ...
  implementation 'com.github.FireZenk:ShortcutsDSL:-SNAPSHOT'
}
```

## USAGE

```kotlin
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
    [...]
)
```
