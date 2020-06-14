package vome.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import vome.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
