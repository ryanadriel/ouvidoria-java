package br.com.ouviFacil.services;

import javax.swing.JOptionPane;

public class Ouvidoria {

	public static void main(String[] args) {
		
		int opcao = 1;

		while (opcao != 5) {

			JOptionPane.showMessageDialog(null,
					"Bem vindo a OuviFácil! \n" + "Digite um opção para iniciar: \n[1] Listar Manifestações \n"
							+ "[2] Cadastrar Nova Manifestação \n[3] Remover Manifestação \n"
							+ "[4] Buscar Manifestação \n[5] Logoff");
			String opcaoStr = JOptionPane.showInputDialog(null, "Digite sua opção: ");
			opcao = Integer.parseInt(opcaoStr);
		}

	}

}
