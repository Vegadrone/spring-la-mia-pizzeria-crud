package org.generation.italy.demo.pojo;


import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Drink {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull (message = "devi inserire un nome")
	@Column(unique =  true)
	private String nome;
	
	@Nullable
	@Lob
	private String descrizione;
	
	@Min(value=1)
	private int prezzo;
	
	public Drink() {}
	
	public Drink (String nome, String deescrizione, int prezzo) {
		setNome(nome);
		setDescrizione(deescrizione);
		setPrezzo(prezzo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {

		return  "Nome: " + getNome() +
				"\nDescrizione: " + getDescrizione() +
				"\nPrezzo: " + getPrezzo();
	}
}
