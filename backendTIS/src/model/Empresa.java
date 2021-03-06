package model;

import java.util.List;

import org.json.JSONObject;

public class Empresa extends AbstractUsuario {
	private String razaoSocial;
	private List<Evento> eventos;

	public Empresa() {
		super();
	}
	
	public Empresa(IUsuario user) {
		super.setUserData(user);
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	@Override
	public JSONObject toJSONObject() {
		JSONObject obj = super.toJSONObject();
		obj.put("razaoSocial", this.razaoSocial);
		return obj;
	}

	@Override
	public String toDATFormat() {
		return super.toDATFormat() + this.razaoSocial + "|";
	}

	@Override
	public void setDAT(String DAT) {
		String[] vet;
		
		super.setDAT(DAT);
		vet = DAT.split("|");
		this.razaoSocial = vet[0];
	}
}
