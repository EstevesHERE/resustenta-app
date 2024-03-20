package br.com.resustenta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.resustenta.screens.LoginScreen
import br.com.resustenta.screens.SplashScreen
import br.com.resustenta.ui.theme.ResustentaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResustentaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color(0xFF0A7911)

                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "splash") {
                        composable(route = "splash") {
                            SplashScreen(navController)
                        }
                        composable(route = "login") {
                            LoginScreen()
                        }
                    }

                }
            }
        }
    }
}




