package com.peopleconnectapp;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CosmosRepository<Category, String> {

}
