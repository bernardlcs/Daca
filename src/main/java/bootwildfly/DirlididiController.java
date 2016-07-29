package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirlididiController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("oi desenvolvedor, seu lindo, bora trabalhar");
    }
    //get
    @RequestMapping("/home")
    public String home(){
    	return ("Bem vindo!!");
    }
    //get
    @RequestMapping("/problemas")
    public String problemas(){
    	return ("deve mostra uma tela cheio de problemas");
    }
    //post
    @RequestMapping("/problemas/create")
    public String problemCreate(){
    	return ("tela de criar um problema");
    }
    //get
    @RequestMapping("/problemas/problemaID")
    public String problemID(){
    	return ("mostra detalhes do problema escolhido");
    }
    
    //post
    @RequestMapping("/problemas/problemaID/edit")
    public String problemEdit(){
    	return ("editando uma soluçao");
    }
    //post
    @RequestMapping("/problemas/problemaID/submit")
    public String problemIdSubmit(){
    	return ("submetendo uma soluçao");
    }
    //get
    @RequestMapping("/admin")
    public String admin(){
    	return ("administradores");
    }
    //get
    @RequestMapping("/usuarios")
    public String usuarios(){
    	return ("usuarios");
    }
    //post
    @RequestMapping("/admin/cadastro")
    public String adminCadastro(@RequestParam(value="name") String name){
    	return (name);
    }
    //Post
    @RequestMapping("/usuarios/cadastro")
    public String usuariosCadastro(@RequestParam(value="name") String name){
    	return (name);
    }
    //get
    @RequestMapping("/user/login")
    public String userLogin(){
    	return ("login do usuario");
    }
    
}