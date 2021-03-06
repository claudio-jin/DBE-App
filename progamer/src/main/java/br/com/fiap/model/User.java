package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name = "claudio";
	private String dtNascimento = "22/06/2000";
	private String email = "claudioJin@hotmail.com";
	private String senha = "11122233";
	
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dtNascimento=" + dtNascimento + ", email=" + email + ", senha="
				+ senha + "]";
	}

	
	
}
