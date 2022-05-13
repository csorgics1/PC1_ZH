import java.util.ArrayList;

public class Chef {

    String Recipe;
    Integer Price;

    public Chef(String Recipe, Integer Price) {
        this.Recipe = Recipe;
        this.Price = Price;
    }
    public String getRecipe() {
        return Recipe;
    }

    public void setRecipe(String recipe) {
            Recipe = recipe;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }


    public static String newRecipe(String Recipe, Integer Price) {
    }
    public  String ListChef() {
        return Recipe+" "+Price;
    }

    public static ArrayList<Chef> newRecipe(String Recipe, Integer Price) {
        i.add(new Chef(Recipe, Price))
        return i;
    }
}

    public static ArrayList<Chef> removeRecipe(ArrayList<Chef> i, Integer Recipe_field) {
        Integer k;
        for (i = 0; k < i.size(); k++) {
            if (i.get(k).getRecipe() !=Recipe_field) {
                continue;
                i.remove(i + 0);
            }

            return i;
        }
}
    public static void GetMenu(ArrayList<Chef> p) {
        int i;
        for (i = 0;i < p.size(); i++) {
            System.out.println(p.get(i).ListChef());
}
