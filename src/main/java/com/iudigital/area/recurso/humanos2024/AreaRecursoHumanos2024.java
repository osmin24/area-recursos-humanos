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
            Funcionario funcionario = funcionariodb.getFuncionario("09876");
            System.out.println("Nombre " + funcionario.getNombres());

        } catch (Exception ex) {
            System.out.println("Exception: "+ex);
        }

    }
}
