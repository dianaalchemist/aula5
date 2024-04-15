package org.acme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/listar_pessoas")
public class ListarPessoasResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String listar_pessoas() 
    {

        
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/agenda";
        String user = "root";
        String password = "12345678";

        String jsonReturnString = "";


        //--
        try
        {
                 
            // Estabelece a conexão com o banco de dados
            Connection connection = DriverManager.getConnection(url, user, password);

            // Cria uma instrução SQL para selecionar todos os registros da tabela "pessoa"
            String sql = "SELECT * FROM pessoa";

            // Cria um objeto Statement
            Statement statement = connection.createStatement();

            // Executa a consulta
            ResultSet resultSet = statement.executeQuery(sql);

            // Lista de pessoas.
            List<Pessoa> pessoas = new ArrayList<>();

            // Itera pelos resultados e exibe as informações
            while (resultSet.next()) {
                Pessoa p = new Pessoa(  resultSet.getLong("cod"), 
                                        resultSet.getString("sexo"),                
                                        resultSet.getString("nome_pessoa"),
                                        resultSet.getString("endereco"),
                                        resultSet.getString("endereco_cep"),
                                        resultSet.getString("email_principal"),
                                        resultSet.getDate("dtnascimento"),
                                        resultSet.getString("estado_civil"),
                                        resultSet.getString("fone_res"),
                                        resultSet.getString("fone_com"),
                                        resultSet.getString("num_pais_fone_cel"),
                                        resultSet.getString("fone_cel"),
                                        resultSet.getString("num_pais_fone_cel2"),
                                        resultSet.getString("fone_cel2"),
                                        resultSet.getString("observacao"),
                                        resultSet.getDate("dtdesativacao"),
                                        resultSet.getString("motivo_desativacao"),
                                        resultSet.getString("profissao"),
                                        resultSet.getString("doc_cpf"),
                                        resultSet.getString("doc_rg"),
                                        resultSet.getString("email_trabalho"),
                                        resultSet.getString("fone_trabalho"));
                pessoas.add(p);

            }


            // Fecha os recursos
            resultSet.close();
            statement.close();
            connection.close();

            //após obter todos as pessoas e adicionar ao arraylist, vamos retornar o conteúdo para o front
            //System.out.println("p: " + p.toString());                
            //System.out.println("--------------------");
            Gson gson = new Gson();
            jsonReturnString = gson.toJson(pessoas);
            //System.out.println(jsonReturnString);            

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        //--

        return jsonReturnString;
    }
}
