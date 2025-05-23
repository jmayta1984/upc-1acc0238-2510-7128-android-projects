package pe.edu.upc.mealscompose.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import pe.edu.upc.mealscompose.data.model.CategoryEntity

@Dao
interface CategoryDao {

    @Query("select * from categories")
    suspend fun fetchCategories(): List<CategoryEntity>

    @Insert
    suspend fun insertCategory(categoryEntity: CategoryEntity)

    @Delete
    suspend fun deleteCategory(categoryEntity: CategoryEntity)

    @Query("select * from categories where id = :id")
    suspend fun isFavorite(id: String): List<CategoryEntity>
}