package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Users;
import services.UserServices;


@RestController
public class UserController {

	private UserServices userService;
	@GetMapping("/users")
    public List<Users> getUsers() {
		List<Users> users =userService.getAllUsers();
        System.out.println(users);
		return users;
	}

    @GetMapping("/users/{id}")
    public Users getSingleUser(@PathVariable("id") int id){
        return this.userService.getUserById(id);
    }

    @PostMapping("/users")
    public Users addUser(@RequestBody Users u){
        Users user = this.userService.addUser(u);
        return user; 
    }


    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") int id){
        this.userService.deleteUser(id);
    }

    @PutMapping("/users/{id}")
    public Users updateUser(@RequestBody Users u,@PathVariable("id") int id){
        this.userService.updateUsers(u, id);
        return u;
    }
}
