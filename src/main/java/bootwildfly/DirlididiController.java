package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirlididiController {
	
	//get
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
    @RequestMapping("/userCadastro/?name=name$email=email&senha=senha")
    public String adminCadastro(@RequestParam(value="name") String name,@RequestParam(value="email") String email,@RequestParam(value="senha") String senha){
    	return (name);
    }
    
    //get
    @RequestMapping("/userlogin/email=email&senha=senha")
    public String userLogin(@RequestParam(value="email") String email,@RequestParam(value="senha") String senha){
    	return ("login do usuario");
    }
    //get
    @RequestMapping("/ranking")
    public String ranking(){
    	return "ranking";
    }
    
}