
package Pages;

public class Account {

    public Account(String name, String username, String password, String phone, String role, String city, String address, String age, String gender, String phone_verified_at, String created_at) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.city = city;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.phone_verified_at = phone_verified_at;
        this.created_at = created_at;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone_verified_at() {
        return phone_verified_at;
    }

    public String getCreated_at() {
        return created_at;
    }


String name;
String username;
String password;
String phone;
String role;
String city;
String address;
String age;
String gender;
String phone_verified_at;
String created_at;




}
