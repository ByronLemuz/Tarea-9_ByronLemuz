/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9_byronlemuz;

/**
 *
 * @author lesly
 */
abstract class MissileLauncher {
    private double velocidadDesplazamiento;
  private double poderExplosivo;

  public MissileLaunchervelocidadDesplazamiento, double poderExplosivo) {
    this.velocidadDesplazamiento = velocidadDesplazamiento;
    this.poderExplosivo = poderExplosivo;
  }

  public double getVelocidadDesplazamiento() {
    return velocidadDesplazamiento;
  }

  public double getPoderExplosivo() {
    return poderExplosivo;
  }

  public abstract void atacar();

    private static class MissileLaunchervelocidadDesplazamiento {

        public MissileLaunchervelocidadDesplazamiento() {
        }
    }
}

