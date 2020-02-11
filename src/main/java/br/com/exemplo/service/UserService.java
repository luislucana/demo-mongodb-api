package br.com.exemplo.service;

import br.com.exemplo.model.User;
import br.com.exemplo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void salvar(String nome, String conteudo) {
        User user = new User();
        user.setName("Fulano de Tal");
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public long count() {
        return userRepository.count();
    }

    public Optional<User> findById(String id) {
        //Optional<User> one = userRepository.findOne(id);
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }
}
