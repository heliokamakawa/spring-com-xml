package br.edu.ifpr.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import banco.DAOEstado;
import entidade.Estado;
import repositorio.RepositorioEstado;

@CrossOrigin
@RestController
@RequestMapping("/webserv")
public class ControleEstado {

	private DAOEstado dao = new DAOEstado();

	 
	@RequestMapping(value = "/estado/", method = RequestMethod.GET)
    public ResponseEntity<List<Estado>> listAll() {
        List<Estado> estados = dao.buscar();
        if(estados.isEmpty()){
            return new ResponseEntity<List<Estado>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Estado>>(estados, HttpStatus.OK);
    }
 
 
}
