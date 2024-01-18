package org.example;
import java.util.*;
interface Discount {
    String getDiscountCategory();
    int getDiscountPercentage();
    void setDiscountPercentage(int percentage);
    String toString();
}
interface ZooAnimal {
    String getAnimalName();

    void setAnimalName(String name);

    String getAnimalID();

    String getAnimalType();

    void makeSound();

    void describeAnimal();

    void setAnimalID(String id);

    void setAnimalType(String type);

    String getAnimalSound();

    void setAnimalSound(String sound);

    String getAnimalDescription();

    void setAnimalDescription(String description);

    String getAnimalDetails();
}
interface Visitor {
    String getVisitorName();
    int getVisitorAge();
    String getContactNumber();
    int getAccountBalance();
    void setAccountBalance(int balance);
    String getVisitorEmail();
    String getVisitorPassword();
    String getMembershipType();
    void setMembershipType(String membership);
    List<ZooAttraction> getTicketsList();
    void setTicketsList(List<ZooAttraction> ticketsList);
    void addTicket(ZooAttraction ticket);
    void printVisitorType();
    String toString();
}
interface Attraction {
    String getAttractionID();
    void setAttractionID(String attractionID);
    String getAttractionName();
    void setAttractionName(String attractionName);
    String getAttractionDescription();
    void setAttractionDescription(String attractionDescription);
    List<ZooAnimal> getAnimalsInAttraction();
    void addAnimalToAttraction(ZooAnimal animal);
    void removeAnimalFromAttraction(ZooAnimal animal);
    void showAnimals();
    int getAttractionPrice();
    void setAttractionPrice(int attractionPrice);
    String toString();
}
interface Deal {
    String getDealDescription();
    void setDealDescription(String description);
    int getTicketCount();
    int getDiscountPercentage();
    void displayDeal();
    String toString();
}
abstract class AbstractZooVisitor implements Visitor {
    private String visitorName;
    private int visitorAge;
    private String contactNumber;
    private int accountBalance;
    private String visitorEmail;
    private String visitorPassword;
    private String membershipType = "Standard";

    private List<ZooAttraction> ticketsList;

    public AbstractZooVisitor(String name, int age, String phoneNumber, int balance, String email, String password) {
        visitorName = name;
        visitorAge = age;
        contactNumber = phoneNumber;
        accountBalance = balance;
        visitorEmail = email;
        visitorPassword = password;
        ticketsList = new ArrayList<>();
    }

    public AbstractZooVisitor() {

    }

    public String getVisitorName() {
        return visitorName;
    }

    public int getVisitorAge() {
        return visitorAge;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int balance) {
        accountBalance = balance;
    }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public String getVisitorPassword() {
        return visitorPassword;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membership) {
        membershipType = membership;
    }

    public List<ZooAttraction> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(List<ZooAttraction> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public void addTicket(ZooAttraction ticket) {
        this.ticketsList.add(ticket);
    }

    public void printVisitorType() {
        System.out.println("Membership Type: " + membershipType);
    }

    @Override
    public String toString() {
        return "ZooVisitor{ Name= " + visitorName + ", Age= " + visitorAge + ", Phone Number= " + contactNumber +
                ", Balance= " + accountBalance + ", Email= " + visitorEmail + ", Password= " + visitorPassword +
                ", Membership Type= " + membershipType + "}";
    }
}

abstract class AbstractZooTicketDeal implements Deal {
    private int ticketCount;
    private int discountPercentage;
    private String dealDescription;

    public AbstractZooTicketDeal(int count, int discount) {
        ticketCount = count;
        discountPercentage = discount;
        dealDescription = "Buy " + count + " tickets and get " + discount + "% off";
    }

    public AbstractZooTicketDeal() {

    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String description) {
        dealDescription = description;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void displayDeal() {
        System.out.println(dealDescription);
    }

    @Override
    public String toString() {
        return "- Ticket Count= " + ticketCount + ", Discount= " + discountPercentage + ", Description= " + dealDescription;
    }
}

abstract class AbstractZooDiscount implements Discount {
    private String discountCategory;
    private int discountPercentage;
    private String discountCode;

    public AbstractZooDiscount(String category, int percentage) {
        discountCategory = category;
        discountPercentage = percentage;
        discountCode = category.substring(0, 1).toUpperCase() + percentage;
    }

    public String getDiscountCategory() {
        return discountCategory;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int percentage) {
        discountPercentage = percentage;
    }

    @Override
    public String toString() {
        return discountCategory + "(" + discountPercentage + "% discount - " + discountCode + ")";
    }
}

abstract class AbstractZooAnimal implements ZooAnimal {
    private String animalID;
    private String animalName;
    private String animalType;
    private String animalSound;
    private String animalDescription;

