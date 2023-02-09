/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9_byronlemuz;

/**
 *
 * @author lesly
 */

    public class PlasmaBeam extends Beam {
  private int tamañoDeTanque;
  private int tiempoDeCarga;
  private int vecesDisparo;

  public PlasmaBeam(String tipoDeCarga, int peso, int potencia, int tamañoDeTanque, int tiempoDeCarga, int vecesDisparo) {
    super(tipoDeCarga, peso, potencia);
    this.tamañoDeTanque = tamañoDeTanque;
    this.tiempoDeCarga = tiempoDeCarga;
    this.vecesDisparo = vecesDisparo;
  }

  @Override
  public void atacar() {
    // Aquí va la lógica para realizar el ataque específico del PlasmaBeam
  }
}

