/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author HP 255-G9
 */
public class Funcionario extends Persona {

    private String informacionAcademica;
    private String tituloEstudio;
    private String universidad;
    private int nivelEstudio;
    
    public Funcionario() {
    }

    public String getInformacionAcademica() {
        return informacionAcademica;
    }

    public void setInformacionAcademica(String informacionAcademica) {
        this.informacionAcademica = informacionAcademica;
    }

    public String getTituloEstudio() {
        return tituloEstudio;
    }

    public void setTituloEstudio(String tituloEstudio) {
        this.tituloEstudio = tituloEstudio;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(int nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    
}
