/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;



    public Conexao()
    {
        this.servidor = "localhost";
        this.banco = "Prog1";
        this.usuario = "postgres";
        this.senha = "Sophard175";
    } 

    public boolean conectar (){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
}