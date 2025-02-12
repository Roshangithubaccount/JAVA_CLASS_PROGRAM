public class Encapsulation {
    private int id = 100;// 
    private String name = "Abhi";
    private String loc;


    public int getID() { // Getter method for ID
        return id;
    }


    public String getName() { // Getter method
        return name;
    }


    public void setLoc(String loc) {
        this.loc = loc;
    }


    public String getLoc() {
        return loc;
    }
}

class main {
    public static void main(String[] args) {
        // Creating an object of Encapsulation
        Encapsulation obj = new Encapsulation();


        System.out.println("ID: " + obj.getID());
        System.out.println("Name: " + obj.getName());

        obj.setLoc("Bangalore");
        System.out.println("Location: " + obj.getLoc());
    }
}


