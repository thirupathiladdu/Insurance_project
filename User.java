import java.util.*;

class Vehicle {
	static Property prop = new Property();
	static Scanner sc = new Scanner(System.in);

	public static void main4() {
		System.out.println("Choose your Vehicle: ");
		System.out.println("1.Bike    2.Car");
		boolean b = true;
		while (b) {
			int type = sc.nextInt();
			if (type == 1 || type == 2) {
				b = false;
				switch (type) {
				case 1:
					Bike obj1 = new Bike();
					obj1.enterBikeDetails();
					break;
				case 2:
					Car obj2 = new Car();
					obj2.enterCarDetails();
					break;
				}
			} else {
				System.out.println("Invalid Input please enter valid Input");
			}
		}
	}

}

class Bike extends Vehicle{
	static Property prop = new Property();

	static Scanner sc = new Scanner(System.in);
	// static final Random RANDOM = new Random();

	static Bike obj = new Bike();

	public void enterBikeDetails() {
		System.out.println("Enter your bike Details");
		System.out.println();
		System.out.print("Enter Bike Registration No: ");
		String bike_RegNo = sc.nextLine();

		System.out.print("Enter manufacturer : ");
		String manufacturer = sc.nextLine();

		System.out.print("Enter Model: ");
		String model = sc.nextLine();

		System.out.print("Enter Price: ");
		double price = sc.nextDouble();

		obj.bike_plan();
	}

	public void bike_plan() {
		System.out.println("Select your plan");
		System.out.println("1) Comprehensive");
//		System.out.println("Offers complete protection not only for your vehicle (own damage), but also for damages incurred to other people or property (third party).");
		System.out.println("2) Own Damage");
//		System.out.println("Offers protection only for your vehicle against damages and theft. If you already have an active Third Party (TP) policy, this is the right plan for you. Keep your TP policy details handy for purchase.");
		System.out.println("Choose '1' for Comprehensive and '2' for Own Damage");
		boolean b = true;
		while (b) {
			int plan = sc.nextInt();
			if (plan > 0 && plan <= 3) {
				b = false;
				switch (plan) {
				case 1:
					obj.bike_duration();
					break;
				case 2:
					obj.bike_idv();
				}
			} else {
				System.out.println("Invalid Input please enter valid Input");
			}
		}
	}

	// Comprehensive
	public void bike_duration() {
		System.out.println("Select your plan duration");
		// System.out.println("Offers complete protection not only for your vehicle (own
		// damage), but also for damages incurred to other people or property (third
		// party)");
		System.out.println("1.six months    2.one year    3.two years    4.five years");
		boolean b = true;
		while (b) {
			int duration = sc.nextInt();
			if (duration > 0 && duration <= 3) {
				b = false;
				switch (duration) {
				case 1:
					obj.sixmonths();
					break;
				case 2:
					obj.oneyear();
					break;
				case 3:
					obj.twoyears();
					break;
				case 4:
					obj.fiveyears();
					break;
				}
			} else {
				System.out.println("Invalid Input please enter valid Input");
			}
		}
	}

