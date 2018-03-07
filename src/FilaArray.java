
public class FilaArray implements Fila {
	private int i;
	private int f;
	public Object Fila[];
	
	
	//VERIFICAR TAMANHO DA FILA
	public int tamanho() {
		return (Fila.length - i + f)%Fila.length;
	}
	
	//VERIFICAR SE A FILA ESTÁ VAZIA
	public boolean EstaVazia() {
		return (i == f);
	}

	
	public Object inicio() throws EFilaVazia {
		if(EstaVazia()) {
			throw new EFilaVazia();
		}else {
			return Fila[i];
		}
	}

	
	public void enfileirar(Object o) {
		
		
	}

	
	public Object desenfileirar() throws EFilaVazia {
		
		return null;
	}
	
	
}
