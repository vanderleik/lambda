package br.com.devmedia.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {

	public List<Funcionario> getFuncionarios(Condicao<Funcionario> condicao){
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>() {{
			add(new Funcionario("Joao", 1903.98F));
			add(new Funcionario("Aline", 2826.65F));
			add(new Funcionario("Marcela", 3751.0F));
			add(new Funcionario("Andre", 500.0F));
		}};
		
		List<Funcionario> funcionariosComCondicao = new ArrayList<Funcionario>();
		
		funcionarios.forEach(f -> {
			if(condicao.teste(f)) {
				funcionariosComCondicao.add(f);
			}
		});
		
		return funcionariosComCondicao;
}
}
