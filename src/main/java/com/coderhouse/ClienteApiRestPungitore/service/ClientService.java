package com.coderhouse.ClienteApiRestPungitore.service;

import com.coderhouse.ClienteApiRestPungitore.model.Client;
import com.coderhouse.ClienteApiRestPungitore.model.ClientDTO;
import com.coderhouse.ClienteApiRestPungitore.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client crearCliente(Client client) {
       return clientRepository.save(client);
    }

    public ClientDTO obtenerCliente(int id) {
        Optional<Client> cliente = clientRepository.findById(id);
        if(cliente.isEmpty()){
            return null;
        } else {
            int edad = calcularEdad(cliente.get().getFechaNacimiento());
            return new ClientDTO(cliente.get().getNombre(), cliente.get().getApellido(), edad);
        }
    }

    private int calcularEdad(Date fechaNacimiento) {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(fechaNacimiento));
        int d2 = Integer.parseInt(formatter.format(new Date()));
        int edad = (d2 - d1) / 10000;
        return edad;
        }
}