package scaffold.data.dao.springdata;

import org.springframework.data.repository.CrudRepository;
import scaffold.data.entity.TestEntity;

public interface TestDao extends CrudRepository<TestEntity, Long> {
}
