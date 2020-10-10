/*-------------------------------------------------------------
// AUTHOR: Connor Miller. 
// FILENAME: Assignment03
// SPECIFICATION: Trade calculator
// FOR: CSE 110
// TIME SPENT: 3/4 hours
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Assignment03 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//variables and initializing them
		int currentShares = 0;
		int purchasePrice = 0;
		int marketPrice = 0;
		int availableFunds = 0;
		double totalBuyCost = 0;
		double numberOfSharesToBuy = 0;
		double perShareBuyValue = 0;
		double totalBuyValue = 0;
		double perShareSellValue = 0;
		double totalSellValue = 0;
		final int transactionFee = 10;
		
		//core input values 
		System.out.print("Current shares: ");
		currentShares = scan.nextInt();
		
		System.out.print("Purchase price: ");
		purchasePrice = scan.nextInt();
		
		System.out.print("Market price: ");
		marketPrice = scan.nextInt();
		
		System.out.print("Availavble funds: ");
		availableFunds = scan.nextInt();
		
		//equations 
		numberOfSharesToBuy = Math.floor((availableFunds - transactionFee) / marketPrice);
		totalBuyCost = transactionFee + (marketPrice * numberOfSharesToBuy);
		perShareBuyValue = purchasePrice - marketPrice;
		totalBuyValue = perShareBuyValue * numberOfSharesToBuy;
		perShareSellValue = marketPrice - purchasePrice; 
		totalSellValue = perShareSellValue * currentShares;
		
		 
		//core if loop to tell whether they should buy, sell, or hold
		if(marketPrice < purchasePrice && totalBuyValue > transactionFee)
			System.out.println("Buy " + (int)numberOfSharesToBuy  + " shares");
		else if(marketPrice > purchasePrice && totalSellValue > transactionFee)
			System.out.println("Sell " + currentShares + " shares"); //the examples showed once there was any profit to be made, it sold everything, following the same logic that means to sell every owned share 
		else 
			System.out.println("Hold");
			
		
	}

	
}