	public void sixmonths() {
		System.out.println("-----------------------------------------------------------");

		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 1,00,000");
		System.out.println("*Liability to the third party");
		System.out.println("*No personal Accident cover");
		System.out.println("*No coverage on customs for imported vehicles");
		System.out.println("*No theft protection");
		System.out.println("*price :- 1230 RS+ GST");
		System.out.println("-----------------------------------------------------------");

		int price = 1230;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void oneyear() {
		System.out.println("-----------------------------------------------------------");

		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 2,00,000");
		System.out.println("*Liability to the third party");
		System.out.println("*personal Accident cover upto 2,00,000");
		System.out.println("*No coverage on customs for imported vehicles");
		System.out.println("*No theft protection");
		System.out.println("*price :- 2250 RS+ GST");
		System.out.println("-----------------------------------------------------------");

		int price = 2250;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void twoyears() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 4,50,000 + total Engine protection");
		System.out.println("*Liability to the third party");
		System.out.println("*personal Accident cover upto 3,00,000");
		System.out.println("*No coverage on customs for imported vehicles");
		System.out.println("*Extra theft protection");
		System.out.println("*price :- 4000 RS+ GST");
		System.out.println("-----------------------------------------------------------");

		int price = 4000;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void fiveyears() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 8,50,000 + total Engine protection");
		System.out.println("*Extra Anual bonus");
		System.out.println("*Liability to the third party");
		System.out.println("*personal Accident cover upto 5,00,000");
		System.out.println("*coverage on customs for imported vehicles");
		System.out.println("*Extra theft protection");
		System.out.println("*price :- 7500 RS+ GST");
		System.out.println("-----------------------------------------------------------");

		int price = 7500;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	// Own Damage
	public void bike_idv() {
		System.out.println("*****Insured Declared Value (IDV) Options****");
		System.out.println();
		System.out.println("Select your plan duration");
		// System.out.println("IDV is the total amount the insurer will pay you, in case
		// your bike is damaged beyond repair or stolen.");
		System.out.println("1. Minimum    2. Standard    3. Maximum");
		boolean b = true;
		while (b) {
			int idv = sc.nextInt();
			if (idv > 0 && idv <= 3) {
				b = false;
				switch (idv) {
				case 1:
					obj.min();
					break;
				case 2:
					obj.standard();
					break;
				case 3:
					obj.max();
				}
			} else {
				System.out.println("Invalid Input please enter valid Input");
			}
		}
	}

	public void min() {
		System.out.println("--------------------------");
		System.out.println("Minimum IDV:");
		System.out.println("* Coverage upto 1,00,000");
		System.out.println("* Premium: 1500 RS + GST");
		System.out.println();
		System.out.println("--------------------------");
		int price = 1500;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void standard() {
		System.out.println("--------------------------");
		System.out.println("Standard IDV:");
		System.out.println("* Coverage upto 2,00,000");
		System.out.println("* Premium: 2250 RS + GST");
		System.out.println();
		System.out.println("--------------------------");
		int price = 2250;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void max() {
		System.out.println("--------------------------");
		System.out.println("Maximum IDV:");
		System.out.println("* Coverage upto 3,00,000");
		System.out.println("* Premium: 3000 RS + GST");
		System.out.println();
		System.out.println("--------------------------");
		int price = 3000;
		prop.handlePayment(price);
		Vehicle.main4();
	}
}

class Car {
	static Property prop = new Property();
	static Scanner sc = new Scanner(System.in);
	// static final Random RANDOM = new Random();

	static Car obj = new Car();

	public void enterCarDetails() {
		System.out.println("Enter your car Details");
		System.out.println();
		System.out.print("Enter car Registration No: ");
		String car_RegNo = sc.nextLine();

		System.out.print("Enter manufacturer : ");
		String manufacturer = sc.nextLine();

		System.out.print("Enter Model: ");
		String model = sc.nextLine();

		System.out.print("Enter Price: ");
		double price = sc.nextDouble();

		obj.car_plan();
	}

	public void car_plan() {
		System.out.println("Select your plan");
		System.out.println("1) Comprehensive");
//		System.out.println("Offers complete protection not only for your vehicle (own damage), but also for damages incurred to other people or property (third party).");
		System.out.println("2) Own Damage");
//		System.out.println("Offers protection only for your vehicle against damages and theft. If you already have an active Third Party (TP) policy, this is the right plan for you. Keep your TP policy details handy for purchase.");
		System.out.println("Choose '1' for Comprehensive and '2' for Own Damage");
		boolean b = true;
		while (b) {
			int plan = sc.nextInt();
			if (plan > 0 && plan <= 3) {
				b = false;
				switch (plan) {
				case 1:
					obj.car_duration();
					break;
				case 2:
					obj.car_idv();
				}
			} else {
				System.out.println("Invalid Input please enter valid Input");
			}
		}
	}

	// Comprehensive
	public void car_duration() {
		System.out.println("Select your plan duration");
		// System.out.println("Offers complete protection not only for your vehicle (own
		// damage), but also for damages incurred to other people or property (third
		// party)");
		System.out.println("1.six months    2.one year    3.two years    4.five years");
		boolean b = true;
		while (b) {
			int duration = sc.nextInt();
			if (duration > 0 && duration <= 3) {
				b = false;
				switch (duration) {
				case 1:
					obj.sixmonths();
					break;
				case 2:
					obj.oneyear();
					break;
				case 3:
					obj.twoyears();
					break;
				case 4:
					obj.fiveyears();
				}
			} else {
				System.out.println("Invalid Input please enter valid Input");
			}
		}
	}

	public void sixmonths() {
		System.out.println("---------------------------------------------------------");
		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 1,00,000");
		System.out.println("*Liability to the third party");
		System.out.println("*No personal Accident cover");
		System.out.println("*No coverage on customs for imported vehicles");
		System.out.println("*No theft protection");
		System.out.println("*price :- 2460 RS+ GST");
		System.out.println("---------------------------------------------------------");
		int price = 2460;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void oneyear() {
		System.out.println("---------------------------------------------------------");
		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 2,00,000");
		System.out.println("*Liability to the third party");
		System.out.println("*personal Accident cover upto 2,00,000");
		System.out.println("*No coverage on customs for imported vehicles");
		System.out.println("*No theft protection");
		System.out.println("*price :- 4150 RS+ GST");
		System.out.println("---------------------------------------------------------");
		int price = 4150;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void twoyears() {
		System.out.println("---------------------------------------------------------");
		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 4,50,000 + total Engine protection");
		System.out.println("*Liability to the third party");
		System.out.println("*personal Accident cover upto 3,00,000");
		System.out.println("*No coverage on customs for imported vehicles");
		System.out.println("*Extra theft protection");
		System.out.println("*price :- 8120 RS+ GST");
		System.out.println("---------------------------------------------------------");
		int price = 8120;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void fiveyears() {
		System.out.println("---------------------------------------------------------");
		System.out.println("*****In this Package we provide****");
		System.out.println();
		System.out.println("*Damage coverage upto 8,50,000 + total Engine protection");
		System.out.println("*Extra Anual bonus");
		System.out.println("*Liability to the third party");
		System.out.println("*personal Accident cover upto 5,00,000");
		System.out.println("*coverage on customs for imported vehicles");
		System.out.println("*Extra theft protection");
		System.out.println("*price :- 14550 RS+ GST");
		System.out.println("---------------------------------------------------------");
		int price = 14550;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	// Own Damage
	public void car_idv() {
		System.out.println("*****Insured Declared Value (IDV) Options****");
		System.out.println();
		System.out.println("Select your plan duration");
		// System.out.println("IDV is the total amount the insurer will pay you, in case
		// your bike is damaged beyond repair or stolen.");
		System.out.println("\n 1. Minimum \n   2. Standard \n   3. Maximum");
		boolean b = true;
		while (b) {
			int idv = sc.nextInt();
			if (idv > 0 && idv <= 3) {
				b = false;
				switch (idv) {
				case 1:
					obj.min();
					break;
				case 2:
					obj.standard();
					break;
				case 3:
					obj.max();
				}
			} else {
				System.out.println("Invalid Input please enter valid Input");
			}
		}
	}

	public void min() {
		System.out.println("-----------------------------");
		System.out.println("Minimum IDV:");
		System.out.println("* Coverage upto 3,00,000");
		System.out.println("* Premium: 5000 RS + GST");
		System.out.println();
		System.out.println("-----------------------------");
		int price = 5000;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void standard() {
		System.out.println("-----------------------------");
		System.out.println("Standard IDV:");
		System.out.println("* Coverage upto 4,00,000");
		System.out.println("* Premium: 5500 RS + GST");
		System.out.println();
		System.out.println("-----------------------------");
		int price = 5500;
		prop.handlePayment(price);
		Vehicle.main4();
	}

	public void max() {
		System.out.println("-----------------------------");
		System.out.println("Maximum IDV:");
		System.out.println("* Coverage upto 5,00,000");
		System.out.println("* Premium: 6530 RS + GST");
		System.out.println();
		System.out.println("-----------------------------");
		int price = 6530;
		prop.handlePayment(price);
		Vehicle.main4();
	}
}

class Sign_up {
	static Scanner input=new Scanner(System.in);

    {
        System.out.println("\n*Sign_up*\n");
    }
    
    private boolean nameLength(String name) {
    	if(name.length()<4) {
    		System.out.println("\nThe name you are entering should have atleast 4 Characters\n");
    		return false;
    	}
    	return true;
    }
    private boolean isnameValid(String name,int i,int userName_length){
        if(i<userName_length){
            if((name.charAt(i)>='A'&&name.charAt(i)<'z')){
                return isnameValid(name, ++i, userName_length);
            }else{
                return false;
            }
        }
        return true;
    }

    {
        System.out.print("Enter First Name: ");
    }

    private String firstName=input.next();

    String setFirstName(){
    	
    	if(nameLength(firstName)) {   		
    		if(isnameValid(firstName,0,firstName.length())){
    			return firstName;
    		}else{
    			System.out.println("\nFirst Name should not have any Special characters\n");
    			System.out.print("Enter First Name: ");
    			firstName=input.next();
    		}
    	}else {
    		System.out.print("Enter First Name: ");
			firstName=input.next();
    	}
        return setFirstName();
    }

    private String lastName;

    {
        setFirstName();
        System.out.print("Enter Last Name: ");
        lastName=input.next();
        setLastName();
    }


    String setLastName(){
    	
    	if(nameLength(lastName)) {    		
    		if(isnameValid(lastName,0,lastName.length())){
    			return lastName;
    		}else{
    			System.out.println("\nLast Name should not have any Special characters\n");
    			System.out.print("Enter Last Name: ");
    			lastName=input.next();
    		}
    	}else {
    		System.out.print("Enter Last Name: ");
			lastName=input.next();
    	}
        return setLastName();
    }


    private String password;
    
    private String n;
    
    private boolean isMobileno(String n,int length) {
    	for(int i=0;i<length;i++) {
    		char ch=n.charAt(i);
    		if(ch<'0'||ch>'9') {
    			return false;
    		}
    	}
    	return true;
    	
    }
    
    private void setMobile_Number(){
        System.out.print("Enter Mobile Number: ");

        String n=input.next();
        int mobile_length=n.length();
        
        if(isMobileno(n,mobile_length)) {
        	if(mobile_length==10){
        		char fd=n.charAt(0);
        		if(fd>='6'&&fd<='9') {      			
        			this.n=n;
        		}else {
        			System.out.println("\n# Mobile Number should start with 6/7/8/9 only. #\n");
        			setMobile_Number();
        		}
        	}else{
        		System.out.println("\n*Invalid Mobile Number*Mobile Number should have 10 digits Only.\n");
        		setMobile_Number();
        	}
        }else {
        	System.out.println("\nMobile Number Should only have digits\n");
        	setMobile_Number();
        }
    }

    private String getMobile_Number(){
        setMobile_Number();
        return n;
    }
    
    private String mobileNo=getMobile_Number();

    Random random=new Random();
    
    private int generated_OTP=random.nextInt(9000)+1000;
    
    {
        System.out.println("\nAn OTP has been sent to your Mobile Number.Verify it...");
        System.out.println("Your OTP to Sign-in: "+generated_OTP+"\n");
    }    
    
    private boolean isPassword(String password) {
    	int cap=0,small=0,num=0,spe=0;
    	for(int i=0;i<password.length();i++) {
    		char ch=password.charAt(i);
    		if(ch>='A'&&ch<='Z') {
    			cap++;
    		}else if(ch>='a'&&ch<='z') {
    			small++;
    		}else if(ch>='0'&&ch<='9') {
    			num++;
    		}else if((ch>='!'&&ch<='/')||(ch>=':'&&ch<='@')) {
    			spe++;
    		}
    	}
    	
    	if(cap<1||small<1||num<1||spe<1) {
    		System.out.println("\nYour password is not Strong enough\n");
    		return false;
    	}
    	return true;
    }
    
    private String setPassword() {
    	System.out.print("(Your Password must have one Capital letter,one Small letter,");
        System.out.println("one Number and one Special Character)\n");
        
        System.out.print("Enter Strong Password: ");
        final String password=input.next();
        
        if(!isPassword(password)) {
        	return setPassword();
        }
        return password;
    }
    
    
    private boolean isOTP_correct(){
        System.out.print("Enter OTP: ");
        int entered_OTP=input.nextInt();

        if(generated_OTP==entered_OTP){
            return true;
        }
        return false;
    }

    
    private boolean isSign_up(int count){
    	
    	if(count>0) {    		
    		if(isOTP_correct()){
    			System.out.println("\nSigned up Successfully...\n\n");
    			
    			System.out.print("Create Password: ");
    			
    			String setPassword=setPassword();
    			
    			System.out.print("Confirm Password: ");
    			String repassword=input.next();
    			
    			while(!repassword.equals(setPassword)){
    				System.out.println("\nPassword not matched");
    				System.out.print("Re enter Password: ");
    				repassword=input.next();
    			}
    			
    			this.password=repassword;
    			return true;
    		}else{
    			System.out.println("Wrong OTP. TRY AGAIN\n");
    			return isSign_up(--count);
    		}
    	}
    	
    	System.out.println("\nYou exeeded OTP limitations\n");
    
        
        while(true) {        	
        	System.out.print("Do you want to continue Sign_up?(YES/NO): ");
        	String new_otp=input.next();
        	if(new_otp.toLowerCase().equals("yes")){
        		generated_OTP=random.nextInt(9000)+1000;
        		System.out.println("Re-generated OTP: "+generated_OTP+"\n");
        		return isSign_up(3);
        	}else if(new_otp.toLowerCase().equals("no")) {      	
        		System.out.println("\nTHANK YOU");
        		return false;
        	}else {
        		System.out.println("Enter appropriate choice\n");
        	}
        }
    }

    String getPassword(){
        return password;
    }

    boolean getSign_up(){
        return isSign_up(3);
    }
    
    String mobile() {
    	return mobileNo;
    }

    public static void main(String[] args) {
        Sign_up sign=new Sign_up();
        sign.getSign_up();
    }}
class Register {

		static Sign_up sign=new Sign_up();
		{	
			boolean b_sign=sign.getSign_up();
			if(b_sign) {		
				Login login=new Login();
				boolean b_login=login.getLogin();
				if(b_login){
					Management.main1();
				}
			}
		}
		
	    public static void main(String[] args) {
	    	new Register();
	    }
	}



class Property {
    static Scanner s = new Scanner(System.in);
    static Property obj = new Property();

    public void Home() {
        System.out.println("\u001B[31mHere are the plans we provide for home Insurances");
        System.out.println("Press 1. Natural Disasters \n2. Fire Accidents \n3. Electrical Breakdown \n4. Exit");
        int a = s.nextInt();
        switch (a) {
            case 1:
                showNaturalDisastersScheme();
                break;
            case 2:
                showFireAccidentsScheme();
                break;
            case 3:
                showElectricalBreakdownScheme();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                Home();
                break;
        }
    }

    public void Land() {
        System.out.println("\u001B[31mHere are the plans we provide for Land Insurances");
        System.out.println("Press 1. Natural Disasters \n2. Fire Accidents \n3. Electrical Breakdown \n4. Exit");
        int a = s.nextInt();
        switch (a) {
            case 1:
                showNaturalDisastersScheme();
                break;
            case 2:
                showFireAccidentsScheme();
                break;
            case 3:
                showElectricalBreakdownScheme();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                Land();
                break;
        }
    }

    public void Shop() {
        System.out.println("\u001B[31mHere are the schemes we provide for Shop Insurances");
        System.out.println("Press \n  1. Natural Disasters \n2. Fire Accidents \n3. Electrical Breakdown \n4. Exit");
        int a = s.nextInt();
        switch (a) {
            case 1:
                showNaturalDisastersScheme();
                break;
            case 2:
                showFireAccidentsScheme();
                break;
            case 3:
                showElectricalBreakdownScheme();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                Shop();
                break;
        }
    }

    private void showNaturalDisastersScheme() {
        System.out.println("\u001B[35mWelcome to Natural Disasters Scheme.");
        System.out.println("This scheme contains \n1. Yearly plan \n2. Monthly plan \nPress 1 or 2 to choose the plan");
        int b = s.nextInt();
        switch (b) {
            case 1:
                System.out.println("The Yearly plans are as follows:");
                System.out.println("1. 5000 for one year");
                System.out.println("2. 15000 for three years");
                System.out.println("3. 25000 for five years");
                System.out.println("enter plan amount to be added");
                int yearlyPlan = s.nextInt();
                handlePayment(yearlyPlan);
                break;
            case 2:
                System.out.println("1. 500 for a month");
                System.out.println("2. 2500 for four months");
                System.out.println("3. 4000 for eight months");
                System.out.println("enter plan amount to be added");
                int monthlyPlan = s.nextInt();
                handlePayment(monthlyPlan);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showNaturalDisastersScheme();
                break;
        }
       // mainMenu();
    }

    private void showFireAccidentsScheme() {
        System.out.println("\u001B[34mWelcome to Fire Accidents Scheme.");
        System.out.println("This scheme contains \n 1. Yearly plan \n2. Monthly plan \n");
        int c = s.nextInt();
        switch (c) {
            case 1:
                System.out.println("The Yearly plans are as follows:");
                System.out.println("1. 5000 for one year");
                System.out.println("2. 15000 for three years");
                System.out.println("3. 25000 for five years");
                System.out.println("enter plan amount to be added");
                int yearlyPlan = s.nextInt();
                handlePayment(yearlyPlan);
                break;
            case 2:
                System.out.println("1. 500 for a month");
                System.out.println("2. 2500 for four months");
                System.out.println("3. 4000 for eight months");
                System.out.println("enter plan amount to be added");
                int monthlyPlan = s.nextInt();
                handlePayment(monthlyPlan);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showFireAccidentsScheme();
                break;
        }
        //mainMenu();
    }

    private void showElectricalBreakdownScheme() {
        System.out.println("\u001B[33mWelcome to Electrical Breakdown Scheme.");
        System.out.println("This scheme contains \n1. Yearly plan \n2. Monthly plan \n");
        int d = s.nextInt();
        switch (d) {
            case 1:
                System.out.println("The Yearly plans are as follows:");
                System.out.println("1. 5000 for one year");
                System.out.println("2. 15000 for three years");
                System.out.println("3. 25000 for five years");
                System.out.println("enter plan amount to be added");
                int yearlyPlan = s.nextInt();
                handlePayment(yearlyPlan);
                break;
            case 2:
                System.out.println("1. 500 for a month");
                System.out.println("2. 2500 for four months");
                System.out.println("3. 4000 for eight months");
                System.out.println("enter plan amount to be added");
                int monthlyPlan = s.nextInt();
                handlePayment(monthlyPlan);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showElectricalBreakdownScheme();
                break;
        }
       // mainMenu();
    }

    public void handlePayment(long amount) {
        System.out.println("\u001B[32mProceed to Payment:");
        System.out.println("You have chosen a plan with amount: " + amount);
        System.out.println("Choose your payment method:");
        System.out.println("1. SBI bank");
        System.out.println("2. HDFC bank");
        System.out.println("3. KOTAK bank");
        System.out.println("4. BOI bank");
        System.out.println("FOR Making Payment You Need To Add Amount To Our Wallet ");
        System.out.println("If you Have enough Amount in Your Wallet You Can Proceed With The PAYMENT");
        int paymentChoice = s.nextInt();
        switch (paymentChoice) {
            case 1:
                System.out.println("You have chosen SBI bank.");
                Payment.main5();
                break;
            case 2:
                System.out.println("You have chosen HDFC bank.");
                Payment.main5();
                break;
            case 3:
                System.out.println("You have chosen KOTAK bank.");
                Payment.main5();
                break;
            case 4:
                System.out.println("You have chosen BOI bank.");
                Payment.main5();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                handlePayment(amount);
                break;
        }
       
    }

    public void mainMenu() {
        System.out.println("\u001B[32mWelcome to Property Policy. This policy includes:");
        System.out.println("1. Home Insurances");
        System.out.println("2. Land Insurances");
        System.out.println("3. Shop Insurances");
        System.out.println("The Insurances we provide are:");
        System.out.println("Press \n 1. Home Insurance \n2. Land Insurance \n3. Shop Insurance");
        int key = s.nextInt();
        switch (key) {
            case 1:
                obj.Home();
                break;
            case 2:
                obj.Land();
                break;
            case 3:
                obj.Shop();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                mainMenu();
                break;
        }
    }

    public static void main2() {
        obj.mainMenu();
    }
}



class Payment
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static double bal = 5000;
	double dep(double amt)
	{
		bal = bal + amt;
		return bal;	
	}
	double with(double amt,double amount)
	{
		
		if(amt>bal)
		{
			System.out.println("Insufficient Funds....please recharge ");
			
		}
		else{
		bal = bal-amt;
		System.out.println("Payment of " + amount + " Successful!");
		}
		return bal;
	}
	public static void main5()
	{
		System.out.println("1. for Deposit \n 2. for payment \n 3. Exit");
		Payment obj = new Payment();
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter Amount for Deposit");
			System.out.println("Your available balance is : "+obj.dep(sc.nextDouble()));
		}
		else if(n==2)
		{
			System.out.println("Enter Amount for Payment");
			double amount=sc.nextDouble();
			System.out.println("Your available balance is : "+obj.with(amount,amount));
			 
		        System.out.println("THANK YOU.....!");
			//break;
			
		}
		else{
			System.out.println("THANK YOU ....... VISIT AGAIN......");
			//break;
		}
	      
		
	}
}
 abstract class Abstrac
 {
	 abstract void run();
 }
 

class Management  extends Abstrac{

	static Scanner scanner = new Scanner(System.in);

	public static void main1() {
		Abstrac obj = new Management();
		obj.run();

	}
	public void run() {
		System.out.println("Select Policy Type:");
		System.out.println("1. Property Policy ");
		System.out.println("2. Life Policy");
		System.out.println("3. vehicle Policy");
		System.out.print("Enter your choice: ");
		int policyType = scanner.nextInt();
		System.out.println(); // Consume newline
		switch (policyType) {
        case 1:
        	Property.main2();
            break;
        case 2:
        	Life.main3();
        	break;
        case 3:
        	Vehicle.main4();
        	break;
        default:
            System.out.println("Invalid policy type. select a valid option.");
            break;
	}
}
}
class Login {
	

    {
        System.out.println("\n\n-------------------Login---------------------\n\n");
    }

    
    
    int fn=0,ln=0,p=0;
    private String firstName,lastName,password;
    private String sfirstName,slastName,spassword;
    private String nf,nl,np;
    
    
    private String resetFn() {		
		return nf;
	}
    
    private String resetLn() {		
		return nl;
	}
    
    private String resetP() {		
		return np;
	}

    private void isFirstName(){
        System.out.print("Enter First Name: ");
        this.firstName=Sign_up.input.next();
        
        if(User.user.direct) {
        	if(fn==0) {      	
            	this.sfirstName=User.user.getfirstName();
            }else {
            	this.sfirstName=resetFn();
            }
        }else {        	
        	if(fn==0) {      	
        		this.sfirstName=Register.sign.setFirstName();
        	}else {
        		this.sfirstName=resetFn();
        	}
        }
        
        if(this.firstName.equals(this.sfirstName)) {
			isLastName();
		}else {
			System.out.println("\nInvalid First Name. Enter");
			
			System.out.print("Enter\n"+"1->  for Forgot First Name/ any number to TRY AGAIN: ");

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	fn=1;
	        	setFn();
	        }
			isFirstName();
		}

    }
    
    private void isLastName(){
        System.out.print("Enter Last Name: ");
        this.lastName=Sign_up.input.next();
        
        if(User.user.direct) {
        	if(ln==0) {      	
            	this.slastName=User.user.getLastName();
            }else {
            	this.slastName=resetLn();
            }
        }else {
        	if(ln==0) {      	
            	this.slastName=Register.sign.setLastName();
            }else {
            	this.slastName=resetLn();
            }
        }
         
        
        if(this.lastName.equals(this.slastName)) {
			isPassword();
		}else {
			System.out.println("\nInvalid Last Name. Enter");
			
			System.out.print("Enter\n"+"1->  for Forgot Last Name/ any number to TRY AGAIN: ");

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	ln=1;
	        	setLn();
	        }
			isLastName();
		}

    }

    
    private void isPassword() {
		System.out.print("\nEnter Password: ");
		this.password=Sign_up.input.next();
		
		if(User.user.direct) {
			if(p==0) {			
				this.spassword=User.user.getPassword();
			}else {
				this.spassword=resetP();
			}
		}else {
			if(p==0) {			
				this.spassword=Register.sign.getPassword();
			}else {
				this.spassword=resetP();
			}
		}
			
		if(!password.equals(this.spassword)) {
			System.out.println("\nInvalid Password.");
			
			System.out.print("Enter\n"+"1->  for Forgot Password/ any number to TRY AGAIN: ");

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	p=1;
	        	setP();
	        }
			isPassword();
		}else {
			System.out.println("\nLogin Successfully...");
		}
	}

 
    Random random=new Random();
    
    int generated_OTP;
    
    
    private boolean OTP(int count) {
    	
	    if(count>0) {
	    	
	    	System.out.print("Enter OTP to verify: ");
	    	int OTP=Sign_up.input.nextInt();
	    	
	    	if(OTP==this.generated_OTP) {
	    		return true;
	    	}else {
	    		System.out.println("Wrong OTP. TRY AGAIN\n");
	    		return OTP(--count);
	    	}
	    }
	    
	    System.out.println("\nYou exeeded OTP limitations\n");
	    
	    	
        	System.out.println("A new OTP has been sent to your Registered Mobile Number");
        		generated_OTP=random.nextInt(9000)+1000;
        		System.out.println("Re-generated OTP: "+generated_OTP+"\n");
        		return OTP(3);        
    }
      
    
    private boolean mobile_v() {
    	System.out.print("Enter registered Mobile No: ");
    	String rmobile=Sign_up.input.next();
    	
    	if(User.user.direct) {
    		if(rmobile.equals(User.user.userMobile())) {
    			
    		    
    		    this.generated_OTP=random.nextInt(9000)+1000;
    		    
    		    System.out.println("\nAn OTP has been sent to your Registered Mobile Number.Verify it...");
    	        System.out.println("Your OTP to Sign-in: "+generated_OTP+"\n");
    	        
    	        return OTP(3);
    		}else {
    			System.out.println("Mobile Number MisMatched");
    			return mobile_v();
    		}
    	}else {
    		if(rmobile.equals(Register.sign.mobile())) {
    			
    		    
    		    this.generated_OTP=random.nextInt(9000)+1000;
    		    
    		    System.out.println("\nAn OTP has been sent to your Registered Mobile Number.Verify it...");
    	        System.out.println("Your OTP to Sign-in: "+generated_OTP+"\n");
    	        
    	        return OTP(3);
    		}else {
    			System.out.println("Mobile Number MisMatched");
    			return mobile_v();
    		}
    	}
    }
    
    private String setFn() {
    	if(mobile_v()) {
    		System.out.println("\nFirst Name must be of atleast 4 characters and should not contain any special characters");
    		System.out.print("\nSet New First Name: ");
    		this.nf=Sign_up.input.next();
    		if(nameLength(this.nf)) {
    			if(isnameValid(this.nf,0,this.nf.length())) {
    				return this.nf;
    			}else {
    				System.out.println("\nFirst Name should not have any Special characters\n");
    				return setFn();
    			}
    		}
    		return setFn();
    	}
    	return "";
    }
    
    private String setLn() {
    	if(mobile_v()) {
    		System.out.println("\nLast Name must be of atleast 4 characters and should not contain any special characters");
    		System.out.print("\nSet New Last Name: ");
    		this.nl=Sign_up.input.next();
    		if(nameLength(this.nl)) {
    			if(isnameValid(this.nl,0,this.nl.length())) {
    				return this.nl;
    			}else {
    				System.out.println("\nLast Name should not have any Special characters\n");
    				return setLn();
    			}
    		}
    		return setLn();
    	}
    	return "";
    }
    
    private String setP() {
    	if(mobile_v()) {
    		System.out.print("\n(Your Password must have one Capital letter,one Small letter,");
    		System.out.println("one Number and one Special Character)");
    		
    		System.out.print("\nSet New Password: ");
    		this.np=Sign_up.input.next();
    		if(isPassword(this.np)) {
    			return this.np;
    		}else {
    			return setP();
    		}
    	}
    	return "";
    }

    
    private boolean nameLength(String name) {
    	if(name.length()<4) {
    		System.out.println("\nThe UserName you are entering should have atleast 4 Characters\n");
    		return false;
    	}
    	return true;
    }
    
    
    private boolean isnameValid(String name,int i,int userName_length){
        if(i<userName_length){
            if((name.charAt(i)>='A'&&name.charAt(i)<'z')){
                return isnameValid(name, ++i, userName_length);
            }else{
                return false;
            }
        }
        return true;
    }
    
    private boolean isPassword(String password) {
    	int cap=0,small=0,num=0,spe=0;
    	for(int i=0;i<password.length();i++) {
    		char ch=password.charAt(i);
    		if(ch>='A'&&ch<='Z') {
    			cap++;
    		}else if(ch>='a'&&ch<='z') {
    			small++;
    		}else if(ch>='0'&&ch<='9') {
    			num++;
    		}else if((ch>='!'&&ch<='/')||(ch>=':'&&ch<='@')) {
    			spe++;
    		}
    	}
    	
    	if(cap<1||small<1||num<1||spe<1) {
    		System.out.println("\nYour password is not Strong enough\n");
    		return false;
    	}
    	return true;
    }
    
    private boolean doLogin(){
        
        while(true) {
        	System.out.print("Do You Want to Login Now?(Yes/No): ");
        	
        	String bool=Sign_up.input.next();
        	
        	if(bool.toLowerCase().equals("yes")){
        		isFirstName();
        		return true;
        	}else if(bool.toLowerCase().equals("no")){
        		System.out.println("Will See You Again...\n\nTHANK YOU");
        		return false;
        	}else {
        		System.out.println("Enter appropriate choice\n");
        	}
        }
    }

    boolean getLogin(){
        return doLogin();
    }
    public static void main(String[] args) {
    	Login login=new Login();
        boolean b=login.getLogin();
        if(b){
        	Management.main1();
        }
    }
}
class Life {
    static Scanner sc = new Scanner(System.in);
    int totalPolicy = 0;
    int index;
    
    String[] arr1 = new String[10]; // UserName
    int [] arr2 = new int[10]; // Age
    String[] arr3 = new String[10]; // PolicyName
    int[] arr4 = new int[10]; // PolicyType
    int[] arr5 = new int[10]; // PolicyTerm
    int[] arr6 = new int[10]; // Amount
    int[] arr7 = new int[10];//return amount

    public void ShowPolicies() {
        System.out.println("These are the policies available for LIFE:");
        System.out.println("1. Aegon Life iTerm Insurance Plan");
        System.out.println("2. Bharti AXA Life eProtect Term Plan");
        System.out.println("3. HDFC Life Click 2 Protect Plus");
        System.out.println("4. Reliance Online Term");
        System.out.println("5. SBI Life - eShield");
        System.out.println("6. Max Life Online Term Plan Basic Life Cover");
        System.out.println("7. LIC's Anmol Jeevan II");
        System.out.println("8. Birla Sun Life Insurance BSLI Protect@Ease Plan");
        System.out.println("9. PNB MetLife Mera Term Plan");
        mainMenu();
    }

    public void AddPolicy() {
        if (totalPolicy >= arr1.length) {
            System.out.println("Policy storage is full. Cannot add more policies.");
            mainMenu();
            return;
        }
        
        System.out.println("Enter UserName:");
        arr1[totalPolicy] = sc.next();
        System.out.println("Enter Age:");
        arr2[totalPolicy] = sc.nextInt();
        sc.nextLine(); // consume the remaining newline
        System.out.println("Enter PolicyName:");
        arr3[totalPolicy] = sc.next();
        System.out.println("Enter PolicyType:");
        arr4[totalPolicy] = sc.nextInt();
        System.out.println("Enter PolicyTerm:");
        arr5[totalPolicy] = sc.nextInt();
        System.out.println("Enter Amount:");
        arr6[totalPolicy] = sc.nextInt();
        System.out.println("Policy Added Successfully");
        int amount= arr2[totalPolicy]* arr4[totalPolicy]* arr5[totalPolicy]* arr6[totalPolicy]/100000;
        arr7[totalPolicy]=amount;
        totalPolicy++;
        Property prop =new Property();
        prop.handlePayment(amount);
        mainMenu();
    }

    public void ViewPolicy() {
        System.out.println("Enter index of policy to view:");
        index = sc.nextInt();
        if (index >= 0 && index < totalPolicy) {
        	System.out.println("-------------------------------------------------------------");
            System.out.println("UserName: " + (arr1[index] != null ? arr1[index] : "null"));
            System.out.println("Age: " + (arr2[index] ));
            System.out.println("PolicyName: " + (arr3[index] != null ? arr3[index] : "null"));
            System.out.println("PolicyType: " + (arr4[index] ));
            System.out.println("PolicyTerm: " + (arr5[index] ));
            System.out.println("Amount: " + (arr6[index]));
            System.out.println("Amount expected return :-"+ (arr7[index]));
            System.out.println("-------------------------------------------------------------");
        } else {
            System.out.println("Invalid index.");
        }
        mainMenu();
    }

    public void UpdatePolicy() {
        System.out.println("Enter index of policy to update:");
        index = sc.nextInt();
        if (index >= 0 && index < totalPolicy) {
            sc.nextLine(); // consume the remaining newline
            System.out.println("Enter new PolicyName:");
            arr3[index] = sc.nextLine();
            System.out.println("Enter new PolicyType:");
            arr4[index] = sc.nextInt();
            System.out.println("Enter new PolicyTerm:");
            arr5[index] = sc.nextInt();
            System.out.println("Enter new Amount:");
            arr6[index] = sc.nextInt();
            System.out.println("Policy Updated Successfully");
        } else {
            System.out.println("Invalid index.");
        }
        mainMenu();
    }

    public void DeletePolicy() {
        System.out.println("Enter index of policy to delete:");
        index = sc.nextInt();
        if (index >= 0 && index < totalPolicy) {
            arr1[index] = null;
            arr2[index] = 0;
            arr3[index] = null;
            arr4[index] = 0;
            arr5[index] = 0;
            arr6[index] = 0;
            System.out.println("Policy Deleted Successfully");
        } else {
            System.out.println("Invalid index.");
        }
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("1. ShowPolicies");
        System.out.println("2. AddPolicy");
        System.out.println("3. ViewPolicy");
        System.out.println("4. UpdatePolicy");
        System.out.println("5. DeletePolicy");
        System.out.println("Select an option from above given choices:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ShowPolicies();
                break;
            case 2:
                AddPolicy();
                break;
            case 3:
                ViewPolicy();
                break;
            case 4:
                UpdatePolicy();
                break;
            case 5:
                DeletePolicy();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                mainMenu();
                break;
        }
    }

    public static void main3() {
        Life life = new Life();
        life.mainMenu();
    }
}

class User {
	static User user=new User();
	
	private String firstName="pavan";
	private String lastName="Kuthuru";
	private String password="pavan@121";
	private String mobile="6302836190";
	
	boolean direct=false;
	
	{
		System.out.println("                   %%%INSURANCE MANAGEMENT SYSYTEM %%%                       \n");
		
		while(true) {
			System.out.print("Are you new to the INSURANCE MANAGEMENT SYSTEM ? (YES/NO): ");
			
			String new_user=Sign_up.input.next();
			
			if(new_user.toLowerCase().equals("no")){
				direct=true;
				
				break;
			}else if(new_user.toLowerCase().equals("yes")) {
				break;
			}else {
				System.out.println("Enter appropriate choice\n");
			}
		}
	}
	
	String getfirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	String getPassword() {
		return password;
	}
	
	String userMobile() {
		return mobile;
	}
	
	public static void main(String[] args) {
		
		if(user.direct) {	
			Login login=new Login();
			boolean b_login=login.getLogin();
			if(b_login){
				Management.main1();
			}
		}else {
			new Register();
		}
	}
}
