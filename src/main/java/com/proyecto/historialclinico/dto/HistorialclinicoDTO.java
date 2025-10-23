package com.proyecto.historialclinico.dto;

import java.time.LocalDateTime;

import com.proyecto.historialclinico.entidades.Historialclinico;



import jakarta.persistence.Column;
import lombok.Data;


@Data
public class HistorialclinicoDTO {
	
	
	
	private int idhistorial;


	private int idpaciente;


	private int idodontologo;


	private int idtratamiento;

	private String motivodeconsulta;
	
	private LocalDateTime fechadeconsulta;


	private String diagnostico;


	private String observaciones;
	
	private String alergias;

	
	private String antecedentesmedicos;
	
	
	public Historialclinico toEntity( String codigo ){
		return new Historialclinico(this.idpaciente, this.idodontologo, this.idtratamiento,this.motivodeconsulta , this.fechadeconsulta,this.diagnostico,this.observaciones, this.alergias, this.antecedentesmedicos);
	}


	public HistorialclinicoDTO(int idpaciente, int idodontologo, int idtratamiento, String motivodeconsulta, LocalDateTime fechadeconsulta,
			String diagnostico, String observaciones,String alergias,  String antecedentesmedicos) {
		super();

		this.idpaciente = idpaciente;
		this.idodontologo = idodontologo;
		this.idtratamiento = idtratamiento;
		this.motivodeconsulta = motivodeconsulta;
		this.fechadeconsulta = fechadeconsulta;
		this.diagnostico = diagnostico;
		this.observaciones = observaciones;
		this.alergias = alergias;
		this.antecedentesmedicos = antecedentesmedicos;
	}


	public int getIdhistorial() {
		return idhistorial;
	}


	public void setIdhistorial(int idhistorial) {
		this.idhistorial = idhistorial;
	}


	public int getIdpaciente() {
		return idpaciente;
	}


	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
	}


	public int getIdodontologo() {
		return idodontologo;
	}


	public void setIdodontologo(int idodontologo) {
		this.idodontologo = idodontologo;
	}


	public int getIdtratamiento() {
		return idtratamiento;
	}


	public void setIdtratamiento(int idtratamiento) {
		this.idtratamiento = idtratamiento;
	}


	public String getMotivodeconsulta() {
		return motivodeconsulta;
	}


	public void setMotivodeconsulta(String motivodeconsulta) {
		this.motivodeconsulta = motivodeconsulta;
	}


	public LocalDateTime getFechadeconsulta() {
		return fechadeconsulta;
	}


	public void setFechadeconsulta(LocalDateTime fechadeconsulta) {
		this.fechadeconsulta = fechadeconsulta;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String getAlergias() {
		return alergias;
	}


	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}


	public String getAntecedentesmedicos() {
		return antecedentesmedicos;
	}


	public void setAntecedentesmedicos(String antecedentesmedicos) {
		this.antecedentesmedicos = antecedentesmedicos;
	}

	
	
}