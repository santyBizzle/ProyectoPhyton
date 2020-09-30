package service;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.http.util.EntityUtils;

import model.Persona;

public class personaServiceImpl implements personaService {

	// Se define la url que apunta la api customer
	public String URL_API_PERSONA = "http://localhost:7070/persona";

	// Se define una variable de tipo httpCliente para realizar las peticiones rest
	private HttpClient httpClient = HttpClientBuilder.create().build();
	private Gson gson = new Gson();

	@Override
	public List<Persona> findAllCustomers() throws IOException, JAXBException {
		HttpGet get = new HttpGet(URL_API_PERSONA);
		HttpResponse response = httpClient.execute(get);

		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode != 200) {
			throw new RuntimeException("Failed with HTTP error code : " + statusCode);
		}

		HttpEntity httpEntity = response.getEntity();
		String apiOutput = EntityUtils.toString(httpEntity);

		System.out.println(apiOutput);
		Type userListType = new TypeToken<ArrayList<Persona>>() {
		}.getType();
		return gson.fromJson(apiOutput, userListType);
	}



}
