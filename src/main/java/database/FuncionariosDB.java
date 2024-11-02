/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import Configuration.ConfigurationDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Funcionario;

/**
 *
 * @author HP 255-G9
 */
public class FuncionariosDB {
    private static final String SELECT = "select*from funcionarios;";
  
    public List<Funcionario> getFuncionarios()throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            List<Funcionario> empleados = new ArrayList<>();
            connection = ConfigurationDB.getConnection();
            preparedStatement = connection.prepareStatement(SELECT);
            resultSet = preparedStatement.executeQuery();
            
                while(resultSet.next()){
                    Funcionario funcionario = new Funcionario();
                    
                    funcionario.setID(resultSet.getInt("id"));
                    funcionario.setNombres(resultSet.getString("nombres"));
                    funcionario.setApellidos(resultSet.getString("apellidos"));
                    funcionario.setTipoIdentificacion(resultSet.getInt("tipo_identificacion"));
                    funcionario.setNumeroIdentificacion(resultSet.getString("numero_identificaion"));
                    funcionario.setEstadoCivil(resultSet.getInt("id_estado_civil"));
                    funcionario.setSexo(resultSet.getInt("id_sexo"));
                    funcionario.setDireccion(resultSet.getString("direcction"));
                    funcionario.setTelefono(resultSet.getString("telefono"));
                    funcionario.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
                    funcionario.setInformacionAcademica(resultSet.getString("informacion_academica"));
                    funcionario.setUniversidad(resultSet.getString("universidad"));
                    funcionario.setNivelEstudio(resultSet.getInt("id_nivel_estudio"));
                    funcionario.setTituloEstudio(resultSet.getString("titulo_estudio"));
                    
                    empleados.add(funcionario);

                }
                
            return empleados;
        }finally{
            if(connection != null){
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        }
    }
    
    public Funcionario getFuncionario(String numeroIdentificacion)throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionario funcionario = new Funcionario();
        try{
         
            connection = ConfigurationDB.getConnection();
            preparedStatement = connection.prepareStatement("select*from public.funcionarios where numero_identificaion='"+numeroIdentificacion+"'");
            resultSet = preparedStatement.executeQuery();
   
                while(resultSet.next()){
                    
                    funcionario.setID(resultSet.getInt("id"));
                    funcionario.setNombres(resultSet.getString("nombres"));
                    funcionario.setApellidos(resultSet.getString("apellidos"));
                    funcionario.setTipoIdentificacion(resultSet.getInt("id_tipo_identificacion"));
                    funcionario.setNumeroIdentificacion(resultSet.getString("numero_identificaion"));
                    funcionario.setEstadoCivil(resultSet.getInt("id_estado_civil"));
                    funcionario.setSexo(resultSet.getInt("id_sexo"));
                    funcionario.setDireccion(resultSet.getString("direcction"));
                    funcionario.setTelefono(resultSet.getString("telefono"));
                    funcionario.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
                    funcionario.setInformacionAcademica(resultSet.getString("informacion_academica"));
                    funcionario.setUniversidad(resultSet.getString("universidad"));
                    funcionario.setNivelEstudio(resultSet.getInt("id_nivel_estudio"));
                    funcionario.setTituloEstudio(resultSet.getString("titulo_estudio"));
                    
              

                }
        }finally{
            if(connection != null){
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        }
        return funcionario;
    }
    
    public void addFuncionario(Funcionario funcionario)throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
         
            connection = ConfigurationDB.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO public.funcionarios(id_tipo_identificacion, numero_identificaion, nombres, apellidos, id_estado_civil, id_sexo, direcction, telefono, fecha_nacimiento, informacion_academica, universidad, id_nivel_estudio, titulo_estudio)VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setInt(1, funcionario.getTipoIdentificacion());
            preparedStatement.setString(2,funcionario.getNumeroIdentificacion());
            preparedStatement.setString(3, funcionario.getNombres());
            preparedStatement.setString(4, funcionario.getApellidos());
            preparedStatement.setInt(5,funcionario.getEstadoCivil());
            preparedStatement.setInt(6,funcionario.getSexo());
            preparedStatement.setString(7,funcionario.getDireccion());
            preparedStatement.setString(8,funcionario.getTelefono());
            preparedStatement.setString(9,funcionario.getFechaNacimiento());
            preparedStatement.setString(10,funcionario.getInformacionAcademica());
            preparedStatement.setString(11,funcionario.getUniversidad());
            preparedStatement.setInt(12,funcionario.getNivelEstudio());
            preparedStatement.setString(13,funcionario.getTituloEstudio());
            preparedStatement.execute();
   
        }finally{
            if(connection != null){
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }
    
    public void updateFuncionario(Funcionario funcionario)throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
         
            connection = ConfigurationDB.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE public.funcionarios SET id_tipo_identificacion=?, numero_identificaion=?, nombres=?, apellidos=?, id_estado_civil=?, id_sexo=?, direcction=?, telefono=?, fecha_nacimiento=?, informacion_academica=?, universidad=?, id_nivel_estudio=?, titulo_estudio=?\n" +
            "WHERE numero_identificacion="+funcionario.getNumeroIdentificacion());
            preparedStatement.setInt(2, funcionario.getTipoIdentificacion());
            preparedStatement.setString(3,funcionario.getNumeroIdentificacion());
            preparedStatement.setString(4, funcionario.getNombres());
            preparedStatement.setString(5, funcionario.getApellidos());
            preparedStatement.setInt(6,funcionario.getEstadoCivil());
            preparedStatement.setInt(7,funcionario.getSexo());
            preparedStatement.setString(8,funcionario.getDireccion());
            preparedStatement.setString(9,funcionario.getTelefono());
            preparedStatement.setString(10,funcionario.getFechaNacimiento());
            preparedStatement.setString(11,funcionario.getInformacionAcademica());
            preparedStatement.setString(12,funcionario.getUniversidad());
            preparedStatement.setInt(13,funcionario.getNivelEstudio());
            preparedStatement.setString(14,funcionario.getTituloEstudio());
            preparedStatement.execute();
   
        }finally{
            if(connection != null){
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }
    
    public void removeFuncionario(String numeroIdentificacion)throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
         
            connection = ConfigurationDB.getConnection();
            preparedStatement = connection.prepareStatement("delete from funcionarios where numero_identificaion='"+numeroIdentificacion+"'");
            preparedStatement.executeQuery();
               
        }finally{
            if(connection != null){
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }
    
}
