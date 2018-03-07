
public class FilaArray implements Fila {
	private int i;
	private int f;
	private int fc;
	public Object Fila[];
	
	
	//VERIFICAR TAMANHO DA FILA
	public int tamanho() {
		return (Fila.length - i + f)%Fila.length;
	}
	
	//VERIFICAR SE A FILA ESTÁ VAZIA
	public boolean EstaVazia() {
		return (i == f);
	}

	//VERIFICAR O INICIO DA FILA
	public Object inicio() throws EFilaVazia {
		if(EstaVazia()) {
			throw new EFilaVazia();
		}else {
			return Fila[i];
		}
	}
	
	
	public void enfileirar(Object o) {
		
		if(tamanho() == Fila.length -1) {
			
		}
		
	}

	
	public Object desenfileirar() throws EFilaVazia {
		Object o;
		
		if(EstaVazia()) {
			throw new EFilaVazia();
		}else {
			o = Fila[i];
			i = (i+1)%Fila.length;
		}
		return o;
	}
	
	
}
