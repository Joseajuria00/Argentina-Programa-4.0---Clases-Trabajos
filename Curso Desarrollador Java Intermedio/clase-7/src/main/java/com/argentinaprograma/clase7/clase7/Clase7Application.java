package com.argentinaprograma.clase7.clase7;

import com.argentinaprograma.clase7.clase7.model.*;
import com.argentinaprograma.clase7.clase7.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Clase7Application {

	private static ServicioService servicioService;
	private static AdministradorService administradorService;
	private static PrestadorService prestadorService;
	private static TareaService tareaService;

	@Autowired
	public Clase7Application(ServicioService servicioService, AdministradorService administradorService, PrestadorService prestadorService, TareaService tareaService) {
		this.servicioService = servicioService;
		this.administradorService = administradorService;
		this.prestadorService = prestadorService;
		this.tareaService = tareaService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Clase7Application.class, args);

		inicializarEntidades();

		System.out.println(servicioService.buscarTodos());
	}

	private static void inicializarEntidades (){
		Administrador a1 = new Administrador(0, "Juan", "Reyno", "juan@gmail.com", "password");
		a1.setId(administradorService.guardar(a1).getId());

		Prestador p1 = new Prestador(0, "Jose", "Perez", "jose@gmail.com", "Mañana", "10km", null, "DNI", 43434343, 2043434343, "4343", "mañana");
		p1.setId(prestadorService.guardar(p1).getId());

		Tarea t1 = new Tarea(0, "Maquillaje pestania", 120.0);
		t1.setId(tareaService.guardar(t1).getId());

		Servicio s1 = new Servicio(0, "Servicio Maquillaje", "Descripcion del serivicio", a1, p1, List.of(t1));
		s1.setId(servicioService.guardar(s1).getId());
	}

}
