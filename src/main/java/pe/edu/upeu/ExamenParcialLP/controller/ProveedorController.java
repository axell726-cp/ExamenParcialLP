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
import pe.edu.upeu.ExamenParcialLP.entity.Proveedor;
import pe.edu.upeu.ExamenParcialLP.service.ProveedorService;


@RestController
@RequestMapping("proveedores")
public class ProveedorController {
	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping
	public ResponseEntity<List<Proveedor>> readAll(){
		try {
			List<Proveedor> Proveedor = proveedorService.readAll();
			if(Proveedor.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Proveedor, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Proveedor> crearProveedor(@Valid @RequestBody Proveedor cat){
		try {
			Proveedor p = proveedorService.create(cat);
			return new ResponseEntity<>(p, HttpStatus.CREATED);			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	@GetMapping("/{id}")
	public ResponseEntity<Proveedor> getProveedorId(@PathVariable("id") Long id){
		try {
			Proveedor p = proveedorService.read(id).get();
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Proveedor> delProveedor(@PathVariable("id") Long id){
		try {
			proveedorService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProveedor(@PathVariable("id") Long id, @Valid @RequestBody Proveedor cat){

			Optional<Proveedor> p = proveedorService.read(id);
			if(p.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
			}else {
				return new ResponseEntity<>(proveedorService.update(cat), HttpStatus.OK);
				
			}		
		
	}
}
