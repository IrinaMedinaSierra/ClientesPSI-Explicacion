package com.ceatformacion.clientespsiexplicacion.repository;


import com.ceatformacion.clientespsiexplicacion.model.Personal;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonalRepository extends JpaRepository<Personal, Integer> {
}
