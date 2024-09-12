package pe.edu.upeu.ExamenParcialLP.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.ExamenParcialLP.entity.Tipo_orden;
import pe.edu.upeu.ExamenParcialLP.service.Tipo_ordenService;;

@RestController
@RequestMapping("tipo_ordenes")
public class Tipo_ordenController {
	@Autowired
	private Tipo_ordenService tipo_ordenService;
	
	@GetMapping
	public ResponseEntity<List<Tipo_orden>> readAll(){
		try {
			List<Tipo_orden> Tipo_orden = tipo_ordenService.readAll();
			if(Tipo_orden.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Tipo_orden, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Tipo_orden> crearTipo_orden(@Valid @RequestBody Tipo_orden cat){
		try {
			Tipo_orden t = tipo_ordenService.create(cat);
			return new ResponseEntity<>(t, HttpStatus.CREATED);			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	@GetMapping("/{id}")
	public ResponseEntity<Tipo_orden> getTipo_ordenId(@PathVariable("id") Long id){
		try {
			Tipo_orden t = tipo_ordenService.read(id).get();
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipo_orden> delTipo_orden(@PathVariable("id") Long id){
		try {
			tipo_ordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipo_orden(@PathVariable("id") Long id, @Valid @RequestBody Tipo_orden cat){

			Optional<Tipo_orden> t = tipo_ordenService.read(id);
			if(t.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
			}else {
				return new ResponseEntity<>(tipo_ordenService.update(cat), HttpStatus.OK);
				
			}		
		
	}
}
