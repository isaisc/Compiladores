import java.util.ArrayList;
import java.util.List;
public class ListaOps{

	public ListaOps(){
		static List<String> listOps = new ArrayList<String>(); //regresan el valor del codigo de operacion
		listaOps.add("+");
		listaOps.add("-");
		listaOps.add("*");
		listaOps.add("/");
		listaOps.add("%");
		listaOps.add(">");
		listaOps.add("<");
		listaOps.add(">=");
		listaOps.add("<=");
		listaOps.add("==");
		listaOps.add("!=");
		listaOps.add("AND");
		listaOps.add("OR");
		listaOps.add("NOT");
		listaOps.add("=");
		listaOps.add("write");
		listaOps.add("read");
		listaOps.add("goTo");
		listaOps.add("goToV");
		listaOps.add("goToF");
	}

	public int getOpCode(String operacion){
		return listaOps.indexOf(operacion);
	}
}
