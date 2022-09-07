package cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n02.controllers;

import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n02.model.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/fruita")

public class FruitaController {
  @Autowired
  FruitaRepository fruitaRepository;

  @PostMapping("/add")
  public ResponseEntity<Fruita> create(@RequestBody Fruita fruita) {
    try {
      Fruita _fruita = fruitaRepository
              .save(new Fruita(fruita.getId(), fruita.getNom(), fruita.getQuantitatQuilos()));
      return new ResponseEntity<>(_fruita, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Fruita> update(@PathVariable("id") int id,
                                           @RequestBody Fruita fruita) {
    Optional<Fruita> fruitaData = fruitaRepository.findById(id);
    if (fruitaData.isPresent()) {
      Fruita _fruita = fruitaData.get();
  //    _fruita.setId(fruita.getId());
      _fruita.setNom(fruita.getNom());
      _fruita.setQuantitatQuilos(fruita.getQuantitatQuilos());
      return new ResponseEntity<>(fruitaRepository.save(_fruita), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/getAll")
  public ResponseEntity<List<Fruita>> getAll(@RequestParam(required = false) String nom) {
    try {
      List<Fruita> fruites = new ArrayList<Fruita>();
      if (nom == null)
        fruitaRepository.findAll().forEach(fruites::add);
      else
        fruitaRepository.findByNom(nom).forEach(fruites::add);
      if (fruites.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(fruites, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  @GetMapping("/getOne/{id}")
  public ResponseEntity<Fruita> getOne(@PathVariable("id") int id) {
    Optional<Fruita> tutorialData = fruitaRepository.findById(id);
    if (tutorialData.isPresent()) {
      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<HttpStatus> deleteOne(@PathVariable("id") int id) {
    try {
      fruitaRepository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }



}
