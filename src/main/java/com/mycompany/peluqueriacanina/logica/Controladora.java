
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void guardar(String nombre, String color, String raza, String nombreDuenio, String celularDuenio, String alergico, String atencionEspecial, String observaciones) {
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celularDuenio);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio);
        
        controlPersistencia.guardar(duenio,mascota);
    }

    public List<Mascota> traerMascotas() {
        return controlPersistencia.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersistencia.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersistencia.traerMascota(num_cliente);
    }

    public void editarMascota(Mascota mascota, String nombre, String color, String raza, String observaciones, String alergico, String atencionEspecial, String nombre_duenio, String celular) {
        mascota.setNombre(nombre);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        
        controlPersistencia.editarMascota(mascota);
        
        Duenio duenio = this.buscarDuenio(mascota.getDuenio().getId());
        duenio.setNombre(nombre_duenio);
        duenio.setCelular(celular);
        
        this.editarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id) {
        return controlPersistencia.buscarDuenio(id);
    }

    private void editarDuenio(Duenio duenio) {
        controlPersistencia.editarDuenio(duenio);
    }
    
}
