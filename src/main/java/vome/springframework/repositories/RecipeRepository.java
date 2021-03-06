package vome.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import vome.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
