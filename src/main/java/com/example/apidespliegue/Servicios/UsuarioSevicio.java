/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apidespliegue.Servicios;

import com.example.apidespliegue.Entidades.UsuarioModel;
import com.example.apidespliegue.Repositorios.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioSevicio {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    
    public List<UsuarioModel> obtenerUsuarios(){
        return usuarioRepositorio.findAll();
    }
    
    public boolean actualizarUsuario (UsuarioModel a){
        boolean respuesta = false;
        try {
            
            usuarioRepositorio.save(a);
            respuesta = true;
        }catch (Exception ex){
            respuesta = false;
        }
        return false;
    }
    
    public boolean eliminarUsuario (UsuarioModel a){
        boolean respuesta = false;
        try {
            
            usuarioRepositorio.save(a);
            respuesta = true;
        }catch (Exception ex){
            respuesta = false;
        }
        return false;
    }
    
    public boolean insertarUsuario (UsuarioModel a){
        boolean respuesta = false;
        try {
            
            usuarioRepositorio.save(a);
            respuesta = true;
        }catch (Exception ex){
            respuesta = false;
        }
        return false;
    }
}
