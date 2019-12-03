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
        }


    }

