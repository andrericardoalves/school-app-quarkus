package com.alves.repository;

import com.alves.model.Students;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudentsRepository implements PanacheRepositoryBase<Students, Long> {
    
}
