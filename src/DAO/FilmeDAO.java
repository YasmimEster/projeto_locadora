/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Filme;
import java.sql.*;
public class FilmeDAO extends ExecuteSQL{

    public FilmeDAO(Connection con) {
        super(con);
    }
    public String Inserir_Filme(Filme a) {
    String sql = "insert into cliente values(0,?,?)";
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        
        ps.setString(1, a.getTitulo());
        ps.setString(2, a.getAno());
        ps.setString(3, a.getDuracao());
        ps.setInt(4, a.getCod_categoria());
        ps.setInt(5, a.getCod_classificacao());
        ps.setString(6, a.getCapa());
        
        
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
