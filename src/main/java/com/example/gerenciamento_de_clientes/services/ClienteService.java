package com.example.gerenciamento_de_clientes.services;

import com.example.gerenciamento_de_clientes.models.ClienteModel;
import com.example.gerenciamento_de_clientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    public ClienteModel criar(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    public ClienteModel atualizar(ClienteModel clienteModel, Long id){
        ClienteModel cliente = clienteRepository.findById(id).get();
        cliente.setNome(clienteModel.getNome());
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }
}
