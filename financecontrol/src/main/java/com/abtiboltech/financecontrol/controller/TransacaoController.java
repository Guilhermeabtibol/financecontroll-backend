package com.abtiboltech.financecontrol.controller;

import com.abtiboltech.financecontrol.entity.TipoTransacao;
import com.abtiboltech.financecontrol.entity.Transacao;
import com.abtiboltech.financecontrol.service.TransacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @GetMapping
    public List<Transacao> listar() {
        return transacaoService.listarTodas();
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Transacao> listarPorUsuario(@PathVariable Long usuarioId) {
        return transacaoService.listarPorUsuario(usuarioId);
    }

    @PostMapping
    public Transacao salvar(@RequestBody Transacao transacao) {
        return transacaoService.salvar(transacao);
    }
}
