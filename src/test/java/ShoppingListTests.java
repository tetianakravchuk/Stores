import org.testng.annotations.Test;

public class ShoppingListTests extends BaseUI {
    String currentShoppingListTests;



    @Test
    public void getToShoppingListPage(){
        //homePage.signInPopUpWindow();
        shoppingListPage.getToShoppingList();

    }

    @Test
    public void addFavoriteItemType(){
        shoppingListPage.getToShoppingList();
        shoppingListPage.addFavoritesType();
        shoppingListPage.addHundredFavoritesType(100);
    }

    @Test
    public void removeAllFavorites(){
        shoppingListPage.getToShoppingList();
        shoppingListPage.clearAllFavorites();
    }

    @Test
    public void addToShoppingList() throws InterruptedException {
        shoppingListPage.getToShoppingList();
        shoppingListPage.addToShoppingListType();
        shoppingListPage.addHundredToShoppingList(20);
    }

    @Test
    public void addLoadedCouponsRoShoppingList() throws InterruptedException {
        shoppingListPage.addLoadedCouponsTOShoppingList();
    }


}

