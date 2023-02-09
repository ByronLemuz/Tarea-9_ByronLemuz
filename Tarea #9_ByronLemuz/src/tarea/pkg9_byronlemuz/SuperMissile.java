/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9_byronlemuz;

/**
 *
 * @author lesly
 */

    public class SuperMissile extends Missile {
  private String material;

  public SuperMissile(double velocidadDesplazamiento, double poderExplosivo, String material) {
    super(velocidadDesplazamiento, poderExplosivo);
    this.material = material;
  }

  public String getMaterial() {
    return material;
  }

  @Override
  public void atacar() {
    System.out.println("El Super Missile ha sido lanzado");
  }
}


