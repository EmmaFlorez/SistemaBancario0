package com.banking.SistemaBancario.controllers;

import com.banking.SistemaBancario.models.Conta;
import com.banking.SistemaBancario.repositories.ContaRepository;
import com.banking.SistemaBancario.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @Autowired
    private ContaRepository contaRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Conta> buscarPorId(@PathVariable Integer id) {
        Conta conta = contaService.buscarContaPorId(id);
        if (conta == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(conta);
    }
    @GetMapping
    public List<Conta> buscarTodas(){
        return contaRepository.findAll();
    }

    @PostMapping
    public void salvarConta(@RequestBody Conta conta) {
        contaRepository.save(conta);
    }
}
