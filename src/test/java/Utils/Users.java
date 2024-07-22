package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Users {
    Faker faker = new Faker(new Locale("en"));

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String gender = faker.options().option("Male", "Female", "Other");
    public String phoneNumber = faker.number().digits(10);
    public String yearOfBDay = Integer.toString(faker.number().numberBetween(1900, 2100));
    public String monthOfBDay = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    public String dayOfBDay = Integer.toString(chooseDay());
    public String subject = faker.options().option("Maths", "Accounting", "Arts", "Social Studies", "Biology", "Physics", "Chemistry", "Computer Science", "Commerce", "Economics", "Civics", "Hindi", "English", "History");
    public String hobby = faker.options().option("Sports", "Reading", "Music");
    public String picturePath = "1126.jpg";
    public String address = faker.address().fullAddress();
    public String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public String city = chooseCity();

    public int chooseDay() {
        if (monthOfBDay.equals("February")) {
            return faker.number().numberBetween(1, 28);
        } else if (monthOfBDay.equals("April") || monthOfBDay.equals("June") || monthOfBDay.equals("September") || monthOfBDay.equals("November")) {
            return faker.number().numberBetween(1, 30);
        } else {
            return faker.number().numberBetween(1, 31);
        }
    }

    public String chooseCity() {
        if (state.equals("NCR")) {
            return faker.options().option("Delhi", "Gurgaon", "Noida");
        } else if (state.equals("Uttar Pradesh")) {
            return faker.options().option("Agra", "Lucknow", "Merrut");
        } else if (state.equals("Haryana")) {
            return faker.options().option("Karnal", "Panipat");
        } else {
            return faker.options().option("Jaipur", "Jaipur");
        }
    }
}
