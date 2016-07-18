package rml.service;

import rml.model.User;

public interface UserServiceI {
	boolean login(String name, String password);
}
