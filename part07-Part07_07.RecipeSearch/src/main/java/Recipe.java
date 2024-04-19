import java.util.ArrayList;

public class Recipe {

    private String title;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.title = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String title, int cookingTime, ArrayList<String> ingredients) {
        this.title = title;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public boolean hasIngredient(String searchedIngredient) {
        for (String ingredient : ingredients) {
            if (ingredient.equals(searchedIngredient))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return title + ", cooking time: " + cookingTime;
    }

    public String getTitle() {
        return title;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

}