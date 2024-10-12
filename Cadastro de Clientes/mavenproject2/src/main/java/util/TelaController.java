package util;

import java.awt.TextField;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class TelaController {

    @FXML
    private TextField campoCEP;

    @FXML
    private TextField campoCidade;

    @FXML
    private TextField campoEstado;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoNumero;

    @FXML
    private TextField campoRua;

    @FXML
    private TextField campoTelefone;
    
    private ArrayList<Cliente> listaClientes;
    
    private Cliente cliente;
    
    private Endereco endereco;
    
    private Buscador buscador;
    
    @FXML
    private void initialize(){
        cliente = new Cliente();
        endereco = new Endereco();
        buscador = new Buscador();
        listaClientes = new ArrayList<>();
    }
    
     private void gravar() {
        cliente.setNome(campoNome.getText());
        cliente.setTelefone(campoTelefone.getText());
        cliente.setEndereco(new Endereco(campoCEP.getText(), campoRua.getText(), campoNumero.getText(), campoCidade.getText(), campoEstado.getText()));
        listaClientes.add(cliente);
        mostrarMensagemConfirmacao("Cliente cadastrado com sucesso!");
    }

    @FXML
    private void buscarEndereco() {
        String cep = campoCEP.getText();
        try {
            endereco = buscador.buscar(cep);
            campoRua.setText(endereco.getRua());
            campoCidade.setText(endereco.getCidade());
            campoEstado.setText(endereco.getEstado());
        } catch (IllegalArgumentException e) {
            mostrarMensagemErro("Formato de CEP inválido.");
        } catch (IOException e) {
            mostrarMensagemErro("Erro ao buscar o CEP: " + e.getMessage());
        } catch (Exception e) {
            mostrarMensagemErro("Erro desconhecido: " + e.getMessage());
        }
    }

    private void mostrarMensagemErro(String mensagem) {
        // Implementar um método para mostrar mensagens ao usuário, como um Alert
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Aviso");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
    
    private void mostrarMensagemConfirmacao(String mensagem) {
        // Implementar um método para mostrar mensagens ao usuário, como um Alert
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(null);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

}