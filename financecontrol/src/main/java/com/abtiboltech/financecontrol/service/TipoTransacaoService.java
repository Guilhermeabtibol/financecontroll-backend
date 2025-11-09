package com.abtiboltech.financecontrol.service;

import com.abtiboltech.financecontrol.entity.TipoTransacao;
import com.abtiboltech.financecontrol.repository.TipoTransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoTransacaoService {

    private final TipoTransacaoRepository tipoTransacaoRepository;

    public TipoTransacaoService(TipoTransacaoRepository tipoTransacaoRepository) {
        this.tipoTransacaoRepository = tipoTransacaoRepository;
    }

    public List<TipoTransacao> listarTodos() {
        return tipoTransacaoRepository.findAll();
    }

    public TipoTransacao salvar(TipoTransacao tipoTransacao) {
        return tipoTransacaoRepository.save(tipoTransacao);
    }

}
