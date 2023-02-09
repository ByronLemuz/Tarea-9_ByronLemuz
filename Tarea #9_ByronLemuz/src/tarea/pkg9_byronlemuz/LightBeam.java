/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9_byronlemuz;

/**
 *
 * @author lesly
 */

    public class LightBeam extends Beam {
  private int indiceDeFotones;
  private int velocidadDeDisparo;
  private int municionDisponible;

  public LightBeam(String tipoDeCarga, int peso, int potencia, int indiceDeFotones, int velocidadDeDisparo, int municionDisponible) {
    super(tipoDeCarga, peso, potencia);
    this.indiceDeFotones = indiceDeFotones;
    this.velocidadDeDisparo = velocidadDeDisparo;
    this.municionDisponible = municionDisponible;
  }

  @Override
  public void atacar() {
    // Aquí va la lógica para realizar el ataque específico del LightBeam
  }
}


