package com.abtiboltech.financecontrol.service;

import com.abtiboltech.financecontrol.entity.Transacao;
import com.abtiboltech.financecontrol.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    private final TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    public List<Transacao> listarTodas() {
        return transacaoRepository.findAll();
    }

    public List<Transacao> listarPorUsuario(Long usuarioId) {
        return transacaoRepository.findByUsuarioId(usuarioId);
    }

    public Transacao salvar(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }
}
