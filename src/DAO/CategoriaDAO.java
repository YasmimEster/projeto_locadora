/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Categoria;
import java.sql.*;
public class CategoriaDAO extends ExecuteSQL{

    public CategoriaDAO(Connection con) {
        super(con);
    }
    public String Inserir_Categoria(Categoria a) {
    String sql = "insert into cliente values(0,?)";
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        
        ps.setString(1, a.getNome());
        
        
        if (ps.executeUpdate() > 0) {
            return "Inserido com Sucesso.";
        }
        else{
            return "Erro ao Inserir";
        }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}

