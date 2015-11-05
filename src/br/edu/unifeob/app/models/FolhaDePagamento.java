package br.edu.unifeob.app.models;

public class FolhaDePagamento {

	private Long id;
	private Integer mes;
	private Integer ano;
	private Empregado empregado;
	private TabelaDeInss tabelaDeInss;
	private TabelaDeIRRF tabelaDeIRRF;
	private Double adiantamento;
	private SalarioMinimo salarioMinimo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public TabelaDeInss getTabelaDeInss() {
		return tabelaDeInss;
	}

	public TabelaDeIRRF getTabelaDeIRRF() {
		return tabelaDeIRRF;
	}

	public void setTabelaDeIRRF(TabelaDeIRRF tabelaDeIRRF) {
		this.tabelaDeIRRF = tabelaDeIRRF;
	}

	public void setTabelaDeInss(TabelaDeInss tabelaDeInss) {
		this.tabelaDeInss = tabelaDeInss;
	}

	public Double getAdiantamento() {
		return adiantamento;
	}

	public void setAdiantamento(Double adiantamento) {
		this.adiantamento = adiantamento;
	}

	public Double salarioBase() {
		return getEmpregado().getCargo().getSalarioBase();
	}

	public Double salarioBruto() {
		return salarioBase();
	}

	public SalarioMinimo getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(SalarioMinimo salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}

	public Double inss() {
		Double salarioBruto = salarioBruto();

		for (AliquotaDeINSS aliquota : tabelaDeInss.getAliquotas()) {

			if (aliquota.getValorFixo() != null && salarioBruto > aliquota.getSalarioInicial()) {
				return aliquota.getValorFixo();
			} else if (salarioBruto >= aliquota.getSalarioInicial() && salarioBruto <= aliquota.getSalarioFinal()) {
				return salarioBruto * aliquota.getValor();
			}

		}

		return 0.0;
	}

	public Double salarioLiquido() {
		return salarioBruto() - inss() - getAdiantamento();
	}

	public Double baseDeCalculoDoIRRF() {
		return salarioBruto() - inss() - deducaoDosDependentesNoIRRF();
	}

	public Double deducaoDosDependentesNoIRRF() {
		return getEmpregado().getQuantidadeDeDependentes() * getTabelaDeIRRF().getValorPorDependente();
	}

	public Double impostoDeRenda() {
		Double baseDeCalculo = baseDeCalculoDoIRRF();
		Double valorDoImposto = 0.0;

		for (AliquotaDeIRRF aliquotaDeIRRF : tabelaDeIRRF.getAliquotas()) {

			if (aliquotaDeIRRF.getSalarioFinal() == null && aliquotaDeIRRF.getSalarioInicial() < baseDeCalculo) {

				valorDoImposto = (baseDeCalculo * aliquotaDeIRRF.getValor()) - aliquotaDeIRRF.getParcelaADeduzir();

			}

			if (aliquotaDeIRRF.getSalarioFinal() != null && aliquotaDeIRRF.getSalarioInicial() < baseDeCalculo
					&& aliquotaDeIRRF.getSalarioFinal() > baseDeCalculo) {

				valorDoImposto = (baseDeCalculo * aliquotaDeIRRF.getValor()) - aliquotaDeIRRF.getParcelaADeduzir();

			}

		}

		return valorDoImposto;
	}

	public Double insalubridade() {
		return getSalarioMinimo().getValor() * getEmpregado().getCargo().getNivelDeInsalubridade();
	}

}
