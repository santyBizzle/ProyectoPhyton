package service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import javax.xml.bind.JAXBException;

import model.Persona;

//Interfaz de los servicios a consumir de la API CUSTOMER
public interface personaService {
	// Funcion que lista todos los customers de la base de datos
	List<Persona> findAllCustomers() throws IOException, JAXBException;

}
