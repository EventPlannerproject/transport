package org.example.controller;

import org.example.entities.Transport;
import org.example.repositories.TransportRepo;
import org.example.service.TransportService;
import org.example.service.serviceImpl.TransportServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/transport")

public class TransoportController {

        private final TransportRepo transportRepo;
        private final TransportService transportService;

        public TransoportController(TransportRepo transportRepo, TransportService transportService) {
            this.transportRepo =  transportRepo;
            this.transportService = transportService;
        }

        @GetMapping
        public List<Transport> getTransport() {
            return transportRepo.findAll();
        }

        @GetMapping("/{id}")
        public Transport getTransport(@PathVariable int id) {
            return transportService.getTransportById(id);
        }

        @PostMapping
        public ResponseEntity createClient(@RequestBody Transport transport) throws URISyntaxException {
            transportService.saveTrans(transport);
            return ResponseEntity.created(new URI("/transport/" + transport.getid())).body(transport);
        }

        @PutMapping("/{id}")
        public ResponseEntity updateClient(@PathVariable int id, @RequestBody Transport transport) {
          Transport transpupdated = transportService.updateTrans(id,transport);
          return  ResponseEntity.ok(transpupdated);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity deleteClient(@PathVariable int id) {
           transportService.DeleteTranspById(id);
            return ResponseEntity.ok().build();
        }
    }

