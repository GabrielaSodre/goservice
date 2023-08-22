package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador, Long> {
    Optional<Prestador> findByEmail(String Email); //Receber a query e se moldar a ela e mostra isso, e observa as mudanças que acontecem a ela
}
