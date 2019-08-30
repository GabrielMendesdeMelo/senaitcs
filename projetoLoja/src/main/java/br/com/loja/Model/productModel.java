package br.com.loja.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class productModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproduto;
	private String nome;
	private float price;
	private String madein;
	private String brand;
	
	public productModel() {
		
	}
	
	public productModel(int id, String nome, String brand, String madein, float price){
		
		this.idproduto=id;
		this.nome=nome;
		this.brand=brand;
		this.madein=madein;
		this.price=price;	
	}
	

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
