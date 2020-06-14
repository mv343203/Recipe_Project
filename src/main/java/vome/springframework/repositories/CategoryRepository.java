package vome.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import vome.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
