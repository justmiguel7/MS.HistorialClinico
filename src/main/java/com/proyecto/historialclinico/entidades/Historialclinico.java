package com.proyecto.historialclinico.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Historialclinico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idhistorial;

	@Column(name = "dnipaciente")
	private String dnipaciente;

	@Column(name = "dniodontologo")
	private String dniodontologo;

	@Column(name = "Idtratamiento")
	private int idtratamiento;

	@Column(name = "motivodeconsulta")
	private String motivodeconsulta;
	
	@Column(name = "Fechadeconsulta")
	private LocalDateTime fechadeconsulta;

	@Column(name = "Diagnostico")
	private String diagnostico;

	@Column(name = "Observaciones")
	private String observaciones;
	
	@Column(name = "Alergias")
	private String alergias;

	@Column(name = "Antecedentesmedicos")
	private String antecedentesmedicos;

	public Historialclinico(String dnipaciente, String dniodontologo, int idtratamiento, String motivodeconsulta,  LocalDateTime fechadeconsulta,
			String diagnostico, String observaciones, String alergias , String antecedentesmedicos) {
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
	
	public Historialclinico() {
		
		
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
	