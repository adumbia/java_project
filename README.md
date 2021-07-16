This machine sells the following ticket types: 

Balcony = 10.50
Upper Circle = 21.99
Dress Circle = 35.65
Rear Stalls  = 50.38
Front Stalls =  60.99

Customer:
	Selects ticket type
	Makes payment with notes or coins
		For every coin or note deduct price 
		and give change
	

Stage 1 
	Design (provide drawings with widgets)
	
	GUI : 
		selectTicket()
		Buttons : 
			Ticket type 
			Number of tickets 
		
		purchaseTicket()
		Payment of :
			Notes or Coins
			[coin 50p, coin £1, coin £2, coin £5, note £10, note £20, note £50 ]
			£50 notes no accepted
		
		displayRecipt()
		Display:
			Ticket type selected
			Plus and change from payment
			
		cancelPurchase()
		Reset machine at any stage and return payment


