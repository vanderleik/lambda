package br.com.devmedia.lambdaexpression;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		
		List<Funcionario> funcionarios = folhaDePagamento.getFuncionarios(
				f -> f.getSalario() <= 1903.98F);

		funcionarios.forEach(f -> System.out.println(f.getNome()));
	}

}
