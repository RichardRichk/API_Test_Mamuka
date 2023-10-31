package com.MamukaTest.MamukaTeste.controllers;

import com.MamukaTest.MamukaTeste.Repositories.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tiposUsuarios", produces = {"application/json"})
public class TipoUsuarioController {
    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

//    @Autowired
//    FileUploadServices fileUploadServices;
}