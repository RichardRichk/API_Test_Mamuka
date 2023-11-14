package com.MamukaTest.MamukaTeste.controllers;

import com.MamukaTest.MamukaTeste.Repositories.TipoUsuarioRepository;
import com.MamukaTest.MamukaTeste.dtos.TipoUsuarioDto;
import com.MamukaTest.MamukaTeste.models.TipoUsuarioModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tipoUsuario", produces = {"application/json"})
public class TipoUsuarioController {

    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    @GetMapping
    public ResponseEntity<List<TipoUsuarioModel>> listarTiposUsuario(){
        return ResponseEntity.status(HttpStatus.OK).body(tipoUsuarioRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<TipoUsuarioModel> cadastoTipoUsuario(@RequestBody @Valid TipoUsuarioDto tipoUsuarioDto){

        TipoUsuarioModel tipoUsuario = new TipoUsuarioModel();

        BeanUtils.copyProperties(tipoUsuarioDto, tipoUsuario);

        return ResponseEntity.status(HttpStatus.CREATED).body(tipoUsuarioRepository.save(tipoUsuario));
    }



}