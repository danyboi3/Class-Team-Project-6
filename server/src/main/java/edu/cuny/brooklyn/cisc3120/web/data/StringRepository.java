package edu.cuny.brooklyn.cisc3120.web.data;

import edu.cuny.brooklyn.cisc3120.web.service.StringModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StringRepository extends CrudRepository<StringModel, String> {
//    public List<String> findAll();
}
