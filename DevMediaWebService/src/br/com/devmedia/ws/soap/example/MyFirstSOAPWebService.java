package br.com.devmedia.ws.soap.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;

@WebService
public class MyFirstSOAPWebService {

	@WebMethod
	public String ping (@WebParam(name="nome") @NotNull String nome){
		return "Pong "+nome;
		
	}
	@WebMethod(operationName="MinhaIdade", exclude=true)
	public Integer getAge(){
		return new Random().nextInt();
	}
	public List<String>  getPrimeiraLista (){
		List<String> toReturn = new LinkedList <String>();
		toReturn.add("Item 1");
		toReturn.add("Item 2");
		toReturn.add("Item 3");
		toReturn.add("Item 4");
		toReturn.add("Item 5");
		
		return toReturn;
		
	}
}
