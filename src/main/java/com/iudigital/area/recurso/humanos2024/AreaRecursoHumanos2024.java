/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.iudigital.area.recurso.humanos2024;

import database.FuncionariosDB;
import java.sql.SQLException;
import models.Funcionario;

/**
 *
 * @author HP 255-G9
 */
public class AreaRecursoHumanos2024 {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");

        try {
           
            System.out.println("Primero");
            FuncionariosDB funcionariodb = new FuncionariosDB();
            Funcionario funcionario = new Funcionario();
            funcionario.setTipoIdentificacion(1);
            funcionario.setNumeroIdentificacion("12345");
            funcionario.setNivelEstudio(5);
            funcionario.setApellidos("Gonzales cantinflas");
            funcionario.setNombres("Mauricio paulo");
            funcionario.setEstadoCivil(2);
            funcionario.setDireccion("Carrera 4, calle 2#434");
            funcionario.setFechaNacimiento("'2000-05-01");
            funcionario.setSexo(2);
            funcionario.setTituloEstudio("Abogado");
            funcionario.setUniversidad("Universidad del magdalena");
            funcionario.setInformacionAcademica("Estudiante de especializacion en big data");
            funcionario.setTelefono("394 494 9344");
            
            funcionariodb.addFuncionario(funcionario);
            
            funcionario = funcionariodb.getFuncionario("12345");
            System.out.println("Nombre " + funcionario.getNombres());
            
            funcionariodb.removeFuncionario("12345");
            
        } catch (Exception ex) {
            
        }

    }
}
