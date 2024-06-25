package Selenium_For_PE;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class S {
public static String id;
public static String name;
public static String userId;
public static String email;
public static String password;
public static String token;
public static String orderId;



public static String getId() {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/id.ser"))) {
		id = (String) ois.readObject();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return id;
}
public static void setId(String id) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/id.ser"))) {
		oos.writeObject(id);
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static String getOrderId() {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/orderId.ser"))) {
		id = (String) ois.readObject();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return id;
}
public static void setOrderId(String id) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/orderId.ser"))) {
		oos.writeObject(id);
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static String getName() {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/name.ser"))) {
		name = (String) ois.readObject();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return name;
}
public static void setName(String name) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/name.ser"))) {
		oos.writeObject(name);
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static String getToken() {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/token.ser"))) {
		name = (String) ois.readObject();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return name;
}
public static void setToken(String name) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/token.ser"))) {
		oos.writeObject(name);
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static String getPassword() {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/password.ser"))) {
		name = (String) ois.readObject();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return name;
}
public static void setPassword(String name) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/password.ser"))) {
		oos.writeObject(name);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public static String getUserId() {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/userId.ser"))) {
		id = (String) ois.readObject();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return id;
}
public static void setUserId(String id) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/userId.ser"))) {
		oos.writeObject(id);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public static String getEmail() {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/email.ser"))) {
		name = (String) ois.readObject();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return name;
}
public static void setEmail(String name) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/email.ser"))) {
		oos.writeObject(name);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

