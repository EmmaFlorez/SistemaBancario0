package com.banking.SistemaBancario.repositories;

import com.banking.SistemaBancario.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository <Conta, Integer>{
}
