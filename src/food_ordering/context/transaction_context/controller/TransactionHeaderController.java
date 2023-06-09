package food_ordering.context.transaction_context.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Handler;

import authentication.context.authentication_context.models.entity.User;
import food_ordering.context.cart_context.models.entity.Cart;
import food_ordering.context.transaction_context.handler.TransactionHeaderHandler;
import food_ordering.context.transaction_context.models.entity.TransactionHeader;
import food_ordering.context.transaction_context.repository.TransactionHeaderRepository;

public class TransactionHeaderController {

    public static ArrayList<TransactionHeader> getAllTransactionHeader(String UserId) {
        return TransactionHeaderHandler.getAllTransactionHeader(UserId);
    }

    public static boolean addNewTransaction(User buyer, Date transactionDate, Date pickupDate,
            ArrayList<Cart> cartlist) {
        return TransactionHeaderHandler.addNewTransaction(buyer, transactionDate, pickupDate, cartlist);
    }
    
    public static TransactionHeader getHeaderById(String transactionId) {
    	return TransactionHeaderHandler.getHeaderById(transactionId);
    }
    
    public static TransactionHeader getLatestTransaction(String userId) {
    	return TransactionHeaderHandler.getLatestTransaction(userId);
    }
}
