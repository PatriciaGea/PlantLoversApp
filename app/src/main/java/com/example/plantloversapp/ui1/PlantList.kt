import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.plantloversapp.data.Datasource

@Composable
fun PlantList() {
    val plants = Datasource.loadPlants()

    LazyColumn {
        items(plants) { plant ->
            PlantCard(
                plant = plant
            )
        }
    }
}
@Composable
fun CategoryRow() {
    val categories =listOf(
        "Indoor",
        "Outdoor",
        "Flowers",
        "Cactus"
    )
    LazyRow {
        items(categories) { category ->
            AssistChip(
                onClick ={},
                label = {
                    Text(category)
                },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}