    public AbstractZooAnimal(String id, String name, String type, String sound, String description) {
        animalID = id;
        animalName = name;
        animalType = type;
        animalSound = sound;
        animalDescription = description;
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    @Override
    public void setAnimalName(String name) {
        animalName = name;
    }

    @Override
    public String getAnimalID() {
        return animalID;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public void makeSound() {
        System.out.println(animalName + " makes a sound.");
    }

    @Override
    public void describeAnimal() {
        System.out.println(animalDescription);
    }

    @Override
    public void setAnimalID(String id) {
        animalID = id;
    }

    @Override
    public void setAnimalType(String type) {
        animalType = type;
    }

    @Override
    public String getAnimalSound() {
        return animalSound;
    }

    @Override
    public void setAnimalSound(String sound) {
        animalSound = sound;
    }

    @Override
    public String getAnimalDescription() {
        return animalDescription;
    }

    @Override
    public void setAnimalDescription(String description) {
        animalDescription = description;
    }

    @Override
    public String getAnimalDetails() {
        return "Name: " + animalName + ", Sound: " + animalSound + ", Description: " + animalDescription +
                ", Type: " + animalType + ".";
    }
}

class ZooVisitor extends  AbstractZooVisitor  {
    private String visitorName;
    private int visitorAge;
    private String contactNumber;
    private int accountBalance;
    private String visitorEmail;
    private String visitorPassword;
    private String membershipType = "Standard";

    private List<ZooAttraction> ticketsList;

    public ZooVisitor(String name, int age, String phoneNumber, int balance, String email, String password) {
        super();
        visitorName = name;
        visitorAge = age;
        contactNumber = phoneNumber;
        accountBalance = balance;
        visitorEmail = email;
        visitorPassword = password;
        ticketsList = new ArrayList<>();
    }

    public String getVisitorName() {
        return visitorName;
    }

    public int getVisitorAge() {
        return visitorAge;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int balance) {
        accountBalance = balance;
    }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public String getVisitorPassword() {
        return visitorPassword;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membership) {
        membershipType = membership;
    }

    public List<ZooAttraction> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(List<ZooAttraction> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public void addTicket(ZooAttraction ticket) {
        this.ticketsList.add(ticket);
    }

    public void printVisitorType() {
        System.out.println("Membership Type: " + membershipType);
    }

    @Override
    public String toString() {
        return "ZooVisitor{ Name= " + visitorName + ", Age= " + visitorAge + ", Phone Number= " + contactNumber +
                ", Balance= " + accountBalance + ", Email= " + visitorEmail + ", Password= " + visitorPassword +
                ", Membership Type= " + membershipType + "}";
    }
}
class ZooTicketDeal extends AbstractZooTicketDeal {
    private int ticketCount;
    private int discountPercentage;
    private String dealDescription;

    public ZooTicketDeal(int count, int discount) {
        super();
        ticketCount = count;
        discountPercentage = discount;
        dealDescription = "Buy " + count + " tickets and get " + discount + "% off";
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String description) {
        dealDescription = description;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void displayDeal() {
        System.out.println(dealDescription);
    }

    @Override
    public String toString() {
        return "- Ticket Count= " + ticketCount + ", Discount= " + discountPercentage + ", Description= " + dealDescription;
    }
}
class ZooDiscount implements Discount {
    private String discountCategory;
    private int discountPercentage;
    private String discountCode;

    public ZooDiscount(String category, int percentage) {
        discountCategory = category;
        discountPercentage = percentage;
        discountCode = category.substring(0, 1).toUpperCase() + percentage;
    }

    public String getDiscountCategory() {
        return discountCategory;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int percentage) {
        discountPercentage = percentage;
    }

    @Override
    public String toString() {
        return discountCategory + "(" + discountPercentage + "% discount - " + discountCode + ")";
    }
}

class ZooMammal implements ZooAnimal {
    private String animalID;
    private String animalName;
    private String animalType = "Mammal";
    private String animalSound;
    private String animalDescription;

    public ZooMammal(String id, String name, String sound, String description) {
        animalID = id;
        animalName = name;
        animalSound = sound;
        animalDescription = description;
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    @Override
    public void setAnimalName(String name) {
        animalName = name;
    }

    @Override
    public String getAnimalID() {
        return animalID;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public void makeSound() {
        System.out.println(animalName + " makes a mammal sound.");
    }

    @Override
    public void describeAnimal() {
        System.out.println(animalDescription);
    }

    @Override
    public void setAnimalID(String id) {
        animalID = id;
    }

    @Override
    public void setAnimalType(String type) {
        animalType = type;
    }

    @Override
    public String getAnimalSound() {
        return animalSound;
    }

    @Override
    public void setAnimalSound(String sound) {
        animalSound = sound;
    }

    @Override
    public String getAnimalDescription() {
        return animalDescription;
    }

    @Override
    public void setAnimalDescription(String description) {
        animalDescription = description;
    }

    @Override
    public String getAnimalDetails() {
        return "Name: " + animalName + ", Sound: " + animalSound + ", Description: " + animalDescription +
                ", Type: " + animalType + ".";
    }
}

class ZooAmphibian implements ZooAnimal {
    private String animalID;
    private String animalName;
    private String animalType = "Amphibian";
    private String animalSound;
    private String animalDescription;

    public ZooAmphibian(String id, String name, String sound, String description) {
        animalID = id;
        animalName = name;
        animalSound = sound;
        animalDescription = description;
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    @Override
    public void setAnimalName(String name) {
        animalName = name;
    }

    @Override
    public String getAnimalID() {
        return animalID;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public void makeSound() {
        System.out.println(animalName + " makes an amphibian sound.");
    }

    @Override
    public void describeAnimal() {
        System.out.println(animalDescription);
    }

    @Override
    public void setAnimalID(String id) {
        animalID = id;
    }

    @Override
    public void setAnimalType(String type) {
        animalType = type;
    }

    @Override
    public String getAnimalSound() {
        return animalSound;
    }

    @Override
    public void setAnimalSound(String sound) {
        animalSound = sound;
    }

    @Override
    public String getAnimalDescription() {
        return animalDescription;
    }

    @Override
    public void setAnimalDescription(String description) {
        animalDescription = description;
    }

    @Override
    public String getAnimalDetails() {
        return "Name: " + animalName + ", Sound: " + animalSound + ", Description: " + animalDescription +
                ", Type: " + animalType + ".";
    }
}

class ZooReptile implements ZooAnimal {
    private String animalID;
    private String animalName;
    private String animalType = "Reptile";
    private String animalSound;
    private String animalDescription;

    public ZooReptile(String id, String name, String sound, String description) {
        animalID = id;
        animalName = name;
        animalSound = sound;
        animalDescription = description;
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    @Override
    public void setAnimalName(String name) {
        animalName = name;
    }

    @Override
    public String getAnimalID() {
        return animalID;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public void makeSound() {
        System.out.println(animalName + " makes a reptile sound.");
    }

    @Override
    public void describeAnimal() {
        System.out.println(animalDescription);
    }

    @Override
    public void setAnimalID(String id) {
        animalID = id;
    }

    @Override
    public void setAnimalType(String type) {
        animalType = type;
    }

    @Override
    public String getAnimalSound() {
        return animalSound;
    }

    @Override
    public void setAnimalSound(String sound) {
        animalSound = sound;
    }

    @Override
    public String getAnimalDescription() {
        return animalDescription;
    }

    @Override
    public void setAnimalDescription(String description) {
        animalDescription = description;
    }

    @Override
    public String getAnimalDetails() {
        return "Name: " + animalName + ", Sound: " + animalSound + ", Description: " + animalDescription +
                ", Type: " + animalType + ".";
    }
}

class ZooAttraction {
    private String attractionID;
    private String attractionName;
    private String attractionDescription;
    private int attractionPrice;
    private List<ZooAnimal> animalsInAttraction;

    public ZooAttraction(String ID, String name, String description) {
        Random random = new Random();
        attractionID = ID;
        attractionName = name;
        attractionDescription = description;
        animalsInAttraction = new ArrayList<>();
        attractionPrice = random.nextInt(16) + 10;
    }

    public String getAttractionID() {
        return attractionID;
    }

    public void setAttractionID(String attractionID) {
        this.attractionID = attractionID;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAttractionDescription() {
        return attractionDescription;
    }

    public void setAttractionDescription(String attractionDescription) {
        this.attractionDescription = attractionDescription;
    }

    public List<ZooAnimal> getAnimalsInAttraction() {
        return animalsInAttraction;
    }

    public void addAnimalToAttraction(ZooAnimal animal) {
        animalsInAttraction.add(animal);
    }

    public void removeAnimalFromAttraction(ZooAnimal animal) {
        animalsInAttraction.remove(animal);
    }

    public void showAnimals() {
        System.out.println("Animals in Attraction are: ");
        for (ZooAnimal animal : animalsInAttraction) {
            System.out.println(animal);
        }
    }

    public int getAttractionPrice() {
        return attractionPrice;
    }

    public void setAttractionPrice(int attractionPrice) {
        this.attractionPrice = attractionPrice;
    }

    @Override
    public String toString() {
        return "- AttractionID = " + attractionID + ", Name = " + attractionName +
                ", Description = " + attractionDescription + ", Price = " + attractionPrice;
    }
}

class ZooEvent {
    private String eventName;
    private String eventDescription;
    private String eventDate;
    private List<ZooAttraction> attractionsInEvent;
    private int eventPrice;
    private String eventID;

    public ZooEvent(String name, String description, String date, int price, String Id) {
        eventName = name;
        eventDescription = description;
        eventDate = date;
        eventPrice = price;
        eventID = Id;
        attractionsInEvent = new ArrayList<>();
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public List<ZooAttraction> getAttractionsInEvent() {
        return attractionsInEvent;
    }

    public void addAttractionToEvent(ZooAttraction attraction) {
        this.attractionsInEvent.add(attraction);
    }

    public int getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(int eventPrice) {
        this.eventPrice = eventPrice;
    }

    public String getEventID() {
        return eventID;
    }

    @Override
    public String toString() {
        return "- Name = " + eventName + ", Description = " + eventDescription + ", Date = " + eventDate +
                ", Price = " + eventPrice + ", EventID = " + eventID;
    }
}
class ZooManagementFunctionality{
    ZooManagementMenus instanceA= new ZooManagementMenus ();
    static Scanner s = new Scanner(System.in);
    private static int attraction_id = 0;
    private static int animal_id = 0;
    private static int event_id = 0;
    private static int mammals_count = 0;
    private static int amphibians_count = 0;
    private static int reptiles_count = 0;

    public static int getTotal_visitors() {
        return total_visitors;
    }

    public static void
    getSpecial_deals(int total_visitors, int total_visitors1, int total_visitors2) {
    }

    public int getTotal_revenue() {
        return total_revenue;
    }

    public void setTotal_visitors(int total_visitors) {
        this.total_visitors = total_visitors;
    }

    public void setTotal_revenue(int total_revenue) {
        this.total_revenue = total_revenue;
    }

    private static int total_visitors = 0;
    private int total_revenue = 0;
    private static final String most_popular_attraction = "";

    public static void setAttraction_id(int attraction_id) {
        ZooManagementFunctionality.attraction_id = attraction_id;
    }

    public static void setAnimal_id(int animal_id) {
        ZooManagementFunctionality.animal_id = animal_id;
    }

    public static void setEvent_id(int event_id) {
        ZooManagementFunctionality.event_id = event_id;
    }

    public static void setMammals_count(int mammals_count) {
        ZooManagementFunctionality.mammals_count = mammals_count;
    }

    public static void setAmphibians_count(int amphibians_count) {
        ZooManagementFunctionality.amphibians_count = amphibians_count;
    }

    public static void setReptiles_count(int reptiles_count) {
        ZooManagementFunctionality.reptiles_count = reptiles_count;
    }

    public static void setAttraction_array(ArrayList<ZooAttraction> attraction_array) {
        ZooManagementFunctionality.attraction_array = attraction_array;
    }

    public static void setAnimal_array(ArrayList<ZooAnimal> animal_array) {
        ZooManagementFunctionality.animal_array = animal_array;
    }

    public static void setEvent_array(ArrayList<ZooEvent> event_array) {
        ZooManagementFunctionality.event_array = event_array;
    }

    public static void setDiscount_array(ArrayList<ZooDiscount> discount_array) {
        ZooManagementFunctionality.discount_array = discount_array;
    }

    public static void setSpecial_deals(ArrayList<ZooTicketDeal> special_deals) {
        ZooManagementFunctionality.special_deals = special_deals;
    }

    public static void setVisitor_array(ArrayList<ZooVisitor> visitor_array) {
        ZooManagementFunctionality.visitor_array = visitor_array;
    }

    public static void setFeedback_array(ArrayList<String> feedback_array) {
        ZooManagementFunctionality.feedback_array = feedback_array;
    }

    private static ArrayList<ZooAttraction> attraction_array = new ArrayList<>();

    public static int getAttraction_id() {
        return attraction_id;
    }

    public static int getAnimal_id() {
        return animal_id;
    }

    public static int getEvent_id() {
        return event_id;
    }

    public static int getMammals_count() {
        return mammals_count;
    }

    public static int getAmphibians_count() {
        return amphibians_count;
    }

    public static int getReptiles_count() {
        return reptiles_count;
    }

    public static ArrayList<ZooAttraction> getAttraction_array() {
        return attraction_array;
    }

    public static ArrayList<ZooAnimal> getAnimal_array() {
        return animal_array;
    }

    public static ArrayList<ZooEvent> getEvent_array() {
        return event_array;
    }

    public static ArrayList<ZooDiscount> getDiscount_array() {
        return discount_array;
    }

    public static ArrayList<ZooTicketDeal> getSpecial_deals() {
        return special_deals;
    }

    public static ArrayList<ZooVisitor> getVisitor_array() {
        return visitor_array;
    }

    public static ArrayList<String> getFeedback_array() {
        return feedback_array;
    }

    private static ArrayList<ZooAnimal> animal_array = new ArrayList<>();
    private static ArrayList<ZooEvent> event_array = new ArrayList<>();
    private static ArrayList<ZooDiscount> discount_array = new ArrayList<>();
    private static ArrayList<ZooTicketDeal> special_deals = new ArrayList<>();

    private static ArrayList<ZooVisitor> visitor_array = new ArrayList<>();

    private static ArrayList<String> feedback_array = new ArrayList<>();
    public static void view_special_deals_page() {
        System.out.println("Special Deals: ");
        for (ZooTicketDeal i : special_deals) {
            i.displayDeal();
        }
    }

    public static void add_attraction() {
        String ID = "ATTRACTION::00" + String.valueOf(attraction_id++);
        System.out.print("Enter Attraction Name: ");
        String name = s.nextLine();
        System.out.print("Enter Attraction Description: ");
        String desc = s.nextLine();

        attraction_array.add(new ZooAttraction(ID, name, desc));

        System.out.println("Attraction added successfully with Attraction ID: " + ID);
    }

    public static void add_animal() {
        String ID = "ANIMAL:00" + String.valueOf(animal_id++);
        System.out.print("Enter Animal Name: ");
        String animal_name = s.nextLine();
        System.out.print("Enter Animal Type (Mammal, Amphibian, Reptile): ");
        String animal_type = s.nextLine();
        System.out.println("Enter Animal's Description: ");
        String animal_desc = s.nextLine();
        System.out.print("Enter the Sound that Animal makes: ");
        String animal_sound = s.nextLine();

        ZooAnimal animal = null;
        if (animal_type.toLowerCase().equals("mammal")) {
            animal = new ZooMammal(ID, animal_name, animal_sound, animal_desc);
            mammals_count++;
        } else if (animal_type.toLowerCase().equals("amphibian")) {
            animal = new ZooAmphibian(ID, animal_name, animal_sound, animal_desc);
            amphibians_count++;
        } else if (animal_type.toLowerCase().equals("Reptile")) {
            animal = new ZooReptile(ID, animal_name, animal_sound, animal_desc);
            reptiles_count++;
        } else {
            System.out.println("Animal type not Available.");
        }

        if (animal != null) {
            view_attractions();
            System.out.print("Enter the AttractionID in which Animal is to be added: ");
            String attraction = s.nextLine();

            for (ZooAttraction i : attraction_array) {
                if (i.getAttractionID().equals(attraction)) {
                    i.addAnimalToAttraction(animal);
                    animal_array.add(animal);
                    break;
                }
            }
            System.out.println("Animal, with ID: " + ID + " added to Zoo.");
        } else {
            System.out.println("Animal couldn't be added");
        }

    }

    public static void add_discount() {
        System.out.print("Enter Discount Category: ");
        String category = s.nextLine();
        System.out.print("Enter Discount Percentage(eg,20 for 20%): ");
        int percentage = s.nextInt();
        s.nextLine();

        discount_array.add(new ZooDiscount(category, percentage));

        System.out.println("Discount added successfully.");
    }

    public static void add_event() {
        String ID = "EVENT:00" + String.valueOf(event_id++);
        System.out.println("Enter Name of Event: ");
        String name = s.nextLine();
        System.out.println("Enter Description of Event: ");
        String description = s.nextLine();
        System.out.println("Enter Date of Event: ");
        String date = s.nextLine();
        System.out.println("Enter Price of Ticket for Event: ");
        int price = s.nextInt();
        s.nextLine();

        event_array.add(new ZooEvent(name, description, date, price, ID));

        System.out.println("Event Added Successfully.");
    }

    public static void view_attractions() {
        System.out.println("Attractions available are : ");
        for (ZooAttraction i : attraction_array) {
            System.out.println(i);
        }
    }

    public static void view_events() {
        System.out.println("Upcoming Events are: ");
        for (ZooEvent i : event_array) {
            System.out.println(i);
        }
    }

    public static void view_discounts() {
        System.out.println("Discounts available are : ");
        for (ZooDiscount i : discount_array) {
            System.out.println(i);
        }
    }

    public static void modify_attraction() {
        view_attractions();
        System.out.print("Enter the ID of Attraction to be Managed: ");
        String manage_id = s.nextLine();
        s.nextLine();

        Iterator<ZooAttraction> it = attraction_array.iterator();
        boolean flag = false;
        while (it.hasNext()) {
            ZooAttraction next = it.next();
            if (next.getAttractionID().equals(manage_id)) {
                System.out.println("Changeable Field : \n1. Name\n2. Description");
                System.out.print("Enter your choice: ");
                int manage_attraction_choice = s.nextInt();
                s.nextLine();
                if (manage_attraction_choice == 1) {
                    System.out.print("Enter new Name: ");
                    String new_attraction_name = s.nextLine();
                    next.setAttractionName(new_attraction_name);
                } else if (manage_attraction_choice == 2) {
                    System.out.print("Enter new Description: ");
                    String new_attraction_desc = s.nextLine();
                    next.setAttractionDescription(new_attraction_desc);
                } else {
                    System.out.println("Invalid Choice!");
                }
                flag = true;
                break;
            }
        }

        if (flag) System.out.println("Attraction Managed!\n---------------------------------");
        else
            System.out.println("No Attraction found with AttractionID " + manage_id + "!\n---------------------------------");
    }

    public static void update_animal_details() {
        view_attractions();
        System.out.println("Enter the ID of Attraction to update animal details: ");
        String attraction = s.nextLine();
        ZooAttraction main_attraction = null;
        for (ZooAttraction i : attraction_array) {
            if (i.getAttractionID().equals(attraction)) {
                main_attraction = i;
                break;
            }
        }

        if (main_attraction == null) {
            System.out.println("Invalid Attraction ID.");
            return;
        }

        main_attraction.showAnimals();
        System.out.print("Enter the ID of Animal to be Updated: ");
        String animal_update_id = s.nextLine();

        Iterator<ZooAnimal> it = main_attraction.getAnimalsInAttraction().iterator();
        boolean flag_1 = false;
        while (it.hasNext()) {
            ZooAnimal next = it.next();
            if (next.getAnimalID().equals(animal_update_id)) {
                System.out.println("Changeable Field : \n1. Description\n2. Sound");
                System.out.print("Enter your choice: ");
                int update_animals_choice = s.nextInt();
                s.nextLine();
                if (update_animals_choice == 1) {
                    System.out.print("Enter new Description: ");
                    String new_description = s.nextLine();
                    next.setAnimalDescription(new_description);
                } else if (update_animals_choice == 2) {
                    System.out.print("Enter new Sound: ");
                    String new_animal_sound = s.nextLine();
                    next.setAnimalSound(new_animal_sound);
                } else {
                    System.out.println("Invalid Choice!");
                }
                flag_1 = true;
                break;
            }
        }

        if (flag_1)
            System.out.println("Animal Details Updated in Particular Attraction!\n---------------------------------");
        else
            System.out.println("No Animal found with AnimalID " + animal_update_id + "!\n---------------------------------");
    }

    public static void modify_discount() {
        view_discounts();

        System.out.print("Enter the Category of Discount to be Modified: ");
        String discount_category = s.nextLine();

        Iterator<ZooDiscount> it = discount_array.iterator();
        boolean flag = false;
        while (it.hasNext()) {
            ZooDiscount next = it.next();
            if (next.getDiscountCategory().equals(discount_category)) {
                System.out.print("Enter the New Percentage(eg,20 for 20%): ");
                int manage_discount = s.nextInt();
                s.nextLine();
                next.setDiscountPercentage(manage_discount);
                flag = true;
                break;
            }
        }

        if (flag) System.out.println("Discount Modified!\n---------------------------------");
        else
            System.out.println("No Discount was found with Category " + discount_category + "!\n---------------------------------");
    }

    public static void manageEvent(List<ZooEvent> eventArray) {
        view_events();

        System.out.println("Enter the EventID to be Modified: ");
        String eventManage = s.nextLine();

        boolean eventFound = false;
        for (ZooEvent event : eventArray) {
            if (event.getEventID().equals(eventManage)) {
                System.out.print("Which field you want to Update:\n1. Description\n2. Date\n3. Ticket Price\nEnter your Choice: ");
                int choice = s.nextInt();
                s.nextLine();

                eventFound = true;

                if (choice == 1) {
                    System.out.print("Enter new Description: ");
                    String newDescription = s.nextLine();
                    event.setEventDescription(newDescription);
                } else if (choice == 2) {
                    System.out.print("Enter new Date: ");
                    String newDate = s.nextLine();
                    event.setEventDate(newDate);
                } else if (choice == 3) {
                    System.out.print("Enter new Ticket Price: ");
                    int newPrice = s.nextInt();
                    s.nextLine();
                    event.setEventPrice(newPrice);
                } else {
                    System.out.println("Choice not Available.");
                    eventFound = false;
                }
                break;
            }
        }

        if (eventFound) {
            System.out.println("Event Modified!\n---------------------------------");
        } else {
            System.out.println("No Event was found with ID " + eventManage + "!\n---------------------------------");
        }
    }

    public static void removeAttraction(List<ZooAttraction> attractionArray) {
        view_attractions();

        System.out.print("Enter the ID of Attraction to be Removed: ");
        String removeId = s.nextLine();

        boolean attractionFound = false;
        Iterator<ZooAttraction> it = attractionArray.iterator();
        while (it.hasNext()) {
            ZooAttraction next = it.next();
            if (next.getAttractionID().equals(removeId)) {
                it.remove();
                attractionFound = true;
                break;
            }
        }

        if (attractionFound) {
            System.out.println("Attraction Removed!\n---------------------------------");
        } else {
            System.out.println("No Attraction found with AttractionID " + removeId + "!\n---------------------------------");
        }
    }

    public static void removeEvent(List<ZooEvent> eventArray) {
        view_events();

        System.out.print("Enter the ID of Event to be Removed: ");
        String removeId = s.nextLine();

        boolean eventFound = false;
        Iterator<ZooEvent> it = eventArray.iterator();
        while (it.hasNext()) {
            ZooEvent next = it.next();
            if (next.getEventID().equals(removeId)) {
                it.remove();
                eventFound = true;
                break;
            }
        }

        if (eventFound) {
            System.out.println("Event Removed!\n---------------------------------");
        } else {
            System.out.println("No Event found with EventID " + removeId + "!\n---------------------------------");
        }
    }

    public static void removeAnimal(List<ZooAttraction> attractionArray, List<ZooAnimal> animalArray) {
        view_attractions();
        System.out.println("Enter the ID of Attraction to update animal from: ");
        String attractionId = s.nextLine();
        ZooAttraction mainAttraction = null;

        for (ZooAttraction attraction : attractionArray) {
            if (attraction.getAttractionID().equals(attractionId)) {
                mainAttraction = attraction;
                break;
            }
        }

        if (mainAttraction == null) {
            System.out.println("Invalid Attraction ID.");
            return;
        }

        mainAttraction.showAnimals();

        System.out.print("Enter the ID of Animal to be Removed: ");
        String removeId = s.nextLine();

        boolean animalFound = false;
        Iterator<ZooAnimal> it = mainAttraction.getAnimalsInAttraction().iterator();
        while (it.hasNext()) {
            ZooAnimal next = it.next();
            if (next.getAnimalID().equals(removeId)) {
                if (next.getAnimalType().equals("Mammal")) {
                    // Handle minimum count logic for mammals
                } else if (next.getAnimalType().equals("Reptile")) {
                    // Handle minimum count logic for reptiles
                } else if (next.getAnimalType().equals("Amphibian")) {
                    // Handle minimum count logic for amphibians
                }

                it.remove();
                animalFound = true;
            }
        }

        if (animalFound) {
            System.out.println("Animal Removed from Specific Attraction!\n---------------------------------");
        } else {
            System.out.println("No Animal found with AnimalID " + removeId + "!\n---------------------------------");
        }
    }

    public static void removeDiscount(List<ZooDiscount> discountArray) {
        view_attractions();

        System.out.println("Enter the Category of Discount to be Removed: ");
        String discountCategory = s.nextLine();

        boolean discountFound = false;
        Iterator<ZooDiscount> it = discountArray.iterator();
        while (it.hasNext()) {
            ZooDiscount next = it.next();
            if (next.getDiscountCategory().equals(discountCategory)) {
                it.remove();
                discountFound = true;
            }
        }

        if (discountFound) {
            System.out.println("Discount Removed!\n---------------------------------");
        } else {
            System.out.println("No Discount was found with Category " + discountCategory + "!\n---------------------------------");
        }
    }
    public static void leaveFeedbackPage(List<String> feedbackList, Scanner scanner) {
        System.out.print("Leave Feedback: \nEnter your feedback (max 200 characters): ");
        String feedback = scanner.nextLine();

        feedbackList.add(feedback);
        System.out.println("Thank you for your feedback.");
    }
    public static void setSpecialDeals(List<ZooTicketDeal> specialDealsList, Scanner scanner) {
        System.out.print("Enter number of Tickets to be bought: ");
        int ticketCount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Percentage of Discount (e.g., 20 for 20%): ");
        int discount = scanner.nextInt();
        scanner.nextLine();

        specialDealsList.add(new ZooTicketDeal(ticketCount, discount));
        System.out.println("Special Deal Added.");
    }
    public static void viewAnimalsZoo(List<ZooAnimal> animalList, Scanner scanner) {
        System.out.println("Animals in the Zoo: ");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println((i + 1) + ". " + animalList.get(i).getAnimalName());
        }

        System.out.print("Enter your Choice: ");
        int viewAnimalInput = scanner.nextInt();
        scanner.nextLine();

        if (viewAnimalInput >= 1 && viewAnimalInput <= animalList.size()) {
            ZooAnimal selectedAnimal = animalList.get(viewAnimalInput - 1);
            System.out.println(selectedAnimal.getAnimalName() + " is an animal of type " + selectedAnimal.getAnimalType()
                    + " it makes a sound of " + selectedAnimal.getAnimalSound() + ", Description: " + selectedAnimal.getAnimalDescription());
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void buyTicketsPage(ZooVisitor visitor, List<ZooAttraction> attractionList, Scanner scanner) {
        System.out.println("Buy Tickets: ");
        for (int i = 0; i < attractionList.size(); i++) {
            System.out.println((i + 1) + ". " + attractionList.get(i).getAttractionName() + " (₹" + attractionList.get(i).getAttractionPrice() + ")");
        }

        System.out.print("Enter your Choice: ");
        int buyTicketInput = scanner.nextInt();
        scanner.nextLine();

        if (buyTicketInput >= 1 && buyTicketInput <= attractionList.size()) {
            ZooAttraction selectedAttraction = attractionList.get(buyTicketInput - 1);

            if (visitor.getAccountBalance() < selectedAttraction.getAttractionPrice()) {
                System.out.println("Insufficient Balance.");
            } else {
                visitor.setAccountBalance(visitor.getAccountBalance() - selectedAttraction.getAttractionPrice());
                visitor.addTicket(selectedAttraction);
                System.out.print("The ticket for " + selectedAttraction.getAttractionName() + " was purchased successfully. Your balance is now ₹" + visitor.getAccountBalance() + ".");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void viewDiscountsPage(List<ZooDiscount> discountList) {
        System.out.println("View Discounts: ");
        for (int i = 0; i < discountList.size(); i++) {
            System.out.println((i + 1) + " " + discountList.get(i));
        }
    }
    public static boolean adminCheck() {
        final String ADMIN_USERNAME = "admin";
        final String ADMIN_PASSWORD = "12345";

        System.out.print("Enter Admin Username: ");
        String enteredUsername = s.nextLine();
        System.out.print("Enter Admin Password: ");
        String enteredPassword = s.nextLine();

        if (enteredUsername.equals(ADMIN_USERNAME) && enteredPassword.equals(ADMIN_PASSWORD)) {
            System.out.println("Admin Login Successful!");
            return true;
        } else {
            System.out.println("Invalid Admin Credentials. Access Denied.");
            return false;
        }
    }
    public void viewVisitorStats(int totalVisitors, double totalRevenue, String mostPopularAttraction) {
        System.out.println("Visitor Statistics:\n- Total Visitors: " + totalVisitors + "\n- Total Revenue: $" + totalRevenue + "\n- Most Popular Attraction: " + mostPopularAttraction + "\n");
    }

    public static void viewFeedback(List<String> feedbackList) {
        System.out.println("Feedbacks received are: ");
        for (String feedback : feedbackList) {
            System.out.println(feedback);
        }
    }

    public static void registerVisitor(Scanner scanner, List<ZooVisitor> visitorList) {
        System.out.print("Enter Visitor Name: ");
        String visitorName = scanner.nextLine();
        System.out.print("Enter Visitor Age: ");
        int visitorAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Visitor Phone Number: ");
        String visitorPhoneNumber = scanner.nextLine();
        System.out.print("Enter Visitor Balance: ");
        int visitorBalance = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Visitor Email: ");
        String visitorEmail = scanner.nextLine();
        System.out.print("Enter Visitor Password: ");
        String visitorPassword = scanner.nextLine();

        visitorList.add(new ZooVisitor(visitorName, visitorAge, visitorPhoneNumber, visitorBalance, visitorEmail, visitorPassword));
        System.out.println("Visitor registered successfully.");
    }

    public static ZooVisitor loginVisitor(Scanner scanner, List<ZooVisitor> visitorList) {
        System.out.print("Enter Visitor Email: ");
        String inputMail = scanner.nextLine();
        System.out.print("Enter Visitor Password: ");
        String inputPassword = scanner.nextLine();

        for (ZooVisitor visitor : visitorList) {
            if (visitor.getVisitorEmail().equals(inputMail) && visitor.getVisitorPassword().equals(inputPassword)) {
                return visitor;
            }
        }

        return null;
    }

    public static void viewAttractionsZoo(List<ZooAttraction> attractionList, Scanner scanner) {
        System.out.println("Attractions in the Zoo: ");
        for (int i = 0; i < attractionList.size(); i++) {
            System.out.println((i + 1) + ". " + attractionList.get(i).getAttractionName() + " (₹" + attractionList.get(i).getAttractionPrice() + ")");
        }

        System.out.print("Enter your Choice: ");
        int viewAttractionInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println(attractionList.get(viewAttractionInput - 1).getAttractionDescription());
    }

    public static void visitAnimalsPage(List<ZooAnimal> animalList, Scanner scanner) {
        System.out.println("Select an Animal to visit: ");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println((i + 1) + ". " + animalList.get(i).getAnimalName());
        }

        System.out.print("Enter your Choice: ");
        int viewAnimalInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println(animalList.get(viewAnimalInput - 1).getAnimalDetails());
    }

    public static void visitAttractionsPage(ZooVisitor visitor, List<ZooAttraction> attractionList, Scanner scanner) {
        System.out.println("Select an Attraction to visit: ");
        for (int i = 0; i < attractionList.size(); i++) {
            System.out.println((i + 1) + ". " + attractionList.get(i).getAttractionName() + " (₹" + attractionList.get(i).getAttractionPrice() + ")");
        }

        System.out.print("Enter your Choice: ");
        int viewAttractionInput = scanner.nextInt();
        scanner.nextLine();

        if (viewAttractionInput >= 1 && viewAttractionInput <= attractionList.size()) {
            ZooAttraction selectedAttraction = attractionList.get(viewAttractionInput - 1);

            if (visitor.getMembershipType().equals("Premium") || visitor.getTicketsList().contains(selectedAttraction)) {
                System.out.println("You visited " + selectedAttraction.getAttractionName() + ". Hope you enjoyed the attraction.");
            } else {
                System.out.println("Ticket not available. Basic members need to buy separate tickets for the attractions.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }


}

class ZooManagementMenus {
    Scanner s = new Scanner(System.in);


    public static void main_page() {
        System.out.println("Select an option:");
        System.out.println("1. Enter as Admin");
        System.out.println("2. Enter as a Visitor");
        System.out.println("3. View Special Deals");
    }

    public static void admin_page() {
        System.out.println("Admin Menu:");
        System.out.println("1. Manage Attractions");
        System.out.println("2. Manage Animals");
        System.out.println("3. Schedule Events");
        System.out.println("4. Set Discounts");
        System.out.println("5. Set Special Deal");
        System.out.println("6. View Visitor Stats");
        System.out.println("7. View Feedback");
        System.out.println("8. Exit");

    }

    public static void visitor_page() {
        System.out.println("Visitor Menu:");
        System.out.println("1. Explore the Zoo");
        System.out.println("2. Buy Membership");
        System.out.println("3. Buy Tickets");
        System.out.println("4. View Discounts");
        System.out.println("5. View Special Deals");
        System.out.println("6. Visit Animals");
        System.out.println("7. Visit Attractions");
        System.out.println("8. Leave Feedback");
        System.out.println("9. Log Out");
    }

    public static void register_login_page() {
        System.out.println("1. Register");
        System.out.println("2. Login");

    }

    public static void manage_attractions_page() {
        System.out.println("Attraction Management:");
        System.out.println("1. Add Attraction");
        System.out.println("2. View Attractions");
        System.out.println("3. Modify Attraction");
        System.out.println("4. Remove Attraction");
        System.out.println("5. Exit");
    }

    public static void manage_animals_page() {
        System.out.println("Animal Management:");
        System.out.println("1. Add Animal");
        System.out.println("2. Update Animal Details");
        System.out.println("3. Remove Animal");
        System.out.println("4. Exit");
    }

    public static void schedule_events_page() {
        System.out.println("Event Management:");
        System.out.println("1. Add Event");
        System.out.println("2. View Events");
        System.out.println("3. Update Event");
        System.out.println("4. Remove Event");
        System.out.println("5. Exit");
    }

    public static void set_discounts_page() {
        System.out.println("Discount Management:");
        System.out.println("1. Add Discount");
        System.out.println("2. Modify Discount");
        System.out.println("3. Remove Discount");
        System.out.println("4. Exit");

    }

    public static void buy_membership_page() {
        System.out.println("Membership Options:");
        System.out.println("1. Basic Membership (Rs.20)");
        System.out.println("2. Premium Membership (Rs.50)");
    }

    public static void explore_the_zoo_page() {
        System.out.println("Explore the Zoo:");
        System.out.println("1. View Attractions");
        System.out.println("2. View Animals");
        System.out.println("3. Exit");

    }



    public ZooManagementMenus() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ZOOtopia!");
        while (true) {
            main_page();
            System.out.print("Enter your choice: ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                if (!ZooManagementFunctionality.adminCheck()) {
                    break;
                }

                while (true) {
                    admin_page();
                    System.out.print("Enter your choice: ");
                    int inputAdmin = scanner.nextInt();
                    scanner.nextLine();

                    if (inputAdmin == 1) {
                        manage_attractions_page();
                        int inputManageAttractions = scanner.nextInt();
                        scanner.nextLine();

                        if (inputManageAttractions == 1) {
                            ZooManagementFunctionality.add_attraction();
                        } else if (inputManageAttractions == 2) {
                           ZooManagementFunctionality.view_attractions();
                        } else if (inputManageAttractions == 3) {
                            ZooManagementFunctionality.modify_attraction();
                        } else if (inputManageAttractions == 4) {
                            ZooManagementFunctionality.removeAttraction(ZooManagementFunctionality.getAttraction_array());
                        } else if (inputManageAttractions == 5) {
                            break;
                        }
                    } else if (inputAdmin == 2) {
                        manage_animals_page();
                        int inputManageAnimals = scanner.nextInt();
                        scanner.nextLine();

                        if (inputManageAnimals == 1) {
                           ZooManagementFunctionality.add_animal();
                        } else if (inputManageAnimals == 2) {
                           ZooManagementFunctionality.update_animal_details();
                        } else if (inputManageAnimals == 3) {
                           ZooManagementFunctionality.removeAnimal(ZooManagementFunctionality.getAttraction_array(), ZooManagementFunctionality.getAnimal_array());
                        } else if (inputManageAnimals == 4) {
                            break;
                        }
                    } else if (inputAdmin == 3) {
                        schedule_events_page();
                        int inputManageEvents = scanner.nextInt();
                        scanner.nextLine();

                        if (inputManageEvents == 1) {
                           ZooManagementFunctionality.add_event();
                        } else if (inputManageEvents == 2) {
                            ZooManagementFunctionality.view_events();
                        } else if (inputManageEvents == 3) {
                            ZooManagementFunctionality.manageEvent( ZooManagementFunctionality.getEvent_array());
                        } else if (inputManageEvents == 4) {
                            ZooManagementFunctionality.removeEvent( ZooManagementFunctionality.getEvent_array());
                        } else if (inputManageEvents == 5) {
                            break;
                        }
                    } else if (inputAdmin == 4) {
                        set_discounts_page();
                        int inputSetDiscount = scanner.nextInt();
                        scanner.nextLine();

                        if (inputSetDiscount == 1) {
                            ZooManagementFunctionality.add_discount();
                        } else if (inputSetDiscount == 2) {
                            ZooManagementFunctionality.modify_discount();
                        } else if (inputSetDiscount == 3) {
                            ZooManagementFunctionality.removeDiscount( ZooManagementFunctionality.getDiscount_array());
                        } else if (inputSetDiscount == 4) {
                            break;
                        }
                    } else if (inputAdmin == 5) {
                        ZooManagementFunctionality.setSpecialDeals( ZooManagementFunctionality.getSpecial_deals(), scanner);
                    } else if (inputAdmin == 6) {
                       ZooManagementFunctionality.getSpecial_deals(ZooManagementFunctionality.getTotal_visitors(),ZooManagementFunctionality.getTotal_visitors(), ZooManagementFunctionality.getTotal_visitors());
                    } else if (inputAdmin == 7) {
                        ZooManagementFunctionality.viewFeedback( ZooManagementFunctionality.getFeedback_array());
                    } else if (inputAdmin == 8) {
                        System.out.println("Logged Out");
                        break;
                    }
                }

            } else if (input == 2) {
                ZooVisitor currentVisitor = null;
                boolean flag = false;
                while (currentVisitor == null) {
                    register_login_page();
                    System.out.print("Enter your choice: ");
                    int inputChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (inputChoice == 1) {
                        ZooManagementFunctionality.registerVisitor(scanner,  ZooManagementFunctionality.getVisitor_array());
                    } else if (inputChoice == 2) {
                        currentVisitor = ZooManagementFunctionality.loginVisitor(scanner,  ZooManagementFunctionality.getVisitor_array());
                        if (currentVisitor != null) {
                            System.out.println("Login Successful.");
                        } else {
                            System.out.println("Invalid Login Credentials.");
                            flag = true;
                        }
                    }
                }

                if (flag) {
                    break;
                }

                while (true) {
                    visitor_page();
                    System.out.print("Enter your choice: ");
                    int inputVisitor = scanner.nextInt();
                    scanner.nextLine();

                    if (inputVisitor == 1) {
                        while (true) {
                            explore_the_zoo_page();
                            System.out.println("Enter your Choice: ");
                            int exploreZooInput = scanner.nextInt();
                            scanner.nextLine();
                            if (exploreZooInput == 1) {
                               ZooManagementFunctionality.viewAttractionsZoo( ZooManagementFunctionality.getAttraction_array(), scanner);
                            } else if (exploreZooInput == 2) {
                               ZooManagementFunctionality.viewAnimalsZoo( ZooManagementFunctionality.getAnimal_array(), scanner);
                            } else if (exploreZooInput == 3) {
                                break;
                            }
                        }
                    } else if (inputVisitor == 2) {
                        buy_membership_page();
                        System.out.println("Enter your Choice: ");
                        int buyMembershipInput = scanner.nextInt();
                        scanner.nextLine();

                        if (buyMembershipInput == 1) {
                            if (currentVisitor.getAccountBalance() < 20) {
                                System.out.println("Insufficient Balance");
                            } else {
                                currentVisitor.setMembershipType("Basic");
                                currentVisitor.setAccountBalance(currentVisitor.getAccountBalance() - 20);
                                System.out.println("Basic Membership purchased successfully. Your balance is now " + currentVisitor.getAccountBalance());
                            }
                        } else if (buyMembershipInput == 2) {
                            if (currentVisitor.getAccountBalance() < 50) {
                                System.out.println("Insufficient Balance");
                            } else {
                                currentVisitor.setMembershipType("Premium");
                                currentVisitor.setAccountBalance(currentVisitor.getAccountBalance() - 50);
                                System.out.println("Premium Membership purchased successfully. Your balance is now " + currentVisitor.getAccountBalance());
                            }
                        }
                    } else if (inputVisitor == 3) {
                        ZooManagementFunctionality.buyTicketsPage(currentVisitor,  ZooManagementFunctionality.getAttraction_array(), scanner);
                    } else if (inputVisitor == 4) {
                        ZooManagementFunctionality.viewDiscountsPage( ZooManagementFunctionality.getDiscount_array());
                    } else if (inputVisitor == 5) {
                        ZooManagementFunctionality.view_special_deals_page();
                    } else if (inputVisitor == 6) {
                        ZooManagementFunctionality.visitAnimalsPage( ZooManagementFunctionality.getAnimal_array(), scanner);
                    } else if (inputVisitor == 7) {
                        ZooManagementFunctionality.visitAttractionsPage(currentVisitor,  ZooManagementFunctionality.getAttraction_array(), scanner);
                    } else if (inputVisitor == 8) {
                        ZooManagementFunctionality.leaveFeedbackPage( ZooManagementFunctionality.getFeedback_array(), scanner);
                    } else if (inputVisitor == 9) {
                        System.out.println("Logged out.");
                        break;
                    }
                }
            } else if (input == 3) {
                for (ZooTicketDeal deal :  ZooManagementFunctionality.getSpecial_deals()) {
                    deal.displayDeal();
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
         ZooManagementMenus zootpia = new ZooManagementMenus();
    }
}