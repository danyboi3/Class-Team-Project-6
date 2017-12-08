package edu.cuny.brooklyn.cisc3120.web.data;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StringRepository extends CrudRepository<String, String> {
    public List<String> findAll();
}
