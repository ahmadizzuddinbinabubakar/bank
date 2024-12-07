# Springboot bank

1. Create a new bank account:<br>
   HTTP Method: POST <br>
   URL: http://localhost:8080/api/accounts<br>
   Sample Request Body:<br>
   {
      "accountHolderName": "Gojo",
      "balance": 10000.00
   }
   <br>
   <br>
2. Fetch the details of a specific account: <br>
   HTTP Method: GET <br>
   URL: http://localhost:8080/api/accounts/{id} 
   <br>
   <br>
3. Deposit money into an account: <br>
   HTTP Method: POST <br>
   URL: http://localhost:8080/api/accounts/{id}/deposit <br>
   Sample Request Body:<br>
   {
      "amount": 250.00
   }
   <br>
   <br>
4. Withdraw money from an account: <br>
   HTTP Method: POST <br>
   URL: http://localhost:8080/api/accounts/{id}/withdraw <br>
   Sample Request Body: <br>
   {
     "amount": 150.00
   }
   <br>
   <br>   
