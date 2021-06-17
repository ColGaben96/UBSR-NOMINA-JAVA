package co.edu.unbosque.controller;

import co.edu.unbosque.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    @GetMapping("/Aplicacion/login")
    public String goLogin() { return "app/login"; }
    @GetMapping("/Aplicacion/")
    public String goDashboard() { return "app/dashboard"; }
    @GetMapping("/Aplicacion/Mi-Cuenta")
    public String goConfig() { return "app/config"; }
    @GetMapping("/Aplicacion/signup")
    public String goSignup() { return "app/signup"; }
    @GetMapping("/Aplicacion/cargueArchivo")
    public String goCSV() { return "app/cargueArchivo"; }
    @GetMapping("/Aplicacion/primerosPasos")
    public String hello() { return "app/primerosPasos"; }
    @GetMapping("/Aplicacion/cargoNuevo")
    public String addJob() { return "app/registroCargo"; }
    @GetMapping("/Aplicacion/dependenciaNueva")
    public String addDependency(){ return "app/registroDependencia"; }
    @GetMapping("/Aplicacion/empleadoNuevo")
    public String addEmpleado(){ return "app/registroEmpleado"; }
    @GetMapping("/Aplicacion/registroNuevo")
    public String addSucursal(){ return "app/registroSucursal"; }
}
