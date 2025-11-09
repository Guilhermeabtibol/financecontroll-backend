package com.abtiboltech.financecontrol.controller;

import com.abtiboltech.financecontrol.entity.TipoTransacao;
import com.abtiboltech.financecontrol.repository.TipoTransacaoRepository;
import com.abtiboltech.financecontrol.service.TipoTransacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-transacao")
public class TipoTransacaoController {

    private final TipoTransacaoService tipoTransacaoService;

    public TipoTransacaoController(TipoTransacaoService tipoTransacaoService) {
        this.tipoTransacaoService = tipoTransacaoService;
    }

    @GetMapping
    public List<TipoTransacao> listar() {
        return tipoTransacaoService.listarTodos();
    }

   @PostMapping
    public TipoTransacao salvar(@RequestBody TipoTransacao tipoTransacao) {
        return tipoTransacaoService.salvar(tipoTransacao);
   }
}
