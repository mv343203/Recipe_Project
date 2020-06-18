package vome.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import vome.springframework.domain.Category;


import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
