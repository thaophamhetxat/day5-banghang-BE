package banhang.web.repository;

import banhang.web.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepo extends CrudRepository <Category,Long>{
}
