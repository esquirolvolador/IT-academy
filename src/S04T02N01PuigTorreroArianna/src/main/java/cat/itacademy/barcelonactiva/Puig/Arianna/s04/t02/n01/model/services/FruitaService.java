package cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FruitaService {

   @Autowired

   FruitaRepository fruitaRepository;


  public List<Fruita> llistaFruita(){
    return  fruitaRepository.findAll();
  }

  public  Optional<Fruita> getFruita(int id){

    return  fruitaRepository.findById(id);
  }

  public  List<Fruita> getByNom(String fruita){

    return fruitaRepository.findByNom(fruita);
  }

  public  void saveFruita(Fruita fruita){

    fruitaRepository.save(fruita);
  }

  public  void deleteFruita(int id){
    fruitaRepository.deleteById(id);
  }

  public  boolean existsByIdFruita(int id){

    return fruitaRepository.existsById(id);
  }



}
