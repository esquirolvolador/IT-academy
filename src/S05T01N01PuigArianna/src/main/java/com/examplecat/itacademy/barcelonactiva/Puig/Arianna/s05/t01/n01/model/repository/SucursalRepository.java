package com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.repository;
import com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.domain.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

  }


