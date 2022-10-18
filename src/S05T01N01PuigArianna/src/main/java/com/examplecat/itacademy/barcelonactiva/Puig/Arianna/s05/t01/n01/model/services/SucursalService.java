package com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.services;
import com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.domain.Sucursal;
import com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SucursalService  {
  @Autowired
  private SucursalRepository sucursalRepository;


  public List<Sucursal> getAllSucursals() {
  return (List<Sucursal>) sucursalRepository.findAll();
  }


  public Sucursal addSucursal(Sucursal sucursal) {
  sucursalRepository.save(sucursal);
    return sucursal;
  }


  public Optional<Sucursal> getSucursalById(int id) {
    return sucursalRepository.findById(id);

  }


  public void deleteSucursalById(int id) {
    sucursalRepository.deleteById(id);
  }

  public void updateSucursal(Sucursal sucursal){
    sucursalRepository.save(sucursal);
  }

  public boolean existsById(int id){
    return sucursalRepository.existsById(id);
  }

  public void save(Sucursal sucursal)
  {
    sucursalRepository.save(sucursal);
  }


}
