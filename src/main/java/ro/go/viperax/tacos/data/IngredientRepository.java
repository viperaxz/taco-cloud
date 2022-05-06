package ro.go.viperax.tacos.data;

import org.springframework.data.repository.CrudRepository;
import ro.go.viperax.tacos.Ingredient;

public interface IngredientRepository 
         extends CrudRepository<Ingredient, String> {
  
}
