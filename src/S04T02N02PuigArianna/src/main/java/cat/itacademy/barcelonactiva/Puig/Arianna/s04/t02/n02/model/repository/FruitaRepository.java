package cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n02.model.repository;

import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n02.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitaRepository extends JpaRepository<Fruita, Integer>{
  List<Fruita> findByNom(String nom);
  List<Fruita> findByQuantitatQuilos(int quantitatQuilos);
}
