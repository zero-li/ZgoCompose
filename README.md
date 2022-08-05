# ZgoDemo

* android compose
* navigation compose
* paging
* http
* demo for fun android api
* CameraView
* mlkit-text-recognition (crop image)

OCR 识别文字
采用[Google MlKit](https://github.com/googlesamples/mlkit)

效果图

<img src="https://p1-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/3a23a13627d84a7c9a64de947676aae3~tplv-k3u1fbpfcp-watermark.image?" alt="" width="50%" />








https://github.com/androidx/androidx/tree/androidx-main/compose/


1. Surface 会向应用添加背景，并配置文本颜色。

2. 预览

由于 HomeScreen 添加了 NavController 参数，所以预览失效：

> No value passed for parameter 'navController'

加上一个参数即可。
```
@Preview
@Composable
fun PreviewHome() {
    val navController = rememberNavController()
    HomeScreen(navController)
}
```

3. Navigation

```
@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "first_screen"
    ) {
        composable("first_screen") {
            FirstScreen(navController = navController)
        }
        composable("second_screen") {
            SecondScreen(navController = navController)
        }
        composable("third_screen") {
            ThirdScreen(navController = navController)
        }
    }
}


navController.navigate("second_screen")

```
4. codelabs

https://developer.android.com/codelabs/jetpack-compose-layouts

https://developer.android.com/codelabs/jetpack-compose-state

5. example

https://github.com/googlecodelabs/android-compose-codelabs

https://github.com/android/compose-samples

https://foso.github.io/Jetpack-Compose-Playground/

6. color-roles

https://m3.material.io/styles/color/the-color-system/color-roles

https://material-foundation.github.io/material-theme-builder/


7. material-catalog

https://github.com/androidx/androidx/tree/androidx-main/compose/integration-tests/material-catalog


8. 设置状态栏

https://google.github.io/accompanist/insets/

https://zhuanlan.zhihu.com/p/277342333

```

// step 1
     implementation "com.google.accompanist:accompanist-insets:0.18.0"

// step 2
    <resources xmlns:tools="http://schemas.android.com/tools">
        <style name="Theme.MyCompose" parent="android:Theme.Material.Light.NoActionBar">
            <item name="android:statusBarColor">@android:color/transparent</item>
            <item name="android:navigationBarColor">@android:color/transparent</item>
        </style>
    </resources>


// step 3
     class MainActivity : ComponentActivity() {
         override fun onCreate(savedInstanceState: Bundle?) {
             super.onCreate(savedInstanceState)

             // This app draws behind the system bars, so we want to handle fitting system windows
             WindowCompat.setDecorFitsSystemWindows(window, false)

             setContent {
                 MyApp()
             }
         }
     }

// step 4
    // 设置状态栏
    fun AppTheme(
        useDarkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
    ) {
        val colors = if (!useDarkTheme) {
            LightThemeColors
        } else {
            DarkThemeColors
        }

        // 设置状态栏 颜色
        val view = LocalView.current
        SideEffect {
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = !useDarkTheme
        }

        MaterialTheme(
            colorScheme = colors,
            typography = AppTypography,
            content = content
        )
    }

// step 5
@Composable
fun HomePage() {
    ZgoScaffold{
        LazyColumn(
            contentPadding =  rememberInsetsPaddingValues(
                insets = LocalWindowInsets.current.statusBars,
            ),
        ){
            item {
                Text(text = "home", modifier = Modifier.fillMaxSize())
            }

        }
    }

}



```

9. Utils for jetpack Compose

https://google.github.io/accompanist/

10. 网格列表 columns-rows-grids

https://www.geeksforgeeks.org/lazy-composables-in-android-jetpack-compose-columns-rows-grids/

lazycolumn + grid

https://stackoverflow.com/questions/69336555/fixed-grid-inside-lazycolumn-in-jetpack-compose



11. 图片加载 coil

https://coil-kt.github.io/coil/compose/

```
// 图片加载
    implementation("io.coil-kt:coil-compose:1.4.0")

```


12

https://github.com/DaaniDev/jetpack_compose_animations

src/main/java/com/daanidev/compose/bottomnav/BottomNavActivity.kt