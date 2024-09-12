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
import pe.edu.upeu.ExamenParcialLP.entity.Orden;
import pe.edu.upeu.ExamenParcialLP.service.OrdenService;


@RestController
@RequestMapping("ordenes")
public class OrdenController {
	@Autowired
	private OrdenService ordenService;
	
	@GetMapping
	public ResponseEntity<List<Orden>> readAll(){
		try {
			List<Orden> Orden = ordenService.readAll();
			if(Orden.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Orden, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Orden> crearOrden(@Valid @RequestBody Orden cat){
		try {
			Orden o = ordenService.create(cat);
			return new ResponseEntity<>(o, HttpStatus.CREATED);			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	@GetMapping("/{id}")
	public ResponseEntity<Orden> getOrdenId(@PathVariable("id") Long id){
		try {
			Orden o = ordenService.read(id).get();
			return new ResponseEntity<>(o, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Orden> delOrden(@PathVariable("id") Long id){
		try {
			ordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateOrden(@PathVariable("id") Long id, @Valid @RequestBody Orden cat){

			Optional<Orden> o = ordenService.read(id);
			if(o.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
			}else {
				return new ResponseEntity<>(ordenService.update(cat), HttpStatus.OK);
				
			}		
		
	}
}
