package com.coderhouse.ClienteApiRestPungitore.controller;

import com.coderhouse.ClienteApiRestPungitore.ResponseHandler;
import com.coderhouse.ClienteApiRestPungitore.model.Client;
import com.coderhouse.ClienteApiRestPungitore.model.ClientDTO;
import com.coderhouse.ClienteApiRestPungitore.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    //Creacion de Clientes
    @PostMapping
    public ResponseEntity<Object> crearCliente(@RequestBody Client client) {
        try {
            Client clienteGuardado = clientService.crearCliente(client);
            return ResponseHandler.generateResponse("El cliente se creo correctamente", HttpStatus.CREATED, clienteGuardado);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    //Obtencion de Clientes
    @GetMapping(path = "{id}")
    public ResponseEntity<Object> obtenerCliente(@PathVariable int id) {
        try {
            ClientDTO clienteObtenido = clientService.obtenerCliente(id);
            if (clienteObtenido == null) {
                return ResponseHandler.generateResponse("Cliente con id "+ id + " inexsistente.", HttpStatus.NOT_FOUND, null);
            }
            return ResponseHandler.generateResponse("El cliente encontrado correctamente", HttpStatus.OK, clienteObtenido);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

}
