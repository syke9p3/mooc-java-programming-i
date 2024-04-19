
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager recipeList = new RecipeManager();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        // fileName = "recipes.txt";
        String recipeText = extractTextFromFile(fileName);
        createRecipesFromText(recipeText, recipeList);

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {

            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop"))
                break;

            // command = "find name";

            if (command.equals("list")) {

                listAllRecipes(recipeList);

            } else if (command.equals("find name")) {

                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                listRecipesByTitle(recipeList, search);

            } else if (command.equals("find cooking time")) {

                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                listRecipesByTime(recipeList, time);

            } else if (command.equals("find ingredient")) {

                System.out.print("Ingredient:");
                String search = scanner.nextLine();
                listRecipesByIngredient(recipeList, search);
            }

            System.out.println("");

        }

    }

    public static String extractTextFromFile(String fileName) {

        String recipeText = "";

        // Read the file and store the text in a string
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                recipeText += row + "\n";
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipeText;

    }

    public static void createRecipesFromText(String recipeText, RecipeManager recipes) {

        // Split each recipe with newline
        String[] separatedRecipes = recipeText.split("\\r?\\n\\n");

        for (String recipe : separatedRecipes) {
            Recipe newRecipe = new Recipe();

            String[] recipeParts = recipe.split("\\n");
            newRecipe.setTitle(recipeParts[0]);
            newRecipe.setCookingTime(Integer.valueOf(recipeParts[1]));

            for (int i = 2; i < recipeParts.length; i++) {
                newRecipe.addIngredient(recipeParts[i]);
            }

            recipes.addRecipe(newRecipe);
        }
    }

    public static void listAllRecipes(RecipeManager recipes) {
        System.out.println("");
        System.out.println("Recipes:");
        recipes.listRecipes();
    }

    public static void listRecipesByTitle(RecipeManager recipes, String searchedTitle) {
        System.out.println("");
        System.out.println("Recipes:");
        recipes.listRecipes(searchedTitle);
    }

    public static void listRecipesByTime(RecipeManager recipes, int time) {
        System.out.println("");
        System.out.println("Recipes:");
        recipes.listRecipes(time);
    }

    public static void listRecipesByIngredient(RecipeManager recipes, String ingredient) {
        System.out.println("");
        System.out.println("Recipes:");
        recipes.listRecipesByIngredient(ingredient);
    }

}
