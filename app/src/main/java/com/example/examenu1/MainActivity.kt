package com.example.examenu1

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.Image
import coil3.compose.AsyncImage
import com.example.examenu1.ui.theme.ExamenU1Theme



import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.RectangleShape

import androidx.compose.ui.graphics.vector.ImageVector

import androidx.compose.ui.res.painterResource

import coil3.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenU1Theme {

                Screen()
            }
        }
    }


//Crear un proyecto y publicar en Gitjub
    /*
Realizar CineApp
Tiene que tener en columna y reenglones
Cada caja para cada pelicula con la capacidad de scroll
Imagen con texto osea resumen de la pelicula, Al menos 10 para notar scroll
*/


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun Screen() {

        LazyColumn (modifier = Modifier.background(Color.LightGray)){
            item {
                Spacer(modifier = Modifier.height(40.dp))
                Row(

                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 30.dp).background(Color.DarkGray).border(2.dp,Color.Black,
                        RectangleShape
                    )
                ) {

                    Image(
                        painter = painterResource(R.drawable.cine1),
                        contentDescription = "Presentacion",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(80.dp).padding(end = 8.dp).clip(CircleShape)
                    )
                    Text(
                        text = "CineApp - Marco F Silva",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White

                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli1),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "-Volver al Futuro-\nrelata las aventuras de Marty McFly, un adolescente que viaja accidentalmente al pasado desde 1985 hasta 1955 en un automóvil DeLorean modificado como máquina del tiempo por su amigo, el excéntrico científico Doc Brown.",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }

            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli2),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "-Madoka Magica-\nLa trilogía cinematográfica de Puella Magi Madoka Magica recopila y continúa la historia del aclamado anime de Studio Shaft, mostrando una reinterpretación oscura del género de las chicas mágicas ",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }

            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli3),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "-Avengers EndGame-\nes la conclusión épica de la Saga del Infinito donde los Vengadores supervivientes intentan revertir el devastador chasquido de Thanos que eliminó a la mitad de la vida en el universo ",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }


            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli4),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "BackRooms Sin Salida\n trata sobre una terapeuta que se adentra en una dimensión paralela de espacios liminales e infinitos para rescatar a uno de sus pacientes que desapareció misteriosamente",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }



            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli5),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "Spiderman - BrandNewDay\nmuestra a Peter Parker (Tom Holland) luchando a tiempo completo como un héroe anónimo en un mundo que olvidó su identidad, lidiando con la soledad y viendo a sus amigos seguir adelante, lo que desencadena una peligrosa transformación física y mental mientras enfrenta una nueva ola de crímenes",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }


            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli6),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "ChainsawMan - Reze\ncontinúa la historia del anime y adapta el popular arco del manga centrado en el romance y la tragedia de Denji",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }


            item {
                Spacer(modifier = Modifier.height(30.dp).background(Color.Black))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli7),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "Uma Musume Beginning of a New Era\nJungle Pocket, una joven Umamusume (chica con orejas y cola de caballo que hereda el alma de históricos equinos de carreras) que se inspira para convertirse en la corredora más rápida del mundo tras ver ganar a su ídolo, Fuji Kiseki.",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }


            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli8),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "Angeles Inesperados\ndrama basado en una conmovedora historia real sobre la solidaridad y la lucha comunitaria en Kentucky, Estados Unidos",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }


            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli9),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "Ready Player One\nuna búsqueda del tesoro en un universo virtual masivo llamado OASIS, en un futuro distópico donde la gente escapa de la dura realidad",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }


            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli10),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "Matrix\ntrata sobre un futuro distópico donde la humanidad vive atrapada sin saberlo en una realidad simulada creada por máquinas",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }

            item {
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.peli11),
                        contentDescription = null,

                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "Rango\ncuenta la historia de un camaleón doméstico con delirios de grandeza que, tras un accidente en el desierto de Mojave, termina convirtiéndose en el sheriff de un pueblo polvoriento llamado Polvo",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black

                    )


                }

            }

        }


    }

}
