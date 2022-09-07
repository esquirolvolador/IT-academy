package cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.repository;
import java.util.List;
import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FruitaRepository extends JpaRepository<Fruita, Integer>{
  List<Fruita> findByNom(String nom);

}
