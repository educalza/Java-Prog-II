package com;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

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
    
    private Endereco endereco;
    
    private Buscador buscador;
    
    @FXML
    private void initialize() {
        endereco = new Endereco();
        buscador = new Buscador();
        listaClientes = new ArrayList<Cliente>();
    }  
    
    @FXML
    private void limpar(){
        campoNome.setText("");
        campoCEP.setText("");
        campoRua.setText("");
        campoNumero.setText("");
        campoCidade.setText("");
        campoEstado.setText("");
        campoTelefone.setText("");
    }
    
    @FXML
    private void buscarCEP(){
        String cep = campoCEP.getText();
        try {
            endereco = buscador.buscar(cep);
            campoRua.setText(endereco.getRua());
            campoCidade.setText(endereco.getCidade());
            campoEstado.setText(endereco.getEstado());
        } catch (IllegalArgumentException e) {
            mostrarAlerta(AlertType.ERROR, "Formato de CEP inválido.");
        } catch (IOException e) {
            mostrarAlerta(AlertType.ERROR, "Erro ao buscar CEP.");
        } catch (Exception e) {
            mostrarAlerta(AlertType.ERROR, "Erro desconhecido.");
        }
    }

    private void mostrarAlerta(AlertType tipo, String mensagem) {
        Alert alert = new Alert(tipo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.show();
    }

    @FXML
    private void gravar() {
        if (campoNome.getText().isEmpty() || campoTelefone.getText().isEmpty() ||
        campoCEP.getText().isEmpty() || campoRua.getText().isEmpty() ||
        campoNumero.getText().isEmpty() || campoCidade.getText().isEmpty() ||
        campoEstado.getText().isEmpty()) {
        
        mostrarAlerta(AlertType.ERROR, "Por favor, preencha todos os campos.");
        return;
    }
        Cliente cliente = new Cliente(); // Cria um novo objeto Cliente
        cliente.setNome(campoNome.getText());
        cliente.setTelefone(campoTelefone.getText());
        cliente.setEndereco(new Endereco(campoCEP.getText(), campoRua.getText(), campoNumero.getText(), campoCidade.getText(), campoEstado.getText()));
        listaClientes.add(cliente);
        
        mostrarAlerta(AlertType.INFORMATION, "Cadastro gravado.");
        limpar();
        
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Clientes cadastrados:");
            for (Cliente c : listaClientes) {
                System.out.println(c.getNome());
            }
        }
    }
}
