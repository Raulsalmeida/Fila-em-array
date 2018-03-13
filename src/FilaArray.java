
public class FilaArray implements Fila {
	private int i;
	private int f;
	private int fc;
	public Object fila[];
	public Object gotenks[];
	
	//CONSTRUTOR DO OBJETO
	public FilaArray(int tamanho, int fc) {
		fila = new Object[tamanho];
		this.fc =fc;
	}
	
	//CRESCIMENTO DA FILA CHEIA
	public Object[] crescimento(int fc) {
		if(fc == 0) {
			gotenks = new Object[tamanho()*2];
		}else {
			gotenks = new Object[tamanho() + fc];
		}
		for (int e = 0; e < fila.length; e++) {	
			gotenks[e] = fila[i];
			i = (i+1)%fila.length;
		}
		i = 0;
		f = fila.length -1;
		return gotenks;
	}
	
	//VERIFICAR TAMANHO DA FILA
	public int tamanho() {
		return (fila.length - i + f)%fila.length;
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
			return fila[i];
		}
	}
	
	
	public void enfileirar(Object o) {
		if(tamanho() == fila.length -1) {
			fila = crescimento(fc);
		}
		fila[f] = o;
		f = (f +1)%fila.length;
	}

	
	public Object desenfileirar() throws EFilaVazia {
		Object o;
		
		if(EstaVazia()) {
			throw new EFilaVazia();
		}else {
			i = (i+1)%fila.length;
			o = fila[i];
		}
		return o;
	}
	
	
}
