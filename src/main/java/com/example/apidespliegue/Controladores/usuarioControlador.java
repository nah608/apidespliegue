/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apidespliegue.Controladores;

import com.example.apidespliegue.Entidades.UsuarioModel;
import com.example.apidespliegue.Servicios.UsuarioSevicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")

public class usuarioControlador {
    
    @Autowired
    UsuarioSevicio usuarioRepositorio;
    
    @GetMapping("")
    public List<UsuarioModel> getTodosLosUsuarios(){
        return usuarioRepositorio.obtenerUsuarios();
    }
    
    @PostMapping("")
    public List<UsuarioModel> putActualizarUsuario(@RequestBody UsuarioModel a1){
        if (usuarioRepositorio.actualizarUsuario(a1)){
            return usuarioRepositorio.obtenerUsuarios();
        } else {
            return null;
        }
    }
    
    @DeleteMapping("")
    public List<UsuarioModel> deleteUsuario(@RequestBody UsuarioModel a1){
        if (usuarioRepositorio.eliminarUsuario(a1)){
            return usuarioRepositorio.obtenerUsuarios();
        } else {
            return null;
        }
    }
}
