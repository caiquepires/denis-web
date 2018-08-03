package com.bembaIT.denis.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bembaIT.denis.model.Cliente;
import com.bembaIT.denis.model.TipoDocumento;
import com.bembaIT.denis.repository.Clientes;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private Clientes clientes;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		
		ModelAndView mv = new ModelAndView("CadastroCliente");
		mv.addObject("todosTipoDocumento", TipoDocumento.values());
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Cliente cliente) {
		
		clientes.save(cliente);
		
		ModelAndView mv = new ModelAndView("CadastroCliente");
		mv.addObject("mensagem","Cliente cadastrado com sucesso.");
		mv.addObject("todosTipoDocumento", TipoDocumento.values());
		return mv;
	}
	
	@RequestMapping
	public String pesquisar() {
	
		return "PesquisaCliente";
	}
	
	
	
	
	@ModelAttribute("todosTipoDocumento")
	public List<TipoDocumento> todosTipoDocumento() {
		return Arrays.asList(TipoDocumento.values());
	}

}
