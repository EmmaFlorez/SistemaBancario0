package com.banking.SistemaBancario.services;

import com.banking.SistemaBancario.models.Conta;
import com.banking.SistemaBancario.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;
    public Conta buscarContaPorId(Integer idConta) {
        Optional<Conta> conta = contaRepository.findById(idConta);
        if(conta.isPresent()) {
            return conta.get();
        } else {
            return null;
        }
    }
}
