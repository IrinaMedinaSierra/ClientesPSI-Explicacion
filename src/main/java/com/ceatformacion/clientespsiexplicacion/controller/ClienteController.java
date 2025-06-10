package com.ceatformacion.clientespsiexplicacion.controller;


import com.ceatformacion.clientespsiexplicacion.model.Clientes;
import com.ceatformacion.clientespsiexplicacion.repository.ClienteRepository;
import com.ceatformacion.clientespsiexplicacion.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    //@Autowired se encarga de crear y conectar los objetos necesario
    @Autowired
    private ClienteRepository  clienteRepository;
    private PersonalRepository personalRepository;

    //Llamar la pagina principal del formulario

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        //Le enviamos un objeto tipo cliente para lo reciba el formulario, y a partir de alli asigne los atributos leidos
        model.addAttribute("cliente", new Clientes());
        return "formulario"; //Se llama el html de la pagina que quieres mostrar
    }

    //Quien recibe los datos del formulario-> la siguiente función que siempre debe ser PostMapping

    @PostMapping("/crud")
    public String leerFormulario(@ModelAttribute Clientes clienteFormulario, Model model) {
        //normalmente en sql ....insert into...etc....
        clienteRepository.save(clienteFormulario); //Lo guarda en la BBDD
        return "redirect:/crud";
    }

    @GetMapping("/crud")
    public String mostrarClientes(Model model) {
        model.addAttribute("clienteParaCRUD", clienteRepository.findAll());
        return "crud";
    }

    @GetMapping("/editar/{id}")
    public String editar(Model model, @PathVariable int id) {
        //debemos enviar los datos del cliente que se ha consultado mediante el id, hibernate lo busca y lo almacena en un objeto
        //recibimos el id medinate la url
        //se busca en la bbdd
        //se almacena todos los datos en un objeto tipo cliente
        Clientes cliente = clienteRepository.findById(id).get(); //busca x el id enviado por al url..
        model.addAttribute("cliente", cliente);
        return "formulario";
    }

    @GetMapping("/borrar/{id}")
    public String eliminar(Model model, @PathVariable int id) {
        clienteRepository.deleteById(id);
        return "redirect:/crud";
    }

}
