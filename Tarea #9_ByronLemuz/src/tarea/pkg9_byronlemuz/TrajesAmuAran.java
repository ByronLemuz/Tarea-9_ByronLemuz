/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9_byronlemuz;

import java.util.ArrayList;

/**
 *
 * @author lesly
 */
public class TrajesAmuAran {

    
        }
    }
    public class TrajeSamusAran {
    private double porcentajeDaño;
    private double porcentajeCarga;
    private double porcentajeOxido;
    private double porcentajeFuerza;
    private Beam beam;
    private MissileLauncher missileLauncher;
    private ArrayList<AddOn> addOns;

    public TrajeSamusAran(double porcentajeDaño, double porcentajeCarga, double porcentajeOxido, double porcentajeFuerza, Beam beam, MissileLauncher missileLauncher, ArrayList<AddOn> addOns) {
        this.porcentajeDaño = porcentajeDaño;
        this.porcentajeCarga = porcentajeCarga;
        this.porcentajeOxido = porcentajeOxido;
        this.porcentajeFuerza = porcentajeFuerza;
        this.beam = beam;
        this.missileLauncher = missileLauncher;
        this.addOns = addOns;
    }

    public double getPorcentajeDaño() {
        return porcentajeDaño;
    }

    public void setPorcentajeDaño(double porcentajeDaño) {
        this.porcentajeDaño = porcentajeDaño;
    }

    public double getPorcentajeCarga() {
        return porcentajeCarga;
    }

    public void setPorcentajeCarga(double porcentajeCarga) {
        this.porcentajeCarga = porcentajeCarga;
    }

    public double getPorcentajeOxido() {
        return porcentajeOxido;
    }

    public void setPorcentajeOxido(double porcentajeOxido) {
        this.porcentajeOxido = porcentajeOxido;
    }

    public double getPorcentajeFuerza() {
        return porcentajeFuerza;
    }

    public void setPorcentajeFuerza(double porcentajeFuerza) {
        this.porcentajeFuerza = porcentajeFuerza;
    }

    public Beam getBeam() {
        return beam;
    }

    public void setBeam(Beam beam) {
        this.beam = beam;
    }

    public MissileLauncher getMissileLauncher() {
        return missileLauncher;
    }

    public void setMissileLauncher(MissileLauncher missileLauncher) {
        this.missileLauncher = missileLauncher;
    }

    public ArrayList<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(ArrayList<AddOn> addOns) {
        this.addOns = addOns;
    }
}

}
