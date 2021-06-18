package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.UsuarioDAO;
import co.edu.unbosque.model.persistence.RolDTO;
import co.edu.unbosque.model.persistence.UsuarioDTO;
import co.edu.unbosque.model.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("userDetailsService")
@Slf4j
public class UsuarioImpl implements UsuarioService {
    @Autowired
    private UsuarioDAO usuario;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UsuarioDTO usuario = this.usuario.findByUsername(s);
        if (usuario == null) {
            throw new UsernameNotFoundException(s);
        }

        var roles = new ArrayList<GrantedAuthority>();

        for (RolDTO rol : new RolImpl().listAll()) {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getUsername(), usuario.getPassword(), roles);
    }

    @Override
    public ArrayList<UsuarioDTO> listAll() {
        return (ArrayList<UsuarioDTO>) this.usuario.findAll();
    }

    @Override
    public void save(UsuarioDTO usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        this.usuario.save(usuario);

    }

    @Override
    public void delete(UsuarioDTO usuario) {
        this.usuario.save(usuario);
    }

    @Override
    public UsuarioDTO findUsuario(UsuarioDTO usuario) {
        return this.usuario.findById(usuario.getId()).orElse(null);
    }
}
