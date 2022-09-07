package cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.controllers;
import java.util.List;
import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.dto.FruitaDto;
import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.dto.Mensaje;
import cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.services.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.commons.lang3.StringUtils;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/fruita")

public class FruitaController {
  @Autowired
  FruitaService fruitaService;

  @PostMapping("/add")

  public ResponseEntity<Fruita> create(@RequestBody FruitaDto fruitaDto) {

    if(StringUtils.isBlank(FruitaDto.getNom()))
      return new ResponseEntity(new Mensaje("El nom es obligatori"), HttpStatus.BAD_REQUEST);

    Fruita fruita = new Fruita(fruitaDto.getId(), fruitaDto.getNom(),
            fruitaDto.getQuantitatQuilos());
    fruitaService.saveFruita(fruita);
    return new ResponseEntity(new Mensaje("Fruita creada"), HttpStatus.OK);
  }


  @PutMapping("/update/{id}")
  public ResponseEntity<Fruita> update(@PathVariable("id") int id,
                                           @RequestBody FruitaDto fruitaDto) {

    if (!fruitaService.existsByIdFruita(id))
      return new ResponseEntity(new Mensaje("No existeix la fruita"), HttpStatus.NOT_FOUND);

    if(StringUtils.isBlank(FruitaDto.getNom()))
      return new ResponseEntity(new Mensaje("El nom es obligatori"), HttpStatus.BAD_REQUEST);


    Fruita fruita = fruitaService.getFruita(id).get();
    fruita.setNom(fruitaDto.getNom());
    fruita.setQuantitatQuilos(fruitaDto.getQuantitatQuilos());
    fruitaService.saveFruita(fruita);
    return new ResponseEntity(new Mensaje("Fruita actualitzada"), HttpStatus.OK);
  }


  @GetMapping("/getAll")
  public ResponseEntity<List<Fruita>> getAll(@RequestParam(required = false) String nom) {

      List<Fruita> fruita = fruitaService.llistaFruita();
      return new ResponseEntity<List<Fruita>>(fruita, HttpStatus.OK);
    }


  @GetMapping("/getOne/{id}")
  public ResponseEntity<Fruita> getOne(@PathVariable("id") int id) {
    if (!fruitaService.existsByIdFruita(id))
      return new ResponseEntity(new Mensaje("No existeix la fruita"), HttpStatus.NOT_FOUND);

    Fruita fruita = fruitaService.getFruita(id).get();
    return new ResponseEntity(fruita, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<HttpStatus> deleteOne(@PathVariable("id") int id) {
    if (!fruitaService.existsByIdFruita(id))
      return new ResponseEntity(new Mensaje("No existeix la fruita"), HttpStatus.NOT_FOUND);
    fruitaService.deleteFruita(id);
    return new ResponseEntity(new Mensaje("fruita eliminada"), HttpStatus.OK);
  }
  }




