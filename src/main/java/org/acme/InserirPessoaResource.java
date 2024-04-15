package org.acme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/inserir_pessoa")
public class InserirPessoaResource {
    @QueryParam("cod")
    Integer cod;
    @QueryParam("sexo")
    String sexo;
    @QueryParam("nome_pessoa")
    String nome_pessoa;
    @QueryParam("endereco")
    String endereco;
    @QueryParam("endereco_cep")
    String endereco_cep;
    @QueryParam("email_principal")
    String email_principal;
    @QueryParam("dtnascimento")
    String dtnascimento;
    @QueryParam("estado_civil")
    String estado_civil;
    @QueryParam("fone_res")
    String fone_res;
    @QueryParam("fone_com")
    String fone_com;
    @QueryParam("num_pais_fone_cel")
    String num_pais_fone_cel;
    @QueryParam("fone_cel")
    String fone_cel;
    @QueryParam("num_pais_fone_cel2")
    String num_pais_fone_cel2;
    @QueryParam("fone_cel2")
    String fone_cel2;
    @QueryParam("observacao")
    String observacao;
    @QueryParam("profissao")
    String profissao;
    @QueryParam("doc_cpf")
    String doc_cpf;
    @QueryParam("doc_rg")
    String doc_rg;
    @QueryParam("email_trabalho")
    String email_trabalho;
    @QueryParam("fone_trabalho")
    String fone_trabalho;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String inserir_pessoa() 
    {

        
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/agenda";
        String user = "root";
        String password = "12345678";


        //--
        int iRetExecute = -1;
        //--
        try 
        {
            // Estabelece a conexão com o banco de dados
            Connection connection = DriverManager.getConnection(url, user, password);

            // SQL para inserção
            String sql = "INSERT INTO pessoa (cod,sexo, nome_pessoa, endereco, endereco_cep, " +
                    "email_principal, dtnascimento, estado_civil, fone_res, fone_com, " +
                    "num_pais_fone_cel, fone_cel, num_pais_fone_cel2, fone_cel2, " +
                    "observacao, dtdesativacao, motivo_desativacao, profissao, doc_cpf, " +
                    "doc_rg, email_trabalho, fone_trabalho) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, cod);
            stmt.setString(2, sexo);
            stmt.setString(3, nome_pessoa);
            stmt.setString(4, endereco);
            stmt.setString(5, endereco_cep);
            stmt.setString(6, email_principal);
            stmt.setDate(7, java.sql.Date.valueOf(dtnascimento));
            stmt.setString(8, estado_civil);
            stmt.setString(9, fone_res);
            stmt.setString(10, fone_com);
            stmt.setString(11, num_pais_fone_cel);
            stmt.setString(12, fone_cel);
            stmt.setString(13, num_pais_fone_cel2);
            stmt.setString(14, fone_cel2);
            stmt.setString(15, observacao); 
            stmt.setNull(16, java.sql.Types.DATE); // Data de desativação é nulo ao inserir
            stmt.setNull(17, java.sql.Types.VARCHAR); // Motivo de desativação é nulo ao inserir
            stmt.setString(18, profissao);
            stmt.setString(19, doc_cpf);
            stmt.setString(20, doc_rg);
            stmt.setString(21, email_trabalho);
            stmt.setString(22, fone_trabalho);

            iRetExecute = stmt.executeUpdate(); // Executando a inserção

            System.out.println("Log: Pessoa inserida com sucesso!");

            stmt.close();
            connection.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return "ERRO;"+e.toString();
        }

        return "OK;"+Integer.toString(iRetExecute);
        //--



    }
}
