package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.bean.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Long>{
}