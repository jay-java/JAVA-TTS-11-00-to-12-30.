package services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Users;

public class UserServices {

	private static List<Users> list = new ArrayList<>();
	static {
		list.add(new Users(1, "c", "ahmedabad",124345));
		list.add(new Users(2, "c++", "ahmedabad",34654));
		list.add(new Users(3, "java", "ahmedabad",345645));
		list.add(new Users(4, "python", "ahmedabad",676554));
		list.add(new Users(5, "dart", "ahmedabad",34654));
	}

	public List<Users> getAllUsers() {
		System.out.println("list ---->>>>>>"+list);
		return list;
	}

	public Users getUserById(int id) {
		return list.stream().filter(u -> u.getId() == id).findFirst().get();
	}

	public Users addUser(Users u) {
		list.add(u);
		return u;
	}

	public void deleteUser(int id) {
		list.stream().filter(u -> u.getId() != id).collect(Collectors.toList());
	}

	public void updateUsers(Users u, int id) {
		list = list.stream().map(b -> {
			if (b.getId() == id) {
				b.setName(u.getName());
				b.setAddress(u.getAddress());
				b.setContact(u.getContact());
			}
			return b;
		}).collect(Collectors.toList());
	}

}
