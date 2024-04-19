import java.util.ArrayList;

public class RecipeManager {

    private ArrayList<Recipe> recipeList;

    public RecipeManager() {
        this.recipeList = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipeList;
    }

    public void listRecipes() {

        String recipes = "";
        for (Recipe recipe : this.recipeList) {
            recipes += recipe + "\n";
        }
        System.out.print(recipes);
    }

    public void listRecipes(String searchedTitle) {

        String recipes = "";
        for (Recipe recipe : this.recipeList) {
            if (recipe.getTitle().contains(searchedTitle))
                recipes += recipe + "\n";
        }
        System.out.print(recipes);
    }

    public void listRecipes(int searchedTime) {

        String recipes = "";
        for (Recipe recipe : this.recipeList) {
            if (recipe.getCookingTime() <= searchedTime)
                recipes += recipe + "\n";
        }
        System.out.print(recipes);
    }

    public void listRecipesByIngredient(String ingredient) {

        String recipes = "";
        for (Recipe recipe : this.recipeList) {
            if (recipe.hasIngredient(ingredient))
                recipes += recipe + "\n";
        }
        System.out.print(recipes);
    }

}
