
public class AppleStockCount {
  public static void main(String[] args) {

    if (args.length == 0) {
        System.out.println("Please give me a qty!");
        return;
    }

    int qty = Integer.parseInt(args[0]);

	if (args.length == 1){
	System.out.println("Please give me the price!");
	return;	
      }

    double cost = Double.parseDouble(args[1]);

    double total;
    int dosen = 0;

    if (qty < 1) {
        System.out.println("Out of stock.");
    }
    else {
	
	total = qty * cost;

	if (qty >= 12) {

	dosen = qty / 12;

	}

      

      StringBuilder message = new StringBuilder();
      message.append("You have bought ");

	if(dosen < 1){
	message.append(qty);
	
      message.append(" of");	
      message.append(" apple");
      if (qty > 1) {
        message.append("s");
      }
      message.append(" for a total cost of ");
      message.append(String.format("%.2f",total));
      message.append(".");
	}
	
	else {
		message.append(dosen);
		message.append(" dosen");
	if(dosen > 1){
		message.append("s");
	}
	
	message.append(" of");	
      message.append(" apple");
      if (qty > 1) {
        message.append("s");
      }
      message.append(" for a total cost of ");
      message.append(String.format("%.2f",total));
      message.append(".");
		
	}
      
      
	

      System.out.println(message.toString());

    }


  }
}
