package com.medicamentos.api.model;

import com.medicamentos.api.estoque.DadosMedicamentos;
import com.medicamentos.api.estoque.Laboratorio;
import com.medicamentos.api.estoque.Via;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="Remédios")
@Entity(name="remédios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Medicamentos {
	
	public Medicamentos(DadosMedicamentos dadosMed) {
		this.nome = dadosMed.nome();
		this.laboratorio = dadosMed.laboratorio();
		this.dosagem = dadosMed.dosagem();
		this.via = dadosMed.via();
		this.validade = dadosMed.validade();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="O nome não pode ser nulo")
	@Size(min = 2, max = 100, message="O nome deve ter entre " + "2 e 100 caracteres") 
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;
	
	@Getter
	@Setter
	private String dosagem;
	
	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Via via;
	
	@Getter
	@Setter
	private String validade;

	
//	public Medicamentos(DadosMedicamentos dadosMed) {
//		// TODO Auto-generated constructor stub
//	}
	

	
	
	
	
}
