package com.molkajmal.autoloc.Controller;

import com.molkajmal.autoloc.domain.Client;
import com.molkajmal.autoloc.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    final IClientService clientService;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c) {
        return clientService.addClient(c);
    }

    @GetMapping("/getClients")
    public List<Client> getAllClients() {
        return clientService.retrieveAllClients();
    }
    @GetMapping("/getClients/{idc}")
    public Client getClient(@PathVariable("idc") Long idc)
    {
        return clientService.retrieveClient(idc);
    }
    @DeleteMapping("/deleteClients/{idc}")
    public void deleteClient(@PathVariable("idc") Long idc)
    {
        clientService.removeClient(idc);
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client c){
        return clientService.updateClient(c);}
}
