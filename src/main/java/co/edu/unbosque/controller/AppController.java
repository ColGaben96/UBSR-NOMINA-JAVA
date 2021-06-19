package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.*;
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
    @GetMapping("/reportes")
    public String goReports() {
        return "app/reportes";
    }
    @GetMapping("/cargueArchivo")
    public String loadFiles() {
        return "app/cargueArchivo";
    }
    @GetMapping("/reporte1")
    public String report1(Model model) {
        var empleados = empleado.listAll();
        var sucursales = sucursal.listAll();
        model.addAttribute("empleados", empleados);
        model.addAttribute("sucursales", sucursales);
        return "reports/rep1";
    }
    @GetMapping("/reporte2")
    public String report2() {
        return "reports/rep2";
    }
    @GetMapping("/reporte3")
    public String report3() {
        return "reports/rep3";
    }
    @GetMapping("/reporte4")
    public String report4() {
        return "reports/rep4";
    }
    @GetMapping("/reporte5")
    public String report5() {
        return "reports/rep5";
    }
    @PostMapping("/uploadAndCreate")
    public String upload() {
        return "redirect:/reportes";
    }
}
