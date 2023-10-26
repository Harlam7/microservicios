package com.usuario.service.feignsclients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.usuario.service.modelos.Moto;

import java.util.List;

@FeignClient(name = "moto-service", url ="http://localhost:8083")
@RequestMapping("/moto")
public interface MotoFeignClient {
    @PostMapping()
    public Moto save(@RequestBody Moto moto);

    @GetMapping("/usuario/{usuarioId}")
    public List<Moto> getMotos(@PathVariable("usuarioId") int usuarioId);
}
