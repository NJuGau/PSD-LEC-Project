package catalogue.context.shop_context.events;

import java.util.ArrayList;

import catalogue.context.shop_context.controller.ShopController;
import catalogue.context.shop_context.models.entity.Shop;

public class OnLoadShopEvent {
	public static ArrayList<Shop> run(){
		return ShopController.getAllShop();
	}
}
