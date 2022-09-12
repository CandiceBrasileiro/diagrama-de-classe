package aplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Agencia;
import entities.Conta;
import entities.Movimento;
import entities.Pessoa;
import entities.TipoSituacao;

public class Teste {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("Rachel", 100, TipoSituacao.ATIVA);
		Pessoa p2 = new Pessoa("Candice", 10, TipoSituacao.ATIVA);
		Pessoa p3 = new Pessoa("Bibi", 500, TipoSituacao.DESATIVADA);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		for (Pessoa p : pessoas) {
				System.out.println(p.getNome().toUpperCase());			
		}
		
		Agencia agencia = new Agencia(1111);
		
		Conta conta = new Conta(1, LocalDate.now(), TipoSituacao.ATIVA, "1234", 100.00, p1);
		Conta conta2 = new Conta(2, LocalDate.now(), TipoSituacao.ATIVA, "1234", 10.00, p2);
		Conta conta3 = new Conta(3, LocalDate.now(), TipoSituacao.ATIVA, "1234", 500.00, p3);
		
		agencia.CadastrarConta(conta);
		agencia.CadastrarConta(conta2);
		agencia.CadastrarConta(conta3);
		
		conta.transferir(20.0, conta2);
		conta2.depositar(150.00);
		conta3.sacar(100.0);
		
		
		for(Conta c : agencia.getContas()) {
			for (Movimento m : c.getMovimentos()) {
				System.out.println(m);
			}
		}
		
	}

}
