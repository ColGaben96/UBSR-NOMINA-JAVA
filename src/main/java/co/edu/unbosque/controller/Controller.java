package co.edu.unbosque.controller;

import co.edu.unbosque.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

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
    @GetMapping("/Aplicacion/signup")
    public String goSignup() { return "app/signup"; }
}
