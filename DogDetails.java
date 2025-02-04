package OOPS;
class Dog {

    private String dogName;
    private String dogBrand;
    private String dogBreed;
    private String dogLocation;
    private String dogOwnerDetails;


    public Dog(String dogName, String dogBrand, String dogBreed, String dogLocation, String dogOwnerDetails) {
        this.dogName = dogName;
        this.dogBrand = dogBrand;
        this.dogBreed = dogBreed;
        this.dogLocation = dogLocation;
        this.dogOwnerDetails = dogOwnerDetails;
    }


    public String getDogName() {
        return dogName;
    }

    public String getDogBrand() {
        return dogBrand;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public String getDogLocation() {
        return dogLocation;
    }

    public String getDogOwnerDetails() {
        return dogOwnerDetails;
    }

    // Setter methods
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogBrand(String dogBrand) {
        this.dogBrand = dogBrand;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setDogLocation(String dogLocation) {
        this.dogLocation = dogLocation;
    }

    public void setDogOwnerDetails(String dogOwnerDetails) {
        this.dogOwnerDetails = dogOwnerDetails;
    }


    public void displayDogDetails() {
        System.out.println("Dog Details:");
        System.out.println("Name: " + dogName);
        System.out.println("Brand: " + dogBrand);
        System.out.println("Breed: " + dogBreed);
        System.out.println("Location: " + dogLocation);
        System.out.println("Owner Details: " + dogOwnerDetails);
        System.out.println("--------------------------------------");
    }
}

public class DogDetails {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruno", "Pedigree", "Labrador", "New York", "John Doe - 9876543210");
        Dog dog2 = new Dog("Rocky", "Royal Canin", "German Shepherd", "Los Angeles", "Emma Smith - 9123456789");


        dog1.displayDogDetails();
        dog2.displayDogDetails();
    }
}
