package com.proyecto.historialclinico.dto;

import java.time.LocalDateTime;

import com.proyecto.historialclinico.entidades.Historialclinico;
import jakarta.persistence.Column;
import lombok.Data;


@Data
public class HistorialclinicoDTO {
	
	
	private int idhistorial;

	private String dnipaciente;

	private String dniodontologo;

	private int idtratamiento;

	private String motivodeconsulta;
	
	private LocalDateTime fechadeconsulta;

	private String diagnostico;

	private String observaciones;
	
	private String alergias;

	private String antecedentesmedicos;
	
	
	public Historialclinico toEntity( String codigo ){
		return new Historialclinico(this.dnipaciente, this.dniodontologo, this.idtratamiento,this.motivodeconsulta , this.fechadeconsulta,this.diagnostico,this.observaciones, this.alergias, this.antecedentesmedicos);
	}


	public HistorialclinicoDTO(String dnipaciente, String dniodontologo, int idtratamiento, String motivodeconsulta, LocalDateTime fechadeconsulta,
			String diagnostico, String observaciones,String alergias,  String antecedentesmedicos) {
		super();

		this.dnipaciente = dnipaciente;
		this.dniodontologo = dniodontologo;
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


	public String getDnipaciente() {
		return dnipaciente;
	}


	public void setDnipaciente(String dnipaciente) {
		this.dnipaciente = dnipaciente;
	}


	public String getDniodontologo() {
		return dniodontologo;
	}


	public void setDniodontologo(String dniodontologo) {
		this.dniodontologo = dniodontologo;
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