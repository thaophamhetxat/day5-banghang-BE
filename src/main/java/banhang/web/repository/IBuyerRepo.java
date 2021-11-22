package banhang.web.repository;

import banhang.web.model.Buyer;
import org.springframework.data.repository.CrudRepository;

public interface IBuyerRepo extends CrudRepository<Buyer,Long> {
}
