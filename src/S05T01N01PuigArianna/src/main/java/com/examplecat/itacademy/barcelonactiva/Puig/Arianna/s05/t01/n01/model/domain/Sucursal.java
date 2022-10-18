package com.examplecat.itacademy.barcelonactiva.Puig.Arianna.s05.t01.n01.model.domain;

import javax.persistence.*;

@Entity
public class Sucursal {

  @Id
  @Column(name = "id")
  private int pk_SucursalID;

  @Column(name = "nom")
  private String nomSucursal;

  @Column(name = "pais")
  private String paisSucursal;

  @Column (name = "tipus_sucursal")
  private String tipusSucursal;



  public Sucursal() {
  }

  public Sucursal(int pk_SucursalID, String nomSucursal, String paisSucursal, String tipusSucursal) {
    this.pk_SucursalID = pk_SucursalID;
    this.nomSucursal = nomSucursal;
    this.paisSucursal = paisSucursal;
   this.tipusSucursal = tipusSucursal;
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
    return tipusSucursal;
  }

  public void setTipusSucursal(String tipusSucursal) {
    this.tipusSucursal = tipusSucursal;
  }

  @Override
  public String toString() {
    return "Sucursal{" +
            "pk_SucursalID=" + pk_SucursalID +
            ", nomSucursal='" + nomSucursal + '\'' +
            ", paisSucursal='" + paisSucursal + '\'' +
            '}';
  }
}
