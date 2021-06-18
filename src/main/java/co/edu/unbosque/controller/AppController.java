package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.EmpresaDTO;
import co.edu.unbosque.model.persistence.RolDTO;
import co.edu.unbosque.model.persistence.UsuarioDTO;
import co.edu.unbosque.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @Autowired
    private AccesoService acceso;
    @Autowired
    private ARLService arl;
    @Autowired
    private CargoService cargo;
    @Autowired
    private ConceptoNominaService concepto;
    @Autowired
    private DepartamentoService departamento;
    @Autowired
    private EmpleadoService empleado;
    @Autowired
    private EmpresaService empresa;
    @Autowired
    private EPSService eps;
    @Autowired
    private NovedadService novedad;
    @Autowired
    private RolService rol;
    @Autowired
    private SucursalService sucursal;
    @Autowired
    private UsuarioService usuario;

    @GetMapping("/")
    public String goIndex() {
        return "index";
    }
    @GetMapping("/login")
    public String goLogin(Model model, UsuarioDTO usuario) {
        model.addAttribute("usuario", usuario);
        return "app/login";
    }
    @GetMapping("/Aplicacion/")
    public String goDashboard(Model model, UsuarioDTO usuario) {
        model.addAttribute("usuario", usuario);
        return "app/dashboard";
    }
    @GetMapping("/Aplicacion/Mi-Cuenta")
    public String goConfig(Model model, UsuarioDTO usuario) {
        model.addAttribute("usuario", usuario);
        return "app/config";
    }
    @GetMapping("/signup")
    public String goSignup(Model model, UsuarioDTO usuario) {
        model.addAttribute("usuario", usuario);
        return "app/signup";
    }
    @GetMapping("/Aplicacion/cargueArchivo")
    public String goCSV(Model model, UsuarioDTO usuario) {
        model.addAttribute("usuario", usuario);
        return "app/cargueArchivo";
    }
    @GetMapping("/Aplicacion/primerosPasos")
    public String hello(Model model, UsuarioDTO usuario, EmpresaDTO empresa) {
        model.addAttribute("usuario", usuario);
        model.addAttribute("empresa", empresa);
        return "app/primerosPasos";
    }
    @GetMapping("/Aplicacion/cargoNuevo")
    public String addJob() {
        return "app/registroCargo";
    }
    @GetMapping("/Aplicacion/dependenciaNueva")
    public String addDependency(){
        return "app/registroDependencia";
    }
    @GetMapping("/Aplicacion/empleadoNuevo")
    public String addEmpleado(){
        return "app/registroEmpleado";
    }
    @GetMapping("/Aplicacion/registroNuevo")
    public String addSucursal(){
        return "app/registroSucursal";
    }
    @PostMapping("/newUser")
    public String newUser(UsuarioDTO usuario) {
        this.usuario.save(usuario);
        return "redirect:/Aplicacion/primerosPasos";
    }
}
