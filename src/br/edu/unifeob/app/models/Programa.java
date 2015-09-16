package br.edu.unifeob.app.models;

public class Programa {

	public static void main(String[] args) {
		
		Cargo cargo = new Cargo();
		cargo.setDescricao("Analista de Sistemas Jr.");
		cargo.setSalarioBase(5000.0);
		cargo.setNivelDeInsalubridade(0.10);
		
		Empregado empregado = new Empregado();
		empregado.setMatricula("1222");
		empregado.setNome("Anderson Luis Ribeiro");
		empregado.setCpf("111.111.111-11");
		empregado.setCargo(cargo);
		empregado.setQuantidadeDeDependentes(0);
		
		TabelaDeInss tabelaDeInss = new TabelaDeInss();
		tabelaDeInss.setAnoDeVigencia(2015);
		
		TabelaDeIRRF tabelaDeIRRF = new TabelaDeIRRF();
		tabelaDeIRRF.setAnoDeVigencia(2015);
		tabelaDeIRRF.setValorPorDependente(189.59);
		
		SalarioMinimo salarioMinimo = new SalarioMinimo(2015, 788.0);
		
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.setMes(8);
		folha.setAno(2015);
		folha.setEmpregado(empregado);
		folha.setTabelaDeInss(tabelaDeInss);
		folha.setTabelaDeIRRF(tabelaDeIRRF);
		folha.setSalarioMinimo(salarioMinimo);
		folha.setAdiantamento(1000.00);
		
		System.out.println("O sal�rio base da folha �:" + folha.salarioBase());
		System.out.println("A insalubridade � de: " + folha.insalubridade());
		System.out.println("O sal�rio bruto da folha �: " + folha.salarioBruto());		
		System.out.println("O inss �: " + folha.inss());
		System.out.println("O valor do IRRF �: " + folha.impostoDeRenda());
		System.out.println("O adiantamento �: " + folha.getAdiantamento());		
		System.out.println("O sal�rio l�quido �: " + folha.salarioLiquido());
		System.out.println("A base de c�lculo �: " + folha.baseDeCalculoDoIRRF());
		
		
		
	}

}
