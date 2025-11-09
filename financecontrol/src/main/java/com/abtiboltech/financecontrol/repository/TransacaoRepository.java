package com.abtiboltech.financecontrol.repository;

import com.abtiboltech.financecontrol.entity.TipoTransacao;
import com.abtiboltech.financecontrol.entity.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findByUsuarioId(Long usuarioId);
}
