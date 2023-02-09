/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9_byronlemuz;

/**
 *
 * @author lesly
 */

    public class RegularMissile extends Missile {
  private double tamanio;

  public RegularMissile(double velocidadDesplazamiento, double poderExplosivo, double tamanho) {
    super(velocidadDesplazamiento, poderExplosivo);
    this.tamanio = tamanho;
  }

  public double getTamanho() {
    return tamanio;
  }

  @Override
  public void atacar() {
    System.out.println("El Regular Missile ha sido lanzado");
  }
}


