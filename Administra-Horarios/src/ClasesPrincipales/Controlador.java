package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Controlador {
    private LinkedList<Usuario> listaUsuarios = new LinkedList();
    private LinkedList<Semestre> listaSemestres = new LinkedList();
    
    /**
     * inserta usuarios en la lista de usuarios
     * @param u usuario a insertar
     */
    public void insetarUsuario(Usuario u){
        listaUsuarios.add(u);
    }
    
    /**
     * inserta semestres en la lista de semestres
     * @param s semestre a insertar
     */
    public void insertarSemestre(Semestre s){
        listaSemestres.add(s);
    }
    
    /**
     * valida que el usuario a ingresar al sistema exista y que todos los datos 
     * ingresados sean correctos
     * @param nU nombre de usuario
     * @param cU clave de usuario
     * @param tU tipo de usuario
     * @return mensaje relacionado con la busqueda del usuario
     */
    public String validarUsuario(String nU, String cU, String tU){
        
        for (int l = listaUsuarios.size(), i = 0; l > i; i++){
            if (listaUsuarios.get(i).getUsuario().equals(nU) &&
                    listaUsuarios.get(i).getClave().equals(cU)){
                if (listaUsuarios.get(i).getTipo().equals(tU)){
                    return "correcto";
                }else{
                    return "Tipo de Usuario Incorrecto";
                }
            }
        }return "no se encuentra el usuario";
    }
}
