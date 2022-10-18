package com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.controllers;

import com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.domain.Sucursal;
import com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.dto.SucursalDTO;
import com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class SucursalController {

  @Autowired
  private SucursalService sucursalService;

  @RequestMapping(value = "/super")
  public String index(Model model) {
    model.addAttribute("sucursals", sucursalService.getAllSucursals());

    return "dissenyllista";
  }


  @PostMapping("/sucursal/add")
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<String> addSucursal(@RequestBody SucursalDTO sucursalDto) {

    Sucursal sucursal = new Sucursal
            (sucursalDto.getPk_SucursalID(), sucursalDto.getNomSucursal(),
                    sucursalDto.getPaisSucursal(),
                    sucursalDto.comprovarTipusSucursal(sucursalDto.getPaisSucursal()));
    sucursalService.addSucursal(sucursal);
    System.out.println(sucursal);
    return new ResponseEntity<>("Sucursal creada amb èxit: " + sucursal, HttpStatus.CREATED);

  }

  @PutMapping("/sucursal/update/{id}")
  public ResponseEntity<String> updateSucursal(@PathVariable(value = "id") int id,
                                               @RequestBody SucursalDTO sucursalDto) {

    Optional<Sucursal> sucursalData = sucursalService.getSucursalById(id);
    if (sucursalData.isPresent()) {
      Sucursal _sucursal = sucursalData.get();
      _sucursal.setNomSucursal(sucursalDto.getNomSucursal());
      _sucursal.setPaisSucursal(sucursalDto.getPaisSucursal());
      _sucursal.setTipusSucursal(sucursalDto.comprovarTipusSucursal(sucursalDto.getPaisSucursal()));
      sucursalService.updateSucursal(_sucursal);
      System.out.println(_sucursal);
      return new ResponseEntity<>("Sucursal editada correctament: " + _sucursal, HttpStatus.OK);
    } else {
      return new ResponseEntity<>("No s'ha trobat cap sucursal amb l'id: " + id,
              HttpStatus.NOT_FOUND);
    }
  }


  @DeleteMapping("/sucursal/delete/{id}")
  public String deleteSucursal(@PathVariable(value = "id") int id) {

    String missatge = "";
    if (sucursalService.existsById(id)) {
      sucursalService.deleteSucursalById(id);
      missatge = "La sucursal ha estat eliminada amb èxit";
    } else {
      missatge = "No s'ha trobat cap sucursal amb l'id: " + id;
    }
    return missatge;
  }

  @GetMapping("/sucursal/getOne/{id}")
  public ResponseEntity<String> getSucursal(@PathVariable(value = "id") int id) throws Exception {
    Optional<Sucursal> sucursalData = sucursalService.getSucursalById(id);
    if (sucursalData.isPresent()) {
      sucursalData.get();
      System.out.println(sucursalData);
      return new ResponseEntity<>("Sucursal trobada: " + sucursalData, HttpStatus.OK);
    } else {
      return new ResponseEntity<>("No s'ha trobat cap sucursal amb l'id: " + id, HttpStatus.NOT_FOUND);
    }

  }

  @GetMapping("/sucursal/getAll")
  public ResponseEntity<List<Sucursal>> getAllSucursal() throws Exception {
    try {
      List<Sucursal> sucursals = sucursalService.getAllSucursals();
      if (sucursals.isEmpty())
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      else
        return new ResponseEntity<>(sucursals, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  /*
  @GetMapping ("/index")
  public String viewHomePage(Model model) {
    model.addAttribute("sucursals", "jhgfjkxañsk");
    return "index";
  }

  @GetMapping("sucursal/addnew")
  public String addNewEmployee(Model model) {
    SucursalDTO sucursalDTO = new SucursalDTO();
    model.addAttribute("sucursal", sucursalDTO);
    return "newemployee";
  }

  @PostMapping("sucursal/save")
  public String saveEmployee(@ModelAttribute("employee") Sucursal sucursal) {
    sucursalService.save(sucursal);
    return "redirect:/";
  }

  @GetMapping("sucursal/showFormForUpdate/{id}")
  public String updateForm(@PathVariable(value = "id") int id, Model model) {
    Optional<Sucursal> sucursal = sucursalService.getSucursalById(id);
    model.addAttribute("sucursal", sucursal);
    return "update";
  }

  @GetMapping("sucursal/deleteEmployee/{id}")
  public String deleteThroughId(@PathVariable(value = "id") int id) {
    sucursalService.deleteSucursalById(id);
    return "redirect:/";

  }
*/
}
