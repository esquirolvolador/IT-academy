package com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;

public class SucursalDTO {

  String paisos[]
          = new String[] {"Espanya","Portugal","França","Alemania","Bèlgica","Països " +
          "Bajos","Irlanda","Grecia","Luxemburg",
          "Estonia","Lituania","Bulgaria","Malta","Chipre","Croàcia","Polonia","Hungria",
          "Republica checa","Suecia","Finlandia","Austria","Letonia"};
  List<String> llistaPaisos = Arrays.asList(paisos);


  private int pk_SucursalID;
  private String nomSucursal;
  private String paisSucursal;
  private String tipusSucursal;


  public SucursalDTO() {
  }

  public SucursalDTO(int pk_SucursalID, String nomSucursal, String paisSucursal, String tipusSucursal) {
    this.pk_SucursalID = pk_SucursalID;
    this.nomSucursal = nomSucursal;
    this.paisSucursal = paisSucursal;
    this.tipusSucursal = comprovarTipusSucursal(paisSucursal);
  }


  public int getPk_SucursalID() {
    return pk_SucursalID;
  }

  public void setPk_SucursalID(int pk_SucursalID) {
    this.pk_SucursalID = pk_SucursalID;
  }

  public String getNomSucursal() {

    return nomSucursal;
  }

  public void setNomSucursal(String nomSucursal) {

    this.nomSucursal = nomSucursal;
  }

  public String getPaisSucursal() {

    return paisSucursal;
  }

  public void setPaisSucursal(String paisSucursal) {

    this.paisSucursal = paisSucursal;
  }

  public String getTipusSucursal() {

    return this.tipusSucursal;

  }

  public void setTipusSucursal(String tipusSucursal) {
    this.tipusSucursal = tipusSucursal;
  }

  public String comprovarTipusSucursal(String paisSucursal) {

      tipusSucursal = "Fora_UE";
      int size = llistaPaisos.size();
      for (int i =0; i<size;i++){
        if(paisSucursal.equalsIgnoreCase(llistaPaisos.get(i))){
          tipusSucursal="UE";
        }
      }
      return tipusSucursal;

  }

  @Override
  public String toString() {
    return "SucursalDTO{" +
            ", pk_SucursalID=" + pk_SucursalID +
            ", nomSucursal='" + nomSucursal + '\'' +
            ", paisSucursal='" + paisSucursal + '\'' +
            ", tipusSucursal='" + tipusSucursal + '\'' +
            '}';
  }
}



