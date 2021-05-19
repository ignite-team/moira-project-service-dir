package es.ozona.moira.project.callejero.process.interfaces.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.ozona.moira.project.callejero.infrastructure.repositories.PaisRepository;
import es.ozona.moira.project.callejero.infrastructure.repositories.ProvinciaRepository;
import es.ozona.moira.project.callejero.process.interfaces.rest.dto.PaisResource;
import es.ozona.moira.project.callejero.process.interfaces.rest.dto.PaisAssembler;
import es.ozona.moira.project.callejero.process.interfaces.rest.dto.ProvinciaResource;
import es.ozona.moira.project.callejero.process.interfaces.rest.dto.ProvinciaAssembler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("/api/v1")
@Api(value = "Calles Service API.", tags = "API de Calles")
@SwaggerDefinition(tags = { @Tag(name = "API de calles.", description = "Operaciones para consulta y gestión de calles.")})
public class DirController {
	
	@Autowired
	private PaisRepository paisRepository;
	@Autowired
	private ProvinciaRepository provRepository;
	
	@GetMapping("/pais")
	@ResponseStatus(code = HttpStatus.OK)
	@ApiOperation(value = "Lista los paises.", notes = "")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = PaisResource.class), @ApiResponse(code = 400, message = "Bad Request")})
	public ResponseEntity<List<PaisResource>> listPais(@ApiParam(required = true) @RequestParam(name = "identidad", defaultValue = "1") Long idPais){
		return ResponseEntity.ok(PaisAssembler.buildFromEntities(paisRepository.findAll()));
	}
	
	@GetMapping("/provincia")
	@ResponseStatus(code = HttpStatus.OK)
	@ApiOperation(value = "Lista las provincias.", notes = "")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = ProvinciaResource.class), @ApiResponse(code = 400, message = "Bad Request")})
	public ResponseEntity<List<ProvinciaResource>> listProvincia(@ApiParam(required = true) @RequestParam(name = "identidad", defaultValue = "1") Long idProvincia){
		return ResponseEntity.ok(ProvinciaAssembler.buildFromEntities(provRepository.findAll()));
	}
}
